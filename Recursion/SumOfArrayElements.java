class Solution {
    public int arraySum(int[] nums) {
        //your code goes here
          return arrayEleSum(nums,0);
      
    }

    public int arrayEleSum(int[] nums,int index){
        if(index==nums.length-1){
            return nums[index];
        }
        return nums[index]+arrayEleSum(nums,index+1);

    }
}
