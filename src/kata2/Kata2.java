package kata2;

import java.util.Map;

/**
 *
 * @author niko
 */
public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Pepe","Juan","Juan","Pepe","Niko","Olga","Herminia","Herminia","Olga","Francesca","Francesca","Kiara","Burlao","Juan","Olga"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr= histo.getHistogram();
        
        for (String key : histogr.keySet()) {
            System.out.println(key+ "==>" + histogr.get(key));
        }
    }
}
