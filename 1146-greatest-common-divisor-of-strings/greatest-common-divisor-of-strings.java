class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if((str1+str2).equals(str2+str1)){
            int a = str1.length();
            int b = str2.length();
            int res;

            while(b!=0){
                 res = a % b;
                 a = b;
                 b = res;
              }
              return str1.substring(0,a); 
            }
             
        
        else{
            return "";
        }

        
    }
}