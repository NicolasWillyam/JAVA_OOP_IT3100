package JAVA_OOP_IT3100.HOME_WORK.LESSON_6_7;

public class CanBoQuanLy extends NhanVien implements QuanLy {
    private double loiNhuanCongTy;

    public CanBoQuanLy(String tenNhanVien, double luongCoBan, double heSoLuong, double loiNhuanCongTy) {
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    public double getLoiNhuanCongTy() {
        return loiNhuanCongTy;
    }

    public void setLoiNhuanCongTy(double loiNhuanCongTy) {
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    @Override
    public double tinhLuong() {
        double hoaHong = tinhHoaHong();
        return super.tinhLuong() + hoaHong;
    }

    @Override
    public double tinhHoaHong() {
        return loiNhuanCongTy * 0.02;
    }

    @Override
    public void inTTin() {
        super.inTTin();
        System.out.println("Hoa hồng: " + tinhHoaHong());
        System.out.println("Tổng lương: " + tinhLuong());
    }
}
