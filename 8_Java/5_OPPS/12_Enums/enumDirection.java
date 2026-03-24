enum Direction{
    NORTH(0),
    EAST(90),
    SOUTH(180),
    WEST(270);

    private int degree;

    Direction(int degree){
        this.degree = degree;
    }

    void getDegree(){
        System.out.println(this.degree);
    }

}

public class enumDirection {
    public static void main(String [] args){
        Direction d = Direction.NORTH;
        d.getDegree();
        
        Direction d2 = Direction.EAST;
        d2.getDegree();

        Direction d3 = Direction.SOUTH;
        d3.getDegree();

        Direction d4 = Direction.WEST;
        d4.getDegree();

    }    
}
