class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length; int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+nums[i];
        }
            int left=0;
            for(int j=0;j<n;j++){
                int right = sum-left-nums[j];
                if(left==right){
                    return j;
                    
                }
                left=left+nums[j];
            }
            
        
        return -1;
    }
}