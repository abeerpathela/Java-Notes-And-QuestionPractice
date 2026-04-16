// sort 0's 1's 2's 
public class l_2_3 {
    public static void swap(int[] arr, int i, int j){
        int temp;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int[] sort(int[] arr){
        int i=0;
        int j=arr.length-1;
        int mid=0;
        while(mid<j){
            if(arr[mid]==0){
                swap(arr,mid,i);
                i++;
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,j);
                j--;
                mid++;
            }
            else{
                mid++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,0,2,1,0,2,2,1,1,0};
        int[] answer=sort(arr);
        for(int i:answer){
            System.out.println(i);
        }
    }
}
