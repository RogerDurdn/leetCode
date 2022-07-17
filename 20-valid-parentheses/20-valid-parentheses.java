class Solution {
    public boolean isValid(String s) {
    Map pairs = Map.of('}','{',']','[',')','(');
        Stack<Character> symbols = new Stack();
        for(char symbol: s.toCharArray()){
            if(!symbols.isEmpty() && symbols.peek() == pairs.get(symbol)){
                symbols.pop();
            }else{
            symbols.add(symbol);
            }
        }
        return symbols.isEmpty();
    }
}

