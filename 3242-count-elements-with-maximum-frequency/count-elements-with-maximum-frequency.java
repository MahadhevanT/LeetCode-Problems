class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> Mp = new HashMap<>();
        int max = 0;
        for(var num : nums){
            Mp.put(num, Mp.getOrDefault(num, 0) + 1);
            max = Math.max(max, Mp.get(num));
        }

        int cc = 0;
        for(var entry : Mp.entrySet()){
            int curr = entry.getValue();
            if(curr == max){
                cc++;
            }
        }
        return max * cc;

    }
}