public boolean closeFar(int a, int b, int c) {
  int diffAB = Math.abs(a - b);
    int diffAC = Math.abs(a - c);
    int diffBC = Math.abs(b - c);

    boolean bClose_cFar = (diffAB <= 1) && (diffAC >= 2) && (diffBC >= 2);

    boolean cClose_bFar = (diffAC <= 1) && (diffAB >= 2) && (diffBC >= 2);

    return bClose_cFar || cClose_bFar;
}
