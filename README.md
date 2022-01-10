# sort-o_CrabbyChips

* Crabby Chips: Lauren Lee and Diana Akhmedova
* APCS pd8
* Lab 04
* 2022-01-10
* Time Spent: 2.5 hrs
* SOTW: Are You Bored Yet? by Wallows

## Best and Worst Case Scenario for Each
### Bubble Sort:
* Best: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]; [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  * Description: An ArrayList of elements in ascending order or of the same elements.
  * Reason:
  * Total Comparisons: 45
  * Total Swaps: 0
  * Big-O Classification: O(n)

* Worst: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
  * Description: An ArrayList of elements in descending order.
  * Reason:
  * Total Comparisons: 45
  * Total Swaps: 45
  * Big-O Classification: O(n<sup>2</sup>)
### Selection Sort:
* Best: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]; [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  * Description: An ArrayList of elements in descending order or of the same elements.
  * Reason:
  * Total Comparisons: 55
  * Total Swaps: 9
  * Big-O Classification: O(n<sup>2</sup>)

* Worst: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
  * Description: An ArrayList of elements in ascending order.
  * Reason:
  * Total Comparisons: 55
  * Total Swaps: 45
  * Big-O Classification: O(n<sup>2</sup>)
### Insertion Sort:
* Best: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]; [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
  * Description: An ArrayList of elements in ascending order or of the same elements.
  * Reason:
  * Total Comparisons: 9
  * Total Swaps: 0
  * Big-O Classification: O(n)

* Worst: [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
  * Description: An ArrayList of elements in descending order.
  * Reason:
  * Total Comparisons: 45
  * Total Swaps: 45
  * Big-O Classification: O(n<sup>2</sup>)

## Conclusions
### Arrays Populated of the Same Element:
* Bubble Sort and Insertion Sort are more efficient, because they do not require any swaps.
* While in Selection Sort, it requires swaps even though it would not need swaps theoretically.
### Arrays Populated in Ascending Order:
* This is the best case scenario for all three sort types, as no swaps are necessary.
* However, Selection Sort the least efficient because it requires the most comparisons.
### Arrays Populated in Descending Order:
* This is the worst case scenario for all three sort types, as it requires the most swaps.
* ! However, Selection Sort is the most efficient because it requires the least swaps, although it does require the most comparisons.
### Final Conclusions:
* The most efficient sorts for the best case scenarios were Bubble Sort and Insertion Sort because they required no swaps and fewer comparisons.
* ! Selection Sort is the most efficient in the worst case scenario because it requires less swaps, but in the best case scenarios it requires more comparisons and sometimes more swaps than necessary.
