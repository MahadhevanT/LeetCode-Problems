class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i), 0)+1);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:order.toCharArray()){
            if(!mp.containsKey(ch))
            continue;
        int count=mp.get(ch);
        for(int i=0;i<count;i++){
            sb.append(ch);
            mp.remove(ch);
        }
        }
        for( Character k:mp.keySet()){
            int c=mp.get(k);
            for(int i=0;i<c;i++){
                sb.append(k);

            }
        }
        return sb.toString();
    }
}