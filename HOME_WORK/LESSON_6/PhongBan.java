package OOP;

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    private static final byte SO_NV_MAX = 100;
    private NhanVien[] nhanViens;

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = 0;
        this.nhanViens = new NhanVien[SO_NV_MAX];
    }

    public void themNV(NhanVien nv) {
        if (soNhanVien < SO_NV_MAX) {
            nhanViens[soNhanVien] = nv;
            soNhanVien++;
        } else {
            System.out.println("Enough!");
        }
    }

    public void xoaNV() {
        if (soNhanVien > 0) {
            soNhanVien--;
            NhanVien nv = nhanViens[soNhanVien];
            nhanViens[soNhanVien] = null;
        } else {
            System.out.println("Empty");
        }
    }

    public double tongLuong() {
        return (NhanVien.getTotleSalary());
    }

    public void inTTin() {
        System.out.println("Thông tin phòng ban: " + tenPhongBan);
        System.out.println("Số lượng nhân viên: " + soNhanVien);
        System.out.println("Danh sách nhân viên trong phòng:");

        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhân viên " + (i + 1) + ":");
            nhanViens[i].inTTin();
            System.out.println();
        }
        System.out.println("Tổng lương của phòng: " + tongLuong());
    }

}
