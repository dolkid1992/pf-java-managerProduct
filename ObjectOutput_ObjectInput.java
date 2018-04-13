import java.io.*;

public class ObjectOutput_ObjectInput {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Mydata\\List.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            Stock s[] = {
                    new Stock(1, "Quat", "Pana", 200000, "Khong Co"),
                    new Stock(1, "Man Hinh", "Sony", 500000, "Khong Co"),
                    new Stock(1, "Dien Thoai", "Iphone", 2200000, "Khong Co")
            };

            oos.writeObject(s);

            fos.close();
            oos.close();
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e);
        }

        try {
            FileInputStream fis = new FileInputStream("D:\\Mydata\\List.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Stock sArr[] = (Stock[]) ois.readObject();
            for (Stock s : sArr) {
                System.out.println(s.toString());
            }

            fis.close();
            ois.close();
        } catch (Exception e) {
            System.out.println("Lỗi đọc file: " + e);
        }
    }
}
