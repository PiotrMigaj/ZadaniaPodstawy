package day2.ex2;


public interface IStringHelper {
    default boolean isValidInterface(String input) {
        return input != null && !input.isBlank();
    }
}
