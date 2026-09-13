class Solution {
    public int findNumbers(int[] nums) {
        int array_counter=0;
        for(int i=0;i<nums.length;i++){
            int temp,element=nums[i],each_element_digit_count=0;
            while (element>0){
                temp=element%10;
                element/=10;
                each_element_digit_count++;
            }
            if(each_element_digit_count%2==0){
                array_counter++;
            }
        }
    return array_counter;
    }
}