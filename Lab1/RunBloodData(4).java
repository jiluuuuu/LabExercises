import java.util.*; 

public class RunBloodData{
    public RunBloodData(){
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int i = 1;
        while(i <= 2){
            System.out.print("Enter the blood type of patient: ");
            String bloodType = s.nextLine();

            System.out.print("Enter the Rhesus Factor (+ or -): ");
            String rhFactor = s.nextLine();

            if(bloodType.equals("A") || bloodType.equals("B") || bloodType.equals("AB") ||bloodType.equals("O") ){
                BloodData bd = new BloodData();
                bd.display();
                break;
            }
            else{
                BloodData bd1 = new BloodData(bloodType,rhFactor);
                bd1.display();
                i++;
                s.close();
                break;
            }
        }
        
    }
}