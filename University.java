
public class University {

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
        University uni = new University();
        System.err.println("University" + uni.universityName);
        System.err.println("*****Department__Info*****");
        University.Department dept = uni.new Department();
        dept.displayDepartmentInfo();

        System.out.println("***** Student Info *****");
        University.student stdent = uni.new student();
        stdent.displayStudentInfo();
    }
}
