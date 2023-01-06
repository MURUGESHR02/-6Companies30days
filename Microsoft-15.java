class Solution {
    public int numberOfSubstrings(String s) {
        int abc[]=new int[3];
        int cnt=0,i=0,j=0;
        while(j<s.length()){
            abc[(int)s.charAt(j)-97]++;
            while(abc[0]>0 && abc[1]>0 && abc[2]>0){
                cnt++;
                abc[(int)s.charAt(i)-97]--;
                i++;
                cnt+=s.substring(j+1,s.length()).length();
            }
            j++;
        }
        return cnt;
    }
}
