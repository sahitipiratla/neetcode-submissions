class Solution {
    public boolean isAnagram(String s, String t) {
     if(s.length()!=t.length())
     {
        return false;
     }

     HashMap<Character, Integer> Ang= new HashMap<>();
     for(char c:s.toCharArray())
     if(Ang.containsKey(c))
     {
        Ang.put(c, Ang.get(c)+1);
     }
     else
     {
        Ang.put(c,1);
     }
      for(char f:t.toCharArray()){
       if(!Ang.containsKey(f))
       {
          return false; 
       }
       else
       {
        Ang.put(f,Ang.get(f)-1);
       }
       if(Ang.get(f)<0)
       {
        return false;
       }
    }
    return true;
}
}
