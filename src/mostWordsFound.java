public class mostWordsFound {
    class Solution {
        public int mostWordsFound(String[] sentences) {
            int max = 0;
            for(int i = 0;i<sentences.length;i++){
                String[] newStr = sentences[i].split("\s+");
                max = Math.max(newStr.length,max);
            }
            return max;
        }
    }
}
