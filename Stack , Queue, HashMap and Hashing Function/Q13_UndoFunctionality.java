// Q13_UndoFunctionality.java
// Simple undo functionality using Stack
import java.util.Stack;

public class Q13_UndoFunctionality {
    private Stack<String> history = new Stack<>();
    private String current = "";

    public void type(String text) {
        history.push(current);
        current += text;
    }

    public void undo() {
        if (!history.isEmpty()) {
            current = history.pop();
        }
    }

    public String getText() {
        return current;
    }

    public static void main(String[] args) {
        Q13_UndoFunctionality editor = new Q13_UndoFunctionality();
        editor.type("Hello");
        editor.type(" World");
        System.out.println(editor.getText()); // Hello World
        editor.undo();
        System.out.println(editor.getText()); // Hello
    }
}
