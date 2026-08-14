class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[n-1];
        for(int i=0; i<n; i++){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(Math.abs(sum-target) <Math.abs(closest-target)){
                    closest = sum;
                }
                if(sum>target){
                    k--;
                }
                else if (sum<target){
                    j++;
                }
                else {
                    return sum;
                }
            }

        } return closest;
    }
}