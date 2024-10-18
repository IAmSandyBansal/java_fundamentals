package types;

import java.awt.*;

public class Types {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println(x);
        System.out.println(y);

        String myName = "Sandeep";
        String selfName = myName;
        myName = "Sandeep Bansal";
        System.out.println(selfName);

        Point point_one = new Point(1,1);
        Point point_two = point_one;
        point_one.x = 2;
        System.out.println(point_two);
    }
}
