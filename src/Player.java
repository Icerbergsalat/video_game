public class Player {
    int playerId;
    String name;
    int age;
    double score;

    public Player(int playerId, String name, int age, double score) {
        this.playerId = playerId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void displayDetails(){
        System.out.println(this.playerId);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.score);
    }
    public void updateScore(double newScore){
        score += newScore;
    }
}
