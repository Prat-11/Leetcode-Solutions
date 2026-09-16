class Solution {
    public String reversePrefix(String word, char ch) {
        char[] a = word.toCharArray();

        int index = word.indexOf(ch);

        if (index == -1) return word;

        int left = 0, right = index;

        while (left < right) {
            char temp = a[left];
            a[left] = a[right];
            a[right] = temp;

            left++;
            right--;
        }

        return new String(a);
    }
}