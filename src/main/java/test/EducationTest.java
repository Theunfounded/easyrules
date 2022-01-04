package test;

import config.MyRulesListener;
import entity.pojo.Person;
import entity.rules.education.CheckIt;
import entity.rules.education.EducationAdd;
import entity.rules.education.QualificationNotMach;
import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.core.DefaultRulesEngine;

/**
 * @author 莫须有
 * @Date 2021/12/31 15:11
 * @Description 学历规则匹配测试
 */
public class EducationTest {

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("曾绍楷");
        person.setAge(25);
        person.setQualifications(6);

        Facts facts = new Facts();
        facts.put("person", person);

        Rules rules = new Rules();
        rules.register(new EducationAdd());
        rules.register(new CheckIt());
        rules.register(new QualificationNotMach());

        DefaultRulesEngine engine = new DefaultRulesEngine();
        engine.registerRuleListener(new MyRulesListener());
        engine.fire(rules, facts);
//        Person person1 = facts.get("person");
//        System.out.println(person1);
        System.out.println("----------------------------");
        System.out.println(person);
    }
}
