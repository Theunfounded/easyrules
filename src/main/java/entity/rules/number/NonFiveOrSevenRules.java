package entity.rules.number;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;

/**
 * @author 莫须有
 * @Date 2021/12/28 15:25
 * @Description  匹配既不能被5整除也不能被7整除的数
 */
@Rule
public class NonFiveOrSevenRules {

    @Condition
    public boolean nonFiveOrSeven(@Fact("number") Integer number){
        return number % 5 != 0 || number % 7 != 0;
    }

    @Action
    public void then(@Fact("number") Integer number){
        System.out.println(number + "既不是5的倍数，也不是7的倍数！");
    }
}
