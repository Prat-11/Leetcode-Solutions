class Solution {
    public int minSetSize(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq, Collections.reverseOrder());

        int removed = 0;
        int count = 0;

        for (int f : freq) {
            removed += f;
            count++;

            if (removed >= arr.length / 2) {
                return count;
            }
        }

        return count;
    }
}