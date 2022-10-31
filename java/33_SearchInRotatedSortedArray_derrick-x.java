class Solution {
    public int search(int[] nums, int target) {
        //Find pivot
        int left = 0;
        int right = nums.length-1;
        while (left!=right){
            int middle = (left+right+1)/2;
            if (nums[middle]>nums[nums.length-1]){
                left = middle;
            } else {
                right = middle-1;
            }
        }
        int pivot = (left+right+1)/2+1;
        if (left==0&&right==0){
            pivot = 0;
        }
        if (pivot==0&&nums.length>1&&nums[1]<nums[0]){
            pivot = 1;
        }
        if (nums.length==2){
            if (nums[0]>nums[1]){
                pivot = 1;
            } else {
                pivot = 0;
            }
        }
        System.out.println(pivot);
        //Find target
        left = 0;
        right = nums.length-1;
        while (left!=right){
            int middle = (left+right+1)/2;
            int realIndex = middle+pivot;
            if (realIndex>=nums.length){
                realIndex-=nums.length;
            }
            if (nums[realIndex]>target){
                right = middle-1;
            } else if (nums[realIndex]<target){
                left = middle;
            } else {
                return realIndex;
            }
        }
        int middle = (left+right+1)/2;
            int realIndex = middle+pivot;
            if (realIndex>=nums.length){
                realIndex-=nums.length;
            }
            if (nums[realIndex]>target){
                right = middle-1;
            } else if (nums[realIndex]<target){
                left = middle;
            } else {
                return realIndex;
            }
        return -1;
    }
}
