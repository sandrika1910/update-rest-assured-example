package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.FindPersonResult;

public interface PersonRepository {
    FindPersonResult getPersonById(String id);

}
