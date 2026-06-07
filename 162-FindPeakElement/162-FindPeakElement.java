// Last updated: 6/7/2026, 9:25:53 AM
1class Solution {
2    public int findPeakElement(int[] arr) {
3        int n  =arr.length;
4         if (n == 1) return 0;
5        if (arr[0] > arr[1]) return 0;
6        if (arr[n - 1] > arr[n - 2]) return n - 1;
7        int i = 1 ;
8        int j = arr.length-2;
9        while(i<=j){
10            int mid = i + (j-i)/2;
11            if(arr[mid-1]< arr[mid] && arr[mid+1]< arr[mid]){
12                return mid;
13            }
14            else if(arr[mid]<arr[mid+1]){
15                i = mid+1;
16
17            }else{
18                j = mid-1;
19            }
20
21        }
22        return -1;
23    }
24}