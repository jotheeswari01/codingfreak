class pm{
    public static void main(String[] args)
    {
        int flag=1,n=5;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("is a prime number");
        }
        else{
            System.out.println("is not a prime number");
        }
    }
}