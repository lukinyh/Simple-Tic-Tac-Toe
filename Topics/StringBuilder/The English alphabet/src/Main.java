class EnglishAlphabet {

    public static StringBuilder createEnglishAlphabet() {
        // write your code here
        StringBuilder result = new StringBuilder();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            result.append(ch).append(" ");
        }
        return result.deleteCharAt(result.length() - 1);
    }
}
