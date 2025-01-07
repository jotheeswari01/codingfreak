class palindromearr{
    public static boolean palindrome(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]!=arr[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;   
    }
    public static void main(String[] args){
        int[] arr={1,2,3,2,1};
        System.out.println("this array is a palindrome\n"+palindrome(arr));
    }
}