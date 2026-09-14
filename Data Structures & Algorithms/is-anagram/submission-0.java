class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        Map<Character, Integer> sMap = charFrequency(s);
        Map<Character, Integer> tMap = charFrequency(t);
        return sMap.equals(tMap);
    }

    public Map<Character, Integer> charFrequency(String str) {
		Map<Character, Integer> frequency = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			if (!frequency.containsKey(str.charAt(i)))
				frequency.put(str.charAt(i), 1);
			int count = frequency.get(str.charAt(i));
			frequency.replace(str.charAt(i), count + 1);
		}
		return frequency;
	}
}
