package hackerEarth;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DataTypes {

    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<(Integer.parseInt(br.readLine()));i++){
            System.out.println((br.readLine()).getClass().getSimpleName());
        }
    }
}