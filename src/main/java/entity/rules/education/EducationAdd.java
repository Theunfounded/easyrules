package entity.rules.education;

import entity.pojo.Person;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;
import utils.AddEducation;

import java.util.List;

/**
 * @author 莫须有
 * @Date 2021/12/31 15:22
 * @Description 根据学历添加学历集合
 */
@Rule(name = "EducationAdd", description = "添加学历规则匹配")
public class EducationAdd {

    @Condition
    public boolean educationAdd(@Fact("person") Person person){
        return person.getQualifications() >=0 &&  person.getQualifications() <= 10;
    }

    @Action
    public void add(Facts facts){
        Person person = facts.get("person");

        List list = AddEducation.getQualification(person);

        person.setEducationList(list);

        facts.put("person", person);
    }
}
