package OOP_HOME_WORK_05.BAI_TAP_1;

public class TestNV {
    public static void main(String[] args) {
        // Tạo 2 đối tượng NhanVien
        NhanVien nv1 = new NhanVien("Nguyen Van A", 5000000, 2.0);
        NhanVien nv2 = new NhanVien("Tran Thi B", 6000000, 1.8);

        // Hiển thị số lượng đối tượng NhanVien
        System.out.println("Số lượng đối tượng NhanVien: " + NhanVien.getSoLuongNhanVien());

        // Tạo thêm một đối tượng NhanVien
        NhanVien nv3 = new NhanVien("Le Thi C", 7000000, 2.2);

        // Hiển thị số lượng đối tượng NhanVien sau khi tạo thêm một đối tượng
        System.out.println("Số lượng đối tượng NhanVien: " + NhanVien.getSoLuongNhanVien());
    }
}