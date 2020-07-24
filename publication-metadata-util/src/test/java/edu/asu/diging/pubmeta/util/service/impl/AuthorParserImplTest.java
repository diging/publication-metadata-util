package edu.asu.diging.pubmeta.util.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.asu.diging.pubmeta.util.model.Person;

public class AuthorParserImplTest {
    
    private AuthorsParserImpl parserToTest;
    
    @Before
    public void init() {
        parserToTest = new AuthorsParserImpl();
    }

    @Test
    public void test_parseAuthorString_semicolonSeperatedFirstLast() {
        String personString = "Albert Einstein;Charles Darwin; Marie Curie";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
    }
    
    @Test
    public void test_parseAuthorString_semicolonSeperatedLastFirst() {
        String personString = "Einstein, Albert;Darwin, Charles; Curie,  Marie";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
    }
    
    @Test
    public void test_parseAuthorString_oneAuthorFirstLast() {
        String personString = "Albert Einstein";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(1, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
    }
    
    @Test
    public void test_parseAuthorString_oneAuthorLastFirst() {
        String personString = "Einstein, Albert ";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(1, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
    }
    
    @Test
    public void test_parseAuthorString_commaSeperatedFirstLast() {
        String personString = "Albert Einstein,Charles Darwin, Marie Curie";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
    }
    
    @Test
    public void test_parseAuthorString_commaSeperatedLastFirst() {
        String personString = "Einstein, Albert,Darwin, Charles, Curie,  Marie";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
    }
}
