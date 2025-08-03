public String deFront(String str) {
  if (str.length() >= 2 && str.substring(0, 2).equals("ab")) {
    return str;
  }

  if (str.length() >= 2 && str.charAt(0) == 'a' && str.charAt(1) != 'b') {
    return str.charAt(0) + str.substring(2);
  }

  if (str.length() >= 2 && str.charAt(0) != 'a' && str.charAt(1) == 'b') {
    return str.substring(1);
  }

  if (str.length() >= 2 && str.charAt(0) != 'a' && str.charAt(1) != 'b') {
    return str.substring(2);
  }

  // For short strings like "a", "b", or "", just handle safely
  if (str.length() == 1 && str.charAt(0) == 'a') {
    return "a";
  }

  return "";
}
