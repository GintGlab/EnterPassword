import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String password = "123qwe";
        boolean isPassFalse = true;
        Scanner scan = new Scanner(System.in);

        while(isPassFalse) {
            System.out.println("Введите пароль");
            if(scan.nextLine().equals(password)){
                System.out.println("Вход выполнен");
                isPassFalse = false;
                scan.close();
            }
        }
    }
}
