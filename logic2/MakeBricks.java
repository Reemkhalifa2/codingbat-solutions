
public boolean makeBricks(int small, int big, int goal) {
  int maxBigBricks = goal / 5;
    int bigBricksToUse = Math.min(maxBigBricks, big);

    int remaining = goal - bigBricksToUse * 5;

    return remaining <= small;
}
