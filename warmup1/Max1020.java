public int max1020(int a, int b) {
  if(Math.max(a,b)>= 10 && Math.max(a,b) <= 20){
    return Math.max(a,b);
  }
  if (a >= 10 && a <= 20) return a;
  if (b >= 10 && b <= 20) return b;
  return 0;
}
