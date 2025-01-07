class minmaxarr{
    public static void main (String[] args){
        int[] arr={1,2,3,2,1};
        int large=arr[0];
        int small=arr[0];
        int n=5;
        for(int i=0;i<n;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        System.out.println("largest number is:"+large);
        System.out.println("smallest number is:"+small);
 
    }
}