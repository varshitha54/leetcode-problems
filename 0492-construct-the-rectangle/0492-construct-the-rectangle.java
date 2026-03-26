class Solution {
    public int[] constructRectangle(int area) {
        int[] a = new int[2];

        for (int i = 1; i <= Math.sqrt(area); i++) {
            if (area % i == 0) {
                int j = area / i;

                if (j >= i) { // ensure L >= W
                    a[0] = j; // length
                    a[1] = i; // width
                }
            }
        }
        return a;
    }
    }