public class Calculate {
    public static void main(String[] args) {
        Rectangle myObj1 = new Rectangle();   
        myObj1.long_= 20;
        int w = myObj1.getWide();
        myObj1.cal_area(w,myObj1.long_);
        int a = myObj1.getArea();
        //myObj1.cal_area(myObj1.getWide(),myObj1.long_);
        System.out.println(a);
        //myObj1.cal_perimeter();
        System.out.println(myObj1.getCal_perimeter());
    }
}
