interface LoginSystem {
    boolean login(String id, String password);
}

class UniversityPortal implements LoginSystem {

    @Override
    public boolean login(String id, String password) {
        if (id.equals("student123") && password.equals("pass123")) {
            return true;
        } else {
            System.out.println("Invalid credentials");
            return false;
        }
    }
}

public class logport {
    public static void main(String[] args) {
        UniversityPortal portal = new UniversityPortal();
        
        
        boolean loginSuccess1 = portal.login("student123", "pass123");
        System.out.println("Login successful: " + loginSuccess1);
        
        boolean loginSuccess2 = portal.login("student123", "wrong pass");
        System.out.println("Login successful: " + loginSuccess2);
    }
}