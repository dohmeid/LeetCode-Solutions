
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int res=0,flag=0;
        Arrays.sort(players);  
        Arrays.sort(trainers);   //sort arrays  in ascending Order
       
        for(int i=0; i<players.length ;i++){
            int index1=i;
            int index2=flag;
            
            while(index2<trainers.length ){
                if(players[index1] <= trainers[index2]){
                    trainers[index2] = 0;
                    res++;
                    flag=index2;
                    break;
                }
                index2++;
            }
            
        }
        
        return res;
    }
}