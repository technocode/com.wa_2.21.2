package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.MediaFormat;
import android.os.Handler;
import java.util.ArrayDeque;

/* renamed from: X.2AL  reason: invalid class name */
public class AnonymousClass2AL extends AbstractC461628i implements AbstractC233315i {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07 = -9223372036854775807L;
    public MediaFormat A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Context A0E;
    public final C225512f A0F;
    public final AnonymousClass12l A0G;
    public final long[] A0H = new long[10];

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2AL(Context context, AnonymousClass13X r5, AnonymousClass138 r6, Handler handler, AbstractC225612g r8, AnonymousClass12Y r9, AbstractC225412e... r10) {
        super(1, r5, r6, 44100.0f);
        C33891hY r2 = new C33891hY(r9, r10);
        this.A0E = context.getApplicationContext();
        this.A0G = r2;
        this.A0F = new C225512f(handler, r8);
        r2.A0Q = new C33911ha(this);
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AbstractC461628i, X.AnonymousClass25L
    public void A04() {
        try {
            this.A07 = -9223372036854775807L;
            this.A05 = 0;
            C33891hY r5 = (C33891hY) this.A0G;
            r5.A01();
            for (AbstractC225412e r0 : r5.A0m) {
                r0.reset();
            }
            for (AbstractC225412e r02 : r5.A0l) {
                r02.reset();
            }
            r5.A01 = 0;
            r5.A0Y = false;
            try {
                super.A04();
                synchronized (super.A0C) {
                }
                this.A0F.A00(super.A0C);
            } catch (Throwable th) {
                synchronized (super.A0C) {
                    this.A0F.A00(super.A0C);
                    throw th;
                }
            }
        } catch (Throwable th2) {
            synchronized (super.A0C) {
                this.A0F.A00(super.A0C);
                throw th2;
            }
        }
    }

    @Override // X.AbstractC461628i, X.AnonymousClass25L
    public void A05(long j, boolean z) {
        super.A05(j, z);
        ((C33891hY) this.A0G).A01();
        this.A06 = j;
        this.A09 = true;
        this.A0A = true;
        this.A07 = -9223372036854775807L;
        this.A05 = 0;
    }

    @Override // X.AbstractC461628i
    public void A0F(AnonymousClass126 r5) {
        int i;
        super.A0F(r5);
        C225512f r3 = this.A0F;
        if (r3.A01 != null) {
            r3.A00.post(new RunnableEBaseShape5S0200000_I1_0(r3, r5, 27));
        }
        if ("audio/raw".equals(r5.A0P)) {
            i = r5.A0A;
        } else {
            i = 2;
        }
        this.A04 = i;
        this.A00 = r5.A05;
        this.A02 = r5.A06;
        this.A03 = r5.A07;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x021b, code lost:
        if (r7.A00() == 0) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0400, code lost:
        if (r8 == 2) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r37 == r1) goto L_0x0062;
     */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0474 A[RETURN] */
    @Override // X.AbstractC461628i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(long r32, long r34, android.media.MediaCodec r36, java.nio.ByteBuffer r37, int r38, int r39, long r40, boolean r42, X.AnonymousClass126 r43) {
        /*
        // Method dump skipped, instructions count: 1176
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AL.A0G(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, X.126):boolean");
    }

    public final int A0H(AnonymousClass13V r4, AnonymousClass126 r5) {
        PackageManager packageManager;
        int i = AnonymousClass0W2.A00;
        if (i >= 24 || !"OMX.google.raw.decoder".equals(r4.A02) || (i == 23 && (packageManager = this.A0E.getPackageManager()) != null && packageManager.hasSystemFeature("android.software.leanback"))) {
            return r5.A09;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: X.12t */
    /* JADX DEBUG: Multi-variable search result rejected for r2v34, resolved type: X.12t */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x018a A[Catch:{ Exception -> 0x01ba }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01b4 A[Catch:{ Exception -> 0x01ba }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0I() {
        /*
        // Method dump skipped, instructions count: 685
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AL.A0I():void");
    }

    @Override // X.AbstractC233315i
    public AnonymousClass12F A8Q() {
        return ((C33891hY) this.A0G).A0O;
    }

    @Override // X.AbstractC233315i
    public long A8V() {
        if (((AnonymousClass25L) this).A01 == 2) {
            A0I();
        }
        return this.A06;
    }

    @Override // X.AbstractC461628i, X.AbstractC33821hR
    public boolean ABS() {
        C33891hY r3 = (C33891hY) this.A0G;
        boolean z = false;
        if (r3.A0M != null) {
            z = true;
        }
        return (z && r3.A0g.A01(r3.A00())) || super.ABS();
    }

    @Override // X.AbstractC233315i
    public AnonymousClass12F AOp(AnonymousClass12F r4) {
        C33891hY r2 = (C33891hY) this.A0G;
        boolean z = false;
        if (r2.A0M != null) {
            z = true;
        }
        if (!z || r2.A0V) {
            AnonymousClass12F r0 = r2.A0N;
            if (r0 == null) {
                ArrayDeque arrayDeque = r2.A0k;
                if (!arrayDeque.isEmpty()) {
                    r0 = ((C226812t) arrayDeque.getLast()).A02;
                } else {
                    r0 = r2.A0O;
                }
            }
            if (!r4.equals(r0)) {
                boolean z2 = false;
                if (r2.A0M != null) {
                    z2 = true;
                }
                if (z2) {
                    r2.A0N = r4;
                } else {
                    r2.A0O = r2.A0i.A25(r4);
                }
            }
            return r2.A0O;
        }
        AnonymousClass12F r02 = AnonymousClass12F.A04;
        r2.A0O = r02;
        return r02;
    }
}
