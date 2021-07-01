package thiThu;

public class SinhVien {
    private int msv;
    private String name;
    private int age;
    private String gender;
    private String diaChi;
    private double diemTB;

    public SinhVien() {
    }

    public SinhVien(int msv, String name, int age, String gender, String diaChi, double diemTB) {
        this.msv = msv;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.diaChi = diaChi;
        this.diemTB = diemTB;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "msv='" + msv + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }

    public String ghi(){
        return msv + "," + name + "," + age + "," +gender+ ","+diaChi+ ","+diemTB;
    }
}
