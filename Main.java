public class Main {
    private static String[] shoutsLeft = {"Wtf", "WTF"};
    private static String[] shoutsRight={"WTF", "WTF is THis SHit","WTF","dude,WTF","WTF"};

    public static void main(String[] args) {
        Door leftDoor = new Door("Code review", shoutsLeft, );
        Door rightDoor = new Door("Code review", shoutsLeft,"red",1.2,2.3,"wood");
        System.out.println("Khatchik");
        System.out.println(leftDoor);
        System.out.println(rightDoor);


    }
}