import java.util.ArrayList;

public class Recursion {
    public static void main(String[] args) {
        String expressionText = "8*(7-(6+8))";
        ArrayList<Element> array = new ArrayList<>();
        array.add(new Element(ElementsType.NUMBER, "8"));
        array.add(new Element(ElementsType.MULTIPLICATION, "*"));
        array.add(new Element(ElementsType.LEFT_BRACKET, "("));
        array.add(new Element(ElementsType.NUMBER, "7"));
        array.add(new Element(ElementsType.MINUS, "-"));
        array.add(new Element(ElementsType.LEFT_BRACKET, "("));
        array.add(new Element(ElementsType.NUMBER, "6"));
        array.add(new Element(ElementsType.PLUS, "+"));
        array.add(new Element(ElementsType.NUMBER, "8"));
        array.add(new Element(ElementsType.RIGHT_BRACKET, ")"));
        array.add(new Element(ElementsType.RIGHT_BRACKET, ")"));
        array.add(new Element(ElementsType.END_STRING, ""));

        ElementBuffer elementBuffer = new ElementBuffer(array);
        System.out.println(result(elementBuffer));
    }

    private enum ElementsType {LEFT_BRACKET, RIGHT_BRACKET,PLUS, MINUS, MULTIPLICATION, DIVISION,NUMBER,END_STRING}
    public static class Element {
        ElementsType type; String value;
        public Element(ElementsType type, String value) {this.type = type;this.value = value;}

        @Override
        public String toString() {
            return "Element{" +
                    "type=" + type +
                    ", value='" + value + '\'' +
                    '}';
        }
    }

    public static class ElementBuffer {
        public int counter;
        public ArrayList<Element> elements;
        public ElementBuffer(ArrayList<Element> elements) {
            this.elements = elements;
        }
        public Element next() {return elements.get(counter++);}
        public void back() {counter--;}
        public int getCounter() {return counter;}

        @Override
        public String toString() {
            return "ElementBuffer{" +
                    "counter=" + counter +
                    ", elements=" + elements +
                    '}';
        }
    }

    // String expressionText = "8*(7-(6+8))";
    // String expressionText = "8*2-5*10";

    public static int result(ElementBuffer elements) {
        Element element = elements.next();
        elements.back();
        return plusMinus(elements);
    }

    public static int plusMinus(ElementBuffer elements) {
        int value = mulDiv(elements);
        while (true) {
            Element element = elements.next();
            switch (element.type) {
                case PLUS:
                    value += mulDiv(elements);
                    break;
                case MINUS:
                    value -= mulDiv(elements);
                    break;
                case END_STRING:
                case RIGHT_BRACKET:
                    System.out.println(elements.counter);
                    elements.back();
                    System.out.println(value);
                    return value;
            }
        }
    }

    public static int mulDiv(ElementBuffer elements) {
        int value = numbers(elements);
        System.out.println(value);
        while (true) {
            Element element = elements.next();
            switch (element.type) {
                case MULTIPLICATION:
                    value *= numbers(elements);
                    break;
                case DIVISION:
                    value /= numbers(elements);
                    break;
                case END_STRING:
                case RIGHT_BRACKET:
                case PLUS:
                case MINUS:
                    elements.back();
                    return value;
            }
        }
    }

    public static int numbers(ElementBuffer elements) {
        Element element = elements.next();
        switch (element.type) {
            case NUMBER:
                return Integer.parseInt(element.value);
            case LEFT_BRACKET:
                int value = result(elements);
                element = elements.next();
                return value;
            default:
                throw new RuntimeException("Синтаксически не верно создано выражение " + element.value
                        + " at position: " + elements.getCounter());
        }
    }
}
