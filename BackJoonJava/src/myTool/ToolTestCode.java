package myTool;

public class ToolTestCode {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };

        a = ShiftArray.shiftRightArrayInt(a);
        PrintAllArray.printAllInt(a);
        System.out.println();

        a = ShiftArray.shiftRightArrayInt(a);
        PrintAllArray.printAllInt(a);
        System.out.println();

        a = ShiftArray.shiftLeftArrayInt(a);
        PrintAllArray.printAllInt(a);
        System.out.println();

        a = ShiftArray.shiftReverseArrayInt(a);
        PrintAllArray.printAllInt(a);
        System.out.println();
    }
}
