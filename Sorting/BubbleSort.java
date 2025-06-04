import java.util.Scanner;

public class BubbleSort {

public void  BubbleSort(int arr[],int n){
 for(int i=n-1; i>=1 ;i--){
   int flag=0;
    for(int j=0;j<=i-1;j++){
        if( arr[j]>arr[j+1]){
            int temp=arr[j+1];
              arr[j+1]=arr[j];
              arr[j]=temp;
              flag=1;
        }
        if(flag==0)
        break;
        
    }
 }
 System.out.println("After Bubble Sort");

 for(int j=0;j<n;j++){
   System.err.print(arr[j]+" ");
 }
 System.out.println();
}
public static void main(String[] args){
    BubbleSort b=new BubbleSort();
 Scanner sc =new Scanner(System.in);

 System.out.println("Enter Size of Arrays");
  int n=sc.nextInt();
  int arr[]=new int[n];

  System.out.println("Enter Array Element");
  for(int i=0;i<n ;i++){
    arr[i]=sc.nextInt();
  }
  System.out.println();

  System.out.println("Before Bubble Sort");
  for(int i=0; i<n;i++){
    System.out.print(arr[i] +" ");
  }
  System.out.println();
   b.BubbleSort(arr,n);
}
    
}