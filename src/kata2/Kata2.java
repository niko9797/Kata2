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
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr= histo.getHistogram();
        
        for (Integer key : histogr.keySet()) {
            System.out.println(key+ "==>" + histogr.get(key));
        }
    }
}
