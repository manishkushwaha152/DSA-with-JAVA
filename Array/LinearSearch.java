

public class LinearSearch {
    
    public static void LinearSearch(int arr[],int n,int key){
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.println("Output of Array index:"+i);
            }
        }
    }
    public static void main(String[] args){
        int[] arr={1,3,6,7,3,4,6};
        int n=7;
        int key=4;
        LinearSearch(arr,n,key);
    }
}
