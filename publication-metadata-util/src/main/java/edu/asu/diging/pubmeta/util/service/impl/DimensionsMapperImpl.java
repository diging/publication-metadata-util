package edu.asu.diging.pubmeta.util.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.asu.diging.pubmeta.util.model.Publication;
import edu.asu.diging.pubmeta.util.model.PublicationExtraData;
import edu.asu.diging.pubmeta.util.model.PublicationType;
import edu.asu.diging.pubmeta.util.model.impl.CategoryImpl;
import edu.asu.diging.pubmeta.util.service.AuthorsParser;
import edu.asu.diging.pubmeta.util.service.DimensionsMapper;

public class DimensionsMapperImpl implements DimensionsMapper {
    
    private final Logger logger = LoggerFactory.getLogger(getClass());
    
    private final String FOR_SCHEME = "https://libguides.usc.edu.au/HERDC-ERA/FoR-codes";
    
    private Map<String, PublicationType> typeMap;
    private AuthorsParser authorParser;

    public DimensionsMapperImpl() {
        init();
    }
    
    public void init() {
        typeMap = new HashMap<>();
        typeMap.put("Article", PublicationType.ARTICLE);
        typeMap.put("Chapter", PublicationType.CHAPTER);
        typeMap.put("Monograph", PublicationType.BOOK);
        typeMap.put("Preprint", PublicationType.PREPRINT);
        
        authorParser = new AuthorsParserImpl();
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.service.impl.DImensionsParserIterator#map(edu.asu.diging.pubmeta.util.service.impl.DimensionsMetadataEntry, edu.asu.diging.pubmeta.util.model.Publication)
     */
    @Override
    public void map(DimensionsMetadataEntry entry, Publication pub) {
        
        pub.setId(entry.getPublicationId() != null ? entry.getPublicationId().trim() : "");
        pub.setPmcid(entry.getPmcid() != null ? entry.getPmcid().trim() : "");
        pub.setPubmedId(entry.getPmid() != null ? entry.getPmid().trim() : "");
        
        addExtraData(entry, pub);
        
        pub.setTitle(entry.getTitle() != null ? entry.getTitle().trim() : "");
        pub.setDoi(entry.getDoi() != null ? entry.getDoi().trim() : null);
        pub.setJournal(entry.getSourceTitle() != null ? entry.getSourceTitle().trim() : "");
        
        addCategories(entry, pub);
        
        pub.setFunder(entry.getFunder() != null ? entry.getFunder().trim() : "");
        addMeshTerms(entry, pub);
        
        pub.setPublishTime(entry.getPublicationDate() != null ? entry.getPublicationDate().trim() : "");
        
        setPublishYear(entry, pub);
        
        pub.setVolume(entry.getVolume() != null ? entry.getVolume().trim() : "");
        pub.setIssue(entry.getIssue() != null ? entry.getIssue().trim() : "");
        pub.setPages(entry.getPagination() != null ? entry.getPagination().trim() : "");
        pub.setPublicationType(typeMap.get(entry.getPublicationType() != null ? entry.getPublicationType().trim() : ""));
        setAuthors(entry, pub);
        setResearchCountries(entry, pub);
        pub.setFunder(entry.getFunder() != null ? entry.getFunder().trim() : "");
        pub.setTimesCited(entry.getTimesCites() != null ? new Integer(entry.getTimesCites()) : 0);
        pub.setRecentCitations(entry.getRecentCitations() != null ? new Integer(entry.getRecentCitations()) : 0);
        pub.setUrl(entry.getSourceLinkout() != null ? entry.getSourceLinkout().trim() : "");
    }

    private void setPublishYear(DimensionsMetadataEntry entry, Publication pub) {
        if (entry.getPubYear() != null && !entry.getPubYear().trim().isEmpty()) {
            try {
                pub.setPublishYear(new Integer(entry.getPubYear()));
            } catch(NumberFormatException ex) {
                logger.error("Could not set publication year.", ex);
            }
        }
    }

    private void addMeshTerms(DimensionsMetadataEntry entry, Publication pub) {
        if (pub.getMeshTerms() == null || pub.getMeshTerms().isEmpty()) {
            if (pub.getMeshTerms() ==  null) {
                pub.setMeshTerms(new ArrayList<>());
            }
            
            if (entry.getMeshTerms() != null) {
                String[] terms = entry.getMeshTerms().split(";");
                for (String term : terms) {
                    if (!term.trim().isEmpty()) {
                        pub.getMeshTerms().add(term.trim());
                    }
                }
            }
        }
    }

    private void addCategories(DimensionsMetadataEntry entry, Publication pub) {
        if (pub.getCategories() == null) {
            pub.setCategories(new ArrayList<>());
        }
        
        String categorieStr = entry.getForCategories();
        if (categorieStr != null && !categorieStr.trim().isEmpty()) {
            List<String> existingCategories = pub.getCategories().stream().map(c -> c.getTerm().trim()).collect(Collectors.toList());
            List<String> categoryList = Arrays.asList(categorieStr.split(";"));
            categoryList.removeIf(c -> existingCategories.contains(c.trim()));
            categoryList.forEach(c -> pub.getCategories().add(new CategoryImpl(c.trim(), FOR_SCHEME, null)));
        }
    }

    private void addExtraData(DimensionsMetadataEntry entry, Publication pub) {
        if (pub.getExtraData() == null) {
            pub.setExtraData(new HashMap<String, Object>());
        }
        
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_RANK, entry.getRank() != null ? entry.getRank().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_ALTMETRIC, entry.getAltmetric() != null ? entry.getAltmetric().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_ANTHOLOGY_TITLE, entry.getAnthologyTitle() != null ? entry.getAnthologyTitle().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_CORRESPONDING_AUTHOR, entry.getCorrespondAuthor() != null ? entry.getCorrespondAuthor().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_FCR, entry.getFcr() != null ? entry.getFcr().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_RCR, entry.getRcr() != null ? entry.getRcr().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_OPEN_ACCESS, entry.getOpenAccess() != null ? entry.getOpenAccess().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_STANDARDIZED_ORGANIZATIONS, entry.getStandardizedOrganizations() != null ? entry.getStandardizedOrganizations().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_GRID_IDS, entry.getGridIds() != null ? entry.getGridIds().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_LINK, entry.getDimensionsUrl() != null ? entry.getDimensionsUrl().trim() : "");
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_DEVELOPMENT_GOALS, entry.getSustainableDevGoals() != null ? entry.getSustainableDevGoals().trim() : "");
    }

    private void setAuthors(DimensionsMetadataEntry entry, Publication pub) {
        if (pub.getAuthors() == null || pub.getAuthors().isEmpty()) {
            if (entry.getAuthors() != null && !entry.getAuthors().trim().isEmpty()) {
                pub.setAuthors(authorParser.parseAuthorString(entry.getAuthorAffiliations().trim()));                
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    private void setResearchCountries(DimensionsMetadataEntry entry, Publication pub) {
        pub.getExtraData().put(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES, new ArrayList<>());
        String countries = entry.getOrganizationCountries();
        if (countries != null && !countries.trim().isEmpty()) {
            String[] countryList = countries.trim().split(";");
            for (String country : countryList) {
                if (!country.trim().isEmpty()) {
                    ((List<String>)pub.getExtraData().get(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES)).add(country.trim());
                }
            }
        }
    }
}
