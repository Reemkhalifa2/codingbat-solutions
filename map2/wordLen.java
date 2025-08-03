public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> result = new HashMap<>();

  for (String str : strings) {
    result.put(str, str.length());  // Store the string length as the value
  }

  return result;
  
}
