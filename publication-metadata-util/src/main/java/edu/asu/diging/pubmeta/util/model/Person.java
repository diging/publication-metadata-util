package edu.asu.diging.pubmeta.util.model;

import java.util.List;

public interface Person {

    void setMiddleNames(List<String> middleNames);

    List<String> getMiddleNames();

    void setFirstName(String firstName);

    String getFirstName();

    void setLastName(String lastName);

    String getLastName();

}
