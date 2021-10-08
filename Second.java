public class Second {
    public static void main(String[] args){
        Main myObj1 = new Main();
        Main myObj2 = new Main();
        System.out.println(myObj1.a);
        myObj2.a = 15;
        System.out.println(myObj2.a);
        myObj2.present();
    }
}
