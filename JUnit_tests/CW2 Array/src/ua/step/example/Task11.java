package ua.step.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * В метод getWin передается символьный двухмерный квадратный массив
 * размерностью 3 на 3, который содержит символы нолика (буква 'O' латинская) и
 * крестика (буква 'X' латинская).
 * 
 * Массив является результатом законченой игры в крестики-нолики. Метод долджен
 * вернуть 'X' если любая строка или столбец или диоганаль в массиви заполненна
 * крестиками. Метод долджен вернуть 'O' если вся строка, или столбец или
 * диоганаль заполненна ноликами. Если ничья метод должен вернуть N. Если размер
 * входного массива не 3 на 3 или null метод должен вернуть E. Если массив
 * содержит другие буквы метод должен вернуть 'E'
 */
public class Task11
{
    public char getWin(int[][] mas)
    {
        if(mas == null || mas.length != 3 || mas[0] == null || mas[0].length != 3) return 'E';

        int x = 'X';
        int y = 'O';

        for (int[] row: mas) {
            for (int num:row) {
                if(num != x && num != y) return 'E';
            }
        }

        // check rows
        for (int[] row: mas) {
            if(row[0] == row[1] && row[1] == row[2]) return (char) row[0];
        }

        for (int i = 0; i < mas.length; i++) {
            if(mas[0][i] == mas[1][i] && mas[1][i] ==mas[2][i]) return (char) mas[0][i];
        }

        System.out.println("check");
        if(mas[0][0] == mas[1][1] && mas[1][1] == mas[2][2]) return (char) mas[2][2];
        if(mas[0][2] == mas[1][1] && mas[1][1] == mas[2][0]) return (char) mas[1][1];

        return 'N';
    }

    /*
     * НЕ ИЗМЕНЯТЬ ТЕСТЫ НАПИСАНЫЕ НИЖЕ
     */

    @Test
    public void testError()
    {
        int[][] mas = null;
        char result = getWin(mas);
        assertTrue(result == 'E');

        mas = new int[3][];
        result = getWin(mas);
        assertTrue(result == 'E');
    }

    @Test
    public void testWrongSize()
    {
        int[][] mas = new int[3][2];
        char result = getWin(mas);
        assertTrue(result == 'E');

        mas = new int[2][3];
        result = getWin(mas);
        assertTrue(result == 'E');

        mas = new int[4][4];
        result = getWin(mas);
        assertTrue(result == 'E');
    }

    @Test
    public void testWrongSymbol()
    {
        int[][] mas = new int[][] { 
            { '0', 'x' }, 
            { 'K', 'Q' } };
        char result = getWin(mas);
        assertTrue(result == 'E');
    }

    @Test
    public void testWinXInRowResult3x3()
    {
        int[][] mas = new int[][] { 
            { 'X', 'X', 'X' }, 
            { 'O', 'O', 'X' }, 
            { 'X', 'O', 'O' } };
        char result = getWin(mas);
        assertTrue(result == 'X');
    }

    @Test
    public void testWinXInColResult3x3()
    {
        int[][] mas = new int[][] {
            { 'X', 'O', 'O' },
            { 'X', 'X', 'O' }, 
            { 'O', 'O', 'X' } };
        char result = getWin(mas);
        assertTrue(result == 'X');
    }

    @Test
    public void testWinXInDiogonalResult3x3()
    {
        int[][] mas = new int[][] { 
            { 'X', 'O', 'X' },
            { 'O', 'X', 'O' }, 
            { 'X', 'O', 'X' } };
        char result = getWin(mas);
        assertTrue(result == 'X');
    }

    @Test
    public void testWinOInRowResult3x3()
    {
        int[][] mas = new int[][] { 
            { 'X', 'O', 'X' },
            { 'O', 'X', 'X' },
            { 'O', 'O', 'O' } };
        char result = getWin(mas);
        assertTrue(result == 'O');
    }

    @Test
    public void testWinOInColResult3x3()
    {
        int[][] mas = new int[][] { 
            { 'X', 'O', 'X' }, 
            { 'X', 'O', 'O' },
            { 'O', 'O', 'X' } };
        char result = getWin(mas);
        assertTrue(result == 'O');
    }

    @Test
    public void testWinOInDioganalResult3x3()
    {
        int[][] mas = new int[][] { 
            { 'X', 'O', 'O' },
            { 'X', 'O', 'O' },
            { 'O', 'X', 'X' } };
        char result = getWin(mas);
        assertTrue(result == 'O');
    }

    @Test
    public void testDraw1()
    {
        int[][] mas = new int[][] { 
            { 'X', 'O', 'X' },
            { 'X', 'O', 'O' },
            { 'O', 'X', 'X' } };
        char result = getWin(mas);
        assertTrue(result == 'N');
    }

    @Test
    public void testDraw2()
    {
        int[][] mas = new int[][] { 
            { 'O', 'X', 'X' },
            { 'X', 'O', 'O' },
            { 'X', 'O', 'X' } };
        char result = getWin(mas);
        assertTrue(result == 'N');
    }
}