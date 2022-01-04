package entity.rules.air;

import org.jeasy.rules.api.Action;
import org.jeasy.rules.api.Facts;

/**
 * @author 莫须有
 * @Date 2021/12/28 16:26
 * @Description
 */
public class DecreaseTemperatureAction implements Action {
    @Override
    public void execute(Facts facts) throws Exception {
        System.out.println("cool facts: " + facts.toString());
        System.out.println("温度太高了，降降温！！！");
        Integer temperature = facts.get("temperature");
        facts.put("temperature", temperature - 1);
    }

    public static DecreaseTemperatureAction decreaseTemperature() {
        return new DecreaseTemperatureAction();
    }
}
