
package oop2;

import java.util.Scanner;


public class PizzaProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu;
        int pizzamenu;
        int sizepizza;
        int watermenu;
        int Wamount = 0;
        int salad;
        int saladprice = 0;
        int promotion;
        int member;
        int total = 0;
        int Pamount = 0;
        int num = 0;
        String namepizza[]  = new String[4];
        String size = "";
        String saladmenu = "";
        String watername = "";
        String membername = "";

        System.out.println("เลือกเมนู");
        System.out.println("1.PIZZA");
        System.out.println("2.WATER");
        System.out.print("Choose menu : ");
        menu = scan.nextInt();

        if (menu == 1) {
            int countpizza = 0;
            for(int x = 0;x<2;x++){
            System.out.println("****** PIZZA MENU *******");
            System.out.println("1.Crab Sticks Cocktail");
            System.out.println("2.Chili BBQ Chicken");
            System.out.println("3.Ham & Bacon");
            System.out.println("4.Hawaiian");
            System.out.print("Choose Pizaa menu : ");
            pizzamenu = scan.nextInt();
            if (pizzamenu == 1) {
                namepizza[countpizza] =   "Crab Sticks Cocktail";
                num++;
                countpizza++;
            }
            if (pizzamenu == 2) {
                namepizza[countpizza] = "Chili BBQ Chicken";
                num++;
                countpizza++;
            }
            if (pizzamenu == 3) {
                namepizza[countpizza] = "Ham & Bacon";
                num++;
                countpizza++;
            }
            if (pizzamenu == 4) {
                namepizza[countpizza] = "Hawaiian";
                num++;
                countpizza++;
            }
            }
            System.out.println("****** SIZE *******");
            System.out.println("1.size M 200 Bath");
            System.out.println("2.size L 300 Bath");
            System.out.println("3.size XL 400 Bath");
            System.out.print("Plase chose size: ");
            sizepizza = scan.nextInt();
            if (sizepizza == 1) {
                Pamount = Pamount + 200;
                size = "M";
            }
            if (sizepizza == 2) {
                Pamount = Pamount + 300;
                size = "L";
            }
            if (sizepizza == 3) {
                Pamount = Pamount + 400;
                size = "XL";
            }
            System.out.println("******** SALAD ********");
            System.out.println("1.Butter head");
            System.out.println("2.COS");
            System.out.println("3.WATER CRESS");
            System.out.println("4.Lettuce");
            System.out.println("5.Rocket");
            System.out.println("6.Egg");
            System.out.println("7.Thai sauce");
            System.out.println("8.Japan head");
            System.out.println("9.Classic head");  
            salad = scan.nextInt();
            if (salad == 1) {
                saladprice = saladprice + 20;
                saladmenu = "Butter head";
            }
            if (salad == 2) {
                saladprice = saladprice + 20;
                saladmenu = "COS";
            }
            if (salad == 3) {
                saladprice = saladprice + 20;
                saladmenu = "WATER CRESS";
            }
            if (salad == 4) {
                saladprice = saladprice + 20;
                saladmenu = "Lettuce";
            }
            if (salad == 5) {
                saladprice = saladprice + 20;
                saladmenu = "Rocket";
            }
            if (salad == 6) {
                saladprice = saladprice + 10;
                saladmenu = "Egg";
            }
            if (salad == 7) {
                saladprice = saladprice + 10;
                saladmenu = "Thai sauce";
            }
            if (salad == 8) {
                saladprice = saladprice + 10;
                saladmenu = "Japan head";
            }
            if (salad == 9) {
                saladprice = saladprice + 10;
                saladmenu = "Classic head";
            }
            

        }//menu 1 

      
            System.out.println("****** WATER MENU ********");
            System.out.println("1.COLA");
            System.out.println("2.WATER");
            watermenu = scan.nextInt();
            if (watermenu == 1) {
                Wamount = Wamount + 20;
                watername ="COLA";
            }
            if (watermenu == 2) {
                Wamount = Wamount + 15;
                watername ="WATER";
            }
            total = Pamount+saladprice+Wamount;
            System.out.println("****** Member ********");
            System.out.println("1.Bronze");
            System.out.println("2.Silver");
            System.out.println("3.GOld");
            System.out.println("4.Not Member");
            member = scan.nextInt();
            if (member == 1) {
            total = (int) (total + (total * 0.03));
            membername = "Bronze";
            // if(total >=200){total=total-50;}
        }
        if (member == 2) {
            total = (int) (total + (total * 0.05));
            membername = "Silver";
        }
        if (member == 3) {
            total = (int) (total + (total * 0.10));
            membername = "Gold";
        }
        if (member == 4) {
            membername = "Not member";
            if (num >= 3) {
                total = (int) (total + (total * 0.03));
            } else {
                total = total;
            }
                
            }
            
                System.out.println("**** BILL PAYMNET*******");
                for(int i=0;i<namepizza.length;i++){
                System.out.println("PIZZA MENU :"+namepizza[i]);
                }
                System.out.println("PIZZA SIZE : "+size);
                System.out.println("SALAD : "+saladmenu);
                System.out.println("WATER MENU: "+watername);
                System.out.println("Member: "+membername);
                System.out.println("PRICE : "+total);
        
    }

}
