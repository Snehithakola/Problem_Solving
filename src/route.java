import java.util.*;
public class route {
   int distance(String startLocation,String endLocation,List<String> locations,int[][] distanceList){
       int xCoordinate=locations.indexOf(startLocation);
       int yCoordinate=locations.indexOf(endLocation);
       return distanceList[xCoordinate][yCoordinate];
   }
}
