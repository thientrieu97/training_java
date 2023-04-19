import java.io.FileOutputStream;
 
public class TryWithResources1 {
    public static void main(String args[]) {
        // su dung try-with-resources
        try (FileOutputStream fos = new FileOutputStream("/message1.txt")) {
            String msg = "Welcome to VietTuts.Vn!";
            // converting string thanh mang byte
            byte byteArray[] = msg.getBytes();
            fos.write(byteArray);
            System.out.println("Thong diep da duoc ghi vao file thanh cong!");
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }
}

//Nó sử dụng một thể hiện của đối tượng FileOutputStream để ghi dữ liệu vào file. 
//FileOutputStream là một tài nguyên phải được đóng lại sau khi chương trình kết thúc