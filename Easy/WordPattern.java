class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if(pattern.length()!=arr.length)return false;
        Map<Character, String> map = new HashMap<>();
        Set<String> str = new HashSet<>();
        for(int i=0;i<pattern.length();i++){
            char char1 = pattern.charAt(i);
            String word = arr[i];
            if(map.containsKey(char1)){
                if(!map.get(char1).equals(word))return false;
            }else{
                if(str.contains(word))return false;
                map.put(char1,word);
                str.add(word);
            }
        }
        return true;
    }
}
