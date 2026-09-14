class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			sMap.put(sChar, sMap.getOrDefault(sChar, 0) + 1);
			tMap.put(tChar, tMap.getOrDefault(tChar, 0) + 1);
		}
        return sMap.equals(tMap);
    }

    // public Map<Character, Integer> charFrequency(String str) {
	// 	Map<Character, Integer> frequency = new HashMap<>();
	// 	for (int i = 0; i < str.length(); i++) {
	// 		if (!frequency.containsKey(str.charAt(i)))
	// 			frequency.put(str.charAt(i), 1);
	// 		int count = frequency.get(str.charAt(i));
	// 		frequency.replace(str.charAt(i), count + 1);
	// 	}
	// 	return frequency;
	// }
}
