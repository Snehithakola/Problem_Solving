import java.util.List;
import java.util.Scanner;

public class customer {
    public static void main(String[] args){
        route routeObject=new route();
        Scanner sc=new Scanner(System.in);
        locations locationslist=new locations();
        locationslist.locationsList.add("A");
        locationslist.locationsList.add("B");
        locationslist.locationsList.add("C");
        int[][] Distance=new int[][]{{1,2,3},{2,4,5},{3,5,6}};
        System.out.println("Enter start Location");
        String startLocation=sc.next();
        System.out.println("Enter end Location");
        String endLocation=sc.next();
        if(!locationslist.checkLocation(startLocation,endLocation)){
            System.out.println("check entered locations");
        }
        else {
            route routeCalculation = new route();
            int routeDistance = routeCalculation.distance(startLocation, endLocation, locationslist.locationsList, Distance);
            System.out.println("Distance from start point to end point is " + routeDistance);
            System.out.println("Two types of transports 1. Two Wheeler 2. Three Wheeler \n choose any one");
            transport transportType = null;
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    transportType = new twoWheeler();
                    break;
                case 2:
                    transportType = new fourWheeler();
            }
            System.out.println("calculated estimation time :" + transportType.estimation(routeDistance));
        }
    }
}
