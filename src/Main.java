public class Main {
    public static void main(String[] args) {
        System.out.println(Utils.validateEmail("bruno@gmail.com"));

        String[] sentence = new String[]{"Ala", "ma", "kota"};
        String joinedSentence = Utils.joinStringArray(sentence, " ");
        System.out.println(joinedSentence);
    }
}
