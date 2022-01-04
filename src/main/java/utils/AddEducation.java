package utils;

import entity.pojo.Education;
import entity.pojo.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 莫须有
 * @Date 2021/12/31 14:32
 * @Description 添加学历集合
 */
public class AddEducation {

    public static List getQualification(Person person){
        List qList = new ArrayList();
        switch (person.getQualifications()){
            case 0:
                qList.add(getGrade0());
                break;
            case 1:
                qList.add(getGrade1());
                break;
            case 2:
                qList.add(getGrade1());
                qList.add(getGrade3());
                break;
            case 3:
                qList.add(getGrade1());
                qList.add(getGrade2());
                qList.add(getGrade3());
                break;
            case 4:
                qList.add(getGrade1());
                qList.add(getGrade2());
                qList.add(getGrade4());
                qList.add(getGrade4());
                break;
            case 5:
                qList.add(getGrade1());
                qList.add(getGrade2());
                qList.add(getGrade3());
                qList.add(getGrade4());
                qList.add(getGrade5());
                break;
            case 6:
                qList.add(getGrade1());
                qList.add(getGrade2());
//                qList.add(getGrade6());
                qList.add(getGrade5());
                qList.add(getGrade3());
                qList.add(getGrade4());
                break;
            case 7:
                qList.add(getGrade1());
                qList.add(getGrade2());
                qList.add(getGrade3());
                qList.add(getGrade4());
                qList.add(getGrade5());
                qList.add(getGrade6());
                qList.add(getGrade7());
                break;
            case 8:
                qList.add(getGrade1());
                qList.add(getGrade2());
                qList.add(getGrade3());
                qList.add(getGrade4());
                qList.add(getGrade5());
                qList.add(getGrade6());
//                qList.add(getGrade7());
                qList.add(getGrade8());
                qList.add(getGrade9());
                break;
            case 9:
                qList.add(getGrade1());
                qList.add(getGrade2());
                qList.add(getGrade3());
                qList.add(getGrade4());
                qList.add(getGrade5());
                qList.add(getGrade6());
                qList.add(getGrade7());
//                qList.add(getGrade8());
                qList.add(getGrade9());
                qList.add(getGrade10());
                break;
            default:

        }
        return qList;
    }

    private static Education getGrade0() {
        Education Education = new Education();
        Education.setGrade(0);
        Education.setQualificationsName("文盲");
        Education.setSchoolName("无教育经历");
        return Education;
    }

    public static Education getGrade1() {
        Education Education = new Education();
        Education.setGrade(1);
        Education.setQualificationsName("小学");
        Education.setSchoolName("easyRules小学");
        return Education;
    }

    private static Education getGrade2() {
        Education Education = new Education();
        Education.setGrade(2);
        Education.setQualificationsName("中学");
        Education.setSchoolName("easyRules中学");
        return Education;
    }

    private static Education getGrade3() {
        Education Education = new Education();
        Education.setGrade(3);
        Education.setQualificationsName("高中");
        Education.setSchoolName("easyRules一中");
        return Education;
    }

    private static Education getGrade4() {
        Education Education = new Education();
        Education.setGrade(4);
        Education.setQualificationsName("中专");
        Education.setSchoolName("easyRules科技技术学院");
        return Education;
    }

    private static Education getGrade5() {
        Education Education = new Education();
        Education.setGrade(5);
        Education.setQualificationsName("大专");
        Education.setSchoolName("easyRules科技技术学院");
        return Education;
    }

    private static Education getGrade6() {
        Education Education = new Education();
        Education.setGrade(6);
        Education.setQualificationsName("本科");
        Education.setSchoolName("easyRules科技大学");
        return Education;
    }

    private static Education getGrade7() {
        Education Education = new Education();
        Education.setGrade(7);
        Education.setQualificationsName("研究生");
        Education.setSchoolName("easyRules科技大学");
        return Education;
    }

    private static Education getGrade8() {
        Education Education = new Education();
        Education.setGrade(8);
        Education.setQualificationsName("博士");
        Education.setSchoolName("easyRules科技大学");
        return Education;
    }

    private static Education getGrade9() {
        Education Education = new Education();
        Education.setGrade(9);
        Education.setQualificationsName("博士后");
        Education.setSchoolName("easyRules科技大学");
        return Education;
    }

    private static Education getGrade10() {
        Education Education = new Education();
        Education.setGrade(10);
        Education.setQualificationsName("科学家");
        Education.setSchoolName("easyRules科技大学");
        return Education;
    }

}
