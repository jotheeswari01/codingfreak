import java.util.Scanner;

class largestarr{
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scan.nextInt();
        int []a=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int large=a[0];
        for(int i=0;i<n;i++){
            if(large<a[i]){
                large=a[i];
            }
        }
        System.out.print("largest number is:"+large);

    }
}