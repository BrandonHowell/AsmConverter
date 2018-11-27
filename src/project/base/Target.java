package project.base;

import project.instruction.Instruction;
import project.value.Value;

public interface Target {

    String convert(Context context);

    String writeInstruction(Instruction instruction);
    String writeVariable(Value value, String string);
}
