/* 第一种方法  subsets  set = subset + (subset+i);
*/
public List<List<Integer>> subsets(int[] nums) {
  List<List<Integer>> res = new ArrayList<List<Integer>>();
  List<Integer> list = new ArrayList<Integer>();
  res.add(list);
  
  for(int i = 0; i < nums.length; i++) {
      int n = res.size();
      for(int j = 0; j < n; j++) {
          res.add(new ArrayList(res.get(j)));
          res.get(j).add(nums[i]);
      }
  }
  return res;
}