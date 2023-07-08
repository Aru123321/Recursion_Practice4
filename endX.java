public class endX {
    public static String endX(String str){
        if(str.isEmpty()){
            return str;
        }
        //xxre--->rexx
        if(str.charAt(0)=='x'){
            return endX(str.substring(1))+'x';
        }
        //if 0 th index pe x nhi hai
        return str.charAt(0) + endX(str.substring(1));
    }
    public static void main(String[] args) {
        String str = "xxer";
        System.out.println(endX(str));
    }
}
