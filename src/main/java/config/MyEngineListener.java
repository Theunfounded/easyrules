package config;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngineListener;

/**
 * @author 莫须有
 * @Date 2021/12/31 11:08
 * @Description 规则引擎监听器
 */
public class MyEngineListener implements RulesEngineListener {
    @Override
    public void beforeEvaluate(Rules rules, Facts facts) {
        System.out.println("engine beforeEvaluate 触发");
    }

    @Override
    public void afterExecute(Rules rules, Facts facts) {
        System.out.println("engine afterExecute 触发");
    }
}
