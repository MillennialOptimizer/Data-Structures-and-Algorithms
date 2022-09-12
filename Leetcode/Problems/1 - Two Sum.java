import java.io.*;
import java.lang.*;
import java.util.*;
class Pair{
    int val; 
    int ind; 
    public Pair(int val, int ind){
        this.val = val;
        this.ind = ind;
    }
}
class SortByPair implements Comparator<Pair>{
    public int compare(Pair a, Pair b){
        // sorts based on the val of Pairs in ascending order
        return a.val - b.val;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2]; 
        int n = nums.length;
        Pair[] pairs = new Pair[n];
        for(int i = 0; i < n; i++){
            pairs[i] = new Pair(nums[i], i);
        }
        Arrays.sort(pairs, new SortByPair());
        int i = 0, j = n-1; 
        while(j > i){
            if(pairs[i].val + pairs[j].val == target){
                res[0] = pairs[i].ind; 
                res[1] = pairs[j].ind;
                break;
            }
            else if(pairs[i].val + pairs[j].val > target)
                j--;
            else
                i++;
        }
        return res;
    }
}
