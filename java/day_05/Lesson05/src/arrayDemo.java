import java.util.Arrays;

public class arrayDemo {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        numbers[0] =10;
        numbers[1] =20;
        numbers[2] =30;
//        numbers[3] =40;
        System.out.println(Arrays.toString(numbers));
        String[] names = {"hiên", "an", "huy"};
        System.out.println(Arrays.toString(names));
        String[] namesOther = new String[]{"hien", "an", "huy"};
        System.out.println(Arrays.toString(namesOther));
//        Reference Type
        String[] emails = {"a123kien@gmail.com", "a124kien@gmail.com", "a125kien@gmail.com"};
        String[] emailsOther = emails; //địa chỉ ô nhớ
        System.out.println("Email :" +Arrays.toString(emails));
        System.out.println("Email :" + Arrays.toString(emailsOther));
        String namesString = String.join(" ", names);
        System.out.println(namesString);
        String message = "Một ngày nào đó";
        String[] messageArray = message.split("");
        System.out.println(Arrays.toString(messageArray));

        for (int j =0;j<messageArray.length; j++) {
            messageArray[j] = messageArray[j].substring(0,1).toUpperCase() + messageArray[j].substring(1).toLowerCase();
        }
        System.out.println("After: "+Arrays.toString(messageArray));
        String messageString = String.join(" ", messageArray);
        System.out.println(messageString);
    }
}
