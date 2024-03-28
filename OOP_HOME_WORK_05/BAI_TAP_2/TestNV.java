package OOP_HOME_WORK_05.BAI_TAP_2;

public class TestNV {
    public static void main(String[] args) {
        // Tạo một danh sách các đối tượng NhanVien
        NhanVien[] danhSachNhanVien = new NhanVien[3];
        danhSachNhanVien[0] = new NhanVien("Nguyen Van A", 5000000, 2.0);
        danhSachNhanVien[1] = new NhanVien("Tran Thi B", 6000000, 1.8);
        danhSachNhanVien[2] = new NhanVien("Le Thi C", 7000000, 2.2);

        // Tính tổng lương của danh sách đối tượng NhanVien
        double tongLuong = NhanVien.tinhTongLuong(danhSachNhanVien);

        // Hiển thị tổng lương
        System.out.println("Tổng lương của các nhân viên: " + tongLuong);
    }
}