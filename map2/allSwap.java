public String[] allSwap(String[] strings) {
  Map<Character, Integer> indexMap = new HashMap<>();

    for (int i = 0; i < strings.length; i++) {
        char firstChar = strings[i].charAt(0);

        if (indexMap.containsKey(firstChar)) {
            int prevIndex = indexMap.get(firstChar);

            String temp = strings[i];
            strings[i] = strings[prevIndex];
            strings[prevIndex] = temp;

            indexMap.remove(firstChar);
        } else {
            indexMap.put(firstChar, i);
        }
    }

    return strings;
}
