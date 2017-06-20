/**Given a set of distinct integers, nums, return all possible subsets.
Note: The solution set must not contain duplicate subsets.
For example,
If nums = [1,2,3], a solution is:*/

//subsets 
//1.using backtracking framework, idea is include this item or not.
public void helper(ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list, int[] nums, int pos){
	for(int i= 0; i < nums.length; i++) {
	//	if ( i != pos && S.get(i) == S.get(i-1)){
    //           continue;
    //    }
		list.add(nums[i]);
		res.add(list);
		helper(res,list,nums,i+1);
		list.remove(list.size());
	}
}

//2.using the feature of subsets   s(i) = s(i-1) + {s(i-1)+nums[i]}
ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
ArrayList<Integer> list = new ArrayList<Integer>();
res.add(list);   // add empty set
for(int i = 0; i < nums.length; i++) {
	for(ArrayList<Integer> list : res) {
		res.add(new ArrayList(list));
		list.add(nums[i]);
	}
}

//3 bit manupalation    10110  1 present include 0 not   totally 2^n
int size = Math.pow(2,nums.length);
error: incompatible types: possible lossy conversion from double to int
List<List<Integer>> res = new ArrayList<ArrayList<Integer>>();
error: incompatible types: ArrayList<ArrayList<Integer>> cannot be converted to List<List<Integer>>
if(i >> j & 1)      if((i >> j & 1) != 0)
error: incompatible types: int cannot be converted to boolean

//combination
    private void helper(
        ArrayList<ArrayList<Integer>> rst, ArrayList<Integer> solution, int n, int k, int start) {

        if (solution.size() == k){
            rst.add(new ArrayList(solution));
            return;
        }
        
        for(int i = start; i<= n; i++){
            solution.add(i);
            
            // the new start should be after the next number after i
            helper(rst, solution, n, k, i+1); 
            solution.remove(solution.size() - 1);
        }
    }