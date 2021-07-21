package sg.edu.rp.c346.id20022678.demoandroidlist;

import androidx.annotation.NonNull;

public class AndroidVersion {

    private String name;
    private String version;

    public AndroidVersion(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersion() {
        return version;
    }

    @NonNull
    @Override
    public String toString() {
        return name + ": " + version + "}";
    }
}
