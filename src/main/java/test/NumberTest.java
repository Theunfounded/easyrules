package test;

import config.MyEngineListener;
import config.MyRulesListener;
import entity.rules.number.SevenRules;
import org.jeasy.rules.api.*;
import org.jeasy.rules.core.DefaultRulesEngine;

/**
 * @author 莫须有
 * @Date 2021/12/28 15:30
 * @Description 取模规则匹配
 */
public class NumberTest {

    public static void main(String[] args) {

        Rules rules = new Rules();
        rules.register(new SevenRules());
//        rules.register(new FiveRules());
//        rules.register(new FiveOrSevenRules(new FiveRules(), new SevenRules()));

        Facts facts = new Facts();

        int number = 35;
        facts.put("number", number);
        facts.put("rain", false);

        RulesEngineParameters parameters = new RulesEngineParameters();
//        parameters.setSkipOnFirstAppliedRule(true);
//        parameters.setSkipOnFirstFailedRule(true);
//        parameters.setSkipOnFirstNonTriggeredRule(true);
//        parameters.setPriorityThreshold(5);

        DefaultRulesEngine engine = new DefaultRulesEngine();
//        InferenceRulesEngine engine = new InferenceRulesEngine();
//        RulesEngine engine1 = new DefaultRulesEngine();
        engine.registerRulesEngineListener(new MyEngineListener());
        engine.registerRuleListener(new MyRulesListener());

//        RulesEngine engine2 = new InferenceRulesEngine(parameters);
        engine.fire(rules, facts);
        Object number1 = facts.get("number");
        System.out.println(number1);
        System.out.println("--------------------------");
//        engine1.fire(rules, facts);
//        System.out.println("--------------------------");
    }
}
