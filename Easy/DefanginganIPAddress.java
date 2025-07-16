class Solution {
    public String defangIPaddr(String address) {
        StringBuilder helper = new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch = address.charAt(i);
            if(ch=='.')helper.append("[.]");
            else helper.append(ch);
        }
    return helper.toString();
    }
}
