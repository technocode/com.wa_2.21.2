package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.356  reason: invalid class name */
public class AnonymousClass356 {
    public File A00;
    public File A01;
    public final String A02;

    public AnonymousClass356(String str) {
        this.A02 = str;
    }

    public File A00(Context context) {
        File file;
        File file2 = this.A01;
        if (file2 == null || !file2.exists() || (file = this.A00) == null || !file.exists()) {
            return null;
        }
        return C002001d.A3E(context) ? this.A00 : this.A01;
    }
}
