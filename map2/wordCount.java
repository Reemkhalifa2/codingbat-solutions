public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> countMap = new HashMap<>();

    for (String str : strings) {
        int count = countMap.getOrDefault(str, 0) + 1;
        countMap.put(str, count);
    }

    return countMap;
}
