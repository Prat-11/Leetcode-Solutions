class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;

        if (n <= 2) return n;

        int ans = 0;

        for (int i = 0; i < n; i++) {
            HashMap<String, Integer> map = new HashMap<>();

            int same = 1;
            int max = 0;

            for (int j = i + 1; j < n; j++) {
                long dx = (long) points[j][0] - points[i][0];
                long dy = (long) points[j][1] - points[i][1];

                if (dx == 0 && dy == 0) {
                    same++;
                    continue;
                }

                long gcd = gcd(Math.abs(dx), Math.abs(dy));

                dx /= gcd;
                dy /= gcd;

                if (dx < 0 || (dx == 0 && dy < 0)) {
                    dx = -dx;
                    dy = -dy;
                }

                String slope = dx + "," + dy;

                map.put(slope, map.getOrDefault(slope, 0) + 1);

                max = Math.max(max, map.get(slope));
            }

            ans = Math.max(ans, max + same);
        }

        return ans;
    }

    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
