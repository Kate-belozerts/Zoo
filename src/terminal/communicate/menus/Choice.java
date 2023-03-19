package terminal.communicate.menus;

import terminal.communicate.output.Tuple;
import terminal.processing.ParserNumber;
import terminal.processing.ParserText;

import java.util.Scanner;

public class Choice {
    public static Tuple choice() {
        Scanner choice = new Scanner(System.in);
        System.out.println("1 - ввод цифрами\n2 - ввод словами");
        int result = choice.nextInt();
        if (result == 1) {
            return new Tuple(1, new ParserNumber());
        } else return new Tuple(2, new ParserText());
    }
}
