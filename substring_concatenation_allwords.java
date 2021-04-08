class Solution {
    public List<Integer> findSubstring(String str, String[] words) {
         if(str.length()==0||words.length==0){
                return new ArrayList<>();
            }
            Map<String ,Integer>frequencymap=new HashMap<>();
            for(String word:words){
                frequencymap.put(word,frequencymap.getOrDefault(word,0)+1);
            }
            List<Integer>result=new ArrayList<>();
            int eachwordlength=words[0].length();
            int totalwords=words.length;
            for(int i=0;i<=str.length()-totalwords*eachwordlength;i++){
                Map<String, Integer>seenwords=new HashMap<>();
                for(int j=0;j<totalwords;j++){
                    int wordindex=i+j*eachwordlength;
                    String word=str.substring(wordindex,wordindex+eachwordlength);
                    if(!frequencymap.containsKey(word)){
                        break;
                    }
                    seenwords.put(word,seenwords.getOrDefault(word,0)+1);
                    if(seenwords.get(word)>frequencymap.getOrDefault(word,0)){
                        break;
                    }
                    if(j+1==totalwords){
                        result.add(i);
                    }
                }
            }
            
            
            return result;
    }
}