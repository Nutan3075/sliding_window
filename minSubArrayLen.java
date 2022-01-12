public class minSubArrayLen{
    public static int minSun(int[] nums,int target)
    {

        int sum = 0;
        int left = 0;
        int result = Integer.MAX_VALUE;
        
        for(int i = 0; i < nums.length;i++)
        {
            sum += nums[i];
            while(sum >= target)
            {
                result = Math.min(result,i+1-left);
                sum -= nums[left];
                left++;
            }
        }
        
        return(result != Integer.MAX_VALUE?result:0);

    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSun(nums,target);
        System.out.println("answer is :" +ans);
        
    }

}