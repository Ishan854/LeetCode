class OrderedStream {
   public String[] str;
    public int ptr = 0;
    public OrderedStream(int n) {
       str = new String[n] ;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> chunk = new ArrayList<>();
        str[idKey - 1] = value;
        while(ptr<str.length && str[ptr]!=null)
        {
            chunk.add(str[ptr]);
            ptr++;
        }
        return chunk;
    }                      
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */