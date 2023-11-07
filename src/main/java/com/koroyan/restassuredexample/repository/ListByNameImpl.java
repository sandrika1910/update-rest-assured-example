package com.koroyan.restassuredexample.repository;

import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;

public class ListByNameImpl implements ListByNameRepository {
    @Override
    public GetListByNameResult getListByName(String name) {
        return new ListByNameData().getListByName(name);
    }
}
