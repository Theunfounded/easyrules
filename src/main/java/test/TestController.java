package test;

import config.MyRulesListener;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

/**
 * @author 莫须有
 * @Date 2021/12/28 14:42
 * @Description 规则监听测试
 */
public class TestController {

    public static void main(String[] args) {
        Facts facts = new Facts();

        Rules rules = new Rules();
        rules.register(new MyRulesListener());

        RulesEngine rulesEngine = new DefaultRulesEngine();
        rulesEngine.fire(rules, facts);

    }
}
