class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        
        Set<Integer> visited = new HashSet<>(); 
        visited.add(0);
        Stack<Integer> keys = new Stack<>();
        keys.push(0);
        
        while(!keys.isEmpty()){
            int room = keys.pop();
            List<Integer> k = rooms.get(room);
            for(Integer key : k){
                if (!visited.contains(key)){
                    visited.add(key);
                    keys.push(key);
                    if(visited.size()==rooms.size())
                        return true;
                }     
            }

        }
    
        return visited.size()==rooms.size();
    }
}