package X;

import com.whatsapp.util.Log;

/* renamed from: X.3N2  reason: invalid class name */
public class AnonymousClass3N2 implements AbstractC655430e {
    public final AnonymousClass0P7 A00;

    @Override // X.AbstractC655430e
    public int A7U() {
        return 21;
    }

    public AnonymousClass3N2(AnonymousClass0P7 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    @Override // X.AbstractC655430e
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A2z() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3N2.A2z():void");
    }

    @Override // X.AbstractC655430e
    public boolean ABV() {
        AnonymousClass0P7 r2 = this.A00;
        boolean z = false;
        if (r2.A01(12) != null) {
            z = true;
        }
        if (!z) {
            boolean z2 = false;
            if (r2.A01(13) != null) {
                z2 = true;
            }
            return z2;
        }
    }

    @Override // X.AbstractC655430e
    public void ANP() {
        this.A00.A04();
    }

    @Override // X.AbstractC655430e
    public void cancel() {
        AnonymousClass0P7 r1 = this.A00;
        if (r1 != null) {
            Log.d("SchExpJobs/manual_pre_periodic/cancel;");
            r1.A06(12);
            r1.A06(13);
            return;
        }
        throw null;
    }
}
