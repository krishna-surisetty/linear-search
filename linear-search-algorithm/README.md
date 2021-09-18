## Linear Search Algorithm

1. In the given data structure start to iterate over elements. Either from left to right or right to left
2. Compare each element with the element value for each iteration
3. If the elements match based on requirement send a boolean response or send an index value of that element


      private static boolean doLinearSearchReturnTrueIfElementIsPresent(int[] givenArrayForLinearSearch, int elementToSearch) {
        for(int iteratedElement  : givenArrayForLinearSearch) {
            if (iteratedElement == elementToSearch) {
            return true;
            }
        }
        return false;
      }

## Time Complexity for Linear Search Algorithm

O(n) is the time complexity for this algorithm.

As we know that Big O notations specify the worst case complexity, if the number to be searched for is at the last right most index and comparison starts from left most index, 
the execution of the comparison logic increases by one execution

    if (iteratedElement == elementToSearch)

Number of elements in given data structure is in direct proportion to number of executions of search logic

## Space Complexity for Linear Search Algorithm

NEED TO UNDERSTAND ON THIS TOPIC - should we consider Auxiliary space or not
Different websites provide info, one contradicting other

