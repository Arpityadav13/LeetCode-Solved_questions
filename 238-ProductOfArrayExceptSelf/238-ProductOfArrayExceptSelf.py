# Last updated: 10/13/2025, 11:31:28 PM
class Solution(object):
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [1] * n  # This is allowed, not counted as extra space

        # 1st pass: prefix product
        prefix = 1
        for i in range(n):
            result[i] = prefix
            prefix *= nums[i]

        # 2nd pass: suffix product (in-place multiplication)
        suffix = 1
        for i in range(n - 1, -1, -1):
            result[i] *= suffix
            suffix *= nums[i]

        return result
