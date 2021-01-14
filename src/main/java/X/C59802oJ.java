package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2oJ  reason: invalid class name and case insensitive filesystem */
public class C59802oJ extends AbstractC54052eH implements AbstractC48882Od {
    public static final AnonymousClass00Z A01 = new AnonymousClass00Z(1, 20, 2000, true);
    public final AnonymousClass0XO A00;

    @Override // X.AbstractC48882Od
    public int A9V() {
        return 1;
    }

    public C59802oJ(AnonymousClass00G r12, AnonymousClass0XO r13, C007703s r14, long j, int i, Uri uri, String str, String str2, long j2, long j3) {
        super(r12, j, uri, str, str2, j2, j3);
        this.A00 = r13;
    }

    @Override // X.AbstractC48882Od
    public Bitmap AQZ(int i) {
        File file;
        Bitmap A0X;
        File file2;
        AnonymousClass0XO r0 = this.A00;
        AnonymousClass00Z r6 = A01;
        AnonymousClass00Y r5 = r0.A00;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String A5w = A5w();
        if (i < 144) {
            if (A5w == null) {
                file2 = null;
            } else {
                file2 = new File(A5w);
            }
            A0X = C002001d.A0X(file2, new C04860Mc(96));
        } else {
            if (A5w == null) {
                file = null;
            } else {
                file = new File(A5w);
            }
            A0X = C002001d.A0X(file, new C04860Mc(512));
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            StringBuilder sb = new StringBuilder();
            sb.append("PerfTimer(");
            sb.append("gallerypicker/video/thumb");
            sb.append(") done in ");
            sb.append(elapsedRealtime2);
            Log.d(sb.toString());
            C44001zL r1 = new C44001zL();
            r1.A00 = Long.valueOf(elapsedRealtime2);
            r1.A02 = "gallerypicker/video/thumb";
            r1.A01 = null;
            r5.A0B(r1, r6, false);
            return A0X;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("PerfTimer(");
        sb2.append("gallerypicker/video/thumb");
        sb2.append(") already stopped");
        AnonymousClass00E.A08(false, sb2.toString());
        return A0X;
    }

    @Override // X.AbstractC54052eH
    public boolean equals(Object obj) {
        return (obj instanceof C59802oJ) && this.A04.equals(((AbstractC54052eH) obj).A04);
    }

    @Override // X.AbstractC54052eH
    public int hashCode() {
        return this.A04.toString().hashCode();
    }

    @Override // X.AbstractC54052eH
    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("VideoObject");
        A0S.append(this.A02);
        return A0S.toString();
    }
}
