package X;

import android.net.Uri;
import com.whatsapp.util.Log;

/* renamed from: X.2nq  reason: invalid class name and case insensitive filesystem */
public class C59542nq extends C53542dR implements AbstractC03150Ez {
    public final C56862jJ A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59542nq(android.content.Context r2, X.C56862jJ r3) {
        /*
            r1 = this;
            X.0Ey r0 = r3.A07
            java.lang.Object r0 = r0.A00()
            X.1WE r0 = (X.AnonymousClass1WE) r0
            if (r0 == 0) goto L_0x0016
            java.io.File r0 = r0.A01
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
        L_0x0010:
            r1.<init>(r2, r0)
            r1.A00 = r3
            return
        L_0x0016:
            r0 = 0
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59542nq.<init>(android.content.Context, X.2jJ):void");
    }

    @Override // X.AbstractC03150Ez
    public void A1e(Object obj) {
        Uri fromFile = Uri.fromFile(((AnonymousClass1WE) obj).A01);
        synchronized (this.A04) {
            if (!fromFile.equals(this.A01)) {
                StringBuilder sb = new StringBuilder();
                sb.append("whatsappswappableuridatasource/swap uri to ");
                sb.append(fromFile);
                Log.d(sb.toString());
                this.A01 = fromFile;
                this.A02 = true;
            }
        }
    }

    @Override // X.AnonymousClass15E, X.C53542dR
    public long ALs(AnonymousClass15G r3) {
        this.A00.A07.A03(this, null);
        return super.ALs(r3);
    }

    @Override // X.AnonymousClass15E, X.C53542dR
    public void close() {
        this.A00.A07.A02(this);
        super.close();
    }
}
