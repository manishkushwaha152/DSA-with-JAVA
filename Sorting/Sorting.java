import java.util.Scanner;

public class Sorting {
  

  //Selection sort
    public void Selection(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap after finding min
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        
        System.out.println("After Selection Sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // for better output format
    }


    // Bubble Sort
    
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sorting s = new Sorting(); // creating object

        System.out.println("Enter the Size of Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered Number:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        s.Selection(arr, n); // call selection sort
        s.BubbleSort(arr, n); // call bubble sort
    }
}
