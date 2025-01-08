class printdivrecur{
    public static void jothi(int n, int divisor){
        if(divisor>n){
            return ;
        }
        else if(n%divisor==0){
           System.out.println(divisor);
        }
            jothi(n,divisor+1);
    }
    public static void main(String [] args){
        int n=6;
        jothi(n,1);
        
    }
}