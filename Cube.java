public class Cube {
    int length;
    int bredth;
    int height;

    public int getCubeVolumn(){
        return (length * bredth * height);
    }

    //first methods to run
    Cube(){

        length = 10;
        bredth = 20;
        height = 30;
    }

    Cube(int l, int b, int h){
        length = l;
        bredth = b;
        height = h;
    }
}
