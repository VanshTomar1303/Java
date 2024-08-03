public class Ques1 {
    public static void main(String[] args){
        int[] nums={1,2,3,4,6,7};
        int[] newNum=new int[nums.length];
        for(int i=0;i<nums.length;i++){
           newNum[i]=arr(nums,nums.length,nums[i]);
           System.out.print("["+newNum[i]+"]");
        }
    }
    public static int arr(int[] a,int size ,int val){
        int num=1;
        for(int i=0;i<size;i++){
            if(a[i]==val){
                continue;
            }
            num=num*a[i];
        }
        return num;
    }
}
