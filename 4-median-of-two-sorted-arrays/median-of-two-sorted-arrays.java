class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int[] arr=IntStream.concat(IntStream.of(nums1),IntStream.of(nums2)).sorted().toArray();
    if((arr.length)%2!=0)
    return arr[arr.length/2];
    else
    return (arr[arr.length/2]+arr[(arr.length/2)-1])/2.0;
    }
}