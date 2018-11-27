package project.instruction;

import project.value.Value;
import project.value.ValueFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InstructionFactory {

    private final ValueFactory valueFactory;

    public InstructionFactory(ValueFactory valueFactory) {
        this.valueFactory = valueFactory;
    }

    public Instruction create(String string) {
        string = string.trim();
        int where = string.indexOf(' ');
        if (where < 0) {
            where = string.length() - 1;
        }
        String mnemonicName = string.substring(0, where + 1);
        Mnemonic mnemonic = Mnemonic.valueOf(mnemonicName); // TODO: this will throw an IllegalArgumentException on a bad name
        String arguments;
        try {
            arguments = string.substring(where + 1);
        } catch (IndexOutOfBoundsException e) {
            arguments = "";
        }
        List<Value> argumentList = Arrays.stream(arguments.split(","))
                .map(String::trim)
                .map(valueFactory::create)
                .collect(Collectors.toList());
        return new Instruction(mnemonic, argumentList);
    }

}
