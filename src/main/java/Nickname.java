import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Nickname {

    protected AtomicInteger perfectNicknameCounter;

    public static String generateText(String letters, int length) {
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }

    public void perfectNickname3 (String text) {
        boolean length = text.length() == 3;
        if(length) {
            char[] chars = text.toCharArray();
            if (chars[1] == chars[0] && chars[2] == chars[0]) {
                perfectNicknameCounter.incrementAndGet();
            }
        }
    }

    public void perfectNickname4 (String text) {
        boolean length = text.length() == 4;
        if(length) {
            char[] chars = text.toCharArray();
            if (chars[2] == chars[0] && chars[3] == chars[1]) {
                perfectNicknameCounter.incrementAndGet();
            }
        }
    }

    public void perfectNickname5 (String text) {
        boolean length = text.length() == 5;
        if(length) {
            char[] chars = text.toCharArray();
            if (chars[1] == chars[0] && chars[3] == chars[2]) {
                perfectNicknameCounter.incrementAndGet();
            }
        }
    }

    @Override
    public String toString() {
        return "Красивые никнеймы с длиной " + Thread.currentThread().getName() + " " + perfectNicknameCounter.intValue();
    }
}
