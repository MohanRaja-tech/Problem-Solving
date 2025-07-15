class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        boolean vowel = false;
        boolean conso = false;
        boolean special = false;
        for(char ch:word.toCharArray()){
            if(Character.isDigit(ch)){
                continue;
            }
            if(set.contains(Character.toLowerCase(ch))){
                vowel = true;
            }
            else if(!set.contains(ch) && Character.isLetter(ch)){
                conso = true;
            }
            else{
                special = true;
            }
            
        }

        return vowel&&conso&&!special ? true  : false;
        
    }
}
