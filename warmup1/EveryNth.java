public String everyNth(String str, int n) {
  String substring = "";
  for (int i = 0; i < str.length(); i += n) {
    substring += str.substring(i, i + 1);
  }
  return substring;
}
