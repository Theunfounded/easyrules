package entity.rules.number;

import org.jeasy.rules.annotation.*;
import org.jeasy.rules.api.Facts;

/**
 * @author 莫须有
 * @Date 2021/12/28 15:00
 * @Description 匹配能被7整除的数
 */
@Rule(name = "sevenRules", description = "this is sevenRules")
public class SevenRules {

    @Condition
    public boolean isSeven(@Fact("number") Integer number){
        System.out.println("触发规则isSeven Condition");
//        System.out.println(1/0);
        return number % 7 == 0;
    }

    @Action
    public void then(Facts facts){
        int number = facts.get("number");
        facts.put("number", number + 1);
        System.out.println("0000");
        System.out.println(number + " 是7的倍数！触发isSeven action");
    }

    @Priority
    public int getPriority(){
        return 10;
    }
}
