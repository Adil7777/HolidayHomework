public class Two {
    String result = "";

    public String repl(String str, int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            result = result + str;
        }
        return result;
    }
}
