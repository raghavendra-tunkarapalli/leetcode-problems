class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
       int[] tempArray = new int[n];
       for(List<Integer> i:edges){
        tempArray[i.get(1)]++;
       }
       List<Integer> result = new ArrayList<>();
       for(int i=0;i<n;i++){
        if(tempArray[i]==0)result.add(i);
       }
       return result;
    }
}
