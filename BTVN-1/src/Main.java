import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên kho hàng: ");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Mời bạn nhập ngày tháng năm sinh yyyy/MM/dd: ");
        String date = sc.nextLine();
        LocalDate lcDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(lcDate);

        System.out.println("Mời bạn nhập thời gian nhập hàng yyyy/MM/dd HH:mm:ss ");
        String dateImport = sc.nextLine();
        LocalDateTime lcDateImport = LocalDateTime.parse(dateImport, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(lcDateImport);

        System.out.println("Mời bạn nhập thời gian nhập hàng HH:mm:ss: ");
        String timeImport = sc.nextLine();
        LocalTime lcTimeImport = LocalTime.parse(timeImport, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(lcTimeImport);
    }
}
