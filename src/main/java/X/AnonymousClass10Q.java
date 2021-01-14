package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.10Q  reason: invalid class name */
public final class AnonymousClass10Q implements FilenameFilter {
    public boolean accept(File file, String str) {
        if (!str.startsWith("override-")) {
            return str.endsWith(".log") || str.endsWith(".zip") || str.endsWith(".tmp");
        }
        return false;
    }
}
