package test;

import entity.rules.WeatherRules;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

/**
 * @author 莫须有
 * @Date 2021/12/29 14:53
 * @Description 规则测试
 */
public class PojoTest {

    public static void main(String[] args) {
        Facts facts = new Facts();
        facts.put("rain", true);

        // define rules
        Rules rules = new Rules();
        rules.register(new WeatherRules());

        // fire rules on known facts
        RulesEngine rulesEngine = new DefaultRulesEngine();
        rulesEngine.fire(rules, facts);
    }
}
