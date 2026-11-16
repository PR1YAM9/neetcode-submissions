class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String sho = strs[0];
        int maxlen = sho.length();
        for(int i =1;i<strs.length;i++){
            String check = strs[i];
            int len = 0;
            for(int j = 0;j<sho.length();j++){
                if(check.charAt(j) == sho.charAt(j)){
                    len++;
                }
                else {
                    break;
                }
            }
            maxlen = Math.min(len,maxlen);
        }
        return sho.substring(0,maxlen);
    }
}