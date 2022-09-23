package ProjectUml;
import java.util.*;
public class Bill{
    
    private String customer;
    private String drink;
    private int order_amount;
    private double price;
    private double total_price;
    private String date;
    private String employee;
    
    public Bill(String customer, String drink, int order_amount, double price, double total_price, String date,
            String employee) {
        this.customer = customer;
        this.drink = drink;
        this.order_amount = order_amount;
        this.price = price;
        this.total_price = total_price;
        this.date = date;
        this.employee = employee;
    }


    public Bill(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap khach hang:  ");
        customer = sc.nextLine();
      
        System.out.println("Nhap nuoc uong order  : ");
        drink = sc.nextLine();
      
        System.out.println("Nhap so luong order: ");
        order_amount = sc.nextInt();
        
        System.out.println("Nhap gia cua order: ");
        price = sc.nextDouble();

        System.out.println("Nhap tong gia cua bill: ");
        total_price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Nhap ten nhan vien quan ly bill : ");
        employee = sc.nextLine();
        System.out.println("Nhap ngay cua bill : ");
        date = sc.nextLine();
        
       

    }

    

    public String getDrink() {
        return drink;
    }


    public void setDrink(String drink) {
        this.drink = drink;
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


    public String getCustomer() {
        return customer;
    }


    public void setCustomer(String customer) {
        this.customer = customer;
    }


    public double getTotal_price() {
        return total_price;
    }


    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }


    public String getDate() {
        return date;
    }


    public void setDate(String date) {
        this.date = date;
    }


    public String getEmployee() {
        return employee;
    }


    public void setEmployee(String employee) {
        this.employee = employee;
    }


    @Override
    public String toString() {
        return String.format("| %-20s| | %-20s| | %-5d| | %-15f| | %-15f| |%-20s| |%-20s|",getCustomer(),getDrink(),getOrder_amount(),getPrice(),getTotal_price(),getDate(),getEmployee());
    }
}

