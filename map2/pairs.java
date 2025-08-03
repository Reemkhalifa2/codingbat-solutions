public Map<String, String> pairs(String[] strings) {
  Map<String, String> result = new HashMap<>();

    for (String str : strings) {
        String firstChar = str.substring(0, 1);
        String lastChar = str.substring(str.length() - 1);
        result.put(firstChar, lastChar);
    }

    return result;
}
