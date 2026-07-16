// PalmerPenguins.java
// Alejandro Cueto
// 7/16/26
// Refactored Palmer Penguins analysis using object-oriented approach

package edu.fscj.cop2800c.penguin;

public class PalmerPenguins {

    public static void main(String[] args) {

        PenguinAnalyzer analyzer = new PenguinAnalyzer();


        analyzer.readPenguinData();

        analyzer.printPenguinData();

        analyzer.writePenguinData();
    }
}
