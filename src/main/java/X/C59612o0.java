package X;

import android.graphics.Bitmap;
import java.io.File;

/* renamed from: X.2o0  reason: invalid class name and case insensitive filesystem */
public class C59612o0 extends AbstractC53892e0 implements AbstractC48882Od {
    public final long A00;

    @Override // X.AbstractC48882Od
    public String A7T() {
        return "audio/*";
    }

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 3;
    }

    @Override // X.AbstractC48882Od
    public Bitmap AQZ(int i) {
        return null;
    }

    public C59612o0(File file, long j, long j2) {
        super(file, j);
        this.A00 = j2;
    }

    @Override // X.AbstractC48882Od
    public long A67() {
        return this.A00;
    }
}
