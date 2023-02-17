public class WordTransformerAddRoundBrackets implements WordTransformer {
    public String transform(String str) {
        return "(" + str + ")";
    }
}
