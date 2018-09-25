package com.test.wanglei;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		
		int len = Test.removeDuplicates(nums);
		for (int i = 0; i < len; i++) {
		    System.out.println(nums[i]);
		}
	}
	
	 public static int removeDuplicates(int[] nums) {   //我的解法
	   if(nums.length == 0){
		   return 0;
	   }
		 int temp = nums[0];
	     int n = nums.length;
	     for(int i = 1; i < n; i++){
	        if(nums[i] != temp){
	            temp = nums[i];
	            continue;
	        }
	        else{
	            for(int j = i; j < n-1; j++){
	                nums[j] = nums[j+1];
	            }
	            i--;
	            n--;
	        }
	    }
	    return n;
	 }
	 
	 public static int improveRemoveDuplicates(int[] nums){    //leetcode改进揭发
		 if(nums.length == 0){
			 return 0;
		 }
		 
		 int i =0;
		 int j = i+1;
		 while (j < nums.length) {
			 if(nums[i] != nums[j]){
				 i++;
				 if(i != j){
					 nums[i] = nums[j];
				 }
			 }
			 j++;
		 }
		 return i+1;
	 }
}
	
	