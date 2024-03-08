class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) return 1;
        else if (arr1.length < arr2.length) return -1;

        int sumArr1 = 0, sumArr2 = 0;

        for (int num : arr1) sumArr1 += num;
        for (int num : arr2) sumArr2 += num;

        if (sumArr1 > sumArr2) return 1; 
        else if (sumArr1 < sumArr2) return -1;
        
        return 0;
    }
}