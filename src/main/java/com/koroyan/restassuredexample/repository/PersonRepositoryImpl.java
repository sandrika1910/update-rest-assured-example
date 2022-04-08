package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.FindPersonResult;

public class PersonRepositoryImpl implements PersonRepository{
    @Override
    public FindPersonResult getPersonById(String id) {
       return new PersonResultData().getPersonByID(id);
    }
}
