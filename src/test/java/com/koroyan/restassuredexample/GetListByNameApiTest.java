package com.koroyan.restassuredexample;

import com.koroyan.restassuredexample.data.common.CommonData;
import com.koroyan.restassuredexample.pojos.response.GetListByNameResult;
import com.koroyan.restassuredexample.repository.ListByNameImpl;
import com.koroyan.restassuredexample.repository.ListByNameRepository;
import com.koroyan.restassuredexample.steps.Step;
import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.testng.annotations.Test;

public class GetListByNameApiTest {
    private Step step;
    private ListByNameRepository listByNameRepository;

    @Test
    void mainTest() throws JSONException {
        listByNameRepository = new ListByNameImpl();
        step = new Step();

        GetListByNameResult actualList = step.getListByName(CommonData.NAME);
        GetListByNameResult expectedList = listByNameRepository.getListByName(CommonData.NAME);
        JSONAssert.assertEquals(actualList.toString(), expectedList.toString(), false);
    }

}
