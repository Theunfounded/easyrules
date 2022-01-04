package test;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.JsonRuleDefinitionReader;

import java.io.FileReader;

/**
 * @author 莫须有
 * @Date 2021/12/30 14:13
 * @Description json文件测试
 */
public class JsonTest {

    public static void main(String[] args) {
        MVELRuleFactory factory = new MVELRuleFactory(new JsonRuleDefinitionReader());

        // 读取json文件
        String path = JsonTest.class.getResource("/rules/rain.json").getPath();

        try {
            FileReader jsonFile = new FileReader(path);
            Rule rule = factory.createRule(jsonFile);

            Rules rules = new Rules();
            rules.register(rule);

            Facts facts = new Facts();
            facts.put("rain", true);

            RulesEngine engine = new DefaultRulesEngine();
            engine.fire(rules, facts);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
