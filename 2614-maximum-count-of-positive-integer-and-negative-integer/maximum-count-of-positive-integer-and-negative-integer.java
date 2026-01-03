class Solution {
    public int maximumCount(int[] nums) {
        int countpositive=0;
        int countnegative =0;
        for(int ele :nums){
            if(ele >  0){
                countpositive++;
            }else if(ele < 0){
                countnegative++;
            }
            
        }
        return Math.max(countpositive,countnegative);
    }
}