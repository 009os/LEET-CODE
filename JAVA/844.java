/*
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

 

Example 1:

Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".
Example 2:

Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".
Example 3:

Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        ArrayList<Character> s1= new ArrayList<>();
        ArrayList<Character> t1= new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if((s.charAt(i))==('#')){
                if(s1.size()==0){continue;}
                s1.remove(s1.size()-1);}
            else{s1.add(s.charAt(i));}
        }
        for(int j=0;j<t.length();j++){
            if(t.charAt(j)==('#')){
                if(t1.size()==0){continue;}
                t1.remove(t1.size()-1);}
            else{t1.add(t.charAt(j));}
        }

        if(s1.equals(t1)){return true;}
        
        return false;
    }
}