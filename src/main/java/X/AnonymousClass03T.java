package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.03T  reason: invalid class name */
public class AnonymousClass03T {
    public File A00;
    public final AnonymousClass00C A01;
    public final AnonymousClass03S A02;
    public final File A03;

    public AnonymousClass03T(AnonymousClass00C r1, File file, AnonymousClass03S r3) {
        this.A03 = file;
        this.A01 = r1;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01a1 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.File A00(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 432
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03T.A00(java.lang.String):java.io.File");
    }

    public final void A01() {
        File file = this.A03;
        if (file.exists() && !file.isDirectory()) {
            StringBuilder A0S = AnonymousClass008.A0S("trash/create-trash-dir/removing ");
            A0S.append(file);
            Log.w(A0S.toString());
            if (!file.delete() && file.exists()) {
                StringBuilder A0S2 = AnonymousClass008.A0S("trash/create-trash-dir/failed ");
                A0S2.append(file);
                A0S2.append(" is not a directory");
                Log.e(A0S2.toString());
            }
        }
        if (!file.exists()) {
            file.mkdirs();
            if (!file.exists() && !file.mkdir()) {
                Log.w("trash/create-trash-dir/failed");
            }
        }
    }
}
