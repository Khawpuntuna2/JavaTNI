public class Student {
    public String name;
    public String id;
    public int score = 0;

    public void doHomework(int point) {
        score += point;
        System.out.println(name + " did homework " + point +" points");
    }
    public void takeExam(int point) {
        score += point;
        System.out.println(name+" took exam "+point+" points");
    }
    public String getResult(){
        if (score>50) return "PASS";
        return "FAIL";
    }
    public void showStatus(){
            System.out.println("Name\t: "+name+
                                "\nID\t    : "+id+
                                "\nScore\t: "+score+
                                "\nResult\t: "+ getResult());
    }
}
