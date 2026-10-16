public class Main {
    public static void main(String[] args) {
        // lista doble ligada de videojuegos
        DoublyLinkedList<VideoGame> games = new DoublyLinkedList<>();

        //videojuegos
        games.insertLast(new VideoGame("The Legend of Zelda", "Nintendo Switch"));
        games.insertLast(new VideoGame("God of War", "PlayStation 5"));
        games.insertLast(new VideoGame("Halo Infinite", "Xbox Series X"));

        // Transversa inversa
        games.traverseBackward();
    }
}