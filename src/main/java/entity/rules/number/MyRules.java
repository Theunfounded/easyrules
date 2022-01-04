package entity.rules.number;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;

/**
 * @author 莫须有
 * @Date 2021/12/28 14:41
 * @Description 测试规则
 */
@Rule(name = "myRules", description = "this is myRules", priority = 1)
public class MyRules {

    @Condition
    public boolean when(){
        return true;
    }

    @Action
    public void then(){
        System.out.println("hello world");
    }
}
