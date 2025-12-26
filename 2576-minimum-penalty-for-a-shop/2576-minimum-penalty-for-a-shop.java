class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int y = 0;
        for (char c : customers.toCharArray()) {
            if (c == 'Y') {
                y++;
            }
        }
        int op = 0;
        int cp = y;
        int mp = op + cp;
        int best = 0;
        for (int j = 1; j <= n; j++) {
            if (customers.charAt(j - 1) == 'Y') {
                cp--;
            } else {
                op++;
            }
            int currentPenalty = op + cp;
            if (currentPenalty < mp) {
                mp = currentPenalty;
                best = j;
            }
        }
        return best;
    }
}