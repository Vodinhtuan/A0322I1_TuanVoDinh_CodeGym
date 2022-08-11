package ss15_throw_exception_debug.practice;

public class TestQuiz {
    public static void main(String[] args) {
        try         {
            badMethod();
            System.out.print("A");
        }  catch (Exception ex)  {
            System.out.print("B");
        } finally {
            System.out.print("C");
        }
        System.out.print("D");
    }
    public static void badMethod() throws Exception{
        throw new Exception();
    }
    /*chạy badMethod -> throw new Exc ,
     throws Exception sẽ ném ngoại lệ ra chổ gọi hàm,
     catch sẽ bắt Exc lại và thực thi, sau khi thực thi trong catch
     thì chạy khối finally*/

}

