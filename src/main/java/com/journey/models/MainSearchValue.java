package com.journey.models;

import java.io.Serializable;

/**
 * Created by Surya on 2/8/2017.
 */
public class MainSearchValue implements Serializable {

    String searchValue;

    public String getSearchValue() {
        return searchValue;
    }

    public void setSearchValue(String searchValue) {
        this.searchValue = searchValue;
    }
}
