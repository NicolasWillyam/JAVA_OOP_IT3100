// package JAVA_OOP_IT3100.HOME_WORK.LESSON_6;

// import java.util.Stack;

// public class PhongBan {
// private String tenPhongBan;
// private Stack<NhanVien> soNhanVien;
// private static final byte SO_NV_MAX = 100;
// // private NhanVien[] nhanViens;

// public PhongBan(String tenPhongBan) {
// this.tenPhongBan = tenPhongBan;
// this.soNhanVien = new Stack<NhanVien>();
// // this.nhanViens = new NhanVien[SO_NV_MAX];
// }

// public void themNV(NhanVien nv) {
// // if (soNhanVien < SO_NV_MAX) {
// // nhanViens[soNhanVien] = nv;
// // soNhanVien++;
// // } else {
// // System.out.println("Full");
// // }
// if (soNhanVien.size() < SO_NV_MAX) {
// soNhanVien.push(nv);
// } else {
// System.out.println("Full");
// }
// }

// public void xoaNV() {
// // if (soNhanVien > 0) {
// // soNhanVien--;
// // NhanVien nv = nhanViens[soNhanVien];
// // nhanViens[soNhanVien] = null;
// if (!soNhanVien.empty()) {
// soNhanVien.pop();
// } else

// {
// System.out.println("Empty");
// }
// }

// public double tongLuong() {
// return (NhanVien.getTotleSalary());
// }

// public void inTTin() {
// System.out.println("Ten Phong Ban " + tenPhongBan);
// System.out.println("So NV cua Phong Ban " + soNhanVien);

// for (NhanVien nv : soNhanVien) {
// nv.inTTin();
// System.out.println();
// }
// }
// }
