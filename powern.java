import java.util.Scanner;

class powern{
    public static int number(int n, int m){
        if(m==0){
            return 1;
        }
        return n*number(n,m-1);
    }
    public static void main(String [] args){
         Scanner s=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=s.nextInt();
        System.out.println("Enter m value:");
        int m=s.nextInt();
        int result=number(n,m);
        System.out.println("power of N value is:"+result);
    }
}