class Solution {
    public String removeDuplicates(String s) {
        StringBuilder strbdr = new StringBuilder(s);
        for(int i=0;i<strbdr.length()-1;){
            if(strbdr.charAt(i)==strbdr.charAt(i+1)){
              strbdr.delete(i,i+2);
              if(i>0)i--;
            }else i++;
        }
        return strbdr.toString();
    }
}
