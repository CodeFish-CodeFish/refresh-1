package Day4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {
        Map<String, Integer> nameGradeMap = new HashMap<>();
        nameGradeMap.put("John", 100);
        nameGradeMap.put("Sarah", 100);
        nameGradeMap.put("Steven", 77);
        nameGradeMap.put("Pat", 85);

        System.out.println(nameGradeMap);

        Integer johnGrade = nameGradeMap.get("John");
        System.out.println("John's grade is: " + johnGrade);

        Integer temirlanGrade = nameGradeMap.get("Temirlan");
        System.out.println("temirlan's grade is: " + temirlanGrade);

        nameGradeMap.put("Steven", 94);
        nameGradeMap.put("Steven", 91);
        nameGradeMap.put("Steven", 1);
        nameGradeMap.put("Steven", 19);
        nameGradeMap.put("Steven", 100);

        System.out.println(nameGradeMap);

        MapIntro intro = new MapIntro();
        List<String> students = intro.getExcellentStudentList(nameGradeMap);
        System.out.println("Students with 100 are " + students);
    }
    public List<String> getExcellentStudentList(Map<String, Integer> studentNameGradeMap) {
        //Find names of students who got 100
        List<String> studentNames = new ArrayList<>();
        for (String name : studentNameGradeMap.keySet()) {
            System.out.println(name);//studentNameGradeMap.get("Temirlan");
            Integer grade = studentNameGradeMap.get(name);
            if (grade == 100) {
                studentNames.add(name);
            }
        }
        return studentNames;
    }


}
