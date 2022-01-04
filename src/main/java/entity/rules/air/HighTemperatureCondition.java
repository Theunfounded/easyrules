package entity.rules.air;

import org.jeasy.rules.api.Condition;
import org.jeasy.rules.api.Facts;

/**
 * @author 莫须有
 * @Date 2021/12/28 16:23
 * @Description
 */
public class HighTemperatureCondition implements Condition {

    @Override
    public boolean evaluate(Facts facts) {
        System.out.println("hot facts: " + facts.toString());
        Integer temperature = facts.get("temperature");
        return temperature > 25;
    }

    public static HighTemperatureCondition itIsHot() {
        return new HighTemperatureCondition();
    }
}
