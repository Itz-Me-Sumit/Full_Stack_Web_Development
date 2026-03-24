enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("Move up (Y+1)");
        }
    },
    EAST{
        @Override
        public void move(){
            System.out.println("");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("Move down (y-1)");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("");
        }
    };

    public abstract void move();

}


public class Enum_Abstract {
    public static void main(String[] args){

    }    
}
