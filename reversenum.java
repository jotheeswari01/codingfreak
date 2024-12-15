class reversenum {
    public static void main(String[] args) {
       int n = 525, sum= 0;
       int x=n;
       while(n>0){
           sum=sum*10+(n%10);
           n=n/10;
       }
       if(sum==x){
           System.out.println("Palindrome");
       } else{
           System.out.println("Not Palindrome");
       }
    }
}