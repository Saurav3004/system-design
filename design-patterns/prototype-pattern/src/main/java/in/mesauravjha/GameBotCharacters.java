package in.mesauravjha;

public class GameBotCharacters implements Cloneable<GameBotCharacters> {
    private String name;
    private int health;
    private int attackPower;

    public GameBotCharacters(String name,int health,int attackPower){

        //Expensive operations
        System.out.println("Loading character animations from DB...");
        System.out.println("Loading sound effects from DB...");
        System.out.println("Preparing AI battle settings file...");

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            System.out.println("Error in thread");
        }


        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    private GameBotCharacters(GameBotCharacters gbc){
        this.name = gbc.name;
        this.health = gbc.health;
        this.attackPower = gbc.attackPower;
    }

    public GameBotCharacters customizeClone(){
        return new GameBotCharacters(this);
    }

    @Override
    public String toString() {
        return "GameBotCharacters{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }
}
