class Solution {
    public String longestPalindrome(String s) {
     if(s.length()<=1)
     return s;
     String LPS=""+s.charAt(0);
     //odd length
     for(int i=1;i<s.length();i++){
        int low=i;
        int high=i;
        while(s.charAt(low)==s.charAt(high)){
            low--;
            high++;
            if(low==-1||high==s.length())
            break;
        }
        String match=s.substring(low+1,high);
        if(match.length()>LPS.length()){
            LPS= match;
        }
        //even length
        low=i-1;
        high=i;
         while(s.charAt(low)==s.charAt(high)){
            low--;
            high++;
            if(low==-1||high==s.length())
            break;
        }
        match=s.substring(low+1,high);
        if(match.length()>LPS.length()){
            LPS= match;
        }
    }
    return LPS;
}
}