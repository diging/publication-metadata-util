package edu.asu.diging.pubmeta.util.model.impl;

import java.util.List;

import edu.asu.diging.pubmeta.util.model.Person;

public class PersonImpl implements Person {

    private String lastName;
    private String firstName;
    private List<String> middleNames;
    
    @Override
    public String getLastName() {
        return lastName;
    }
    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String getFirstName() {
        return firstName;
    }
    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Override
    public List<String> getMiddleNames() {
        return middleNames;
    }
    @Override
    public void setMiddleNames(List<String> middleNames) {
        this.middleNames = middleNames;
    }

}
