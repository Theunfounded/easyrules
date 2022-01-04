package entity.rules.education;

import entity.pojo.Education;
import entity.pojo.Person;
import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Fact;
import org.jeasy.rules.annotation.Rule;
import org.jeasy.rules.api.Facts;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 莫须有
 * @Date 2021/12/31 17:51
 * @Description 学历造假规则匹配
 */
@Rule(name = "QualificationNotMach", description = "学历检测未通过匹配规则")
public class QualificationNotMach {

    @Condition
    public boolean qualificationNotMach(@Fact("person")Person person, Facts facts){
        List<Education> educationList = person.getEducationList();
        System.out.println("排序前：");
        System.out.println(person);

        List<Education> collect = educationList.stream().sorted(Comparator.comparing(Education::getGrade).reversed()).collect(Collectors.toList());

        person.setEducationList(collect);
        facts.put("person", person);
        return !(person.getQualifications() == educationList.size() && collect.get(0).getGrade() == person.getQualifications());
    }

    @Action
    public void add(Facts facts){
        Person person = facts.get("person");
        person.setDec("存在学历造假的嫌疑！");

        facts.put("person", person);
    }
}
