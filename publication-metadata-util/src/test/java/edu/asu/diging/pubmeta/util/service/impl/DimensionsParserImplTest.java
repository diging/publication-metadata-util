package edu.asu.diging.pubmeta.util.service.impl;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class DimensionsParserImplTest {
    
    private DimensionsParserImpl parserToTest;

    @Test
    public void test_hasNext() throws IOException {
        parserToTest = new DimensionsParserImpl(getClass().getResource("dimensions_test_file.csv").getPath());
        Assert.assertTrue(parserToTest.hasNext());
        parserToTest.next();
        Assert.assertTrue(parserToTest.hasNext());
        parserToTest.next();
        Assert.assertTrue(parserToTest.hasNext());
        parserToTest.next();
        Assert.assertFalse(parserToTest.hasNext());
    }
    
    @Test
    public void test_next() throws IOException {
        parserToTest = new DimensionsParserImpl(getClass().getResource("dimensions_test_file.csv").getPath());
        assertEquals("pub.1127162174", parserToTest.next().getId());
        assertEquals("pub.1127251895", parserToTest.next().getId());
        assertEquals("pub.1125546310", parserToTest.next().getId());
    }
}
