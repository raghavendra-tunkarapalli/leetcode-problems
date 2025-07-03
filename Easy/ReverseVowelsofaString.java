class Solution {
    public String reverseVowels(String s) {
      StringBuilder res = new StringBuilder(s);
      int left = 0;
      int right = s.length()-1;
      while(left<right){
        char leftchar = res.charAt(left);
        char rightchar = res.charAt(right);
        if(isvowel(leftchar)){
            if(isvowel(rightchar)){
                res.setCharAt(left,rightchar);
                res.setCharAt(right,leftchar);
                left++;
                right--;
            }
            else{
                right--;
            }
        }else{
            left++;
        }
    }
    return res.toString();
    }
    public static boolean isvowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}
