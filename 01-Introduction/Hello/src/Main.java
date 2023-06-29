public class Main {

    public static void main(String[] args) {
        //main() - это главная функция (метод), которая является точкой входа в программу
        //String[] args - это принимаемый параметр функции (метода) main()
        //                функция может не принимать никаких параметров, в таком случае, () оставляют пустыми,
        //                но их обязательно нужно писать, поскольку они отличают функцию от переменной.

        //void (пустота) показывает, что функция (метод) ничего НЕ возвращает по завершении
        //ООП - Объектно-Ориентированное Программирование
        //{} - показывают начало и конец функции main()

        System.out.print("\t\t\t\t\tHello \"World\"!\n");   //Метод 'print()' класса 'System' выводит данные на экран
                                            //"Hello World" - это строковая константа
                                            //Строковая константа - это последовательность произволных символов, заключенная в двоные кавычки.
        //; - показывает конец выражения на языке Java
        System.out.print("C:\\Windows\\System32\\drivers\\etc\\\n");
        System.out.print("Привет!\n");
        System.out.print("Сам привет!\n");
        //                      Escape-последовательности (Esc):
        //Esc нужны для выравнивания выводимой в консол информации, а так же для вывода некоторых специальных символов.
        //Esc - это одиночные символы, экранированные символом '\'
        //  / Slash (косая черта, дробовая черта)
        //  \ Backslash (обратная косая черта)
        //  Экранированный символ значит, что перед этим символом стоит символ '\',
        //  например, '\n' - символ 'n' экранирован символом '\'

        // '\' - это символ отмены специального значения другого символа, т.е., он отменяет специальное значение символа,
        // следующего за ним, например
        //  \" - отменяет специальное значение кавычек, и позволяет вывести кавычку в консоль;
        //  \\ - backslash отменяет специальное значение в том числе и самого себя;

        // Некоторым символам '\' наоборот, придает специальное значение, например,
        //  \n (newline) - переводит курсор в начало новой строки.
        //  \t (tab) - выводит на экран табуляцию. Один символ табуляции включает в себя до 8 пробелов.
    }
}