import java.util.*;

public class RunBloodData{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String input1, input2;
        String data;
        BloodData bd;
        
        System.out.print("Enter blood type of patient: ");
        input1 = s.nextLine();
        System.out.print("Enter the Rhesus factor (+ or -): ");
        input2 = s.nextLine();

        data = input1 + input2;
        if(data.isEmpty()){
            bd = new BloodData();
            bd.setBloodType("O");
            bd.setRhFactor("+");
            System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
        }
        else if(data.equals("A+") || data.equals("A-") || data.equals("B+") || data.equals("B-") || data.equals("AB+") || data.equals("AB-") || data.equals("O+") || data.equals("O-")){
            BloodData d = new BloodData();
            d.setBloodType(input1);
            d.setRhFactor(input2);
            System.out.println(d.getBloodType() + d.getRhFactor() + " is added to the blood bank.");
        }
        else{
            System.out.println("Invalid input!");
        }
        s.close();

    }
}