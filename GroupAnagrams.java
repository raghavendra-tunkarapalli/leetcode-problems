class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>> map = new HashMap<>();
        for(String arrstr:strs){
            char[] arr = arrstr.toCharArray();
            Arrays.sort(arr);
            String str = new String(arr);
            if(!map.containsKey(str)){
                map.put(str,new ArrayList<>());
            }
            map.get(str).add(arrstr);
        }
        return new ArrayList<>(map.values());
    }
}
