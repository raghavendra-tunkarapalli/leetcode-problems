class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] copy = score.clone();
        Arrays.sort(copy);
        int first = 0;
        int last = copy.length-1;
        while(first<last){
            int temp = copy[first];
            copy[first]=copy[last];
            copy[last]=temp;
            first++;
            last--;
        }
        Map<Integer, String> map = new HashMap<>();
        int rank = 4;
        for(int i=0;i<copy.length;i++){
            if(i==0)map.put(copy[i],"Gold Medal");
            else if(i==1)map.put(copy[i],"Silver Medal");
            else if(i==2)map.put(copy[i],"Bronze Medal");
            else map.put(copy[i],rank++ +"");
        }
        String[] result = new String[score.length];
            for(int j=0;j<score.length;j++){
                result[j]=map.get(score[j]);
            }
    return result;
    }
}
