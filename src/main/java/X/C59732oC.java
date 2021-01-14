package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.2oC  reason: invalid class name and case insensitive filesystem */
public class C59732oC extends AbstractC54052eH implements AbstractC48882Od {
    @Override // X.AbstractC48882Od
    public int A9V() {
        return 2;
    }

    public C59732oC(AnonymousClass00G r1, long j, Uri uri, String str, String str2, long j2, long j3) {
        super(r1, j, uri, str, str2, j2, j3);
    }

    @Override // X.AbstractC48882Od
    public Bitmap AQZ(int i) {
        File file;
        String A5w = A5w();
        if (A5w == null) {
            file = null;
        } else {
            file = new File(A5w);
        }
        return C002001d.A0V(file);
    }
}
