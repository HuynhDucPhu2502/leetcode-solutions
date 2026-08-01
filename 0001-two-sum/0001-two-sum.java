class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int size = nums.length;

        for (int i = 0; i < size; ++i) {
            int value = nums[i];


            int need = target - value;
            if (map.get(need) != null)
                return new int[]{map.get(need), i};
            else
                map.put(value, i);
        }

        return new int[0];
    }
}