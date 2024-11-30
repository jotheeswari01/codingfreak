import java.util.Scanner;
class seventhprblm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter n value:");
        int n= scan.nextInt();
        System.out.println("Enter firstname ");
        String firstname = scan.next();
        System.out.println("Enter secondname ");
        String secondname = scan.next();
        int i=1;
        while(i<5){
            System.out.println(String.format("%s %s", firstname,secondname));
            i++;
        }
    }
}