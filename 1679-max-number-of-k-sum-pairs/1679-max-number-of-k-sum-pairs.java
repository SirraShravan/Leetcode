import java.util.HashMap;

class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int count = 0;

        for (int num : nums) {
            if (map.getOrDefault(num, 0) == 0) {
                continue;
            }

            int complement = k - num;

            if (map.getOrDefault(complement, 0) > 0) {
                if (num == complement && map.get(num) < 2) {
                    continue;
                }

                count++;

                map.put(num, map.get(num) - 1);
                map.put(complement, map.get(complement) - 1);
            }
        }

        return count;
    }
}