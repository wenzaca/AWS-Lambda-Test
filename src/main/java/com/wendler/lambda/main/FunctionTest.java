package com.wendler.lambda.main;

import com.amazonaws.services.lambda.AWSLambdaClient;
import com.amazonaws.services.lambda.invoke.LambdaInvokerFactory;
import com.wendler.lambda.entities.Person;
import com.wendler.lambda.lambda.ValidatorCPF;

public class FunctionTest {

    public static void main(String[] args) {

        ValidatorCPF validatorCPF = LambdaInvokerFactory.builder()
                                                        .lambdaClient(AWSLambdaClient.builder()
                                                                                     .withRegion("us-east-1")
                                                                                     .build())
                                                        .build(ValidatorCPF.class);
        System.out.println(validatorCPF.validateCPF(new Person("Lucas", "Silva", "92071312007")));
    }
}
