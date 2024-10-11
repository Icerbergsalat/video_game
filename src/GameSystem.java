import java.util.ArrayList;

public class GameSystem {
    ArrayList<Game> games;
    ArrayList<Player> players;
    int gameCount;
    int playerCount;

    GameSystem(int maxGames, int maxPlayers){
        games = new  ArrayList<>();
        gameCount = maxGames;
        players = new ArrayList<>();
        playerCount = maxPlayers;
    }

    public void addGame(Game game){
        games.add(game);
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    public void displayAllGames(){
        System.out.println(games);
    }

    public void displayAllPlayers(){
        System.out.println(players);
    }

    public void updatePlayerScore(int playerId, double newScore){
        Player p = findPlayerById(playerId);
        if (p != null){
            p.setScore(newScore);
        }
    }
    Game findGameById(int gameId){
        for (int i = 0; i < games.size(); i++){
            if (gameId == games.get(i).getGameId()){
                return games.get(i);
            }
        }
        System.out.println("game not found");
        return null;
    }

    Player findPlayerById(int playerId){
        for (int i = 0; i < players.size(); i++){
            if (playerId == players.get(i).getPlayerId()){
                return players.get(i);
            }
        }
        System.out.println("game not found");
        return null;
    }
}
