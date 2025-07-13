class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder obj1 = new StringBuilder();
        int n = num1.length()-1;
        int m = num2.length()-1;
        int carry = 0;
        while(n>=0 || m>=0 || carry!=0){
            int digit1 = (n>=0) ? num1.charAt(n--)-'0' : 0;
            int digit2 = (m>=0) ? num2.charAt(m--)-'0' : 0;
            int sum = digit1+digit2+carry;
            obj1.append(sum%10);
            carry = sum /10;
        }
        return obj1.reverse().toString();
    }
}
