public class noX {
    public static String noX(String str){
        if(str.isEmpty()){
            return str;
        }
        if(str.charAt(0)=='x'){// if string starts with x
            return "" + noX(str.substring(1));
        }
        //if string doesnt start with x
        return str.charAt(0) + noX(str.substring(1));

    }
    public static void main(String[] args) {
        String str = "axb";
        System.out.println(noX(str));
    }
}
