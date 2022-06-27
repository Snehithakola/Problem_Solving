import java.util.ArrayList;
import java.util.List;

public class locations {
    List<String> locationsList=new ArrayList<String>(){};

    boolean checkLocation(String startLocation,String endLocation){
        if(locationsList.contains(startLocation) && locationsList.contains(endLocation))
            return true;
        else
            return false;
    }
}
