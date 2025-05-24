import java.util.Arrays;
import java.util.Collections;

class Relativesortarray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int xy=0;
        int[] res = new int[arr1.length];
        for(int i:arr2){
            for(int j:arr1){
                if(i==j){
                    res[xy++]=i;
                }
            }
        }
        HashSet<Integer> list = new HashSet<>();
        for(int i:arr2){
            list.add(i);
        }
        ArrayList<Integer> sub = new ArrayList<>();
        for(int i:arr1){
            if(!list.contains(i)){
                sub.add(i);
            }
        }
        Collections.sort(sub);
        for(int num:sub){
            res[xy++]=num;
        }
        return res;
    }
}
