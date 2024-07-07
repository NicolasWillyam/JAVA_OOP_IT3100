package JAVA_OOP_IT3100.HOME_WORK.LESSON_6_7;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng GiamDoc và in thông tin
        GiamDoc giamDoc = new GiamDoc("Nguyen Van Giam", 15000000, 3.5, 3000000, 50000000);
        System.out.println("Thông tin Giám đốc:");
        giamDoc.inTTin();
        System.out.println("-----------------------------------");

        // Tạo đối tượng Cán bộ quản lý và in thông tin
        CanBoQuanLy canBoQuanLy = new CanBoQuanLy("Tran Thi Quan Ly", 12000000, 2.8, 10000000);
        System.out.println("Thông tin Cán bộ quản lý:");
        canBoQuanLy.inTTin();
        System.out.println("-----------------------------------");

        // Tăng hệ số lương cho Giám đốc và in lại thông tin
        giamDoc.tangHeSoLuong(1.0);
        System.out.println("Thông tin Giám đốc sau khi tăng hệ số lương:");
        giamDoc.inTTin();
        System.out.println("-----------------------------------");

        // Tăng hệ số lương cho Cán bộ quản lý và in lại thông tin
        canBoQuanLy.tangHeSoLuong(0.5);
        System.out.println("Thông tin Cán bộ quản lý sau khi tăng hệ số lương:");
        canBoQuanLy.inTTin();
        System.out.println("-----------------------------------");
    }
}
