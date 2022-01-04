package test;

import entity.rules.air.DecreaseTemperatureAction;
import entity.rules.air.HighTemperatureCondition;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.InferenceRulesEngine;
import org.jeasy.rules.core.RuleBuilder;

/**
 * @author 莫须有
 * @Date 2021/12/28 16:29
 * @Description 温度测试
 */
public class TemperatureController {

    public static void main(String[] args) {
        Facts facts = new Facts();
        facts.put("temperature", 30);

        Rule airRule = new RuleBuilder()
                .name("air condition rule")
                .when(HighTemperatureCondition.itIsHot())
                .then(DecreaseTemperatureAction.decreaseTemperature())
                .build();

        Rules rules = new Rules();
        rules.register(airRule);

        RulesEngine engine = new InferenceRulesEngine();
        engine.fire(rules, facts);
    }
}
