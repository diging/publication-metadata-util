package edu.asu.diging.pubmeta.util.model.impl;

import java.util.List;
import java.util.Map;

import edu.asu.diging.pubmeta.util.model.Person;
import edu.asu.diging.pubmeta.util.model.Publication;
import edu.asu.diging.pubmeta.util.model.PublicationType;

public class PublicationImpl implements Publication {

    private String id;
    private String title;
    private List<Person> authors;
    private PublicationType publicationType;
    private String doi;
    private String pmcid;
    private String pubmedId;
    private String arxivId;
    private String license;
    private String sourceX;
    private String publishTime;
    private int publishYear;
    private String journal;
    private String msAcademicPaperId;
    private boolean hasPdfParse;
    private boolean hasPmcXmlParse;
    private String pdfJsonFiles;
    private String pmcJsonFiles;
    private String fulltextFile;
    private String url;
    private String documentUrl;
    private String documentType;
    private String whoCovidence;
    private String funder;
    private String volume;
    private String issue;
    private String pages;
    
    private String database;
    private boolean duplicate;

    private List<String> abstracts;
    private List<CategoryImpl> categories;
    private CategoryImpl primaryCategory;
    private String comment;
    private List<String> meshTerms;
    private int timesCited;
    private int recentCitations;
    
    private Map<String, Object> extraData;
    
    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public List<Person> getAuthors() {
        return authors;
    }

    @Override
    public void setAuthors(List<Person> authors) {
        this.authors = authors;
    }

