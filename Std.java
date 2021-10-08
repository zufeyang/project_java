public class Std {
    public static void main(String[] args) {
        Student objStd1 = new Student();
        Student objStd2 = new Student();
        objStd1.fname = "นาย A";
        objStd1.lname = "สุขใจ";
        objStd1.high = 170;
        objStd1.weight = 73.5;
        objStd1.setStudent_id("12345678");
        //objStd1.calculate_bmi();
        objStd2.fname = "นาย B";
        objStd2.lname = "สุขมาก";
        objStd2.high = 160;
        objStd2.weight = 75.5;
        objStd2.setStudent_id("87654321");
        //objStd2.calculate_bmi();
        System.out.print("ชื่อ-สกุล ="+objStd1.fname);
        System.out.println(" "+objStd1.lname);
        System.out.println("รหัสนักศึกษา = "+objStd1.getStudent_id());
        System.out.println("ส่วนสูง = "+objStd1.high);
        System.out.println("น้ำหนัก = "+objStd1.weight);
        //System.out.println("BMI = "+objStd1.bmi);
        System.out.println("BMI = "+objStd1.getBmi());

        System.out.print("ชื่อ-สกุล ="+objStd2.fname);
        System.out.println(" "+objStd2.lname);
        System.out.println("รหัสนักศึกษา = "+objStd2.getStudent_id());
        System.out.println("ส่วนสูง = "+objStd2.high);
        System.out.println("น้ำหนัก = "+objStd2.weight);
        //System.out.println("BMI = "+objStd2.bmi);
        System.out.println("BMI = "+objStd2.getBmi());
    }
}
