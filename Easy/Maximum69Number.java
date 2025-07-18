class Solution {
    public int maximum69Number (int num) {
        char[] char1 = String.valueOf(num).toCharArray();
        for(int i=0;i<char1.length;i++){
            if(char1[i]=='6'){
                char1[i]='9';
                break;
            }
        }
        return Integer.parseInt(new String(char1));
    }
}
