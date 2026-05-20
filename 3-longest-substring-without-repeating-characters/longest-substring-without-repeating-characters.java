import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set=new HashSet<>();
        int maxLength=0;
        int left=0;
        for(int right=0; right<s.length(); right++){
            char ch=s.charAt(right);
            //remove duplicates\\
            while(set.contains(ch)){
                set.remove(s.charAt(left)) ;
                left++;
            }
            //add current character\\
        set.add(ch);
        //updae max lenght//
        maxLength=Math.max(maxLength,right-left + 1);

        }
        return maxLength;
    }
}