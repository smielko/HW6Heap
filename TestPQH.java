import java.util.Scanner;
public class TestPQH {

    public static void main(String []args)
    {
        boolean isFinished = false;
        int heaptype = -1;//tracks heap type: -1 = not chosen, 0 = string, 1 = integer
       Heap myHeap = new Heap();
        while (heaptype < 0)
            heaptype = HeapTypeSelection();
        while (!isFinished)
        {
            DisplayMenu();
            isFinished = MenuSelection(1, myHeap);
        }
    }
    public static void DisplayMenu()
    {
        System.out.println("\n----------------MAIN MENU---------------\n" +
                "0. Enter Queue Type (integer or string)\n" +
                "1. Enqueue Element\n" +
                "2. Dequeue Element\n" +
                "3. Check is_Full\n" +
                "4. Check is_Empty\n" +
                "5. Print PQueue Size\n" +
                "6. Display Front Element\n" +
                "7. Print PQueue Elements\n" +
                "8. Exit program\n" +
                "Enter option number:");
    }
    public static int HeapTypeSelection()
    {
        DisplayMenu();
        Scanner myScanner = new Scanner(System.in);
        String selection = myScanner.next();
        if (selection.equals("0")) {
            System.out.print("String or Integer: ");
            String treetype = myScanner.next();
            if (treetype.equals("String") || treetype.equals("string"))
                return 0;
            else if (treetype.equals("Integer") || treetype.equals("integer"))
                return 1;
            else System.out.println("Invalid Input");
        } else {
            System.out.println("Please specify tree type");
        }
        return -1;
    }
    public static boolean MenuSelection(int heaptype,Heap myHeap)
    {
        Scanner myScanner = new Scanner(System.in);
        String selection = myScanner.next();
        switch(selection)
        {
            case "0":   System.out.println("HeapType is already specified");
                break;
            case "1": if(heaptype == 1) addInteger(myHeap);
                      else addString(myHeap);
                break;
            case "2":
                break;
            case "3":
                break;
            case "4": if (myHeap.getSize() == 0) System.out.println("Heap is empty");
                break;
            case "5": System.out.println("Heap size is " + myHeap.getSize());
                break;
            case "6": System.out.println("Front Element: " + myHeap.Peek());
                break;
            case "7":
                break;
            case "8":  return true;
            default: System.out.println("Invalid selection");
        }
        return false;
    }
    public static void addString(Heap myHeap)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input (String): ");
        String input = myScanner.next();
        myHeap.add(input);
    }
    public static void addInteger(Heap myHeap)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Input (Integer): ");
        int input = myScanner.nextInt();
        myHeap.add(input);
    }
}

