public class InterfaceExample {
    public static void main(String args[]) {
        Queen q = new Queen();
        q.moves();

        Bear b = new Bear();
        b.eatsGrass();
        b.eatsMeat();
    }
}


//describing interface to implement 100 percent abstract
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up, down, left, right, diagonal (in all 4 direction)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down, left, right");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, down, left, right, diagonal -(by one step)");
    }
}

//interface to implement multiple inheritance
interface Herbivore{
    void eatsGrass();
}

interface Carnivore{
    void eatsMeat();
}

class Bear implements Herbivore, Carnivore {
    public void eatsGrass() {
        System.out.println("Bear Eats Grass");

    }

    public void eatsMeat() {
        System.out.println("Bears hunts and eats meat and fish");
    }
}


