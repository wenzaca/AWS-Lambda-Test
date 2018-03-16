package com.wendler.lambda.controller;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.wendler.lambda.entities.Person;

public class LambdaController implements RequestHandler<Person, String> {

    @Override
    public String handleRequest(Person input, com.amazonaws.services.lambda.runtime.Context context) {

        CPFValidator cpfValidator = new CPFValidator(false);
        try {
            cpfValidator.assertValid(input.getCpf());
        } catch (InvalidStateException e) {
            return e.getMessage();
        }
        return "Welcome " + input.toString();
    }
}
