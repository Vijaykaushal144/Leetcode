class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
           HashSet<Integer> set1=new HashSet(); 
           HashSet<Integer> set2=new HashSet();
        //adding the value in hashset1
        for(int s1:nums1)
        {
            set1.add(s1);
        }
        //adding the value of array in hashset2
        for(int s2:nums2)
        {
            //check that set1 is contain the value of nums2 carray;
            if(set1.contains(s2))
            {
                //if value is present then add that value in to set2 
                set2.add(s2);
            }
           
        }
        // create the array with set2 size 
        int a[]= new int[set2.size()];
        int i=0;
        for(int num:set2)
        {
            //adding the value of set2 in to array with the help of i pointer and increment the                    //pointer
                a[i++]=num;
        }
        
        return a;
        
      
    }
}