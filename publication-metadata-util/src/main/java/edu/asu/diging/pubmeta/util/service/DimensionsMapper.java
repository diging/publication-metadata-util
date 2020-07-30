package edu.asu.diging.pubmeta.util.service;

import edu.asu.diging.pubmeta.util.model.Publication;
import edu.asu.diging.pubmeta.util.service.impl.DimensionsMetadataEntry;

public interface DimensionsMapper {

    void map(DimensionsMetadataEntry entry, Publication pub);

}