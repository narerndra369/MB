public class Jump_Game{
    public static void main(String[] args){
        int count = 0;
        int nums[] = {2,3,0,1,4};
        int k=nums[0];
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=i+1; j<=i+k;j++){
                max=Math.max(nums[j],max);
            }
            count ++;
            i += max;
            if(i<nums.length){
                k=nums[i];
            }
            i -= 1;
            
        }
        System.out.println(count);
    }
}
