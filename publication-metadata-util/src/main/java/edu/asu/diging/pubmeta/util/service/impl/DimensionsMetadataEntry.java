package edu.asu.diging.pubmeta.util.service.impl;

import com.opencsv.bean.CsvBindByName;

public class DimensionsMetadataEntry {
    @CsvBindByName(column = "Rank")
    private String rank;
    @CsvBindByName(column = "Publication ID")
    private String publicationId;
    @CsvBindByName(column = "DOI")
    private String doi;
    @CsvBindByName(column = "PMCID")
    private String pmcid;
    @CsvBindByName(column = "PMID")
    private String pmid;
    @CsvBindByName(column = "Title")
    private String title;
    @CsvBindByName(column = "Source title")
    private String sourceTitle;
    @CsvBindByName(column = "Anthology title")
    private String anthologyTitle;
    @CsvBindByName(column = "MeSH terms")
    private String meshTerms;
    @CsvBindByName(column = "Publication Date")
    private String publicationDate;
    @CsvBindByName(column = "PubYear")
    private String pubYear;
    @CsvBindByName(column = "Volume")
    private String volume;
    @CsvBindByName(column = "Issue")
    private String issue;
    @CsvBindByName(column = "Pagination")
    private String pagination;
    @CsvBindByName(column = "Open Access")
    private String openAccess;
    @CsvBindByName(column = "Publication Type")
    private String publicationType;
    @CsvBindByName(column = "Authors")
    private String authors;
    @CsvBindByName(column = "Corresponding Author")
    private String correspondAuthor;
    @CsvBindByName(column = "Authors Affiliations")
    private String authorAffiliations;
    @CsvBindByName(column = "Research Organizations - standardized")
    private String standardizedOrganizations;
    @CsvBindByName(column = "GRID IDs")
    private String gridIds;
    @CsvBindByName(column = "Country of Research organization")
    private String organizationCountries;
    @CsvBindByName(column = "Funder")
    private String funder;
    @CsvBindByName(column = "Times cited")
    private String timesCites;
    @CsvBindByName(column = "Recent citations")
    private String recentCitations;
    @CsvBindByName(column = "RCR")
    private String rcr;
    @CsvBindByName(column = "FCR")
    private String fcr;
    @CsvBindByName(column = "Altmetric")
    private String altmetric;
    @CsvBindByName(column = "Source Linkout")
    private String sourceLinkout;
    @CsvBindByName(column = "Dimensions URL")
    private String dimensionsUrl;
    @CsvBindByName(column = "FOR (ANZSRC) Categories")
    private String forCategories;
    @CsvBindByName(column = "Sustainable Development Goals")
    private String sustainableDevGoals;
    
    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public DimensionsMetadataEntry() {
    }

    public String getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(String publicationId) {
        this.publicationId = publicationId;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getPmcid() {
        return pmcid;
    }

    public void setPmcid(String pmcid) {
        this.pmcid = pmcid;
    }

    public String getPmid() {
        return pmid;
    }

    public void setPmid(String pmid) {
        this.pmid = pmid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSourceTitle() {
        return sourceTitle;
    }

    public void setSourceTitle(String sourceTitle) {
        this.sourceTitle = sourceTitle;
    }

    public String getAnthologyTitle() {
        return anthologyTitle;
    }

    public void setAnthologyTitle(String anthologyTitle) {
        this.anthologyTitle = anthologyTitle;
    }

    public String getMeshTerms() {
        return meshTerms;
    }

    public void setMeshTerms(String meshTerms) {
        this.meshTerms = meshTerms;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getPubYear() {
        return pubYear;
    }

    public void setPubYear(String pubYear) {
        this.pubYear = pubYear;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getPagination() {
        return pagination;
    }

    public void setPagination(String pagingation) {
        this.pagination = pagingation;
    }

    public String getOpenAccess() {
        return openAccess;
    }

    public void setOpenAccess(String openAccess) {
        this.openAccess = openAccess;
    }

    public String getPublicationType() {
        return publicationType;
    }

    public void setPublicationType(String publicationType) {
        this.publicationType = publicationType;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getCorrespondAuthor() {
        return correspondAuthor;
    }

    public void setCorrespondAuthor(String correspondAuthor) {
        this.correspondAuthor = correspondAuthor;
    }

    public String getAuthorAffiliations() {
        return authorAffiliations;
    }

    public void setAuthorAffiliations(String authorAffiliations) {
        this.authorAffiliations = authorAffiliations;
    }

    public String getStandardizedOrganizations() {
        return standardizedOrganizations;
    }

    public void setStandardizedOrganizations(String standardizedOrganizations) {
        this.standardizedOrganizations = standardizedOrganizations;
    }

    public String getGridIds() {
        return gridIds;
    }

    public void setGridIds(String gridIds) {
        this.gridIds = gridIds;
    }

    public String getOrganizationCountries() {
        return organizationCountries;
    }

    public void setOrganizationCountries(String organizationCountries) {
        this.organizationCountries = organizationCountries;
    }

    public String getFunder() {
        return funder;
    }

    public void setFunder(String funder) {
        this.funder = funder;
    }

    public String getTimesCites() {
        return timesCites;
    }

    public void setTimesCites(String timesCites) {
        this.timesCites = timesCites;
    }

    public String getRecentCitations() {
        return recentCitations;
    }

    public void setRecentCitations(String recentCitations) {
        this.recentCitations = recentCitations;
    }

    public String getRcr() {
        return rcr;
    }

    public void setRcr(String rcr) {
        this.rcr = rcr;
    }

    public String getFcr() {
        return fcr;
    }

    public void setFcr(String fcr) {
        this.fcr = fcr;
    }

    public String getAltmetric() {
        return altmetric;
    }

    public void setAltmetric(String altmetric) {
        this.altmetric = altmetric;
    }

    public String getSourceLinkout() {
        return sourceLinkout;
    }

    public void setSourceLinkout(String sourceLinkout) {
        this.sourceLinkout = sourceLinkout;
    }

    public String getDimensionsUrl() {
        return dimensionsUrl;
    }

    public void setDimensionsUrl(String dimensionsUrl) {
        this.dimensionsUrl = dimensionsUrl;
    }

    public String getForCategories() {
        return forCategories;
    }

    public void setForCategories(String forCategories) {
        this.forCategories = forCategories;
    }

    public String getSustainableDevGoals() {
        return sustainableDevGoals;
    }

    public void setSustainableDevGoals(String sustainableDevGoals) {
        this.sustainableDevGoals = sustainableDevGoals;
    }
}