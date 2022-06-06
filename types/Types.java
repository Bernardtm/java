import java.math.BigDecimal;

public class Types {
    public static void main(String[] args) {

        int primitiveInteger = 0;
        System.out.println(primitiveInteger);
        long primitiveLong = 0;
        System.out.println(primitiveLong);
        float primiteFloat = 0;
        System.out.println(primiteFloat);
        double primitiveDouble = 0;
        System.out.println(primitiveDouble);
        char character = 'c';
        System.out.println(character);
        boolean primitiveBoolean = false;
        System.out.println(primitiveBoolean);

        Integer intergerWrapper = 1;
        System.out.println(intergerWrapper);
        Long longWrapper = 0L;
        System.out.println(longWrapper);
        Float floatWrapper = 0f;
        System.out.println(floatWrapper);
        Double doubleWrapper = 0.0;
        System.out.println(doubleWrapper);
        Boolean booleanWrapper = false;
        System.out.println(booleanWrapper);
        BigDecimal bigDecimal = new BigDecimal(0.0);
        System.out.println(bigDecimal);
        String string = new String();
        System.out.println(string);
    }
}
