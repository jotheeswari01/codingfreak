import java.util.Scanner;
class thirdprblm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter input");
        int mark=scan.nextInt();
        if(mark>=90){
            System.out.println("GRADE A");
        }
        else if(mark>=80){
            System.out.println("GRADE B");
        }
        else if(mark>=60){
            System.out.println("GRADE C");
        }
        else if (mark>=35){
            System.out.println("GRADE D");
        }
    }
}