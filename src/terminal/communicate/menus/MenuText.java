package terminal.communicate.menus;

/**
 * Print menu to choose further movement
 */
public class MenuText {
    public static void menuStartText() {
        System.out.println("""
                __________________________________________________________________________________
                Введите запрос:\s
                exit - выйти
                1 - добвить животное
                del - удалить животное
                А затем данные зверька через запятую:\s
                Например: 1, lion, 3 years, 150 kg, 20 volume, 4 limbs
                     Или: 1, wolf, 6 years, 60 kg, 4 limbs
                     Или: 1, snake, 10 years, 50 kg, 100 length
                __________________________________________________________________________________""");
    }

    public static void menuContinue() {
        System.out.println(" Введите параметры или exit для выхода: ");
    }
}
