package OOP;

public class TestPhongBan {
    public static void main(String[] args) {
        PhongBan phongKeToan = new PhongBan("Phòng Kế toán");

        NhanVien nv1 = new NhanVien("Nguyen A", 10000000.0, 2.0);
        NhanVien nv2 = new NhanVien("Nguyen B", 12000000.0, 2.5);

        phongKeToan.themNV(nv1);
        phongKeToan.themNV(nv2);

        phongKeToan.inTTin();

        System.out.println("\nSau khi xóa 1 nhân viên:");
        phongKeToan.xoaNV();
        phongKeToan.inTTin();
    }
}
