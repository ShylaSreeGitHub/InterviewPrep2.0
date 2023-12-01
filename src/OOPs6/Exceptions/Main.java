package OOPs6.Exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            divide(a,b);
            String name = "shyla";
            if (name.equals("shyla")){
                throw new MyException("my name is "+name);
            }
        }catch (ArithmeticException exception){
            System.out.println(exception.getMessage());
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        } finally {//only one finally block, can't have multiple
            System.out.println("executes no matter what");
        }

    }

    static int divide(int a, int b) throws ArithmeticException{
        if (b == 0){
            throw new ArithmeticException("please do not give denominator as zero");
        }

        return a/b;
    }
}
