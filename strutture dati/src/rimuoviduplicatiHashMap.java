import java.util.ArrayList;
import java.util.HashMap;

public class rimuoviduplicatiHashMap {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 7, 14, 21};
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> noduplicati = new ArrayList<>();
        for(int numero : nums){
            if (!map.containsKey(numero)){
                map.put(numero, true);
                noduplicati.add(numero);
            }
        }
        System.out.println("Array originale: "+java.util.Arrays.toString(nums));
        System.out.println("Array senza duplicati "+ noduplicati);
    }

}
