package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.10R  reason: invalid class name */
public final class AnonymousClass10R implements FilenameFilter {
    public boolean accept(File file, String str) {
        return str.startsWith("override-") && str.endsWith(".log");
    }
}
