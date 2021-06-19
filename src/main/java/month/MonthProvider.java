package month;

import java.util.Scanner;

public class MonthProvider {

    public static void example() {
        System.out.println("---- Nhap thang -----");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        try {
            if (checkDataValid(month)) {
                handleData(month);
            }
        } catch (CustomException exception) {
            System.out.println(exception.getMessage());
        }

    }

    private static void handleData(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng này có 31 ngày");
                break;
            case 2:
                System.out.println("Tháng này có 28 hoặc 29 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng này có 30 ngày");
        }
    }

    private static boolean checkDataValid(int month) throws CustomException {
        if (month > 12) {
            throw new CustomException("Thang khong lon hon 12");
        }
        if (month <= 0) {
            throw new CustomException();
        }
        return true;
    }
}
