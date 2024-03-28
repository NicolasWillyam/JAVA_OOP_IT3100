package OOP_HOME_WORK_05.BAI_TAP_2;

// Lớp NhanVien
public class NhanVien {

    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;

    // Phương thức khởi tạo
    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    // Phương thức tính lương
    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    // Phương thức tính tổng lương của một danh sách đối tượng NhanVien
    public static double tinhTongLuong(NhanVien[] danhSachNhanVien) {
        double tongLuong = 0;
        for (NhanVien nv : danhSachNhanVien) {
            tongLuong += nv.tinhLuong(); // Gọi phương thức tinhLuong() của mỗi đối tượng NhanVien và cộng vào tổng
                                         // lương
        }
        return tongLuong;
    }

}
