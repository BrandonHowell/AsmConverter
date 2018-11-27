package project.base;

import java.util.List;
import java.util.Map;

public class Context {

    public Map<String, Value> variablesByName;
    public List<Instruction> code;

    public Context() {

    }

    public Map<String, Value> getVariablesByName() {
        return variablesByName;
    }

    public void setVariablesByName(Map<String, Value> variablesByName) {
        this.variablesByName = variablesByName;
    }

    public List<Instruction> getCode() {
        return code;
    }

    public void setCode(List<Instruction> code) {
        this.code = code;
    }
}