    public List<String> getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(List<String> abstracts) {
        this.abstracts = abstracts;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPublicationType()
     */
    @Override
    public PublicationType getPublicationType() {
        return publicationType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPublicationType(edu.asu.diging.pubmeta.util.model.PublicationType)
     */
    @Override
    public void setPublicationType(PublicationType publicationType) {
        this.publicationType = publicationType;
    }


    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getDoi()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getDoi()
     */
    @Override
    public String getDoi() {
        return doi;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setDoi(java.lang.
     * String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setDoi(java.lang.String)
     */
    @Override
    public void setDoi(String doi) {
        this.doi = doi;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPmcid()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPmcid()
     */
    @Override
    public String getPmcid() {
        return pmcid;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPmcid(java.lang
     * .String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPmcid(java.lang.String)
     */
    @Override
    public void setPmcid(String pmcid) {
        this.pmcid = pmcid;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPubmedId()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPubmedId()
     */
    @Override
    public String getPubmedId() {
        return pubmedId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPubmedId(java.
     * lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPubmedId(java.lang.String)
     */
    @Override
    public void setPubmedId(String pubmedId) {
        this.pubmedId = pubmedId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getArxivId()
     */
    @Override
    public String getArxivId() {
        return arxivId;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setArxivId(java.lang.String)
     */
    @Override
    public void setArxivId(String arxivId) {
        this.arxivId = arxivId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getLicense()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getLicense()
     */
    @Override
    public String getLicense() {
        return license;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setLicense(java.
     * lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setLicense(java.lang.String)
     */
    @Override
    public void setLicense(String license) {
        this.license = license;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getSourceX()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getSourceX()
     */
    @Override
    public String getSourceX() {
        return sourceX;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setSourceX(java.
     * lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setSourceX(java.lang.String)
     */
    @Override
    public void setSourceX(String sourceX) {
        this.sourceX = sourceX;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPublishTime()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPublishTime()
     */
    @Override
    public String getPublishTime() {
        return publishTime;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPublishTime(
     * java.lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPublishTime(java.lang.String)
     */
    @Override
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPublishYear()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPublishYear()
     */
    @Override
    public int getPublishYear() {
        return publishYear;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPublishYear(
     * int)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPublishYear(int)
     */
    @Override
    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getJournal()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getJournal()
     */
    @Override
    public String getJournal() {
        return journal;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setJournal(java.
     * lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setJournal(java.lang.String)
     */
    @Override
    public void setJournal(String journal) {
        this.journal = journal;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#
     * getMsAcademicPaperId()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getMsAcademicPaperId()
     */
    @Override
    public String getMsAcademicPaperId() {
        return msAcademicPaperId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#
     * setMsAcademicPaperId(java.lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setMsAcademicPaperId(java.lang.String)
     */
    @Override
    public void setMsAcademicPaperId(String msAcademicPaperId) {
        this.msAcademicPaperId = msAcademicPaperId;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#isHasPdfParse()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#isHasPdfParse()
     */
    @Override
    public boolean isHasPdfParse() {
        return hasPdfParse;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setHasPdfParse(
     * boolean)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setHasPdfParse(boolean)
     */
    @Override
    public void setHasPdfParse(boolean hasPdfParse) {
        this.hasPdfParse = hasPdfParse;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#isHasPmcXmlParse()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#isHasPmcXmlParse()
     */
    @Override
    public boolean isHasPmcXmlParse() {
        return hasPmcXmlParse;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setHasPmcXmlParse(
     * boolean)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setHasPmcXmlParse(boolean)
     */
    @Override
    public void setHasPmcXmlParse(boolean hasPmcXmlParse) {
        this.hasPmcXmlParse = hasPmcXmlParse;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPdfJsonFiles()
     */
    @Override
    public String getPdfJsonFiles() {
        return pdfJsonFiles;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPdfJsonFiles(java.lang.String)
     */
    @Override
    public void setPdfJsonFiles(String pdfJsonFiles) {
        this.pdfJsonFiles = pdfJsonFiles;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPmcJsonFiles()
     */
    @Override
    public String getPmcJsonFiles() {
        return pmcJsonFiles;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPmcJsonFiles(java.lang.String)
     */
    @Override
    public void setPmcJsonFiles(String pmcJsonFiles) {
        this.pmcJsonFiles = pmcJsonFiles;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getFulltextFile()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getFulltextFile()
     */
    @Override
    public String getFulltextFile() {
        return fulltextFile;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setFulltextFile(
     * java.lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setFulltextFile(java.lang.String)
     */
    @Override
    public void setFulltextFile(String fulltextFile) {
        this.fulltextFile = fulltextFile;
    }

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getUrl()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getUrl()
     */
    @Override
    public String getUrl() {
        return url;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setUrl(java.lang.
     * String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setUrl(java.lang.String)
     */
    @Override
    public void setUrl(String url) {
        this.url = url;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getDocumentUrl()
     */
    @Override
    public String getDocumentUrl() {
        return documentUrl;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setDocumentUrl(java.lang.String)
     */
    @Override
    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getDocumentType()
     */
    @Override
    public String getDocumentType() {
        return documentType;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setDocumentType(java.lang.String)
     */
    @Override
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getWhoCovidence()
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getWhoCovidence()
     */
    @Override
    public String getWhoCovidence() {
        return whoCovidence;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setWhoCovidence(
     * java.lang.String)
     */
    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setWhoCovidence(java.lang.String)
     */
    @Override
    public void setWhoCovidence(String whoCovidence) {
        this.whoCovidence = whoCovidence;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getFunder()
     */
    @Override
    public String getFunder() {
        return funder;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setFunder(java.lang.String)
     */
    @Override
    public void setFunder(String funder) {
        this.funder = funder;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getDatabase()
     */
    @Override
    public String getDatabase() {
        return database;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getVolume()
     */
    @Override
    public String getVolume() {
        return volume;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setVolume(java.lang.String)
     */
    @Override
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getIssue()
     */
    @Override
    public String getIssue() {
        return issue;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setIssue(java.lang.String)
     */
    @Override
    public void setIssue(String issue) {
        this.issue = issue;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getPages()
     */
    @Override
    public String getPages() {
        return pages;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setPages(java.lang.String)
     */
    @Override
    public void setPages(String pages) {
        this.pages = pages;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setDatabase(java.lang.String)
     */
    @Override
    public void setDatabase(String database) {
        this.database = database;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#isDuplicate()
     */
    @Override
    public boolean isDuplicate() {
        return duplicate;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setDuplicate(boolean)
     */
    @Override
    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }

    @Override
    public List<CategoryImpl> getCategories() {
        return categories;
    }

    @Override
    public void setCategories(List<CategoryImpl> categories) {
        this.categories = categories;
    }

    @Override
    public CategoryImpl getPrimaryCategory() {
        return primaryCategory;
    }

    @Override
    public void setPrimaryCategory(CategoryImpl primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getComment()
     */
    @Override
    public String getComment() {
        return comment;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setComment(java.lang.String)
     */
    @Override
    public void setComment(String comment) {
        this.comment = comment;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getMeshTerms()
     */
    @Override
    public List<String> getMeshTerms() {
        return meshTerms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setMeshTerms(java.util.List)
     */
    @Override
    public void setMeshTerms(List<String> meshTerms) {
        this.meshTerms = meshTerms;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getTimesCited()
     */
    @Override
    public int getTimesCited() {
        return timesCited;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setTimesCited(int)
     */
    @Override
    public void setTimesCited(int timesCited) {
        this.timesCited = timesCited;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getRecentCitations()
     */
    @Override
    public int getRecentCitations() {
        return recentCitations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setRecentCitations(int)
     */
    @Override
    public void setRecentCitations(int recentCitations) {
        this.recentCitations = recentCitations;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#getExtraData()
     */
    @Override
    public Map<String, Object> getExtraData() {
        return extraData;
    }

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.model.impl.Publication#setExtraData(java.util.Map)
     */
    @Override
    public void setExtraData(Map<String, Object> extraData) {
        this.extraData = extraData;
    }

}
