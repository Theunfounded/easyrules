package entity.pojo;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author 莫须有
 * @Date 2021/12/31 13:53
 * @Description
 */
@Data
public class Education implements Serializable {
    // 学习名称
    private String schoolName;

    // 学历名称
    private String qualificationsName;

    // 学历等级
    private int grade; // 学历等级 0文盲 1小学 2中学 3高中 4中专 5大专 6本科 7研究生 8博士 9博士后

}
