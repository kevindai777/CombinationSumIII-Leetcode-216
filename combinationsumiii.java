//Java Solution

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        LinkedList<Integer> temp = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        int index = 1;
        int sum = 0;
        
        backtrack(temp, result, index, sum, n, k);
        return result;
    }
    
    public void backtrack(LinkedList<Integer> temp, List<List<Integer>> result, int index, int sum, int n, int k) {
        if (sum > n || temp.size() > k) {
            return;
        }
        
        if (sum == n && temp.size() == k) {
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for (int i = index; i <= 9; i++) {
            temp.add(i);
            backtrack(temp, result, i + 1, sum + i, n, k);
            temp.removeLast();
        }
    }
}