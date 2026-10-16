import java.util.Objects;

public class VideoGame {
    private final String title;
    private final String platform;

    public VideoGame(String title, String platform) {
        this.title = title;
        this.platform = platform;
    }

    @Override
    public String toString() {
        return title + " en " + platform;
    }

    //Valida que el videojuego a comparar no sea nulo o sea de diferente clase
    //Después válida que tengan los mismos valores en sus atributos
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        VideoGame game = (VideoGame) o;
        return Objects.equals(title, game.title) && Objects.equals(platform, game.platform);
    }

    //Devuelve un numero calculado a partir de los campos del objeto
    //Funciona como una huella digital
    @Override
    public int hashCode() {
        return Objects.hash(title, platform);
    }
}
