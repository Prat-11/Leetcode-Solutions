class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] p = new boolean[n+1];
        Arrays.fill(p,true);
        if(n>=0) p[0]=false;
        if(n>=1) p[1]=false;
        for(int i=2;i*i<=n;i++){
            if(p[i]){
                for(long j=1L*i*i;j<=n;j+=i) p[(int)j]=false;
            }
        }
        for(int i=2;i<=n/2;i++){
            if(p[i]&& p[n-i]) ans.add(Arrays.asList(i,n-i));
        }
        return ans;
    }
}