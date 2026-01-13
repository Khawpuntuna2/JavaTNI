public class StudentMain2 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Malee";
        s1.id = "251310001";
        s1.showStatus();
        s1.doHomework(10);
        s1.showStatus();

        s1.doHomework(15);
        s1.showStatus();
        s1.takeExam(15);
        s1.showStatus();


    }
}
