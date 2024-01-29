package com.example.calculator;

import org.springframework.beans.factory.annotation.Autowired ;
import org.springframework.web.bind.annotation.CrossOrigin    ;
import org.springframework.web.bind.annotation.PostMapping    ;
import org.springframework.web.bind.annotation.RequestBody    ;
import org.springframework.web.bind.annotation.RestController ;

@RestController
@CrossOrigin
public class Controller {

    private final EvaluatingExpression evaluatingExpression ;

    @Autowired
    public Controller(EvaluatingExpression evaluatingExpression) {
        this.evaluatingExpression = evaluatingExpression;
    }

    @PostMapping("expression/evaluation")
    public String result(@RequestBody String expression){

        evaluatingExpression.setExpression(expression) ;
        
        return evaluatingExpression.evaluation(evaluatingExpression.getExpression()) ;
    }
}
