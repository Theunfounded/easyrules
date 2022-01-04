package test;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRuleFactory;
import org.jeasy.rules.support.reader.YamlRuleDefinitionReader;

import java.io.FileReader;

/**
 * @author 莫须有
 * @Date 2021/12/30 13:58
 * @Description yml文件测试
 */
public class YmlTest {

    public static void main(String[] args) {
        MVELRuleFactory ruleFactory = new MVELRuleFactory(new YamlRuleDefinitionReader());

        // 读取规则文件
        String path = YmlTest.class.getResource("/rules/rain.yml").getPath();

        try {
            FileReader ymlReader = new FileReader(path);
            Rule rule = ruleFactory.createRule(ymlReader);

            Rules rules = new Rules();
            rules.register(rule);

            Facts facts = new Facts();
            facts.put("rain", true);

            RulesEngine engine = new DefaultRulesEngine();
            engine.fire(rules, facts);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
