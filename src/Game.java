public class Game {
    private int gameId;
    private String title;
    private String genre;
    private double price;

    public Game(int gameId, String title, String genre, double price){
        this.gameId = gameId;
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getGenre() {
        return genre;
    }

    public String getTitle() {
        return title;
    }

    public int getGameId() {
        return gameId;
    }

    public void displayDetails(){
        System.out.println(this.gameId);
        System.out.println(this.title);
        System.out.println(this.genre);
        System.out.println(this.price);
    }
}
