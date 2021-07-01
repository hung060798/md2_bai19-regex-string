package thiThu;

import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SvManager {
    static ArrayList<SinhVien> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static File file = new File("C:\\Users\\Admin\\Documents\\dat.csv");

    public static void them() throws IOException {
        System.out.println("nhap msv");
        int msv = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten");
        String name = (sc.nextLine());
        System.out.println("nhap tuoi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap gioi tinh");
        String gender = sc.nextLine();
        System.out.println("nhap dia chi");
        String adr = sc.nextLine();
        System.out.println("nhap diem tb");
        int diem = Integer.parseInt(sc.nextLine());
        list.add(new SinhVien(msv, name, age, gender, adr, diem));
        ghiFile();
    }

    static void show() {
        for (SinhVien sv : list) {
            System.out.println("Hung oc cho");
        }
    }

    public static void xoa() throws IOException {
        System.out.println("ban co chac chan xoa");
        System.out.println("1.co");
        System.out.println("2.khong");
        int choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            System.out.println("nhap ten");
            String name = sc.nextLine();
            for (int i=0; i<list.size();i++) {

                if (list.get(i).getName().equals(name)) {
                    list.remove(list.get(i));
                }
            }

        }
        ghiFile();
        show();

    }

    public static void  sapXep() throws IOException {
        SortByName sortByName =new SortByName();
        list.sort(sortByName);
        ghiFile();
    }

    public static void  sua() throws IOException {
        System.out.println("nhap msv");
        int msv = Integer.parseInt(sc.nextLine());
        for (SinhVien sv : list){
            if(sv.getMsv()== msv){
                System.out.println("nhap ten");
                String name = (sc.nextLine());
                System.out.println("nhap tuoi");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("nhap gioi tinh");
                String gender = sc.nextLine();
                System.out.println("nhap dia chi");
                String adr = sc.nextLine();
                System.out.println("nhap diem tb");
                sv.setAge(age);
                sv.setName(name);
                sv.setDiaChi(adr);
                sv.setGender(gender);
            }
        }
        ghiFile();
    }

    public static void ghiFile() throws IOException {
        BufferedWriter bufferedWriter = null;
        try {
            FileWriter fileWriter = new FileWriter(file,false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (SinhVien pp : list) {
                bufferedWriter.write(pp.ghi());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedWriter.close();
        }
    }
    //============================================
    public static void docFile() throws IOException {
        ArrayList<SinhVien> list1=new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] str = line.split(",");
                if (str.length >= 6) {
                    list1.add(new SinhVien((Integer.parseInt(str[0])),str[1],(Integer.parseInt(str[2])),str[3],str[4],(Double.parseDouble(str[5]))));
                }
            }
            for(SinhVien x:list1){
                System.out.println(x);
            }
            bufferedReader.close();
            //=============================================
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}