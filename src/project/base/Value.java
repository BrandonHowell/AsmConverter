package project.base;

import project.enums.Location;
import project.enums.Type;

public class Value {

    Location location;
    Type type;

    public Value(){

    }

    public String text() {
        return "";
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
