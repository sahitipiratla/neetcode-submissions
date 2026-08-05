class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
      Set<Integer> set= new HashSet<>();
      for(int i=0;i<nums.length;i++)
      {
        set.add(nums[i]);
      }  
      int con=0;
      for (int i = 0; i < nums.length; i++) {
        int num=nums[i];
        if (!set.contains(num - 1)){
        int current=1;
        while (set.contains(num + 1)) {
                    num++;
                    current++;
                }
                con = Math.max(con, current); 
            }
      }
      return con;
    }
}

