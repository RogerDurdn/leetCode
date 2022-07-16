class Solution {
    public boolean isAnagram(String s, String t) {
        int sL = s.length(); 
        int tL = t.length(); 
        if(sL != tL) return false;
        Map<Character, Integer> cMap = new HashMap<>();
        for(int i = 0; i < sL; i++){
            cMap.put(s.charAt(i),  cMap.getOrDefault(s.charAt(i), 0)+1);
            cMap.put(t.charAt(i),  cMap.getOrDefault(t.charAt(i), 0)-1);
        }
        for(Character c: cMap.keySet()){
            if(cMap.get(c) !=0) return false;
        }
        return true;
    }
}