package entity.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author 莫须有
 * @Date 2021/12/31 13:59
 * @Description
 */
@Data
public class Person {
    // 姓名
    private String name;

    // 年龄
    private int age;

    // 描述
    private String dec;

    // 学历等级
    private int qualifications;

    private List<Education> educationList;
}
