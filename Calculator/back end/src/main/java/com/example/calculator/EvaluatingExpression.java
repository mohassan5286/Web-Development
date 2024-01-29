package com.example.calculator ;


import org.springframework.stereotype.Service ;

import javax.script.ScriptEngine        ;
import javax.script.ScriptEngineManager ;
import javax.script.ScriptException     ;
import java.util.Objects;

@Service
public class EvaluatingExpression {
    private String expression ;

    ScriptEngineManager mgr = new ScriptEngineManager() ;
    ScriptEngine engine = mgr.getEngineByName("JavaScript") ;

    public String getExpression() {
        return expression ;
    }

    public void setExpression(String expression) {
        this.expression = expression ;
    }

    public String evaluation(String expression){

        expression = expression.replaceAll("÷", "/").replaceAll("×", "*") ;

        try {
            if (Objects.equals(engine.eval(expression).toString(), "Infinity") || Objects.equals(engine.eval(expression).toString(), "NaN"))
                return ("Error Division by zero") ;

            return engine.eval(expression).toString() ;
        }

        catch (ScriptException e) {

            return ("Error Invalid expression") ;
        }

    }

}
