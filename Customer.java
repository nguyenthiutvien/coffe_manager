package ProjectUml;

import java.util.Scanner;
public class Customer extends Person{
    //Khách hàng (Mã khách hàng, Tên khách hàng, Địa chỉ, Số điện thoại) 
    private Person person;
    public Customer(String name, String gender, String age, String address, String email, String phone, Person person) {
        super(name, gender, age, address, email, phone);
        this.person = person;
    }

    public Customer(String name, Person person) {
        super(name);
        this.person = person;
    }

    private String choose;
    
    
    public Customer(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten khach hang : ");
        String name = sc.nextLine();
        setName(name);
        System.out.println("Nhap gioi tinh : ");
        String gender = sc.nextLine();
        setGender(gender);
        System.out.println("Nhap tuoi : ");
        String age = sc.nextLine();
        setAge(age);
        System.out.println("Nhap dia chi : ");
        String address = sc.nextLine();
        setAddress(address);;
        System.out.println("Nhap email : ");
        String email = sc.nextLine();
        setEmail(email);;
        System.out.println("Nhap so dien thoai: ");
        String phone = sc.nextLine();
        setPhone(phone);;
    
    }    

    public Customer(String name) {
        super(name);
    }
    
    public Person getPerson() {
        return person;
    }
    public void setPerson(Person person) {
        this.person = person;
    }
    
    public String getChoose() {
        return choose;
    }

    public void setChoose(String choose) {
        this.choose = choose;
    }
    
    @Override
    public String toString() {
        return String.format(" |%-20s| |%-10s| |%-10s| |%-20s| |%-30s| |%-20s|",getName(),getGender(),getAge(),getAddress(),getEmail(),getPhone());
    }
}
    
