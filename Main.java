
public class Main {
    public static void main(String[] args) {

        Cube cube1 = new Cube();
        System.out.println(cube1.getCubeVolumn());

        Cube cube2 = new Cube(20,20,20);
        System.out.println(cube2.getCubeVolumn());
    }

}