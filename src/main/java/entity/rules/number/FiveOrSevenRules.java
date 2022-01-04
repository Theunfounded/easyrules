package entity.rules.number;

import org.jeasy.rules.support.composite.UnitRuleGroup;

/**
 * @author 莫须有
 * @Date 2021/12/28 15:05
 * @Description 多规则匹配
 */
public class FiveOrSevenRules extends UnitRuleGroup{

    public FiveOrSevenRules(Object... rules){
        for (Object rule : rules) {
            this.addRule(rule);
        }
    }

    @Override
    public int getPriority() {
        return 0;
    }
}
