package studios.areaofacircle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class areaofacircle {

    public static void main(String[] args){
//        personToJob
        HashMap<String, String> usCityToState = new HashMap<>();
        usCityToState.put("Philly", "Pennsylvania");
        usCityToState.put("Pitt", "Pennsylvania");
        usCityToState.put("NY", "New York");
        ArrayList<HashMap<String, String>>  countries = new ArrayList<>();
        countries.add(usCityToState);
        for( HashMap<String, String> countryCityToState: countries){
            for(Map.Entry<String, String> cityToState: countryCityToState.entrySet()) System.out.println(cityToState);
        }
    }
}
