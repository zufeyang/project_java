public class Rectangle {
    private int wide = 10;
    int long_ = 0;
    int perimeter = 0;
    private int area = 0;

    void cal_area(int w,int l){
        this.area = w*l;
    }
    public int getArea(){
        return this.area;
    }
    /*
    private void cal_perimeter(){
        perimeter = 2*(wide+long_);
    }
    */
    private int cal_perimeter(){
        perimeter = 2*(wide+long_);
        return perimeter;
    }
    /* สร้าง setter */
    public void setWide(int a) { 
        this.wide = a;
    }
    /* getter*/
    public int getWide() { 
        return this.wide;
    }

    /*สร้าง getter เพื่อเรียก method cal_perimeter */
    public int getCal_perimeter()
    {
        return this.cal_perimeter();
    }
}
