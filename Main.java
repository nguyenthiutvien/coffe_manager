package ProjectUml;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customer = new ArrayList<>();
        ArrayList<Employee> employee = new ArrayList<>();
        ArrayList<Menu> menu = new ArrayList<>();
        ArrayList<Order> order = new ArrayList<>();
        ArrayList<Bill> bill = new ArrayList<>();
        ArrayList<Account> account = new ArrayList<>();

        char choose;
        int chon;// id;
        
        Scanner sc = new Scanner(System.in);
        ManageCoffeeShop manage = new ManageCoffeeShop();
        manage.login();
        while(true) {
            System.out.println("**********MENU***********");
            System.out.println("|1 : Chon Account       |");
            System.out.println("|2 : Chon Customer      |");
            System.out.println("|3 : Chon Employee      |");
            System.out.println("|4 : Chon Menu          |");
            System.out.println("|5 : Chon Order         |");
            System.out.println("|6 : Chon Bill          |");
            System.out.println("|7 : Thoat              |");
            System.out.println("*************************");
            do {
                System.out.print("Lua chon cua ban la: ");
                chon = sc.nextInt();
                if (chon < 0 || chon> 7) {
                    System.err.println("Vui  long chon: 0-7!");
                }
            } while (chon < 0 || chon > 7);
            sc.nextLine();
            switch(chon){
                case 0: break;
                case 1: {
                    System.out.println("*****Menu-Account******");
                    System.out.println("*1 : Nhap Account     *");
                    System.out.println("*2 : Xoa Account      *");
                    System.out.println("*3 : Hien thi Account *");
                    System.out.println("***********************");
                    do {
                        System.out.print("Lua chon cua ban la: ");
                        chon = sc.nextInt();
                        if (chon < 1 || chon > 3) {
                            System.err.println("Vui long chon: 1-3!");
                        }
                    } while (chon < 1 || chon > 3);
                    sc.nextLine();

                    switch (chon) {
                        case 1:
                            do{
                            Account ac = new Account();
                            account.add(ac);
                            do {
                                System.out.print("Tiep tuc nhap account hay khong[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Vui long chon: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                            }while(choose == 'Y'|| choose == 'y');
                

                            break;
                        case 2:
                            manage.showAccount(account);;
                            manage.removeAccount(account);
                            account.remove(manage.id);
                            break;

                        case 3:
                            manage.showAccount(account);
                            break;
                    }
                    break;
                }
            
                case 2: {
                    System.out.println("------Menu-Customer-----");
                    System.out.println("1 :Nhap Customer");
                    System.out.println("2 :Xoa Customer");
                    System.out.println("3 :Hien thi Customer");
                    System.out.println("4 :Tim kiem Customer");
                    System.out.println("5 :Sap xep Customer");
                    System.out.println("6 :Cap nhat Customer");



                    do {
                        System.out.print("Lua chon cua ban la: ");
                        chon = sc.nextInt();
                        if (chon < 1 || chon > 6) {
                            System.err.println("Vui long chon: 1-6!");
                        }
                    } while (chon < 1 || chon > 6);
                    sc.nextLine();

                    switch (chon) {
                        case 1:
                            do{
                                Customer cus = new Customer();
                                customer.add(cus);
                                do {
                                    System.out.print("Tiep tuc nhap Customer hay khong[Y/N] :");
                                    choose = sc.next().charAt(0);
                                    
                                    if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                        System.err.println("Vui long chon: [Y/N]");
                                        }
                                    }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                        
                            }while(choose == 'Y'|| choose == 'y');
                    
                            break;

                        case 2:
                            manage.showCustomer(customer);
                            manage.removeCustomer(customer);
                            customer.remove(manage.id);
                            break;
                        case 3:
                            manage.showCustomer(customer);

                            break;
                        case 4: 
                            manage.searchCustomerID(customer);
                            break;
                        case 5:
                            manage.sortCustomer(customer);
                            break;
                        case 6:
                            manage.updateCustomer(customer);

                        }break;
                    }
                case 3:
                System.out.println("------Menu-Employee-----");
                System.out.println("1 : Nhap Employee");
                System.out.println("2 : Xoa Employee");
                System.out.println("3 : Hien thi Employee");
                do {
                    System.out.print("Lua chon cua ban la: ");
                    chon = sc.nextInt();
                    if (chon < 1 || chon > 3) {
                        System.err.println("Vui long chon: 1-3!");
                    }
                } while (chon < 1 || chon > 3);
                sc.nextLine();

                switch (chon) {
                    case 1:
                        do{
                            Employee emp = new Employee();
                            employee.add(emp);
                            do {
                                System.out.print("Muon nhap customer khac khong[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Please choose: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;

                    case 2:
                        manage.showEmployee(employee);
                        employee.remove(manage.id);

                        break;
                    case 3:
                        manage.showEmployee(employee);

                        break;
                    }break;
            
                case 4:
                    System.out.println("------Menu-Drink-----");
                    System.out.println("1 : Nhap  Drink");
                    System.out.println("2 : Xoa Drink");
                    System.out.println("3 : Hien thi Drink");
                    do {
                        System.out.print("Lua chon cua ban la: ");
                        chon = sc.nextInt();
                        if (chon < 1 || chon > 3) {
                            System.err.println("Vui long chon: 1-3!");
                        }
                    } while (chon< 1 || chon > 3);
                    sc.nextLine();

                    switch (chon) {
                    case 1:
                        do{
                            Menu meu = new Menu();
                            menu.add(meu);
                            do {
                                System.out.print("Muon nhap Drink khac khong[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Vui long chon: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;
                    case 2: 
                        manage.showDrink(menu);;
                        manage.removeDrink(menu);
                        menu.remove(manage.id);

                        break;
                    case 3:
                        manage.showDrink(menu);;
                        break;
                    }break;
                case 5:
                    System.out.println("------Menu-Order-----");
                    System.out.println("1 : Nhap Order");
                    System.out.println("2 : Xoa Order");
                    System.out.println("3 : Hien thi Order");
                do {
                        System.out.print("Lua chon cua ban: ");
                        chon = sc.nextInt();
                        if (chon < 1 || chon > 3) {
                            System.err.println("Please choose: 1-3!");
                        }
                    } while (chon < 1 || chon > 3);
                    sc.nextLine();

                    switch (chon) {
                    case 1:
                        do{
                            Order ord = new Order();
                            order.add(ord);
                            do {
                                System.out.print("Co muon nhap order khac khong[Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Vui long chon: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;
                    case 2: 
                        manage.showOrder(order);
                        manage.removeOrder(order);;
                        order.remove(manage.id);

                        break;
                    case 3:
                        manage.showOrder(order);
    
                        break;
                    }break;
                case 6: 
                    System.out.println("------Menu-Bill-----");
                    System.out.println("1 : Nhap bill");
                    System.out.println("2 : Xoa bill");
                    System.out.println("3 : Hien thi bill");
                    do {
                        System.out.print("Lua chon của ban la : ");
                        chon = sc.nextInt();
                        if (chon < 1 || chon > 3) {
                            System.err.println("Please choose: 1-3!");
                        }
                    } while (chon < 1 || chon > 3);
                    sc.nextLine();

                    switch (chon) {
                    case 1:
                        do{
                            Bill bil = new Bill();
                            bill.add(bil);
                            do {
                                System.out.print("Bạn muon nhap order khac khong [Y/N] :");
                                choose = sc.next().charAt(0);
                                
                                if (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n') {
                                    System.err.println("Vui long chon: [Y/N]");
                                    }
                                }while (choose != 'Y' && choose != 'y' && choose != 'N' && choose != 'n');
                    
                        }while(choose == 'Y'|| choose == 'y');
                
                        break;
                    case 2: 
                        manage.showBill(bill);
                        manage.removeBill(bill);
                        bill.remove(manage.id);

                        break;
                    case 3:
                        manage.showBill(bill);

                        break;
                    }break;
                }
            }
        }
    }          
            
        
    

