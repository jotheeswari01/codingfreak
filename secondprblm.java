import java.util.Scanner;
class secondprblm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d= a+b+c;
        if(d!=180){
            System.out.println("triangle can not be formed");
        }
        else{
            System.out.println("triangle can be formed");
        }
    }
}