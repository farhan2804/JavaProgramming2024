// Majority element
//  find the element which occurs more than or equal to n/2 times the array
//  input - 2 4 2 4 2 4
//  output - 2,4
import java.util.HashMap;
 class majorityelement {
    public static void main(String args[]) {
        int arr[]= {1,3,2,5,1,3,1,5,1};
        int n = 6;
        HashMap <Integer,Integer> map =new HashMap<>(); 
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for(int key:map.keySet()) {
            if(map.get(key) > n/3){
               System.out.println(key);
            }
        }
    }
}
