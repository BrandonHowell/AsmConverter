package project.value;

class BasicValue implements Value {

    private final Location location;
    private final Type type;
    private final String value;

    BasicValue(Location location, Type type, String value) {
        this.location = location;
        this.type = type;
        this.value = value;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public String getValue() {
        return value;
    }

}
