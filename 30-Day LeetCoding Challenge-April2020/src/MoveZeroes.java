/*
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */

public class MoveZeroes {
	 public void moveZeroes(int[] nums) {
	        int len = nums.length;
	        
	        int zeroInd=0;
	        int oneInd=0;
	        
	        while(zeroInd!=len && oneInd!=len){
	           
	            if(nums[zeroInd] == 0 && nums[oneInd]!=0 ){
	                if( zeroInd<oneInd){
	                int temp = nums[zeroInd];
	                nums[zeroInd]=nums[oneInd];
	                nums[oneInd]=temp;
	                    zeroInd++;
	                oneInd++;
	                }
	                else{
	                    oneInd++; 
	                }
	                
	            }
	             if(zeroInd<nums.length && nums[zeroInd]!=0){
	                zeroInd++;
	            }
	            if(oneInd<nums.length && nums[oneInd]==0){
	                oneInd++;
	            }
	            
	            
	        }
	        
	    }

}
