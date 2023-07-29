class Solution {
    int serve[][] = {{100,0},{75,25},{50,50},{25,75}};
    double dp[][];
    public double qt(double a,double b){
        if(a<=0 && b<=0){
            return 0.5;
        }
        if(a<=0){
            return 1.0;
        }
        if(b<=0){
            return 0.0;
        }
        if(dp[(int)a][(int)b]!=-1){
            return dp[(int)a][(int)b];
        }
        double prob = 0.0;
        for(int arr[]:serve){
            prob+=qt(a-arr[0],b-arr[1]);
        }
        return dp[(int)a][(int)b]=prob*0.25;

    }
    public double soupServings(int n) {
        if(n>5000){
            return 1.0;
        }
        dp = new double[n+1][n+1];
        for(double temp[]:dp){
            Arrays.fill(temp,-1.0);
        }
        return qt(n,n);
    }
}