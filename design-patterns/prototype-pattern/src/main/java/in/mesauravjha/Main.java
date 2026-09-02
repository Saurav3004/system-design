package in.mesauravjha;

public class Main {
    static void main() {
        long startTime = System.currentTimeMillis();

        GameBotCharacters gbc1 = new GameBotCharacters("Bot1",100,0);
        GameBotCharacters gbc2 = gbc1.customizeClone();
        gbc2.setName("Bot2");
        GameBotCharacters gbc3 = gbc1.customizeClone();
        gbc3.setName("Bot3");

        long endTime = System.currentTimeMillis();

        System.out.println(gbc1);
        System.out.println(gbc2);
        System.out.println(gbc3);

        System.out.println((endTime - startTime)/1000);
    }
}
