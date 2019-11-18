# Bubble vs Heap Sort Algorithms
There are many sorting algorithms. Here are examples of one of the efficient O(Nlog(N)) and one of the time-consuming O(N^2) algorithm. All of them do the job, but some of them do faster.
### Bubble Sort - O(N^2)
Starting from the first element compares each element with the next one. If it is sorting ascending order, swaps these two elements order by moving the smaller element to the left and larger element to the right. Repeats this process for each individual element.  
### Heap Sort - O(N*log(N))
Adds all items into a heap. Pop the largest item from the heap and insert it at the end (final position). Repeat for all items.

---

## Task
You are given an array of n size distinct elements, sort the array in ascending order using the Bubble Sort and Heap Sort algorithms.

## Input
5  
45 647 87 1 95  

## Output
Array is sorted in 5 swaps with Bubble Sort.  
1 45 87 95 647  
1 45 87 95 647  

---

## Links
Similar practice -  https://www.hackerrank.com/challenges/30-sorting/problem  
More about sorting algorithms - https://betterexplained.com/articles/sorting-algorithms/
