class Solution {
    public int calPoints(String[] operations) {
        int[] record= new int[1000];
        int j=0;
        int sum=0;
        for(int i=0; i<operations.length; i++)
        {
            switch(operations[i])
            {
                case "+":
                    j++;
                    record[j]=record[j-1]+record[j-2];  
                    break;
                
                case "C":
                    record[j]=0;
                    j--;
                    break;
                    
                case "D":
                    j++;
                    record[j]=record[j-1]*2;
                    break;
                
                default:
                    j++;
                    record[j]=Integer.valueOf(operations[i]);
                    break;
            }
        }
        for(int k=0; k<record.length;k++)
        {
            sum+=record[k];
        }
        return sum;
    }
}