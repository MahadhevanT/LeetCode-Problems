class Solution {
    public int lengthOfLongestSubstring(String s) {
     int len=s.length();
     int res=0;
     HashSet<Character> set=new HashSet<>();
     int i=0,j=0;
     while(i<len && j<len){
        if(!set.contains(s.charAt(j))){
            set.add(s.charAt(j++));
            res=Math.max(res,j-i);
        }else{
            set.remove(s.charAt(i++));
        }
     }
    return res;
    }
}