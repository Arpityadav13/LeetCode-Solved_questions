// Last updated: 5/8/2026, 9:26:54 PM
1class Solution {
2    public int sumOfPrimesInRange(int n) {
3        int rev = 0;
4        int temp = n;
5        while(temp>0){
6            int digit = temp%10;
7            rev = rev*10+digit;
8            temp =temp/10;
9        }
10        int min = Math.min(rev,n);
11        int max = Math.max(rev,n);
12        int sum = 0;
13        for(int i = min;i<=max;i++){
14            boolean isPrime = true;
15            if (i <= 1) {
16            isPrime = false;
17            } else {
18                for (int j = 2; j <= Math.sqrt(i); j++) {
19
20                if (i % j == 0) {
21                    isPrime = false;
22                    break;
23                }
24            }
25                if(isPrime){
26                    sum+=i;
27                }
28        }
29    }
30    return sum;
31    }
32}