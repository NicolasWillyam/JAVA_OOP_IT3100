package OOP;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    private static int count = 0; // Biến static để đếm số đối tượng đã tạo
    private static double totalLuong = 0; // Biến static để đếm số đối tượng đã tạo

    // Hằng số lương tối đa
    public static final double LUONG_MAX = 20000000.0; // Ví dụ

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        count++; // Tăng biến đếm khi mỗi đối tượng được tạo ra
        totalLuong += this.luongCoBan * this.heSoLuong;
    }

    // Phương thức để kiểm tra và tăng hệ số lương
    public boolean tangLuong(double heSoTang) {
        double luongMoi = this.luongCoBan * (this.heSoLuong + heSoTang);
        if (luongMoi > LUONG_MAX) {
            System.out.println("Không thể tăng hệ số lương vì vượt quá lương tối đa cho phép.");
            return false;
        } else {
            this.heSoLuong += heSoTang;
            return true;
        }
    }

    // Phương thức tính lương
    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    // Phương thức in thông tin
    public void inTTin() {
        System.out.println("Tên nhân viên: " + this.tenNhanVien);
        System.out.println("Lương cơ bản: " + this.luongCoBan);
        System.out.println("Hệ số lương: " + this.heSoLuong);
        System.out.println(getCount());
    }

    // Getter cho số lượng đối tượng đã tạo
    public static int getCount() {
        return count;
    }

    public static double getTotleSalary() {
        return totalLuong;
    }
}
