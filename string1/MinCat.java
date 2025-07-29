public String minCat(String a, String b) {
  if (a.length() > b.length()) {
    int diff = a.length() - b.length();
    return a.substring(diff) + b;
  } else if (b.length() > a.length()) {
    int diff = b.length() - a.length();
    return a + b.substring(diff);
  } else {
    return a + b;
  }
}
