package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;

/* renamed from: X.2o1  reason: invalid class name and case insensitive filesystem */
public class C59622o1 extends AbstractC53892e0 implements AbstractC48882Od {
    public final long A00;
    public final C02580Cq A01;
    public final String A02;

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 4;
    }

    public C59622o1(C02580Cq r1, File file, long j, long j2, String str) {
        super(file, j);
        this.A01 = r1;
        this.A00 = j2;
        this.A02 = str;
    }

    @Override // X.AbstractC48882Od
    public long A67() {
        return this.A00;
    }

    @Override // X.AbstractC48882Od
    public String A7T() {
        String str = this.A02;
        return str == null ? "application/*" : str;
    }

    @Override // X.AbstractC48882Od
    public Bitmap AQZ(int i) {
        C02580Cq r5 = this.A01;
        AnonymousClass0M3 r0 = super.A00;
        synchronized (r5) {
            AnonymousClass00E.A00();
            Bitmap A04 = r5.A04(r0);
            if (A04 == null) {
                C05440On A0B = r0.A0B();
                if (A0B == null || A0B.A06()) {
                    return null;
                }
                r5.A03.A02(A0B);
                byte[] A08 = A0B.A08();
                if (A08 != null) {
                    A04 = BitmapFactory.decodeByteArray(A08, 0, A08.length, C02580Cq.A08);
                }
            }
            return A04;
        }
    }
}
