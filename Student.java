public class Student {
    String fname,lname;
    private String student_id;
    /*
    double high,weight,bmi;
    void calculate_bmi(){
        high = high/100;
        bmi = weight/((high)*(high));
    }
    */
    double high,weight;
    String getStudent_id(){
        return this.student_id;
    }
    void setStudent_id(String id){
        this.student_id = id;
    }
    
    private double calculate_bmi(){
        high = high/100;
        double bmi = weight/((high)*(high));
        return bmi;
    }
    
    double getBmi(){
        return this.calculate_bmi();
    }
}
