package bitlab.askar.module2.lesson7;

import java.io.Serializable;
import java.util.ArrayList;

public class PackageData implements Serializable {
    String name;
    String message;
    ArrayList<String> strings;

    public PackageData() {
    }

    public PackageData(String name, String message) {
        this.name = name;
        this.message = message;
    }

    @Override
    public String toString() {
        return "PackageData{" +
                "name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
