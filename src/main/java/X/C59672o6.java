package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.2o6  reason: invalid class name and case insensitive filesystem */
public class C59672o6 extends AbstractC53892e0 implements AbstractC48882Od {
    public final long A00;

    @Override // X.AbstractC48882Od
    public String A7T() {
        return "video/*";
    }

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 1;
    }

    public C59672o6(File file, long j, long j2) {
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
