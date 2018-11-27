package project.base;

import project.enums.Mnemonic;

import java.util.List;

public class Instruction {

    private List<Value> arguments;
    private Mnemonic mnemonic;

    public Instruction() {

    }

    public List<Value> getArguments() {
        return arguments;
    }

    public void setArguments(List<Value> arguments) {
        this.arguments = arguments;
    }

    public Mnemonic getMnemonic() {
        return mnemonic;
    }

    public void setMnemonic(Mnemonic mnemonic) {
        this.mnemonic = mnemonic;
    }
}
