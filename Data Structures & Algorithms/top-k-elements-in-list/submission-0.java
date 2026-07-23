class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {if(!map.containsKey(nums[i]))
               {
                map.put(nums[i],1);
               }
               else
               {
                 map.put(nums[i],map.get(nums[i])+1);
               }
        }
        List<Integer>[] bucket= new List[nums.length+1];
        Integer[] keys=map.keySet().toArray(new Integer[0]);
        for(int i=0;i<keys.length;i++)
        {
          int key = keys[i];
          int frequency = map.get(key);
          if (bucket[frequency] == null) {
        bucket[frequency] = new ArrayList<>();
        }
         bucket[frequency].add(key);
        }
    int[] result = new int[k];
        int index = 0;

        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {
            if (bucket[i] != null) {
                for (int num : bucket[i]) {
                    result[index++] = num;
                    if (index == k) {
                        return result; // We collected our K elements!
                    }
                }
            }
        }

        return result;
    }

}
