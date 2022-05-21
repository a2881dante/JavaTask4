package org.example;

import org.example.subtasks.Subtask1;
import org.example.subtasks.Subtask2;
import org.example.subtasks.Subtask4;

public class App
{
    public static void main( String[] args )
    {
        Subtask1.run();

        Subtask2.run();

        Subtask4.run();
    }

    /*
        3. Создать список из элементов каталога и его подкаталогов.
        4. Создать стек из номеров записи. Организовать прямой доступ к элементам записи.
        5. Занести стихотворения одного автора в список. Провести сортировку по возрастанию длин
        строк.
        6. Задать два стека, поменять информацию местами.
        7. Определить множество на основе множества целых чисел. Создать методы для
        определения
        пересечения и объединения множеств.
        8. С использованием множества выполнить попарное суммирование произвольного
        конечного ряда чисел по следующим правилам: на первом этапе суммируются попарно рядом
        стоящие числа,на втором этапе суммируются результаты первого этапа и т. д. до тех пор,
        пока не останется одночисло.
        9. Сложить два многочлена заданной степени, если коэффициенты многочленов хранятся в
        объекте HashMap.
        10. Перемножить два многочлена заданной степени, если коэффициенты многочленов хранятся в
        различных списках.
        11. Не используя вспомогательных объектов, переставить отрицательные элементы данного
        списка в конец, а положительные — в начало списка.
        12. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк,
        используя метод sort() из класса Collections.
        13. Задан файл с текстом на английском языке. Выделить все различные слова. Слова,
        отличающиеся только регистром букв, считать одинаковыми.
     */
}
