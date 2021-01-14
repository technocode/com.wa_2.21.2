package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.3Ay  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C67903Ay implements FileFilter {
    public static final /* synthetic */ C67903Ay A00 = new C67903Ay();

    public final boolean accept(File file) {
        String name = file.getName();
        if (!name.startsWith("cpu")) {
            return false;
        }
        for (int i = 3; i < name.length(); i++) {
            if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }
}
