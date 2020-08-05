package edu.asu.diging.pubmeta.util.model;

import java.util.List;
import java.util.Map;

import edu.asu.diging.pubmeta.util.model.impl.CategoryImpl;

public interface Publication {

    PublicationType getPublicationType();

    void setPublicationType(PublicationType publicationType);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getDoi()
     */
    String getDoi();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setDoi(java.lang.
     * String)
     */
    void setDoi(String doi);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPmcid()
     */
    String getPmcid();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPmcid(java.lang
     * .String)
     */
    void setPmcid(String pmcid);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPubmedId()
     */
    String getPubmedId();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPubmedId(java.
     * lang.String)
     */
    void setPubmedId(String pubmedId);

    String getArxivId();

    void setArxivId(String arxivId);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getLicense()
     */
    String getLicense();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setLicense(java.
     * lang.String)
     */
    void setLicense(String license);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getSourceX()
     */
    String getSourceX();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setSourceX(java.
     * lang.String)
     */
    void setSourceX(String sourceX);

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPublishTime()
     */
    String getPublishTime();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPublishTime(
     * java.lang.String)
     */
    void setPublishTime(String publishTime);

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getPublishYear()
     */
    int getPublishYear();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setPublishYear(
     * int)
     */
    void setPublishYear(int publishYear);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getJournal()
     */
    String getJournal();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setJournal(java.
     * lang.String)
     */
    void setJournal(String journal);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#
     * getMsAcademicPaperId()
     */
    String getMsAcademicPaperId();

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#
     * setMsAcademicPaperId(java.lang.String)
     */
    void setMsAcademicPaperId(String msAcademicPaperId);

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#isHasPdfParse()
     */
    boolean isHasPdfParse();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setHasPdfParse(
     * boolean)
     */
    void setHasPdfParse(boolean hasPdfParse);

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#isHasPmcXmlParse()
     */
    boolean isHasPmcXmlParse();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setHasPmcXmlParse(
     * boolean)
     */
    void setHasPmcXmlParse(boolean hasPmcXmlParse);

    String getPdfJsonFiles();

    void setPdfJsonFiles(String pdfJsonFiles);

    String getPmcJsonFiles();

    void setPmcJsonFiles(String pmcJsonFiles);

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getFulltextFile()
     */
    String getFulltextFile();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setFulltextFile(
     * java.lang.String)
     */
    void setFulltextFile(String fulltextFile);

    /*
     * (non-Javadoc)
     * 
     * @see edu.asu.diging.cord19.explorer.core.model.impl.Publication#getUrl()
     */
    String getUrl();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setUrl(java.lang.
     * String)
     */
    void setUrl(String url);

    String getDocumentUrl();

    void setDocumentUrl(String documentUrl);

    String getDocumentType();

    void setDocumentType(String documentType);

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#getWhoCovidence()
     */
    String getWhoCovidence();

    /*
     * (non-Javadoc)
     * 
     * @see
     * edu.asu.diging.cord19.explorer.core.model.impl.Publication#setWhoCovidence(
     * java.lang.String)
     */
    void setWhoCovidence(String whoCovidence);

    String getFunder();

    void setFunder(String funder);

    String getDatabase();

    String getVolume();

    void setVolume(String volume);

    String getIssue();

    void setIssue(String issue);

    String getPages();

    void setPages(String pages);

    void setDatabase(String database);

    boolean isDuplicate();

    void setDuplicate(boolean duplicate);

    List<CategoryImpl> getCategories();

    void setCategories(List<CategoryImpl> categories);

    CategoryImpl getPrimaryCategory();

    void setPrimaryCategory(CategoryImpl primaryCategory);

    String getComment();

    void setComment(String comment);

    List<String> getMeshTerms();

    void setMeshTerms(List<String> meshTerms);

    int getTimesCited();

    void setTimesCited(int timesCited);

    int getRecentCitations();

    void setRecentCitations(int recentCitations);

    Map<String, Object> getExtraData();

    void setExtraData(Map<String, Object> extraData);

    void setAuthors(List<Person> authors);

    List<Person> getAuthors();

    void setTitle(String title);

    String getTitle();

    void setId(String id);

    String getId();

}