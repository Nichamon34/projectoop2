package oop2;

public class saladOrder extends PizzaOrder implements salmanu {

    private int id;
    private String name;
    private String phoneNumber;
    private String order;
    private String type;
    double price1; //p is the cost of the salad

    public double determinesalapPrice() {
        if (getOrder().equals("Spicy Carrot Salad")) {
            price1 = 150.0;
        }//end if for order Hawaiian
        else if (getOrder().equals("Herb Salad")) {
            price1 = 100.0;
        }//end else-if for order Meat Lovers
        else if (getOrder().equals("Champagne Greens")) {
            price1 = 50.0;
        } //end else-if for order Aussie
        else if (getOrder().equals("Caesar Salad")) {
            price1 = 120.0;
        }//end else-if for order Supreme
        else if (getOrder().equals("Panzanella")) {
            price1 = 250.0;
        }//end else-if for order Pepperoni
        else {
            System.out.println("Error: Incorrect Order name has been entered. Please ensure it is spelt correctly");
        }//end else 
        return price1;
    }

    public void saladmanu() {
        for(int h =0; h<7;h++){
        System.out.print("=");
        }
        System.out.println("");
        System.out.println("Spicy Carrot Salad");
        System.out.println("Herb Salad");
        System.out.println("Champagne Greens");
        System.out.println("Caesar Salad");
        System.out.println("Panzanella");
         for(int h =0; h<7;h++){
        System.out.print("=");
        }
         System.out.println("");
    }

   

}
