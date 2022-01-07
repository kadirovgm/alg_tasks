# O(n)
# char = 8 bite -> 256 bite all chars (36 characters)

NO_OF_CHARS = 256

def areAnagram(str1,str2):
     
    # Create temp array and initialize all values as 0
    count=[0 for i in range(NO_OF_CHARS)]
    i=0
    # For each character in input strings,
    # increment count in the corresponding count array
    for i in range(len(str1)):
        count[ord(str1[i]) - ord('a')] += 1;
        count[ord(str2[i]) - ord('a')] -= 1;
     
    # See if there is any non-zero value in count array
    for i in range(NO_OF_CHARS):
        if (count[i] != 0):
            return False
    return True
 
# test code
str1="test"
str2="estt"
 
# Function call
if (areAnagram(str1, str2)):
    print("The two strings are anagram of each other")
else:
    print("The two strings are not anagram of each other")