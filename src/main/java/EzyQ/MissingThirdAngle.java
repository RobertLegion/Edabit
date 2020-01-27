package EzyQ;

public class MissingThirdAngle {
    public static void main(String[] args) {
        System.out.println(missingAngle(45, 45));
        System.out.println(missingAngle(90, 45));
        System.out.println(missingAngle(135, 15));
        System.out.println(missingAngle(60, 60));
        System.out.println(missingAngle(30, 56));
    }
    public static String missingAngle(int angle1, int angle2) {
        int angle3 = 180 - angle1 - angle2;
        if(angle3 < 90){
            return "acute";
        } else if (angle3 == 90){
            return "right";
        } else if (angle3 > 90){
            return "obtuse";
        } else return null;
    }
}
