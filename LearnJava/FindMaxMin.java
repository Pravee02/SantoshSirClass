class FindMaxMin{
    static void findmaxmin(int[] nums){
        int max= nums[0];
        int min= nums[0];

        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
            max=nums[i];
            }
            if(nums[i]<=min){
                min=nums[i];
            }
        }
        System.out.println("the maximun number is "+max);
        System.out.println("the minimum number is "+min);

    }
    public static void main(String[] args) {

        int[] num={5,8,6,12,6,24,6};

        findmaxmin(num);
    }
}