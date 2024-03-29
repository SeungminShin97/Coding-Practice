import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder("");
        boolean first = true;
        for(int i = 0; i < s.length(); i++) {
            if(first) {
                sb.append(Character.toUpperCase(s.charAt(i)));
                first = false;
            }
            else 
                sb.append(Character.toLowerCase(s.charAt(i)));
            if(s.charAt(i) == ' ')
                first = true;            
        }
        return sb.toString();
    }
}