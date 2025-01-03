class firstandlastd{
    public static int firstandlast(int N){
    int lastDigit=N%10;
    int firstDigit=N;
    while(firstDigit>=10){
        firstDigit/=10;
    }
    return firstDigit+lastDigit;
}
    
public static void main(String[] args){
    int N=12345;
    System.out.println(firstandlast(N));
}
}