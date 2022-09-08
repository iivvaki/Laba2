import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {

    private static Customer[] enterInfo(int count){
        Customer[] customers = new Customer[count];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < customers.length; i++){
            customers[i] = new Customer();
            System.out.print("Id: ");
            customers[i].setId(scan.nextInt());
            scan.nextLine();
            System.out.print("Name: ");
            customers[i].setName(scan.nextLine());
            System.out.print("Secondname: ");
            customers[i].setSecondName(scan.nextLine());
            System.out.print("Fathername: ");
            customers[i].setFatherName(scan.nextLine());
            System.out.print("Address: ");
            customers[i].setAddress(scan.nextLine());
            System.out.print("Number card: ");
            customers[i].setNumberCard(scan.nextInt());
            System.out.print("Balance: ");
            customers[i].setBalance(scan.nextInt());
            System.out.println("\n");

        }
        return customers;
    }

    private static void findName(Customer[] customers){
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = scan.nextLine();

        for(Customer customer : customers){
            if(customer.getName().equals(name)){
                System.out.println(customer);
            }
        }
    }

   private static void findCard(Customer[] arr){
        Scanner scan = new Scanner(System.in);
        int x, y;
        System.out.println("Enter interval ");
       System.out.print("Enter x: ");
        x = scan.nextInt();
       System.out.print("Enter y: ");
        y = scan.nextInt();

        if (x>y){
            int add = x;
            x = y;
            y = add;
        }

        for(Customer customers : arr){
            if(customers.getNumberCard() >= x && customers.getNumberCard() <= y){
                System.out.println(customers);
            }
        }
    }

    private static void checkBalance(Customer[] arr){
        int count = 0;
        for (int i =0; i < arr.length; i++){
            if(arr[i].getBalance() < 0){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Count of negative balance: " + count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter count: ");
        int count = scan.nextInt();

        Customer[] customers = enterInfo(count);



        findName(customers);
        System.out.println();
        findCard(customers);
        System.out.println("Customers with negative balance");
        checkBalance(customers);
    }
}

