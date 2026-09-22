class Solution {
    public int countSpecialIntegers(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        for (int i = 0; i < nums.length; i++) {

            if (!map.containsKey(nums[i])) {

                // First occurrence
                map.put(nums[i], i);

            } else {

                // Second occurrence
                int dis = i - map.get(nums[i]);

                int thirdIndex = i + dis;

                if (thirdIndex < nums.length &&
                    nums[thirdIndex] == nums[i] &&
                    freq.get(nums[i]) == 3) {

                    mpp.put(nums[i], 3);
                }
            }
        }

        return mpp.size();
    }
}