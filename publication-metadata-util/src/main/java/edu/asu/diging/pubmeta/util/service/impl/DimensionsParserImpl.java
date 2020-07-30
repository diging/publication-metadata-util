package edu.asu.diging.pubmeta.util.service.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import edu.asu.diging.pubmeta.util.model.Publication;
import edu.asu.diging.pubmeta.util.model.impl.PublicationImpl;
import edu.asu.diging.pubmeta.util.service.DimensionsMapper;
import edu.asu.diging.pubmeta.util.service.DimensionsParserIterator;

public class DimensionsParserImpl implements DimensionsParserIterator {
    
    private DimensionsMapper mapper;
    
    private Iterator<DimensionsMetadataEntry> csvIterator;
    
    public DimensionsParserImpl(String metadataFilename) throws IOException {
        mapper = new DimensionsMapperImpl();
        init(metadataFilename);
    }

    private void init(String metadataFilename) throws IOException {
        File metadataFile = new File(metadataFilename);
        BufferedReader fileReader = new BufferedReader(new FileReader(metadataFile));
        // skip the first line which is info about the data 
        fileReader.readLine();
        CsvToBean<DimensionsMetadataEntry> bean = new CsvToBeanBuilder<DimensionsMetadataEntry>(fileReader).withType(DimensionsMetadataEntry.class).build();
        csvIterator = bean.iterator();    
    }

    @Override
    public boolean hasNext() {
        return csvIterator.hasNext();
    }

    @Override
    public Publication next() {
        DimensionsMetadataEntry entry = csvIterator.next();
        Publication pub = new PublicationImpl();
        mapper.map(entry, pub);
        return pub;
    }
    
}
