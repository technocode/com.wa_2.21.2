package X;

import android.os.SystemClock;

/* renamed from: X.2WY  reason: invalid class name */
public class AnonymousClass2WY implements AnonymousClass2E5 {
    public final /* synthetic */ AnonymousClass2E4 A00;
    public final /* synthetic */ AnonymousClass0YW A01;

    public AnonymousClass2WY(AnonymousClass0YW r1, AnonymousClass2E4 r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public void A00() {
        long j;
        AnonymousClass0YW r7 = this.A01;
        if (r7.A0i) {
            AnonymousClass0XR r8 = r7.A0x;
            AnonymousClass2E6 r1 = r7.A0N;
            Integer valueOf = Integer.valueOf(r1.getCameraApi());
            int cameraType = r1.getCameraType();
            if (r8 != null) {
                C44111zW r12 = new C44111zW();
                r12.A02 = Long.valueOf(SystemClock.elapsedRealtime() - r8.A03);
                r12.A01 = Integer.valueOf(cameraType);
                r12.A00 = valueOf;
                r8.A01(r12);
                r7.A0i = false;
            } else {
                throw null;
            }
        } else {
            AnonymousClass0XR r5 = r7.A0x;
            boolean z = r7.A0h;
            AnonymousClass2E6 r13 = r7.A0N;
            Integer valueOf2 = Integer.valueOf(r13.getCameraApi());
            int cameraType2 = r13.getCameraType();
            if (r5 != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (z) {
                    j = r5.A01;
                } else {
                    j = r5.A02;
                }
                r5.A01 = 0;
                r5.A02 = 0;
                if (j != 0) {
                    int intValue = valueOf2.intValue();
                    int i = !z ? 1 : 0;
                    C44131zY r14 = new C44131zY();
                    r14.A02 = Integer.valueOf(i);
                    r14.A03 = Long.valueOf(elapsedRealtime - j);
                    r14.A01 = Integer.valueOf(cameraType2);
                    r14.A00 = Integer.valueOf(intValue);
                    r5.A01(r14);
                }
            } else {
                throw null;
            }
        }
        r7.A0h = false;
        AnonymousClass02M r3 = r7.A0s;
        r3.A02.post(new RunnableEBaseShape7S0200000_I1_2(this, this.A00, 5));
    }

    public void A01() {
        AnonymousClass0XR r4 = this.A01.A0x;
        if (r4 != null) {
            r4.A04 = SystemClock.elapsedRealtime() - r4.A05;
            return;
        }
        throw null;
    }

    public void A02(int i) {
        AnonymousClass02M r2 = this.A01.A0s;
        r2.A02.post(new RunnableEBaseShape1S0101000_I1(this, i, 9));
    }

    public void A03(AnonymousClass1Fh r5) {
        String str = r5.A01;
        AnonymousClass0YW r2 = this.A01;
        if (!r2.A0X.A02(str, true, 1)) {
            AnonymousClass02M r22 = r2.A0s;
            r22.A02.post(new RunnableEBaseShape8S0100000_I1_3(this, 8));
        }
    }

    public void A04(boolean z) {
        AnonymousClass02M r2 = this.A01.A0s;
        r2.A02.post(new RunnableEBaseShape1S0110000_I1(this, z, 5));
    }
}
