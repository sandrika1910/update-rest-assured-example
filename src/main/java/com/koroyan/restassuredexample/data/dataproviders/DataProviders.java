package com.koroyan.restassuredexample.data.dataproviders;

import com.koroyan.restassuredexample.data.models.MathOperation;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider
    public static Object[][] mathOperations() {
        return new Object[][]{
                {new MathOperation(1, 5)},
                {new MathOperation(2, 9)}
        };
    }
}
