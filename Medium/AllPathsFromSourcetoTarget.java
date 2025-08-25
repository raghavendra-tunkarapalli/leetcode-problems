class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      List<List<Integer>> result = new ArrayList<>();
      List<Integer> subList = new ArrayList<>();
      subList.add(0);
      dfs(graph, result, subList, 0);
      return result;  
    }
    public void dfs(int[][] graph, List<List<Integer>> result, List<Integer> subList, int key){
        if(key==graph.length-1){
            result.add(new ArrayList<>(subList));
            return;
        }
        for(int i:graph[key]){
            subList.add(i);
            dfs(graph,result,subList,i);
            subList.remove(subList.size()-1);
        }
    }
}
