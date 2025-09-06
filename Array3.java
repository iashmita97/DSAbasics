class Array3 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Array3 obj = new Array3();

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = obj.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
