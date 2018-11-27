package project.base;

public interface Target {

    String convert(Context);

    String writeInstruction(Instruction);
    String writeVariable(Value, String);
}
