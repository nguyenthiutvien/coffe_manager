package ProjectUml;
import java.util.*;
public class Account {
    private String userName;
    private String password;
    public Account(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    private static Scanner sc = new Scanner(System.in);

    public Account() {
        System.out.println("Da them account!");
        System.out.println("Nhap User Name: ");
        String userName = sc.nextLine();
        setUserName(userName);
        System.out.print("Nhap Password: ");
        String password = sc.nextLine();
        setPassword(password);
    }

    void add(ArrayList<String> userName,ArrayList<String> password){

    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("|%-20s| |%-10s|",userName,password);
    }

}

