package project.value;

import java.util.Arrays;
import java.util.List;

public class ValueFactory {

    public Value create(String text) {
        // \\s = "any whitespace" ; + = "one or more"
        return create(Arrays.asList(text.split("\\s+")));
    }

    private Value create(List<String> text) {
        Value result = memory(text);
        if (result == null) {
            result = register(text);
        }
        if (result == null) {
            result = immediate(text);
        }
        return result;
    }

    private Value memory(List<String> text) {
        // TODO: if this is a memory reference, recurse into create then wrap the value; otherwise null
        // Something like...
        // if (text is a memory reference) {
        //    return new MemoryValue(create(drop_the_PTR_token_or_whatever(text));
        // }
        // return null;
        throw new UnsupportedOperationException();
    }

    private Value register(List<String> text) {
        // TODO: if the text is a valid register, return a value representing that register; otherwise null
        throw new UnsupportedOperationException();
    }

    private Value immediate(List<String> text) {
        // TODO: return a value representing an immediate value - need to figure out the type
        throw new UnsupportedOperationException();
    }

}
