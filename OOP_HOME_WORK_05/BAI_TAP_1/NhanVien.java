package OOP_HOME_WORK_05.BAI_TAP_1;

// Lớp NhanVien
public class NhanVien {
    private static int soLuongNhanVien = 0; // Biến static để đếm số lượng đối tượng

    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;

    // Phương thức khởi tạo
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        soLuongNhanVien++; // Tăng số lượng đối tượng khi một đối tượng được tạo ra
    }

    // Các phương thức khác...

    // Phương thức để lấy số lượng đối tượng đã được tạo ra
    public static int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
}