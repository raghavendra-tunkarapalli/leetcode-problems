class Solution {
    public String reverseWords(String s) {
        String[] array = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<array.length;i++){
            result.append(new StringBuilder(array[i]).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
