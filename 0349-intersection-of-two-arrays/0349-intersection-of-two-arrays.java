class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           HashSet<Integer> set1=new HashSet(); 
           HashSet<Integer> set2=new HashSet();
        
        for(int s1:nums1)
        {
            set1.add(s1);
        }
        for(int s2:nums2)
        {
            if(set1.contains(s2))
            {
                set2.add(s2);
            }
        }
        int a[]= new int[set2.size()];
        int i=0;
        for(int num:set2)
        {
            a[i++]=num;
        }
        
        return a;
        
      
    }
}