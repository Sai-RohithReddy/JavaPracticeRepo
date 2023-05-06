package Array;

public class Q3 {

	public static void main(String[] args) {
		
		Q3 q3 = new Q3();
		
		int[] nums1 = {-2,1,-3,4,-1,2,1,-5,4};
		int[] nums2 = {1};
		int[] nums3 = {5,4,-1,7,8};
		int[] nums4 = {-2, 1};
		int[] nums5 = {-1};
		int[] nums = {-2, -1};
		
		int res1 = q3.maxSubArray(nums1);
		System.out.println(res1);
		
		int res2 = q3.maxSubArray(nums2);
		System.out.println(res2);
		
		int res3 = q3.maxSubArray(nums3);
		System.out.println(res3);
		
		int res4 = q3.maxSubArray(nums4);
		System.out.println(res4);
		
		int res5 = q3.maxSubArray(nums5);
		System.out.println(res5);
		
		
	}
	public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = 0;
        
        for (int i = 0; i < nums.length; i++) {
        	cur += nums[i];
        	if (cur > max) max = cur;
        	if (cur < 0) cur = 0;
        }
        return max;
       }
}
