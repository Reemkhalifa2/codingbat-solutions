public boolean evenlySpaced(int a, int b, int c) {
  int[] nums = {a, b, c};
    Arrays.sort(nums); // sorts ascending

    int diff1 = nums[1] - nums[0];
    int diff2 = nums[2] - nums[1];

    return diff1 == diff2;
}
