import java.util.Scanner;
class math1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=scan.nextInt();
        int count = 0;
        while(n>0){
            int ld = n%10;
            count = count + 1;
            n=n/10;
        }
        System.out.println(count);
    }
}

