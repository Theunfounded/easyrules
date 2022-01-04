package config;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.RuleListener;

/**
 * @author 莫须有
 * @Date 2021/12/30 18:20
 * @Description 规则监听器
 */
public class MyRulesListener implements RuleListener {
    @Override
    public boolean beforeEvaluate(Rule rule, Facts facts) {
        System.out.println("beforeEvaluate 触发");
        return true;
    }

    @Override
    public void afterEvaluate(Rule rule, Facts facts, boolean evaluationResult) {
        System.out.println("afterEvaluate 触发");
    }

    @Override
    public void onEvaluationError(Rule rule, Facts facts, Exception exception) {
        System.out.println("onEvaluationError 触发");
    }

    @Override
    public void beforeExecute(Rule rule, Facts facts) {
        System.out.println("beforeExecute 触发");
    }

    @Override
    public void onSuccess(Rule rule, Facts facts) {
        System.out.println("onSuccess 触发");
    }

    @Override
    public void onFailure(Rule rule, Facts facts, Exception exception) {
        System.out.println("onFailure 触发");
    }
}
