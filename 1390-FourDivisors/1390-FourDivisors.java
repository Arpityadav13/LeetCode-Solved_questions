// Last updated: 1/4/2026, 11:51:45 PM
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3        int totalSum = 0;
4
5        for (int num : nums) {
6            int sum = 0;
7            int count = 0;
8
9            for (int d = 1; d * d <= num; d++) {
10                if (num % d == 0) {
11                    int e = num / d;
12
13                    if (d == e) {
14                        count++;
15                        sum += d;
16                    } else {
17                        count += 2;
18                        sum += d + e;
19                    }
20
21                    if (count > 4) break;
22                }
23            }
24
25            if (count == 4) {
26                totalSum += sum;
27            }
28        }
29
30        return totalSum;
31    }
32}
33