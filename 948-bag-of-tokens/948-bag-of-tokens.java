class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
     
        int score=0;
        Arrays.sort(tokens); //sort the tokens by ascending order 
        if(tokens.length ==0 || power < tokens[0])
            return 0;
        
        int minus=0;
        
      for(int i=0 ; i<tokens.length ; i++){  
           if(tokens[i] == -1)
                continue;   
          
           if(power<tokens[i] && score>=1 && tokens.length-minus>1 ){ //play face down
               for(int j=tokens.length-1 ; j>0 ; j--){
                   if(tokens[j] != -1){
                        score--;
                        power += tokens[j];
                        tokens[j] = -1;
                        minus++;
                       break;
                    }
               }
           }
            
             if(power >= tokens[i] ){ //play face up
                score++;
                power -= tokens[i];
                tokens[i] = -1;
                minus++;
            }
        
      }
        
        
        return score;
    }
}