
public class IfElse {
    public static void main(String[] args) {
        int x=8;
        int y=5;
        int z=10;

        if(x>y && x>z)
        {
            System.out.println("X is the greater number");
        }
        else if(y>x && y>z)
        {
            System.out.println("Y is the greater number");
        }
        else if(z>x && z<y)
        {
            System.out.println("Z is the greater number");
        }
        else{
            System.out.println("error");
        }
    }
}
