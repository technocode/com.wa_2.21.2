package X;

import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.2yw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64872yw implements FilenameFilter {
    public final /* synthetic */ String A00;

    public /* synthetic */ C64872yw(String str) {
        this.A00 = str;
    }

    public final boolean accept(File file, String str) {
        return str.endsWith(this.A00);
    }
}
