public class anagram_java_2_count {

    static int NO_OF_CHARS = 256;
 
    static boolean areAnagram(char[] str1,
                              char[] str2)
    {
        // Create a temp array and initialize all values as 0
        int[] count = new int[NO_OF_CHARS];
        int i;
        
        if (str1.length != str2.length)
            return false;

        // For each character in input strings,
        // increment count in the corresponding count array
        for(i = 0; i < str1.length; i++)
        {
            count[str1[i] - 'a']++;
            count[str2[i] - 'a']--;
        }
     
        for(i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0)
            {
                return false;
            }
        return true;
    }
     
    // TEST
    public static void main(String[] args)
    {
        char str1[] = "test".toCharArray();
        char str2[] = "estt".toCharArray();
     
        // Function call
        if (areAnagram(str1, str2))
            System.out.print("The two strings are " +
                             "anagram of each other");
        else
            System.out.print("The two strings are " +
                             "not anagram of each other");
    } 
}

// complexity O(n)
