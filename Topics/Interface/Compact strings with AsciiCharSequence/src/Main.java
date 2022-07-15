import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.IntStream;

class AsciiCharSequence implements CharSequence {

    public byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array.clone();
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int i) {
        return (char) array[i];
    }

    @Override
    public CharSequence subSequence(int i, int i1) {
        return new AsciiCharSequence(Arrays.copyOfRange(array, i, i1));
    }

    @Override
    public IntStream chars() {
        return CharSequence.super.chars();
    }

    @Override
    public String toString() {
        return new String(this.array, StandardCharsets.UTF_8);
    }

}
