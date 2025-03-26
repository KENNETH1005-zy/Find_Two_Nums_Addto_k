# Challenge: Find Two Numbers That Add Up to K
## Solution1: Using two pointers
To implement this approach, we first sort the given array in ascending order. Then, we initialize two pointers: 
one at the beginning of the array and the other at the end. These pointers will gradually move toward each other. 
At each step, we compute the sum of the values pointed to by these pointers. 
If the sum is smaller than the target we are looking for, we move the left pointer to the right. Conversely, if it’s larger, we move the right pointer to the left. 
We continue this process until we find a pair whose sum equals the target.
## Solution2: Using binary Search
First, the array is sorted to arrange the elements in ascending order, enabling efficient searching. Then, for each element in the sorted array, we compute the difference between the target sum (k) and the current element 
 This difference represents the value we need to find in the array to achieve the target sum. By utilizing binary search, we attempt to locate this difference within the sorted array. This process is repeated for each element in the array until a pair that sums up to the target is found.
