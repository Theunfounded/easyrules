package entity.rules;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

/**
 * @author 莫须有
 * @Date 2021/12/29 14:56
 * @Description 天气匹配
 */
@Rule(name = "weather rule", description = "if it rains then take an umbrella")
public class WeatherRules {
    @Condition
    public boolean itRains(@Fact("rain") boolean rain) {
        return rain;
    }

    @Action
    public void takeAnUmbrella() {
        System.out.println("It rains, take an umbrella!");
    }
}
