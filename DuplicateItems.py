def duplicate_items(list_numbers): 
    result = []
    # Sort the array
    list_numbers.sort()
    # Iterate over the list
    for i in range(1,len(list_numbers)):
        # If previous element is the same as current, its the duplicate element
        if list_numbers[i] == list_numbers[i - 1]:
            result.append(list_numbers[i])

    return result
