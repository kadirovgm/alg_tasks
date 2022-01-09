# `Binary search`
## Time complexity: log (n)
## Precondition: sorted array

```python
def binary_search(sorted_list, item):
    low = 0
    high = len(sorted_list) - 1

    while low <= high:
        mid = (low + high)//2
        guess = sorted_list[mid]
        print(guess)
        if guess == item:
            return mid
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    return None


my_list = [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29]
print(binary_search(my_list, 25))
```

### Notes

1. The speed of algorithm is measured not in seconds but in the growth rate of the number of operations.
2. The formula descrubes how fast the algorithm execution time increases with an increase in the size of the input data.
3. Execution time described as "big-O"
4. O (log N) is faster than O (n) 