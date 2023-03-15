package terminal.communicate.menus;

/**
 * Print menu for choose a number
 */
public class MenuNumber {
    public static void menuStartNumbers() {
        System.out.println("""
                Введите запрос:\s
                0 - выйти
                1 - добвить рандомное животное
                2 - удалить рандомное животное""");
    }
}
