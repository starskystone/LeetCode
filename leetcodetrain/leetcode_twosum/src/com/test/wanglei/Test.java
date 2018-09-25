package com.test.wanglei;

public class Test {
	public static void main(String[] args){
		
	}
		
	
	public int[] sum(int[] nums,int target){
		for(int i = 0; i < nums.length-1; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[i] + nums[j] == target){
					return new int[]{i,j};
				}
			}
		}
		return null;
	}
}

