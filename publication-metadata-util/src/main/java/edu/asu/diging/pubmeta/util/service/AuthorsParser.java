package edu.asu.diging.pubmeta.util.service;

import java.util.List;

import edu.asu.diging.pubmeta.util.model.Person;

public interface AuthorsParser {

    List<Person> parseAuthorString(String authorStr);

}