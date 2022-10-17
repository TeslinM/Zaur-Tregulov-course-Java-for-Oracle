package homework.Lesson16;

public class Mail {

    public static void email(String input) {
        char c1;
        char c2;
        int i2;

        for(int i=0; i<input.length(); i++) {
            c1 = input.charAt(i);
            if(c1=='@') {
               if (input.charAt(i+1) == 'y') {
                   System.out.println("yahoo");
                   continue;
               } else if (input.charAt(i+1) == 'm') {
                   System.out.println("mail");
                   continue;
                } else {
                   System.out.println("gmail");
               }
            }
        }
    }

    public static void main(String[] args) {
        email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
    }
}
