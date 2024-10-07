public class Door {
    String codeReview = "";
    String[] shouts = {""};
    String color;
    double width;
    double height;
    String material;


    public Door(String sign, String[] shouts, String color, double width, double height, String material) {
        this.codeReview = sign;
        this.shouts = shouts;
        this.color = color;
        this.width = width;
        this.height = height;
        this.material = material;




    }
    @Override
    public String toString(){
        return codeReview;



    }

}
