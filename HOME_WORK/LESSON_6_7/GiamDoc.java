package JAVA_OOP_IT3100.HOME_WORK.LESSON_6_7;

public class GiamDoc extends NhanVien implements QuanLy {
    private double phuCap;
    private double loiNhuanCongTy;

    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    @Override
    public double tinhLuong() {
        double hoaHong = tinhHoaHong();
        return super.tinhLuong() + phuCap + hoaHong;
    }

    @Override
    public void inTTin() {
        super.inTTin();
        System.out.println("Phụ cấp: " + phuCap);
        System.out.println("Hoa hồng: " + tinhHoaHong());
        System.out.println("Tổng lương: " + tinhLuong());
    }

    @Override
    public double tinhHoaHong() {
        return loiNhuanCongTy * 0.05;
    }
}
