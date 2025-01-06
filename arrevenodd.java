import java.util.Scanner;
class arrevenodd{
    public static void main (String [] args){
        int evencount=0,oddcount=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=scan.nextInt();
        int []a=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++){
           if(a[i]%2==0){
            evencount++;

           }
           else{
            oddcount++;
           }
        }
        System.out.print("event count"+evencount);
        System.out.println("odd count"+oddcount);
    }
}
   