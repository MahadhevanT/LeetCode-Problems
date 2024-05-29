class Solution {
    public String longestCommonPrefix(String[] strs) {
    String perfix=strs[0];
    for(int i=1;i<strs.length;i++){
        while(strs[i].indexOf(perfix)!=0){
            perfix=perfix.substring(0,perfix.length()-1);
        }
    }
    return perfix;
    }
}
//     Arrays.sort(strs);
//     String s1=strs[0];
//     String s2=str[strs.length-1];
//     int index=0;
//     while(index<s1.length && index<s2.length){
//         if(s1.charAt(index)==s2.charAt(index)){
//             index++;
//         }else{
//             break;
//         }
//     }  
//     return substring(0,index);
//     }
// }