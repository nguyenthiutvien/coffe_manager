package ProjectUml;
import java.util.*;
public class Menu{
    private String drinktype;
    private String name;
    private char size;
    private double price;
    private String note;

    public Menu(String drinktype, String name, char size, double price, String note) {
        this.drinktype = drinktype;
        this.name = name;
        this.size = size;
        this.price = price;
        this.note = note;
    }

    public Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai nuoc uong: ");
        drinktype = sc.nextLine();
        setDrinktype(drinktype);
        System.out.println("Nhap ten loai nuoc uong : ");
        name = sc.nextLine();
        setName(name);
        System.out.println("Nhap size : ");
        size = sc.next().charAt(0);
        setSize(size);
        System.out.println("Nhap gia: ");
        price = sc.nextDouble();
        setPrice(price);
        System.out.println("Nhap ghi chu/ tinh trang : ");
        sc.nextLine();
        note = sc.nextLine();
        setNote(note);
    }
    
    public String getDrinktype() {
        return drinktype;
    }

    public void setDrinktype(String drinktype) {
        this.drinktype = drinktype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format(" | %-10s| | %-20s| | %-5s| | %-15f| |%-20s|",getDrinktype(), getName(), getSize(),getPrice(), getNote() );
    }
}


