public class l_2_2 {
    public static void swap(int[] arr,int index1, int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static int[] moveZeros(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0){
                i++;
                j--;
            }
            else if(arr[i]==0 && arr[j]==1){
                swap(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i]==1 && arr[j]==1){
                i++;
            }
            else{           // arr[i]==0 && arr[j]==0
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,1,0,0,1,1,0,1};
        int[] answer=moveZeros(arr);
        for(int i:answer){
            System.out.println(i);
        }
    }
}
