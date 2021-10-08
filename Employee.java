public class Employee {
    String fname,lname;
    private String employee_id ,id_card_number;
    int product_price,change,input_price;
    void setEmployee_id(String employee_id_arg){
        this.employee_id = employee_id_arg;
    }
    void setId_card_number(String id_card_number_arg){
        this.id_card_number = id_card_number_arg;
    }
    String getEmployee_id(){
        return this.employee_id;
    }
    String getId_card_number(){
        return this.id_card_number;
    }
    private void returnChange(){
        change = input_price - product_price;
        System.out.println("เงินทอน = "+change);
        int change1000 = change/1000;
        System.out.println("แบงค์ 1000 = "+change1000);
        change = change%1000;
        int change500 = change/500;
        System.out.println("แบงค์ 500 = "+change500);
        change = change%500;
        int change100 = change/100;
        System.out.println("แบงค์ 100 = "+change100);
        change = change%100;-
        int change50 = change/50;
        System.out.println("แบงค์ 50 = "+change50);
        change = change%50;
        int change20 = change/20;
        System.out.println("แบงค์ 20 = "+change20);
        change = change%20;
        int change10 = change/10;
        System.out.println("เหรียญ 10 = "+change10);
        change = change%10;
        int change5 = change/5;
        System.out.println("เหรียญ 5 = "+change5);
        change = change%5;
        int change2 = change/2;
        System.out.println("เหรียญ 2 = "+change2);
        change = change%2;
        int change1 = change/1;
        System.out.println("เหรียญ 1 = "+change1);
        change = change%1;
    }
    void getReturnChange(){
        this.returnChange();
    }
}
