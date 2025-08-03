public int makeChocolate(int small, int big, int goal) {
  int maxBigBars = goal / 5;
    int bigBarsToUse = Math.min(maxBigBars, big);

    int remaining = goal - bigBarsToUse * 5;

    if (remaining <= small) {
        return remaining;  // number of small bars to use
    } else {
        return -1;  // cannot meet goal with given bars
    }
}
