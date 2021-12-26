### Algorithm as pseudocode ###:
# PRECONDITION:
# const arr [N]
# const index = arr [0]
# const max_count = 1
#
# FUNC: migrationBirds(array, n) {
#     array = bubblesort()
#     FOR every element of array
#         count = 1
#         FOR every next element
#             IF array element == array next element
#                 THEN count++
#         IF count > max_count
#             THEN max_count = count AND index = array element
#         ELSE IF count == max_count
#             THEN IF array element < index
#                 THEN max_count = count AND index = array element
#     IF max_count > 1
#         THEN max_count time(s) the index occurs
#     ELSE
#         All elements are different

import pytest

def bubble_sort(arr):
    for i in range(len(arr) - 1):
        for j in range(len(arr) - i - 1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
    return arr

def migratoryBirds(arr):
    sorted_arr = bubble_sort(arr)
    index = arr[0]
    max_count = 1
    for elm in range(len(sorted_arr) - 1):
        count = 1
        for i in range(elm + 1, len(sorted_arr)):
            if sorted_arr[elm] == sorted_arr[i]:
                count += 1
        if count > max_count:
            max_count = count
            index = sorted_arr[elm]
        elif count == max_count:
            if sorted_arr[elm] < index:
                max_count = count
                index = sorted_arr[elm]
    if max_count > 1:
        print(f"{max_count} birds(s) with the lowest type of id = {index} occurs")
        return True
    else:
        print("All types of id have only one birds")
        return False


#### TEST: for execution pytest -s -v test_migratory_birds
arr1 = [1, 2, 3, 4, 5]              # false
arr2 = [1, 1, 2, 2, 3]              # 1
arr3 = [1, 1, 4, 3, 3]              # 1
arr4 = [1, 2, 3, 1, 4, 1]           # 1
arr5 = [1, 1, 1, 1, 1]              # 1
arr6 = [1, 3, 3, 3, 1, 2, 1]        # 1

@pytest.mark.parametrize('arr',
                         (arr1, arr2, arr3, arr4, arr5, arr6))
def test_migratory_birds(arr):
    if arr == arr1: assert migratoryBirds(arr) is True, "Error"
    if arr == arr2: assert migratoryBirds(arr) is True, "Error"
    if arr == arr3: assert migratoryBirds(arr) is True, "Error"
    if arr == arr4: assert migratoryBirds(arr) is True, "Error"
    if arr == arr5: assert migratoryBirds(arr) is True, "Error"
    if arr == arr6: assert migratoryBirds(arr) is True, "Error"
