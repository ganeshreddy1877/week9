
public class Week9Q4 {

    String universityName = "Amrita University";

    class Department {

        String deptName = "computer science";
        int deptcode = 101;

        void displayDepartmentInfo() {
            System.out.println("department" + deptName);
            System.out.println("department" + deptcode);
        }
    }

    class student {

        String stdname = "Ganesh Reddy";
        int stdcode = 1877;

        void displayStudentInfo() {
            System.out.println("department" + stdname);
            System.out.println("department" + stdcode);

        }
    }

    public static void main(String[] args) {
        Week9Q4 uni = new Week9Q4();
        System.err.println("University" + uni.universityName);
        System.err.println("*****Department__Info*****");
        Week9Q4.Department dept = uni.new Department();
        dept.displayDepartmentInfo();

        System.out.println("***** Student Info *****");
        Week9Q4.student stdent = uni.new student();
        stdent.displayStudentInfo();
    }
}
