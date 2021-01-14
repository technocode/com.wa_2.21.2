package X;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

/* renamed from: X.36M  reason: invalid class name */
public final /* synthetic */ class AnonymousClass36M implements FilenameFilter {
    public static final /* synthetic */ AnonymousClass36M A00 = new AnonymousClass36M();

    public final boolean accept(File file, String str) {
        return str.toLowerCase(Locale.US).endsWith(".dmp");
    }
}
