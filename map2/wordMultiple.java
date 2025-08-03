public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Integer> countMap = new HashMap<>();
    Map<String, Boolean> result = new HashMap<>();

    for (String str : strings) {
        int count = countMap.getOrDefault(str, 0) + 1;
        countMap.put(str, count);
    
        result.put(str, count >= 2);
    }

    return result;
}
