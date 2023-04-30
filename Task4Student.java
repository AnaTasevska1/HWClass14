package HWClass14;

import class11.Student;

/*
Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F
 */
public class Task4Student {
    public String getGrade(int score) {
        if (score > 90) {
            return "A";
        } else if (score > 80) {
            return "B";
        } else if (score > 70) {
            return "C";
        } else if (score > 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Task4Student student = new Task4Student();
        String grade = student.getGrade(85);
        System.out.println(grade);
    }
}