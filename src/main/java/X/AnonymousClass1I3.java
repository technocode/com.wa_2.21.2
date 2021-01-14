package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.1I3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1I3 implements FileFilter {
    public static final /* synthetic */ AnonymousClass1I3 A00 = new AnonymousClass1I3();

    public final boolean accept(File file) {
        if (!file.isFile()) {
            return false;
        }
        C02230Bd.A0Q(C006803i.A0K(file.getAbsolutePath()));
        return true;
    }
}
