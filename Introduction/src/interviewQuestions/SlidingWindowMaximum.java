package interviewQuestions;

import java.util.*;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		int nums[] = {4, 3, 1, 2, 5, 3, 4, 7, 1, 9}; 
		int ans[] = solution.maxSlidingWindow(nums, 4);

		for(int x: ans) {
			System.out.print(x+" ");
		}
	}
	
	static class Solution {
	    public int[] maxSlidingWindow(int[] nums, int k) {
	        int n = nums.length;
	    	Deque<Integer> dq = new LinkedList<>();
	    	int ans[] = new int[n-k+1];
	    	
	    	int i = 0;
	    	for(;i<k;i++) {
	    		while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	
	    	for(;i<n;i++) {
	    		ans[i-k]  = nums[dq.peekFirst()];
	    		
	    		while(!dq.isEmpty() && dq.peekFirst() <= i-k) {
	    			dq.removeFirst();
	    		}
	    		while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
	    			dq.removeLast();
	    		}
	    		dq.addLast(i);
	    	}
	    	ans[i-k] = nums[dq.peekFirst()];
	    	
	    	return ans;
	    }
	}

}
