class Solution {
    public int mostWordsFound(String[] sentences) {
       int max = 0;
        int count = 0;
        for(String s : sentences){
            for(int i = 0;i<s.length();i++){
                if(s.charAt(i)==' '){
                    count++;
                }
        }
            max = Math.max(count,max);
            count = 0;
    }
        return max+1;
}
}