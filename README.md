# Longest-Obstacle-Course-Detector
we are given a 0-indexed integer array obstacles of length n, where obstacles[i] describes the height of the ith obstacle.For every index i between 0 and n - 1 (inclusive), find the length of the longest obstacle course in obstacles such that:
- we choose any number of obstacles between 0 and i inclusive.
- we must include the ith obstacle in the course.
- we must put the chosen obstacles in the same order as they appear in obstacles.
- Every obstacle (except the first) is taller than or the same height as the obstacle immediately before it.

we should return an array ans of length n, where ans[i] is the length of the longest obstacle course for index i as described above.
## Example
Input: obstacles = [3,1,5,6,4,2]

Output: [1,1,2,3,2,2]

Explanation: The longest valid obstacle course at each position is:

- i = 0: [3], [3] has length 1.
- i = 1: [3,1], [1] has length 1.
- i = 2: [3,1,5], [3,5] has length 2. [1,5] is also valid.
- i = 3: [3,1,5,6], [3,5,6] has length 3. [1,5,6] is also valid.
- i = 4: [3,1,5,6,4], [3,4] has length 2. [1,4] is also valid.
- i = 5: [3,1,5,6,4,2], [1,2] has length 2.
## Approach

The program uses dynamic programming to find the longest subsequence. It maintains a list dp of increasing elements found so far. For each element in the obstacles array, the program uses binary search to find the index where the element should be inserted in dp. If the index is equal to the length of dp, the element is added to the end of the list. The index where the element is inserted represents the length of the longest increasing subsequence up to that point, so it is added to the answer array.

## Time complexity 
The time complexity of the program is O(n log n) due to the binarsearch.
## Space Complexity 
The dp array has a maximum size of n where n is the length of the obstacles array. Therefore, the space complexity of the provided solution is O(n).
