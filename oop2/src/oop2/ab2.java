package oop2;

abstract class ab2 extends ab1 {
    
//หัวร้าน เมนเรียกใช้
    public void intro() {
        
        System.out.println("Pizza Order Manager");
        System.out.println("===================");
        System.out.println("");
        System.out.print("Enter number of Pizza & Salad Orders: ");
    }
//โชว์ โปรโมชั่น
    public void member() {
        System.out.println("****** Member ********");
        System.out.println("1.Bronze");
        System.out.println("2.Silver");
        System.out.println("3.GOld");
        System.out.println("4.Not Member");
        System.out.print(">>>>> ");

    }
}
