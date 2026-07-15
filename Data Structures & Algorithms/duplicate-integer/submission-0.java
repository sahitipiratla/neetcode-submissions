class Solution {
    public boolean hasDuplicate(int[] nums) {
     HashSet<Integer> set = new HashSet<>();
     for(int num:nums)  {
     if(set.contains(num))
     {
        return true;
     }
     else {
    set.add(num);
    }
    }
    return false;
    }}
 /*  public static void main(String args[])
    {
        Solution solve = new Solution();
        int[] test={1,2,2,3};
        boolean result=solve.hasDuplicate(test);
        System.out.println(result);
    }
}*/
