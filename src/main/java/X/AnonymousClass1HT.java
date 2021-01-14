package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.1HT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1HT implements FilenameFilter {
    public final /* synthetic */ String A00;

    public /* synthetic */ AnonymousClass1HT(String str) {
        this.A00 = str;
    }

    public final boolean accept(File file, String str) {
        return str.startsWith(this.A00);
    }
}
