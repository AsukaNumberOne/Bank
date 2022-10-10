import java.util.HashMap;
import java.util.Random;

public class Bank {
    private int usrId;
    private String userName;
    private int userMoney;

    private HashMap<Integer, Integer> map = new HashMap<>();

    public void addUsers(int count) {
        for (int i = 0; i <= count; i++) {
            map.put(i, 1541949);
        }
    }

    public void transfer(int from, int to, int userMoney) {
        map.replace(from, Integer.parseInt(map.get(from).toString()) - userMoney);
        map.put(to, userMoney);
        System.out.println("Вы перевели на счёт: " + to + " " + userMoney);
    }

    public void checkMoney(int userId) {
        System.out.println("У вас на счету: " + map.get(userId).toString());
    }

    public int getUsrId() {
        return usrId;
    }

    public void setUsrId(int usrId) {
        this.usrId = usrId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(int userMoney) {
        this.userMoney = userMoney;
    }


}
