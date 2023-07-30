

public class OOPS {
    public static void main(String args[]) {
        Pen p1 = new Pen();  //declaring an object and initializing it to a reference variable
        p1.setColor("blue");
        p1.setTip(5);
        System.out.println(p1.color + " " + p1.tip);

        //object for bankAccount
        BankAccount acc1 = new BankAccount();
        acc1.userName = "Sayan Mitra";
        //acc1.password = "abcdefgh"; will throw error since password is private

        acc1.setPassword("abcedf");
        System.out.println(acc1.userName + " "   /*  + acc1.password  -> will not display give error since password is private*/);
    }
}
//class Pen describing attirbutes and behaviour of pen objects
 class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int tipSize) {
        tip = tipSize;
    }
}

//class describing acess specifiers / access modifers
class BankAccount{
    public String userName;
    private String password;

    protected void setPassword(String pwd){
        password = pwd;
    }
}
