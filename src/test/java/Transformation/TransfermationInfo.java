package Transformation;

import cucumber.api.Transformer;

public class TransfermationInfo extends Transformer<String> {

    @Override
    public String transform(String value) {
        return value.concat("@gmail.com");
    }
}
