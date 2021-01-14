package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.2o2  reason: invalid class name and case insensitive filesystem */
public class C59632o2 extends AbstractC53892e0 implements AbstractC48882Od {
    public final long A00;

    @Override // X.AbstractC48882Od
    public String A7T() {
        return "image/gif";
    }

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 2;
    }

    public C59632o2(File file, long j, long j2) {
        super(file, j);
        this.A00 = j2;
    }

    @Override // X.AbstractC48882Od
    public long A67() {
        return this.A00;
    }

    @Override // X.AbstractC48882Od
    public Bitmap AQZ(int i) {
        return C002001d.A0V(this.A04);
    }
}
