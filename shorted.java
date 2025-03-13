import java.util.*;
public class shorted {

public class Main {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 4};
        Set<Integer> set = new HashSet<>();
        
        for (int num : arr) {
            set.add(num);
        }
        
        List<Integer> uniqueArr = new ArrayList<>(set);
        Collections.sort(uniqueArr);
        
        System.out.println(uniqueArr);
    }
}

    
}
