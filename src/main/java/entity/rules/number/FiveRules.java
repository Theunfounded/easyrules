package entity.rules.number;

import org.jeasy.rules.annotation.*;

/**
 * @author  莫须有
 * @Date 2021/12/28 14:54
 * @Description 检测规则是否能被5整除
 */
@Rule(name = "fiveRules", description = "this is fiveRules")
public class FiveRules {

    @Condition
    public boolean isFive(@Fact("number") Integer number){
        System.out.println("触发规则isFive Condition");
//        System.out.println(1/0);
        return number % 5 == 0;
    }

    @Action
    public void isFizz(@Fact("number") Integer number){
        System.out.println(number + "是5的倍数 触发Action");
//        System.out.println(1/0);
    }

    @Priority
    public int getPriority(){
        return 5;
    }
}
