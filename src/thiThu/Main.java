package thiThu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("1.xem danh sach");
            System.out.println("2.them");
            System.out.println("3.cap nhat");
            System.out.println("4.xoa");
            System.out.println("5.sap xep");
            System.out.println("6.doc tu file");
            System.out.println("7.ghi vao file");

            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    SvManager.show();
                    break;
                case 2:
                    SvManager.them();
                    break;
                case 3:
                    SvManager.sua();
                    break;
                case 4:
                    SvManager.xoa();
                    break;
                case 5:
                    SvManager.sapXep();
                    break;
                case 6:
                    SvManager.docFile();
                    break;
                case 7 :
                    SvManager.ghiFile();
                    break;
                default: System.exit(0);

            }
        }
    }
}
