## Sample string use-cases

1. Basic Operations

- Reverse a string.
```java
class Main {
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int i = 0, j = str.length() - 1;
        while(i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    public static void main(String[] args) {
        String str = new String("Hello");
        System.out.println(reverseString(str));
    }
}
```
```java
class Main {
    public static String reverseString(String str) { 
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverseString(str));
    }
}
```
- Check if a string is a palindrome.
```java
public static boolean isPalindrome(String str) {
    return str.equals(reverseString(str));
}
```
```java
public static boolean isPalindrome(String str) {
    int left = 0, right = str.length() - 1;

    while (left < right) {
        // Ignore case and whitespace differences
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}
```
- Count the number of vowels and consonants in a string.
- Find the frequency of characters in a string.
- Convert a string to uppercase/lowercase without using in-built methods.

2. Substrings and Patterns

- Generate all substrings of a string.
```java
public static void printAllSubStrings(String str) {
    for(int i = 0 ; i < str.length(); i++) {
        for(int j = i+1; j <= str.length(); j++) {
            System.out.println(str.substring(i, j));
        }
    }
}
```
```java
public static void generateSubstrings(String str) {
    // Outer loop to fix the starting index of the substring
    for (int i = 0; i < str.length(); i++) {
        // Inner loop to fix the ending index of the substring
        for (int j = i + 1; j <= str.length(); j++) {
            System.out.println(str.substring(i, j));
        }
    }
}
```
- Check if a string is a substring of another string.
- Find the longest palindrome substring in a string.
- Implement string matching algorithms:
- Naive Pattern Search
- KMP Algorithm
- Rabin-Karp Algorithm
- Boyer-Moore Algorithm

3. Parsing and Manipulation

- Remove duplicate characters from a string.
- Replace all spaces with %20 (simulate URL encoding).
- Split a sentence into words and reverse the order of words.
- Convert a numeric string (e.g., “1234”) to an integer without using Integer.parseInt().

4. Encoding and Decoding

- Implement basic run-length encoding.
- Decode a given run-length encoded string.
- Encrypt and decrypt a string using:
- Caesar Cipher
- Vigenère Cipher

5. Regular Expressions

- Validate email addresses.
- Validate a phone number.
- Extract hashtags from a social media post.
- Find and replace patterns in a string.

6. String Metrics

- Find the longest common subsequence (LCS) of two strings.
- Compute the edit distance (Levenshtein Distance) between two strings.
- Find the longest prefix which is also a suffix (LPS) in a string.
- Check if two strings are anagrams.

7. Performance Challenges

- Concatenate a list of strings efficiently using StringBuilder.
- Count the occurrences of a substring in a large text.
- Find the first non-repeating character in a string.
- Check if a string can be rearranged to form a palindrome.

8. Advanced Use Cases

- Implement a basic spell checker that suggests corrections for misspelled words.
- Implement a simple search engine for matching queries in a document (basic full-text search).
- Design and implement a compression algorithm for strings (e.g., Huffman Encoding).
