package oop2;

import java.util.Scanner;

public class PizzaOrderManager extends ab2 {

    public static void main(String[] args) {
// Declare Variables
        int numberOfPizzasOrdered;
        int numberOfCurrentPizza = 1;

//Declare input Scanners
        Scanner numberOfPizzasOrderedScanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

//Adding a new Order
        do{
        wellcom a = new wellcom();
        a.showintro();
        numberOfPizzasOrdered = numberOfPizzasOrderedScanner.nextInt();
        System.out.println("");

//declaring a counter
        int i = 1;

//creating a loop to display entry details for pizzas
        while (i <= numberOfPizzasOrdered) {
            System.out.println("Enter Details of Pizza & Salad Order " + numberOfCurrentPizza + ":");
            System.out.println("===================");
//Details of the new order
            PizzaOrder p1 = new PizzaOrder();
            saladOrder s1 = new saladOrder();
            System.out.print("ID: ");
            p1.setId(scanner.nextInt());

            if (p1.getId() <= 1000) {
                System.out.print("Please enter a number higher than 1000: ");
                p1.setId(scanner.nextInt());
            }
            scanner.nextLine();
            System.out.print("Name: ");
            p1.setName(scanner.nextLine());
            System.out.print("Phone: ");
            p1.setPhoneNumber(scanner.nextLine());
            p1.pizzamanu();
            System.out.print("Order(pizza): ");
            p1.setOrder(scanner.nextLine().trim());
            s1.saladmanu();
            System.out.print("Orde(salad): ");
            s1.setOrder(scanner.nextLine().trim());
            System.out.print("Type (Pick-Up or Delivery): ");
            p1.setType(scanner.next());
            a.showmem();

//Display Pizza salad Order Details
            System.out.println("");
            System.out.println("Details of Pizza Order " + numberOfCurrentPizza + ":");
            System.out.println("=======================");
            System.out.println("ID: " + p1.getId());
            System.out.println("Name: " + p1.getName());

            System.out.println("Phone: " + p1.getPhoneNumber());

            System.out.println("Order(Pizza): " + p1.getOrder());   //Type of Pizza eg; Peperoni
            System.out.println("Order(salad): " + s1.getOrder());
            System.out.println("Type (Pick-up or Delivery(plus20 bath)): " + p1.getType());   // Pickup or Delivery 
            System.out.println("Pizza Cost ($): " + p1.determinePizzaPrice());
            System.out.println("salad Cost ($): " + s1.determinesalapPrice());
            System.out.println("Calculate total cost ($): " + (p1.totalCost() + s1.determinesalapPrice()));
            switch (a.member) {
                case 1:
                    System.out.println("Member total cost" + (p1.totalCost() + s1.determinesalapPrice() - 50));
                    break;
                case 2:
                    System.out.println("Member total cost" + (p1.totalCost() + s1.determinesalapPrice() - 70));
                    break;
                case 3:
                    System.out.println("Member total cost" + (p1.totalCost() + s1.determinesalapPrice() - 100));
                    break;
                case 4:
                    System.out.println("Member total cost" + (p1.totalCost() + s1.determinesalapPrice()));
                    break;
                default:
                    System.out.println("Member total cost" + (p1.totalCost() + s1.determinesalapPrice()));
                    break;
            }

            numberOfCurrentPizza = numberOfCurrentPizza + 1;
            i++;

        } //end while
         System.out.println("");
         System.out.print("สั่งอาหารอีกมั้ย :(Y/N)");
        } while (scanner.next().equalsIgnoreCase("Y"));
    }

}