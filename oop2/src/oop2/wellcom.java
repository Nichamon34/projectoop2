package oop2;

import java.util.Scanner;

public class wellcom extends PizzaOrderManager {

    String membername = ("");
    public int member;

    public void showintro() {

        super.intro();//เรียกใช้เพื่อโชว์introร้าน

    }

    public void showmem() {

        Scanner scan = new Scanner(System.in);

        super.member();//เรียกใช้เพื่อโชว์member
       member = scan.nextInt();

    }
}
