package oop2;

public class PizzaOrder   implements pizmanu {

    //ตัวแปรprivate
    private int id;
    private String name;
    private String phoneNumber;
    private String order;
    private String type;

    //constructor
    public PizzaOrder() {
        setId(1000);
        setName("testname");
        setPhoneNumber("xxxx");
        setOrder("testorder");
        setType("testtype");
      
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public void setType(String type) {
        this.type = type;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOrder() {
        return order;
    }

    public String getType() {
        return type;
    }

    //ตัวแปรคำนวนราคา
    double price; //ราคา pizza
    public double totalCost = 0; //ราคารวม
    double deliveryCost; //เงินดิลิเวอรี่
    //ค่าพิซซ่า
    public double determinePizzaPrice() {
        if (getOrder().equals("Hawaiian")) {
            price = 300;
        }//end if for order Hawaiian
        else if (getOrder().equals("Meat Lovers")) {
            price = 250;
        }//end else-if for order Meat Lovers
        else if (getOrder().equals("Aussie")) {
            price = 250;
        } //end else-if for order Aussie
        else if (getOrder().equals("Supreme")) {
            price = 300;
        }//end else-if for order Supreme
        else if (getOrder().equals("Pepperoni")) {
            price = 250;
        }//end else-if for order Pepperoni
        else if (getOrder().equals("no")) {
            price = 0;
            System.out.println("No Pizza Manu");
        }
        else {
            System.out.println("Error: Incorrect Order name has been entered. Please ensure it is spelt correctly");
        }//end else 
        return price;
    }
//แสดงเมนู
    public void pizzamanu() {
        for (int h = 0; h < 15; h++) {
            System.out.print("=");
        }
        System.out.println("");
        System.out.println(" PiZZA MANU......");
        System.out.println("Hawaiian\t300 Bath");
        System.out.println("Meat Lovers\t250 Bath");
        System.out.println("Aussie\t\t250 Bath");
        System.out.println("Supreme\t\t300 Bath");
        System.out.println("Pepperoni\t250 Bath");
        for (int h = 0; h < 15; h++) {
            System.out.print("=");
        }
        System.out.println("");

    }
//คำนวนเงิน
    public double totalCost() {
        
        saladOrder s1 = new saladOrder();
        if (getType().equals("Pick-up")) {
            deliveryCost = 0.0;
           
        }//end if delivery
        else if (getType().equals("Delivery")) {
            deliveryCost = 20.0;
            if(getOrder().equals("no")|| s1.getOrder().equals("no")){
                deliveryCost = 0.0;
            }
            
        }//end else-if delivery
       
        return  totalCost = deliveryCost + price;
//สั่งพิซซ่ากลับ +20
//สลัดอย่างเดียวไม่บวก
//ทั้งคู่ +20
    }

}
