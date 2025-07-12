class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> unique = new HashSet<>();
        for(char c :jewels.toCharArray()){
            unique.add(c);
        }
        int result =0;
        for(int i=0;i<stones.length();i++){
            if(unique.contains(stones.charAt(i))) result++;
        }
        return result;
    }
}
