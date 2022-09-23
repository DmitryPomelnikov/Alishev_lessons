import javax.lang.model.util.Elements;
import javax.swing.text.DefaultStyledDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Testing {
    public static void main(String[] args) {

        String expressionText = "(5*2+((-2-4))+5";
        String expressionText2 = "(8+3)-2";
        ArrayList<String> array2 = elementAnalyze(expressionText2);
        ArrayList<Element> elements = elementAnalyze(array2);
        ElementBuffer elementBuffer = new  ElementBuffer(elements);
        System.out.println(expr(elementBuffer));

    }

    public static ArrayList<String> elementAnalyze(String inputString) {
        String expText = inputString.replaceAll(" ", "");
        ArrayList<String> elements = new ArrayList<>();
        ArrayList<String> elementsCorrect = new ArrayList<>();
        int counter = 0;
        while (counter < expText.length()) {
            char symbol = expText.charAt(counter);
            switch (symbol) {
                case '(':
                case ')':
                case '+':
                case '-':
                case '*':
                case '/':
                    elements.add(Character.toString(symbol));
                    counter++;
                    continue;
                default:
                    if (symbol <= '9' && symbol >= '0') {
                        String sb = "";
                        do {
                            sb += Character.toString(symbol);
                            counter++;
                            if (counter >= expText.length()) {
                                break;
                            }
                            symbol = expText.charAt(counter);
                        }
                        while (symbol <= '9' && symbol >= '0');
                        elements.add(sb);
                    }
            }
        }
        for (int e = 0; e < elements.size(); e++) {
            if (elements.get(0).equals("-") || (elements.get(e).equals("-") && elements.get(e - 1).equals("("))) {
                elementsCorrect.add(elements.get(e) + elements.get(e + 1));
                e++;
            } else elementsCorrect.add(elements.get(e));
            int left=0;
            int right = 0;
            for (int c=0;c<elements.size();c++){
                if(elements.get(c).equals("(")){
                    left++;
                }
                if(elements.get(c).equals(")")){
                    right++;
                }
            }
            if (left!=right) {
                throw new RuntimeException("Количество открывающихся скобок не равно количеству закрывающихся, выражение некорректное");
            }
        }
        return elementsCorrect;
    }

    private enum ElementsType {
        LEFT_BRACKET, RIGHT_BRACKET,
        PLUS, MINUS, MULTIPLICATION, DIVISION,
        NUMBER,
        END_STRING
    }

    public static class Element {
        ElementsType type;
        String value;

        public Element(ElementsType type, String value) {
            this.type = type;
            this.value = value;
        }

//        public Element(ElementsType type, Character value) {
//            this.type = type;
//            this.value = value.toString();
//        }


//        @Override
//        public String toString() {
//            return "Element{" +
//                    "type=" + type +
//                    ", value='" + value + '\'' +
//                    '}';
//        }
    }

    public static ArrayList<Element> elementAnalyze(ArrayList<String> array) {
        ArrayList<Element> elements = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < array.size(); i++) {
            switch (array.get(i)) {
                case "(":
                    elements.add(new Element(ElementsType.LEFT_BRACKET, array.get(i)));
                    counter++;
                    continue;
                case ")":
                    elements.add(new Element(ElementsType.RIGHT_BRACKET, array.get(i)));
                    counter++;
                    continue;
                case "*":
                    elements.add(new Element(ElementsType.MULTIPLICATION, array.get(i)));
                    counter++;
                    continue;
                case "/":
                    elements.add(new Element(ElementsType.DIVISION, array.get(i)));
                    counter++;
                    continue;
                case "+":
                    elements.add(new Element(ElementsType.PLUS, array.get(i)));
                    counter++;
                    continue;
                case "-":
                    elements.add(new Element(ElementsType.MINUS, array.get(i)));
                    counter++;
                    continue;
                default:
                    elements.add(new Element(ElementsType.NUMBER, array.get(i)));
                    counter++;
            }
        }
        elements.add(new Element(ElementsType.END_STRING, ""));
        return elements;
    }
public static class ElementBuffer{
        public int counter;
        public ArrayList<Element> elements;

    public ElementBuffer(ArrayList<Element> elements) {
        this.elements = elements;
    }

    public Element next(){
        return elements.get(counter++);
    }
    public void back(){
        counter--;
    }
    public int getCounter(){
        return counter;
    }
}

    public static int numbers(ElementBuffer elements) {
        Element element = elements.next();
        switch (element.type) {
            case NUMBER:
                return Integer.parseInt(element.value);
            case LEFT_BRACKET:
                int value = expr(elements);
                element = elements.next();
                if (element.type != ElementsType.RIGHT_BRACKET) {
                    throw new RuntimeException("Не хватает закрывающейся скобки " + element.value
                            + " at position: " + elements.getCounter());
                }
                return value;
            default:
                throw new RuntimeException("Unexpected token: " + element.value
                        + " at position: " + elements.getCounter());
        }
    }

    public static int mulDiv(ElementBuffer elements){
        int value = numbers(elements);
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
                default:
                    throw new RuntimeException("Unexpected token: " + element.value
                            + " at position: " + elements.getCounter());
            }
        }
    }
    public static int plusMinus(ElementBuffer elements){
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
                    elements.back();
                    return value;
                default:
                    throw new RuntimeException("Unexpected token: " + element.value
                            + " at position: " + elements.getCounter());
            }
        }
    }
    public static int expr(ElementBuffer elements){
        Element element = elements.next();
        if (element.type == ElementsType.END_STRING) {
            return 0;
        } else {
            elements.back();
            return plusMinus(elements);
        }
    }

}



