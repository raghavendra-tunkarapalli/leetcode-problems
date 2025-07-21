class Solution {
    public int countSegments(String s) {
        if(s.equals(""))return 0;
        int count=0;
        String[] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(!arr[i].isEmpty())count++;
        }
        return count;
    }
}
