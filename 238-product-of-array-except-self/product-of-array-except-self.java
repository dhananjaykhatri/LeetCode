class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pro=1,i,f=0;
        for(i=0;i<n;i++){
            if(nums[i]==0){
                f++;
                continue;
            }
            pro*=nums[i];
        }
            if(f>1)
            pro=0;
        
        for(i=0;i<n;i++){
            if(nums[i]==0)
                nums[i]=pro;
            else if(f==0)
          nums[i]=pro/nums[i];
            else
                nums[i]=0;
            }
        return nums;
        }
}