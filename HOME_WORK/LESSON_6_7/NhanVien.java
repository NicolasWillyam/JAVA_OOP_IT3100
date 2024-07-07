package JAVA_OOP_IT3100.HOME_WORK.LESSON_6_7;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;

    // Constants
    private static final double LUONG_MAX = 20000000;

    // Constructor
    public NhanVien(String tenNhanVien, double luongCoban, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoban;
        this.heSoLuong = heSoLuong;

    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public boolean tangHeSoLuong(double heSoTang) {
        double hesoMoi = heSoLuong + heSoTang;
        if (hesoMoi > 10) {
            System.out.println("Maximum!!!");
            return false;
        } else {
            heSoLuong = heSoTang;
            System.out.println("Ok!!!");
            return true;
        }
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương nhân viên:" + tinhLuong());
    }
}
