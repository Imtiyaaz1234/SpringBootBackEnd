package com.imtiyaaz.tpapppractical.Factories;

import com.imtiyaaz.tpapppractical.Domain.Client;
import com.imtiyaaz.tpapppractical.Domain.Operations;
import com.imtiyaaz.tpapppractical.Domain.User;

import java.util.Date;
import java.util.Map;

/**
 * Created by Ameer on 2017/08/13.
 */
public class OperationsFactory {

    public static Operations getOperations(Map<String, Object> values, String operationName){
                Operations operations = new Operations.Builder()
                        .user((User)values.get("user"))
                        .client((Client)values.get("client"))
                        .operationName((String)values.get("operationName"))
                        .operationTime((Date)values.get("operationTime"))
                        .build();

                        return operations;

    }
}
