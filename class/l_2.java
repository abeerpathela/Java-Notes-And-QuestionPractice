import java.util.Arrays;
public class l_2{
    public static boolean twoSum(int[] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }
    public static boolean threeSum(int[] arr, int target){
        return false;
    }
    public static void main(String[] args) {
        int[] arr={8,7,3,5,6,2,9,11};
        int target=7;
        System.out.println(twoSum(arr,target));
    }
}