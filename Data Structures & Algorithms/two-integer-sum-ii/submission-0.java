class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> dub = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
        int comp= target- numbers[i];
        if(dub.containsKey(comp))
        {
            return new int[]{dub.get(comp)+1,i+1};
        }
        dub.put(numbers[i],i);

    }
    return new int[]{};
}
}
