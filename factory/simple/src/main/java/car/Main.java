package car;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String ...args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Input car brand: ");
            String brand = br.readLine();
            System.out.println();

            Car car = SimpleCarFactory.createCar(brand);
            System.out.print("Created car: ");
            System.out.println(car);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
