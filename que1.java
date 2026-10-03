import java.util.*;
public class que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter panel id:");
        int panelId = sc.nextInt();
        System.out.print("enter the energy generated:");
        double energy = sc.nextDouble();
        System.out.print("enetr the number of pannels:");
        int Panels = sc.nextInt();
        System.out.print("enter system status A = active & I = inactive");
        char Status ='A';  

        System.out.println("Solar System Details:");
        System.out.println("Panel ID          : " + panelId);
        System.out.println("Energy Generated  : " + energy + "kWh(kilo watt hour)");
        System.out.println("Number of Panels  : " + Panels);
        System.out.println("System Status     : " + Status);
    }
}
