package org.example.extension.function;

/**
 * @author Shabelnik Ilya (ishabelnik@unislabs.com)
 */
public class MainJava {

    public static void main(String[] args) {
        System.out.println(ExtensionFunctionKt.lastChar("Lasd dance"));

        System.out.println(ExtensionFunctionKt.repeat("Сколько раз повторится ?", 3));
    }
}
