class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        if(s.length()!=t.length())return false;
        for(int i=0;i<s.length();i++){
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);
            if(map1.containsKey(char1)){
                if(map1.get(char1)!=char2)return false;
            }else{
                map1.put(char1,char2);
            }
            if(map2.containsKey(char2)){
                if(map2.get(char2)!=char1)return false;
            }else{
                map2.put(char2,char1);
            }
        }
        return true;
    }
}
