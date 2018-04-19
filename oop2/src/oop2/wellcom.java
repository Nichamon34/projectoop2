package oop2;

import java.util.Scanner;

public class wellcom extends PizzaOrderManager {

    String membername = ("");
    public int member;

    public void showintro() {

        super.intro();

    }

    public void showmem() {

        Scanner scan = new Scanner(System.in);

        super.member();
        member = scan.nextInt();

    }
}
