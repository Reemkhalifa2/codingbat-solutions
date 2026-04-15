public int blackjack(int a, int b) {
  if (a > 21 && b > 21) {
        return 0;
    }
    if (a > 21) {
        return b;
    }
    if (b > 21) {
        return a;
    }
    // Both are ≤ 21, return the one closer to 21
    return (21 - a) <= (21 - b) ? a : b;
}
