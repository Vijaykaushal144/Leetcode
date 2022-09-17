class Solution {
    public int[] sortArray(int[] nums) {
        int st=0;
        int end=nums.length-1;
        mergeSort(nums,st,end);
        return nums;
    }
    public int[] mergeSort(int arr[], int left , int right){
        if (left < right){
            int mid = (left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
        return arr;
    }
    public int[] merge(int a[],int low, int mid, int end){
        int n1=mid-low+1;
       int n2=end-mid;
       int[] l1 =new int[n1];
       int[] l2 =new int[n2];
       for(int i=0;i<n1;i++)
       {
           l1[i]=a[low+i];

       }
       for (int j=0;j<n2;j++)
       {
           l2[j]=a[mid+1+j];
       }

       int i=0,j=0,k=low;
       while(i<n1 && j<n2)
       {
           if(l1[i]<l2[j])
           {
               a[k++]=l1[i++];
           }
           else {
               a[k++] = l2[j++];
           }

       }
       while(i<n1)
       {
           a[k++]=l1[i++];
       }
       while(j<n2)
       {
           a[k++] = l2[j++];
       }
        
        return  a;
    }
}