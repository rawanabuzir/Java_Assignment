public class StudentsResult {

    static void StudentResult(String name, int mark) {
        char grade;

        if (mark >= 0 && mark <= 49) {
            grade = 'F';
        } else if (mark >= 50 && mark <= 60) {
            grade = 'C';
        } else if (mark >= 61 && mark <= 70) {
            grade = 'D';
        } else if (mark >= 71 && mark <= 80) {
            grade = 'C';
        } else if (mark >= 81 && mark <= 90) {
            grade = 'B';
        } else if (mark >= 91 && mark <= 100) {
            grade = 'A';
        } else {
            System.out.println("Invalid mark for " + name);
            return;
        }

        System.out.println(name + ", your score is " + grade);
    }

    public static void main(String[] args) {
        StudentResult("Rawan", 100);
    }
}
