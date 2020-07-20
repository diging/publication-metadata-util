package edu.asu.diging.pubmeta.util.service.impl;

import java.util.ArrayList;
import java.util.List;

import edu.asu.diging.pubmeta.util.model.Person;
import edu.asu.diging.pubmeta.util.model.impl.PersonImpl;
import edu.asu.diging.pubmeta.util.service.AuthorsParser;

public class AuthorsParserImpl implements AuthorsParser {

    /* (non-Javadoc)
     * @see edu.asu.diging.pubmeta.util.service.impl.AuthorsParser#parseAuthorString(java.lang.String)
     */
    @Override
    public List<Person> parseAuthorString(String authorStr) {
        long commaCount = authorStr.chars().filter(c -> c == ',').count();
        List<Person> authors = new ArrayList<>();
        if (authorStr.contains(";") || commaCount <= 1) {
            /*
             * Multiple authors
             * e.g. 
             * Einstein, Albert; Darwin, Charles
             * or
             * Albert Einstein; Charles Darwin
             * 
             * or only one author
             * e.g. 
             * Einstein, Albert
             * or
             * Albert Einstein
             */
            parseSemicolonStr(authorStr, authors);
        } else if (commaCount > 1) {
            /*
             * one or multiple authors of the form:
             * Albert Einstein, Charles Darwin
             * or
             * Einstein, Albert, Darwin, Charles
             */
            parseCommaSeparatedString(authorStr, authors);
        }
        
        return authors;
    }

    private void parseSemicolonStr(String authorStr, List<Person> authorList) {
        String[] authors = authorStr.split(";");
        handleIndividualAuthors(authorList, authors);
    }

    private void handleIndividualAuthors(List<Person> authorList, String[] authors) {
        for (String author : authors) {
            if (!author.trim().isEmpty()) {
                if (author.contains(",")) {
                    authorList.add(createPersonLastnameFirst(author));
                } else {
                    authorList.add(createPersonNoComma(author));
                }
            }
        }
    }
    
    private void parseCommaSeparatedString(String authorStr, List<Person> authorList) {
        int startIdx = 0;
        int lastSeparatorIdx = 0;
        boolean lastWasSeparator = true;
        List<String> names = new ArrayList<>();
        while (authorStr.indexOf(',', startIdx) > -1) {
            int currentIdx = authorStr.indexOf(',', startIdx);
            if (lastWasSeparator) {
                lastWasSeparator = false;
            } else {
                if (currentIdx > -1) { 
                    names.add(authorStr.substring(lastSeparatorIdx + 1, currentIdx));
                } else {
                    names.add(authorStr.substring(lastSeparatorIdx + 1));
                }
                lastSeparatorIdx = currentIdx;
                lastWasSeparator = true;
            }
            
            startIdx = currentIdx;
        }
        
        handleIndividualAuthors(authorList, names.toArray(new String[names.size()]));
    }

    private Person createPersonLastnameFirst(String author) {
        Person person = new PersonImpl();
        String[] nameParts = author.split(", ");
        if (nameParts.length > 1) {
            person.setLastName(nameParts[0].trim());
            person.setFirstName(nameParts[1].trim());
            /*
             * The following really doesn't seem to make sense as it would
             * mean the name would be something like Bauer, Peter, Franz but
             * who knows. Let's make those middle names for now.
             */
            if (nameParts.length > 2) {
                List<String> middleParts = new ArrayList<>();
                for (int i = 2; i<nameParts.length; i++) {
                    middleParts.add(nameParts[i].trim());
                }
                person.setMiddleNames(middleParts);
            }
        } else {
            person.setLastName(nameParts[0].trim());
        }
        return person;
    }
    
    private Person createPersonNoComma(String author) {
        Person person = new PersonImpl();
        String[] nameParts = author.split(" ");
        if (nameParts.length == 1) {
            person.setLastName(nameParts[0].trim());
            return person;
        }
        
        person.setMiddleNames(new ArrayList<>());
        
        for (int i=0; i<nameParts.length; i++) {
            if (i == 0) {
                person.setFirstName(nameParts[i].trim());
            } else if (i == nameParts.length-1) {
                person.setLastName(nameParts[i].trim());
            } else {
                person.getMiddleNames().add(nameParts[i].trim());
            }
        }
        
        return person;
    }
}
