public Map<String, String> firstChar(String[] strings) {
  Map<String, String> result = new HashMap<>();

    for (String str : strings) {
        String firstChar = str.substring(0, 1).toLowerCase(); // Normalize to lowercase
        String value = result.getOrDefault(firstChar, "");
        result.put(firstChar, value + str);
    }

    return result;
}
