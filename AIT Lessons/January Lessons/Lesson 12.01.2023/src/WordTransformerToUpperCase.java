public class WordTransformerToUpperCase implements WordTransformer {

    public String transform (String str){
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
