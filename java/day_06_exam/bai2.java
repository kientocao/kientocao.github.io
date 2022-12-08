public class bai2 {
    public static void main(String[] args) {
        countword("Vũ Mạnh Kion");
    }
    public static void countword(String str){
        int i = 0;
        int ctno = 0;
        for (int j = 0; j < str.length(); j++){
            if (j == str.length()-1){
                i += 0;
            }else{
                if (str.charAt(j) == ' '){
                    if ((str.charAt(j+1) == '\n') || (str.charAt(j+1) == ' ')){
                        i+= 0;
                    }else{
                        i++;
                    }
                }
            }
            if (str.charAt(j) == 'o'){
                ctno+=1;
            }
        }
        if (str.charAt(0) == ' '){
            System.out.println("Số từ trong chuỗi là: "+i);
        }else{
            System.out.println("Số từ trong chuỗi là: " + (i+1));
        }
        System.out.println("Số kí tự \"o\" trong chuỗi là: "+ctno);
    }
}
