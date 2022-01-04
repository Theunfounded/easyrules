package test;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRule;

/**
 * @author 莫须有
 * @Date 2021/12/29 14:58
 * @Description 流式规则测试
 */
public class FluentTest {

    public static void main(String[] args) {
        Rule weatherRule = new MVELRule()
                .name("weather rule")
                .description("if it rains then take an umbrella")
                .when("rain == true")
                .then("System.out.println(\"It rains, take an umbrella! \nThat's fluentTest!\");");

        Rules rules = new Rules();
        rules.register(weatherRule);

        Facts facts = new Facts();
        facts.put("rain", true);

        RulesEngine engine = new DefaultRulesEngine();
        engine.fire(rules, facts);
    }
}
