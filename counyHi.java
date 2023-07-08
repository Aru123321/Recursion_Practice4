public class counyHi {
    public static int countHi(String str){
        if(str.isEmpty()){
            return 0;
        }
        // one more base case for only one character
        if(str.length()==1){
            return 0;
        }
        int count=0;
        
        if(str.charAt(0)=='h'&& str.charAt(1)=='i'){
            count++;
        }
        int tot = count + countHi(str.substring(2));
        return tot;
/*          
if (str.length() == 0) return 0;

if (str.length() >= 2 && str.charAt(0) == 'h' && str.charAt(1) == 'i')
return 1 + countHi(str.substring(2));

else return countHi(str.substring(1)); */
    }
    public static void main(String[] args) {
        String str = "hixhixhix";
        System.out.println(countHi(str));
    }
}
