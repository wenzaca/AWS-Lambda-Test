package com.wendler.lambda.lambda;

import com.amazonaws.services.lambda.invoke.LambdaFunction;
import com.wendler.lambda.entities.Person;

public interface ValidatorCPF {
    @LambdaFunction(functionName = "myFunctionTest")
    String validateCPF(Person person);
}
