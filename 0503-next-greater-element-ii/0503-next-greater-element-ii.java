class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;

            while (!st.isEmpty() && st.peek() <= nums[index]) {
                st.pop();
            }

            if (i < n) {
                if (!st.isEmpty()) {
                    res[index] = st.peek();
                } else {
                    res[index] = -1;
                }
            }

            st.push(nums[index]);
        }

        return res;
    }
}