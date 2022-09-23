package ProjectUml;

import java.util.Scanner;
public class Order{
    private String  customer;
    private String drink;
    private char size;
    private int order_amount;
    private double price;
    private String employee;
    
    public Order(String customer, String drink, char size, int order_amount, double price, String employee) {
        this.customer = customer;
        this.drink = drink;
        this.size = size;
        this.order_amount = order_amount;
        this.price = price;
        this.employee = employee;
    }

    public Order(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khach hang cua order: ");
        customer = sc.nextLine();
        System.out.println("Nhap nuoc uong cua order : ");
        drink = sc.nextLine();
        System.out.println("Nhap size cua loai nuoc uong : ");
        size = sc.next().charAt(0);
        System.out.println("Nhap so luong order : ");
        order_amount = sc.nextInt();
        System.out.println("Nhap gia cua order : ");
        price = sc.nextDouble(); sc.nextLine(); 
        System.out.println("Nhap nhan vien nhan order : ");
        employee = sc.nextLine();

    }
    
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public int getOrder_amount() {
        return order_amount;
    }

    public void setOrder_amount(int order_amount) {
        this.order_amount = order_amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return String.format(" | %-20s| | %-20s| | %-5s| | %-10s| |%-20s |%-20s|",getCustomer(),getDrink(),getSize(),getOrder_amount(),getPrice(),getEmployee());
    }

}

