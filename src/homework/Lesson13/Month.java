package homework.Lesson13;

public class Month {

    public void showDay(int month) {
        switch(month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("в этом месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("в этом месяце 30 дней");
                break;
            case 2:
                System.out.println("в этом месяце 28 дней");
                break;
            default:
                System.out.println("это не месяц");
        }
    }

    public static void main(String[] args) {
        Month month = new Month();
        month.showDay(0);
    }
}
