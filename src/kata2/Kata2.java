package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = {1,1,1,100,2,4,5,6,8,8,4,5,6,2,-4};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histoThis = histo.getHistogram();
        
        for (int key : histoThis.keySet()) {
            System.out.println(key + "-->" + histoThis.get(key));
        }
    }
}
