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
        String personString = "Albert Einstein;Charles Darwin; Marie S. Curie";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals(1, persons.get(2).getMiddleNames().size());
        Assert.assertEquals("S.", persons.get(2).getMiddleNames().get(0));
        Assert.assertEquals("Curie", persons.get(2).getLastName());
    }
    
    @Test
    public void test_parseAuthorString_semicolonSeperatedFirstLast_withAffiliation() {
        String personString = "Albert Einstein (Institute A);Charles Darwin; Marie Curie (Institute B)";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Institute A", persons.get(0).getAffiliation());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("", persons.get(1).getAffiliation());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
        Assert.assertEquals("Institute B", persons.get(2).getAffiliation());
    }
    
    @Test
    public void test_parseAuthorString_semicolonSeperatedLastFirst() {
        String personString = "Einstein, Albert ;Darwin, Charles; Curie,  Marie S.  ";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
        Assert.assertEquals(1, persons.get(2).getMiddleNames().size());
        Assert.assertEquals("S.", persons.get(2).getMiddleNames().get(0));
    }
    
    @Test
    public void test_parseAuthorString_semicolonSeperatedLastFirst_withAffiliation() {
        String personString = "Einstein, Albert  (Institute A);Darwin, Charles; Curie,  Marie S.  (Institute B)";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Institute A", persons.get(0).getAffiliation());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("", persons.get(1).getAffiliation());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
        Assert.assertEquals(1, persons.get(2).getMiddleNames().size());
        Assert.assertEquals("S.", persons.get(2).getMiddleNames().get(0));
        Assert.assertEquals("Institute B", persons.get(2).getAffiliation());
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
    public void test_parseAuthorString_oneAuthorFirstLast_withAffiliation() {
        String personString = "Albert Einstein  (Institute A)";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(1, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Institute A", persons.get(0).getAffiliation());
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
    public void test_parseAuthorString_oneAuthorLastFirst_withAffiliation() {
        String personString = "Einstein, Albert (Institute A)";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(1, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Institute A", persons.get(0).getAffiliation());
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
    public void test_parseAuthorString_commaSeperatedFirstLast_withAffiliation() {
        String personString = "Albert Einstein (Institute A),Charles Darwin, Marie S. Curie (Institute B)";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Institute A", persons.get(0).getAffiliation());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("", persons.get(1).getAffiliation());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
        Assert.assertEquals(1, persons.get(2).getMiddleNames().size());
        Assert.assertEquals("S.", persons.get(2).getMiddleNames().get(0));
        Assert.assertEquals("Institute B", persons.get(2).getAffiliation());
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
    
    @Test
    public void test_parseAuthorString_commaSeperatedLastFirst_withAffiliation() {
        String personString = "Einstein, Albert (Institute A),Darwin, Charles, Curie,  Marie S. (Institute B)";
        List<Person> persons = parserToTest.parseAuthorString(personString);
        Assert.assertEquals(3, persons.size());
        Assert.assertEquals("Albert", persons.get(0).getFirstName());
        Assert.assertEquals("Einstein", persons.get(0).getLastName());
        Assert.assertEquals("Institute A", persons.get(0).getAffiliation());
        Assert.assertEquals("Charles", persons.get(1).getFirstName());
        Assert.assertEquals("Darwin", persons.get(1).getLastName());
        Assert.assertEquals("", persons.get(1).getAffiliation());
        Assert.assertEquals("Marie", persons.get(2).getFirstName());
        Assert.assertEquals("Curie", persons.get(2).getLastName());
        Assert.assertEquals(1, persons.get(2).getMiddleNames().size());
        Assert.assertEquals("S.", persons.get(2).getMiddleNames().get(0));
        Assert.assertEquals("Institute B", persons.get(2).getAffiliation());
    }
    
    
}
