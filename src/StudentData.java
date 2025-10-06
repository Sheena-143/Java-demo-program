public class StudentData {
    public  void studentName() {
        System.out.println("Name: Amit");
    }
    public void studentList(){
        System.out.println();
    }
    public void studentMark(){
        System.out.println("Marks : 1000");
    }
    public void studentAddress(){
        System.out.println("Address: Maharashtra");
    }

    public static void main(String[] args) {
        StudentData info = new StudentData();
        info.studentName();
        info.studentList();
        info.studentMark();
        info.studentAddress();
    }
}
