class StockSpanner {
    Stack<int[]> stock ;
    public StockSpanner() {
        stock = new Stack<>();
    }
    
    public int next(int price) {
        int res=1;
        while(!stock.isEmpty() && stock.peek()[0]<=price){
            res += stock.pop()[1];
        }
        stock.push( new int []{price,res});
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */