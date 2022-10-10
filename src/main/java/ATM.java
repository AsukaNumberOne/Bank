import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(
                "Доступные вам комманды:" + "\n" +
                "1) exit" + "\n" +
                "2) transfer from to money"+"\n"+
                "3) checkMoney UserId");
        while (true) {
            String[] word = reader.readLine().split(" ");
            if (word[0].equals("exit")) {
                break;
            } else if (word[0].equals("checkMoney")) {
                bank.checkMoney(Integer.parseInt(word[1]));
            } else if (word[0].equals("transfer")) {
                bank.transfer(Integer.parseInt(word[1]), Integer.parseInt(word[2]), Integer.parseInt(word[3]));
            }else if(word[0].equals("addUsers")){
                bank.addUsers(Integer.parseInt(word[1]));
            }
        }
    }
}
