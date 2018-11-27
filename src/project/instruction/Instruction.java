package project.instruction;

import project.value.Value;

import java.util.ArrayList;
import java.util.List;

public class Instruction {

    private final Mnemonic mnemonic;
    private final List<Value> arguments;

    Instruction(Mnemonic mnemonic, List<Value> arguments) {
        this.mnemonic = mnemonic;
        this.arguments = new ArrayList<>(arguments);
    }

}
