package ru.bia.test.testrest;

/**
 * Example cat POJO for JSONB (un)marshalling as array of primitives.
 *
 * See also {@link MyParamConverter}, {@link MyParamConverterProvider}
 */
public class Ints {
    Integer[] iii;
    public String toString() {
        return iii.toString();
    }
}
