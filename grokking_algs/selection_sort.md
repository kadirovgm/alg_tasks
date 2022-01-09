# Selection sort
## Time complexity: O(n^2)

```python
# Find the smallest
def find_smallest(arr):
    smallest = arr[0]
    smallest_index = 0
    for i in range (1, len(arr)):
        if arr[i] < smallest:
            smallest = arr [i]
            smallest_index = i
    return smallest_index

# Sorting by selection
def selectionSort(arr):
    newArr = []
    for i in range(len(arr)):
        smallest = find_smallest(arr)
        newArr.append(arr.pop(smallest))
    retutn newArr

print selectionSort([5,3,6,2,10])
```