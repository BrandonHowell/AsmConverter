package project.value;

class MemoryValue implements Value {

    private final Value decorated;

    MemoryValue(Value decorated) {
        this.decorated = decorated;
    }

    @Override
    public Location getLocation() {
        return Location.MEMORY;
    }

    @Override
    public Type getType() {
        return decorated.getType();
    }

    @Override
    public String getValue() {
        // TODO: should include the PTR token or whatever
        return decorated.getValue();
    }

}
