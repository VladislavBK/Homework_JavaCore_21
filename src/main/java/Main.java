import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Nickname nickname = new Nickname();
        String[] texts = new String[100_000];
        for (int i = 0; i < texts.length; i++) {
            texts[i] = Nickname.generateText("abc", 3 + random.nextInt(3));
        }

        new Thread(() -> {
            for (String text : texts) {
                nickname.perfectNickname3(text);
                System.out.println(nickname);
            }
        }).start();

        new Thread(() -> {
            for (String text : texts) {
                nickname.perfectNickname4(text);
                System.out.println(nickname);
            }
        }).start();

        new Thread(() -> {
            for (String text : texts) {
                nickname.perfectNickname5(text);
                System.out.println(nickname);
            }
        }).start();


    }
}
