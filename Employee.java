package ProjectUml;


import java.util.*;

public class Employee extends Person{

    private Person person;
    private double salary;
   
    
    public Employee(String name, String gender, String age, String address, String email, String phone, Person person,
            double salary) {
        super(name, gender, age, address, email, phone);
        this.person = person;
        this.salary = salary;
    }

    public Employee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten nhan vien : ");
        String name = sc.nextLine();
        System.out.println("Nhap gioi tinh nhan vien : ");
        String gender = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien: ");
        String age = sc.nextLine();
        System.out.println("Nhap dia chi nhan vien : ");
        String address = sc.nextLine();
        System.out.println("Nhap email nhan vien : ");
        String email = sc.nextLine();
        System.out.println("Nhap so dien thoai nhan vien: ");
        String phone = sc.nextLine();
        System.out.println("Nhap luong : ");
        salary = sc.nextDouble(); sc.nextLine();
    }
    public Employee(String name) {
        super(name);
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return String.format(" | %-20s| | %-10s| | %-10s| | %-20s| | %-20s| | %-20s| | %-20s|",getName(),getGender(),getAge(),getAddress(),getEmail(),getPhone(),getSalary());
    }
}
    

