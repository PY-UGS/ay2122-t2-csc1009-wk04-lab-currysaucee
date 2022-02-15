import java.util.*;

class BMI{
    private double weight;
    private double height;
    private double final_bmi;

    BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
        getBMI();
    }

    private void getBMI(){
        double value = Math.round((this.weight/Math.pow(this.height,2))*100)/100;
        System.out.println("Your BMI:"+ value);
        if (value<18.5){ System.out.println("Underweight");}
        else if(18.5<=value && value<25){ System.out.println("Normal");}
        else if(25<= value && value<30){ System.out.println("Overweight");}
        else if(30<=value){ System.out.println("Obese");}
    }
}

public class qns1 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please input your weight in pounds:");
        double weight = Double.parseDouble(scan.nextLine());
        System.out.print("Please input your height in inches:");
        double height = Double.parseDouble(scan.nextLine());
        BMI bmiObject = new BMI(weight * 0.453592, height * 0.0254);
        scan.close();
    }
}
