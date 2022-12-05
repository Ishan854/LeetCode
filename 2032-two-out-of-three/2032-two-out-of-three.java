class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> ans = new ArrayList<>();
      
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        HashSet<Integer> set3 = new HashSet<>();
        
        for(int a : nums1) set1.add(a);
        for(int a : nums2) set2.add(a);
        for(int a : nums3) set3.add(a);
        
        for(int a : set1) 
              if(set2.contains(a)) 
                   ans.add(a);
        
        for(int a : set2) 
              if(set3.contains(a)  && !set1.contains(a)) 
                   ans.add(a);
        
        for(int a : set3) 
              if(set1.contains(a)  && !set2.contains(a)) 
                   ans.add(a);
        
        
        return ans;
    }
}