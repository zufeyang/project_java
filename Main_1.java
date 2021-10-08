public class Main_1 {
    public static void main(String[] args) {
        Employee obj1 = new Employee();
        obj1.fname = "นาย A";
        obj1.lname = "www";
        obj1.setEmployee_id("123456");
        obj1.setId_card_number("24343434");
        System.out.println("พนักงานชื่อ = "+obj1.fname+" "+obj1.lname);
        System.out.println("รหัสพนักงาน = "+obj1.getEmployee_id());
        System.out.println("รหัสพนักประจำตัวประชาชน = "+obj1.getId_card_number());
        obj1.input_price = 2000;
        obj1.product_price = 354;
        obj1.getReturnChange();
    }
}
