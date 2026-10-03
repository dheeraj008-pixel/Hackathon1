import java.util.Scanner;
public class Municipalwaste{
    public double calculateTotalWaste(double point1Waste, double point2Waste){
        return point1Waste+point2Waste;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int vehiclenum=4343;
        double wastecollected=180.5;
         int collectionpoints=2;
         char status='F';
         System.out.println("Vehicle Number = "+vehiclenum) ;
         System.out.println ("Waste Collected = "+wastecollected);
         System.out.println("Number of Collection Points = "+collectionpoints);
         System.out.println("Vehicle Status(F=filled /E=Empty) = "+status);

         System.out.println("Total Waste Collected = ");
         int totalwastecollected=sc.nextInt();
         if(totalwastecollected>=100){
            System.out.println("Collected Target Achieved");
            
         }
        else{
            System.out.println("More Waste Collection Required");
        }
        System.out.println("enter waste collected in point 1");
        double point1Waste=sc.nextDouble();
        System.out.println("enter waste collected in point 2");
        double point2Waste=sc.nextDouble();
Municipalwaste s=new Municipalwaste();
double totalwaste =s.calculateTotalWaste(point1Waste, point2Waste);
System.out.println("total waste in 2 points = "+totalwaste);
        
    }
}