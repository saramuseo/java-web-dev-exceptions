package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static int pointsEarned = 0;

    public static void main(String[] args) {

//        int x = 10;
//        int y = 0;
//
//            int grade = Divide(x, y);
        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
       studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.pdf");
        studentFiles.put("Stefanie", "CoolProgram.java");

        for (Map.Entry<String, String> file : studentFiles.entrySet()){
            System.out.println(file.getKey() + ": " + CheckFileExtension(file.getValue()));

        }

    }

    public static int Divide(int x, int y)
    {

        if (y == 0) {
            try {
                throw new ArithmeticException("Can't divide by zero");
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }

       return x/y;
    }

    public static int CheckFileExtension(String fileName) {
        if (fileName.equals("") || fileName == null) {
            try {
                throw new NullPointerException("this file needs an extension");
            } catch (NullPointerException e) {
                e.printStackTrace();
            }
            return pointsEarned - 1;
        }
        else if (fileName.endsWith(".java")) {
            return pointsEarned +1;
        }
        else  {
            return pointsEarned;

        }



    }

}
