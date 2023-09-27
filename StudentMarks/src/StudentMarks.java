public class StudentsResult {

    static void StudentResult(String name, int mark) {
        if (mark >= 0 && mark <= 49) {
            System.out.println("Please correct your situation " + name + ", your score is F");
        } else if (mark >= 50 && mark <= 60) {
            System.out.println("Not bad " + name + ", your score is C");
        } else if (mark >= 61 && mark <= 70) {
            System.out.println("Good " + name + ", your score is D+");
        } else if (mark >= 71 && mark <= 80) {
            System.out.println("Very Good " + name + ", your score is C");
        } else if (mark >= 81 && mark <= 90) {
            System.out.println("Excellent " + name + ", your score is B");
        } else if (mark >= 91 && mark <= 100) {
            System.out.println("Outstanding " + name + ", your score is A");
        }
    }

    public static void main(String[] args) {
        StudentResult("Rawan", 100);
    }
}
