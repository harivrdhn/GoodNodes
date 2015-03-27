import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++){
            int height = 1;
            int n = in.nextInt();
            if(n%2 == 0)
                System.out.println((int)(Math.pow(2,((n/2)+1))-1));
            else
                System.out.println((int)(Math.pow(2,((n/2)+2))-2));
        }
    }
}
