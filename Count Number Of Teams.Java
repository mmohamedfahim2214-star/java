lass Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int count = 0;

        for (int j = 0; j < n; j++) {
            int leftSmaller = 0, leftGreater = 0;
            int rightSmaller = 0, rightGreater = 0;

            // Count soldiers on the left
            for (int i = 0; i < j; i++) {
                if (rating[i] < rating[j]) {
                    leftSmaller++;
                } else {
                    leftGreater++;
                }
            }

            // Count soldiers on the right
            for (int k = j + 1; k < n; k++) {
                if (rating[k] > rating[j]) {
                    rightGreater++;
                } else {
                    rightSmaller++;
                }
            }

            // Increasing + Decreasing teams
            count += leftSmaller * rightGreater;
            count += leftGreater * rightSmaller;
        }

        return count;
    }
}
