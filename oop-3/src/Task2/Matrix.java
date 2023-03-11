package Task2;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Matrix {
    private ArrayList<ArrayList<Integer>> source = new ArrayList<>();
    private int rowsCount = 0;
    private int colsCount = 0;

    public Matrix() {}

    // private to keep secure source and right shape
    private Matrix(ArrayList<ArrayList<Integer>> matrix) {
        this.source = matrix;
    }


    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows count:");
        rowsCount = scanner.nextInt();

        System.out.println("Enter cols count :");
        colsCount = scanner.nextInt();

        source = new ArrayList<>(rowsCount);

        for (int i = 0; i < rowsCount; ++i) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < colsCount; j++) {
                row.add(scanner.nextInt());
            }
            source.add(row);
        }
    }

    public void generate(int rows, int cols) {
        Random rnd = new Random();
        source = new ArrayList<>(rows);

        for (int i = 0; i < rows; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(rnd.nextInt());
            }
            source.add(row);
        }
    }

    public void show() {
        for (var row: source) {
            for (var col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public int max() {
        Optional<Integer> max = Optional.empty();
        for (var row: source) {
            for (var col:row) {
                if(max.isEmpty() || max.get() < col) {
                    max = Optional.of(col);
                }
            }
        }
        return  max.orElse(0);
    }

    public int min() {
        Optional<Integer> min = Optional.empty();
        for (var row: source) {
            for (var col:row) {
                if(min.isEmpty() || min.get() > col) {
                    min = Optional.of(col);
                }
            }
        }
        return  min.orElse(0);
    }

    public double avg() {
        int count = rowsCount * colsCount;
        if(count == 0) return  0;

        double sum = 0;
        for (var row: source) {
            for (var col:row) {
                sum += col;
            }
        }
        return  sum/count;
    }

    // for sum and difference math operations
    private Optional<Matrix> simpleMathOperation(Matrix matrix, BiFunction<Integer, Integer, Integer> operation) {
        if(matrix.colsCount != colsCount || matrix.rowsCount != rowsCount) return Optional.empty();

        ArrayList<ArrayList<Integer>> newMatrixSource = new ArrayList<>(rowsCount);
        for (int i = 0; i < rowsCount; i++) {
            ArrayList<Integer> newMatrixRow = new ArrayList<>(colsCount);
            for (int j = 0; j < colsCount; j++) {
                newMatrixRow.add(operation.apply(source.get(i).get(j), matrix.source.get(i).get(j)));
            }
            newMatrixSource.add(newMatrixRow);
        }
        return Optional.of(new Matrix(newMatrixSource));
    }

    public Optional<Matrix> sum(Matrix matrix) {
        return simpleMathOperation(matrix, Integer::sum);
    }

    public Optional<Matrix> difference(Matrix matrix) {
        return simpleMathOperation(matrix, (f, s) -> f - s);
    }

    public Optional<Matrix> multiplication(Matrix matrix) {
        if(colsCount != matrix.rowsCount) return Optional.empty();

        int newMatrixRowsCount = rowsCount;

        ArrayList<ArrayList<Integer>> newMatrixSource = new ArrayList<>(newMatrixRowsCount);

        for (int sourceRowIndex = 0; sourceRowIndex < rowsCount; ++sourceRowIndex) {
            ArrayList<Integer> newMatrixRow = new ArrayList<>();

            for (int givenColIndex = 0; givenColIndex < matrix.colsCount; ++givenColIndex) {
                int newNum = 0;

                for (int sourceColIndex = 0; sourceColIndex < colsCount; ++sourceColIndex) {

                    final var sourceNum = source.get(sourceRowIndex).get(sourceColIndex);
                    final var givenNum = matrix.source.get(sourceColIndex).get(givenColIndex);
                    newNum += sourceNum * givenNum;
                }
                newMatrixRow.add(newNum);
            }
            newMatrixSource.add(newMatrixRow);
        }
        return Optional.of(new Matrix(newMatrixSource));
    }
}
