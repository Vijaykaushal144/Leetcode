class Solution {
    public int romanToInt(String s) {
//         Map<Character,Integer> m=new HashMap<>();
//         m.put('I',1);
//         m.put('V',5);
//         m.put('X',10);
//         m.put('L',50);
//         m.put('C',100);
//         m.put('D',500);
//         m.put('M',1000);
//         int result=m.get(s.charAt(s.length()-1));
//         for(int i=s.length()-2;i>=0;i--)
//         {
//             if(m.get(s.charAt(i))<m.get(s.charAt(i+1)))
//             {
//                 result=result-m.get(s.charAt(i));
//             }
//             else
//             {
//  result=result+m.get(s.charAt(i));

//             }
//         }
//         return result;
        
        char a[]= s.toCharArray();
    int sum=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(val(a[i])<val(a[i+1]))
            {
                sum-=val(a[i]);
            }
            else
            {
                sum+=val(a[i]);
            }
        }
        sum+=val(a[a.length-1]);
        return sum;
        
        
    }
    public static int val(char c)
    {
        if(c=='I') {
            
            return 1;}
        else if(c=='V') 
        {
            return 5;}
        else if(c=='X')
        {
            
            return 10;}
        
        else if(c=='L')
        {
            
            return 50;
            
        }
        else if(c=='C')
        {
             return 100;
        }
        else if(c=='D')
        {
            return 500;
        }
        else{
             return 1000;
        }
    }
}