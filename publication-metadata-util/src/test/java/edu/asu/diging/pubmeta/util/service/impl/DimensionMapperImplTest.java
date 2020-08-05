package edu.asu.diging.pubmeta.util.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import edu.asu.diging.pubmeta.util.model.Publication;
import edu.asu.diging.pubmeta.util.model.PublicationExtraData;
import edu.asu.diging.pubmeta.util.model.PublicationType;
import edu.asu.diging.pubmeta.util.model.impl.PublicationImpl;

public class DimensionMapperImplTest {
    
    private Iterator<DimensionsMetadataEntry> csvIterator;
    
    private DimensionsMapperImpl mapperToTest = new DimensionsMapperImpl();
    
    @Before
    public void init() throws IOException {
        File metadataFile = new File(getClass().getResource("dimensions_test_file.csv").getPath());
        BufferedReader fileReader = new BufferedReader(new FileReader(metadataFile));
        // skip the first line which is info about the data 
        fileReader.readLine();
        CsvToBean<DimensionsMetadataEntry> bean = new CsvToBeanBuilder<DimensionsMetadataEntry>(fileReader).withType(DimensionsMetadataEntry.class).build();
        csvIterator = bean.iterator();    
    }

    @SuppressWarnings("unchecked")
    @Test
    public void test_map_completeRecord() {
        
        DimensionsMetadataEntry entry = csvIterator.next();
        Publication pub = new PublicationImpl();
        mapperToTest.map(entry, pub);
        
        Assert.assertEquals("17", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_RANK));
        Assert.assertEquals("2", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_ALTMETRIC));
        Assert.assertEquals("Anthology title", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_ANTHOLOGY_TITLE));
        
        Assert.assertEquals("Olff, Miranda", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_CORRESPONDING_AUTHOR));
        Assert.assertEquals("https://app.dimensions.ai/details/publication/pub.1127162174", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_LINK));
        Assert.assertEquals("10.1080/20008198.2020.1752504", pub.getDoi());
        Assert.assertEquals("x", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_FCR));
        Assert.assertEquals("funder", pub.getFunder());
        Assert.assertEquals("grid.412004.3; grid.1005.4; grid.410781.b; grid.26009.3d; grid.95004.38;", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_GRID_IDS));
        Assert.assertEquals("1", pub.getIssue());
        Assert.assertEquals("All OA; Gold", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_OPEN_ACCESS));
        Assert.assertEquals("1752504", pub.getPages());
        
        Assert.assertEquals("xxx", pub.getPmcid());
        Assert.assertEquals("32349550", pub.getPubmedId());
        Assert.assertEquals("12/31/20", pub.getPublishTime());
        Assert.assertEquals(2020, pub.getPublishYear());
        Assert.assertEquals("pub.1127162174", pub.getId());
        Assert.assertEquals(PublicationType.ARTICLE, pub.getPublicationType());
        Assert.assertEquals("x", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_RCR));
        Assert.assertEquals(0, pub.getRecentCitations());
        Assert.assertEquals("https://www.tandfonline.com/doi/pdf/10.1080/20008198.2020.1752504?needAccess=true", pub.getUrl());
        Assert.assertEquals("European Journal of Psychotraumatology", pub.getJournal());
        Assert.assertEquals("University Hospital of Zurich; UNSW Sydney; Kurume University;", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_STANDARDIZED_ORGANIZATIONS));
        Assert.assertEquals("goal 1", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_DEVELOPMENT_GOALS));
        Assert.assertEquals(0, pub.getTimesCited());
        Assert.assertEquals("Screening for consequences of trauma – an update on the global collaboration on traumatic stress", pub.getTitle());
        Assert.assertEquals("11", pub.getVolume());
        
        // check authors
        Assert.assertEquals("Miranda", pub.getAuthors().get(0).getFirstName());
        Assert.assertEquals("Olff", pub.getAuthors().get(0).getLastName());
        Assert.assertEquals("", pub.getAuthors().get(0).getAffiliation());
        
        Assert.assertEquals("Anne", pub.getAuthors().get(1).getFirstName());
        Assert.assertEquals("Bakker", pub.getAuthors().get(1).getLastName());
        Assert.assertEquals("", pub.getAuthors().get(1).getAffiliation());
        
        Assert.assertEquals("Paul", pub.getAuthors().get(2).getFirstName());
        Assert.assertEquals("Frewen", pub.getAuthors().get(2).getLastName());
        Assert.assertEquals("Western University", pub.getAuthors().get(2).getAffiliation());
        
        Assert.assertEquals("Helene", pub.getAuthors().get(3).getFirstName());
        Assert.assertEquals("Aakvaag", pub.getAuthors().get(3).getLastName());
        Assert.assertEquals("Norwegian Centre for Violence and Traumatic Stress Studies", pub.getAuthors().get(3).getAffiliation());
   
        Assert.assertEquals("Ulrich", pub.getAuthors().get(4).getFirstName());
        Assert.assertEquals("Schnyder", pub.getAuthors().get(4).getLastName());
        Assert.assertEquals("", pub.getAuthors().get(4).getAffiliation());
        
        // check categories
        Assert.assertEquals("17 Psychology and Cognitive Sciences", pub.getCategories().get(0).getTerm());
        Assert.assertEquals("11 Medical and Health Sciences", pub.getCategories().get(1).getTerm());
        Assert.assertEquals("1701 Psychology", pub.getCategories().get(2).getTerm());
        Assert.assertEquals("1103 Clinical Sciences", pub.getCategories().get(3).getTerm());
  
        // check mesh terms
        Assert.assertEquals("Adaptation, Psychological", pub.getMeshTerms().get(0));
        Assert.assertEquals("Coronavirus Infections", pub.getMeshTerms().get(1));
        Assert.assertEquals("Epidemics", pub.getMeshTerms().get(2));
        
        // check countries
        Assert.assertEquals("Switzerland", ((List<String>)pub.getExtraData().get(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES)).get(0));
        Assert.assertEquals("Australia", ((List<String>)pub.getExtraData().get(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES)).get(1));
        Assert.assertEquals("Japan", ((List<String>)pub.getExtraData().get(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES)).get(2));
        Assert.assertEquals("United States", ((List<String>)pub.getExtraData().get(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES)).get(3));
        Assert.assertEquals("Ireland", ((List<String>)pub.getExtraData().get(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES)).get(4));
    }
    
    @SuppressWarnings("unchecked")
    @Test
    public void test_map_incompleteRecord() {
        // use second entry
        csvIterator.next();
        DimensionsMetadataEntry entry = csvIterator.next();
        
        Publication pub = new PublicationImpl();
        mapperToTest.map(entry, pub);
        
        Assert.assertEquals("225", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_RANK));
        Assert.assertEquals("4", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_ALTMETRIC));
        Assert.assertEquals("", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_ANTHOLOGY_TITLE));
        
        Assert.assertEquals("", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_CORRESPONDING_AUTHOR));
        Assert.assertEquals("https://app.dimensions.ai/details/publication/pub.1127251895", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_LINK));
        Assert.assertEquals("10.1080/13814788.2020.1757312", pub.getDoi());
        Assert.assertEquals("", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_FCR));
        Assert.assertEquals("", pub.getFunder());
        Assert.assertEquals("grid.5012.6", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_GRID_IDS));
        Assert.assertEquals("1", pub.getIssue());
        Assert.assertEquals("All OA; Gold", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_OPEN_ACCESS));
        Assert.assertEquals("58-60", pub.getPages());
        
        Assert.assertEquals("", pub.getPmcid());
        Assert.assertEquals("32349550", pub.getPubmedId());
        Assert.assertEquals("12/16/20", pub.getPublishTime());
        Assert.assertEquals(2020, pub.getPublishYear());
        Assert.assertEquals("pub.1127251895", pub.getId());
        Assert.assertEquals(PublicationType.CHAPTER, pub.getPublicationType());
        Assert.assertEquals("", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_RCR));
        Assert.assertEquals(1, pub.getRecentCitations());
        Assert.assertEquals("https://www.tandfonline.com/doi/pdf/10.1080/13814788.2020.1757312?needAccess=true", pub.getUrl());
        Assert.assertEquals("European Journal of General Practice", pub.getJournal());
        Assert.assertEquals("Maastricht University", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_STANDARDIZED_ORGANIZATIONS));
        Assert.assertEquals("", pub.getExtraData().get(PublicationExtraData.DIMENSIONS_DEVELOPMENT_GOALS));
        Assert.assertEquals(1, pub.getTimesCited());
        Assert.assertEquals("Family medicine in times of ‘COVID-19’: A generalists' voice", pub.getTitle());
        Assert.assertEquals("26", pub.getVolume());
        
        // check authors
        Assert.assertEquals("An", pub.getAuthors().get(0).getFirstName());
        Assert.assertEquals("de Sutter", pub.getAuthors().get(0).getLastName());
        Assert.assertEquals("Maastricht University", pub.getAuthors().get(0).getAffiliation());
        
         // check categories
        Assert.assertEquals("1117 Public Health and Health Services", pub.getCategories().get(0).getTerm());
        Assert.assertEquals("11 Medical and Health Sciences", pub.getCategories().get(1).getTerm());
        
        // check mesh terms
        Assert.assertEquals("Adaptation, Psychological", pub.getMeshTerms().get(0));
        
        // check countries
        Assert.assertEquals("Netherlands", ((List<String>)pub.getExtraData().get(PublicationExtraData.DIMENSIONS_AFFILIATION_COUNTRIES)).get(0));
        
    }
}
