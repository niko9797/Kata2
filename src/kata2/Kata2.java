package kata2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author niko
 */
public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Map<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                //En caso de contener el mapa la clave le añade 1
                
                histogram.put(data[i], histogram.get(data[i])+1);
            } else {
                //En caso contrario la introduce
                
                histogram.put(data[i], 1);
            }
            
        }
        for (Integer key : histogram.keySet()) {
            System.out.println(key+ "==>" + histogram.get(key));
        }
    }
}
