class Solution {
    public List<String> topKFrequent(String[] words, int kk) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(!map.containsKey(word))
                map.put(word, 1);
            else{
                int val = map.get(word);
                map.put(word,++val);
            }
        }
        
        int [] count = new int [map.size()];
        String [] word = new String[map.size()];
        int i=0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            word[i] = entry.getKey();
            count[i] = entry.getValue();
            i++;
        }
        
        //swap
        for(int j=0; j<count.length; j++){
            for(int k=j+1; k<count.length; k++){
                if(count[j]<count[k] || (count[j]==count[k] && word[j].compareToIgnoreCase(word[k])>0 ) ){
                    
                    int temp = count[j];
                    count[j] = count[k];
                    count[k] = temp;
                    
                    String t = word[j];
                    word[j] = word[k];
                    word[k] = t;
                }
            }
        }
        
        List<String> res = new ArrayList<String>();
        for(int j=0 ; j<word.length; j++){
            if(kk==0)
                break;
            --kk;
            res.add(word[j]);
        }
        
        return res;
    }
}