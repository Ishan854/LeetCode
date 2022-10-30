class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = words.length;
        boolean[] alphabate =  new boolean[26];
        for(char c : allowed.toCharArray()){
            alphabate[c-'a'] = true;
        }
        for(String word : words){
            for(char c : word.toCharArray())
            if(alphabate[c-'a']==false){
                count--;
                break;
            }
        }
        return count;
    }
}