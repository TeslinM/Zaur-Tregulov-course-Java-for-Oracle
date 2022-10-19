package lesson20;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"ivanod", "petrov", "sidiriv"};
        String[] exams = {"mat analiz", "philosofia"};

        for(String s1 : students) {
            for(String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
