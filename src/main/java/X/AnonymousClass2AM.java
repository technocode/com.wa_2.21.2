package X;

import android.content.Context;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.util.List;

/* renamed from: X.2AM  reason: invalid class name */
public class AnonymousClass2AM extends AbstractC461628i {
    public static boolean A0b;
    public static boolean A0c;
    public static final int[] A0d = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public Surface A0M;
    public Surface A0N;
    public AnonymousClass162 A0O;
    public AnonymousClass163 A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public final int A0T = 50;
    public final long A0U = 5000;
    public final Context A0V;
    public final AnonymousClass167 A0W;
    public final AnonymousClass169 A0X;
    public final boolean A0Y;
    public final long[] A0Z;
    public final long[] A0a;

    public AnonymousClass2AM(Context context, AnonymousClass13X r7, AnonymousClass138 r8, Handler handler, AnonymousClass16A r10) {
        super(2, r7, r8, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.A0V = applicationContext;
        this.A0W = new AnonymousClass167(applicationContext);
        this.A0X = new AnonymousClass169(handler, r10);
        this.A0Y = "NVIDIA".equals(AnonymousClass0W2.A03);
        this.A0Z = new long[10];
        this.A0a = new long[10];
        this.A0L = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A07 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0E = 1;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
    }

    public static int A01(AnonymousClass13V r6, AnonymousClass126 r7) {
        int i = r7.A09;
        if (i == -1) {
            return A02(r6, r7.A0P, r7.A0F, r7.A08);
        }
        List list = r7.A0Q;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += ((byte[]) list.get(i3)).length;
        }
        return i + i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r5.equals("video/mp4v-es") != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r5.equals("video/hevc") != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        r6 = r6 * r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0080, code lost:
        if (r5.equals("video/3gpp") != false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0082, code lost:
        r6 = r6 * r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r5.equals("video/x-vnd.on2.vp9") != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r5.equals("video/x-vnd.on2.vp8") != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A02(X.AnonymousClass13V r4, java.lang.String r5, int r6, int r7) {
        /*
        // Method dump skipped, instructions count: 166
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AM.A02(X.13V, java.lang.String, int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:394:0x0519, code lost:
        if (r1.equals("HWWAS-H") != false) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x0533, code lost:
        if (r4.equals("AFTA") != false) goto L_0x0535;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 1842
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AM.A03(java.lang.String):boolean");
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AbstractC461628i, X.AnonymousClass25L
    public void A04() {
        this.A07 = -1;
        this.A05 = -1;
        this.A00 = -1.0f;
        this.A01 = -1.0f;
        this.A0L = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A09 = 0;
        this.A0D = -1;
        this.A0B = -1;
        this.A02 = -1.0f;
        this.A0C = -1;
        A0I();
        AnonymousClass167 r2 = this.A0W;
        if (r2.A09 != null) {
            AnonymousClass165 r1 = r2.A0A;
            if (r1 != null) {
                r1.A00.unregisterDisplayListener(r1);
            }
            r2.A0B.A02.sendEmptyMessage(2);
        }
        this.A0P = null;
        this.A0S = false;
        try {
            super.A04();
            synchronized (super.A0C) {
            }
            AnonymousClass169 r4 = this.A0X;
            C227412z r3 = super.A0C;
            if (r4.A01 != null) {
                r4.A00.post(new RunnableEBaseShape5S0200000_I1_0(r4, r3, 34));
            }
        } catch (Throwable th) {
            synchronized (super.A0C) {
                AnonymousClass169 r42 = this.A0X;
                C227412z r32 = super.A0C;
                if (r42.A01 != null) {
                    r42.A00.post(new RunnableEBaseShape5S0200000_I1_0(r42, r32, 34));
                }
                throw th;
            }
        }
    }

    @Override // X.AbstractC461628i, X.AnonymousClass25L
    public void A05(long j, boolean z) {
        long j2;
        super.A05(j, z);
        A0I();
        this.A0H = -9223372036854775807L;
        this.A04 = 0;
        this.A0J = -9223372036854775807L;
        int i = this.A09;
        if (i != 0) {
            this.A0L = this.A0Z[i - 1];
            this.A09 = 0;
        }
        if (z) {
            long j3 = this.A0U;
            if (j3 > 0) {
                j2 = SystemClock.elapsedRealtime() + j3;
            } else {
                j2 = -9223372036854775807L;
            }
            this.A0I = j2;
            return;
        }
        this.A0I = -9223372036854775807L;
    }

    @Override // X.AbstractC461628i
    public void A07() {
        super.A07();
        this.A03 = 0;
    }

    @Override // X.AbstractC461628i
    public void A08() {
        try {
            super.A08();
        } finally {
            this.A03 = 0;
            Surface surface = this.A0M;
            if (surface != null) {
                if (this.A0N == surface) {
                    this.A0N = null;
                }
                surface.release();
                this.A0M = null;
            }
        }
    }

    @Override // X.AbstractC461628i
    public void A0F(AnonymousClass126 r5) {
        super.A0F(r5);
        AnonymousClass169 r3 = this.A0X;
        if (r3.A01 != null) {
            r3.A00.post(new RunnableEBaseShape5S0200000_I1_0(r3, r5, 31));
        }
        this.A01 = r5.A02;
        this.A0A = r5.A0B;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0185  */
    @Override // X.AbstractC461628i
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(long r29, long r31, android.media.MediaCodec r33, java.nio.ByteBuffer r34, int r35, int r36, long r37, boolean r39, X.AnonymousClass126 r40) {
        /*
        // Method dump skipped, instructions count: 472
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2AM.A0G(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, X.126):boolean");
    }

    public void A0H() {
        if (!this.A0R) {
            this.A0R = true;
            AnonymousClass169 r4 = this.A0X;
            Surface surface = this.A0N;
            if (r4.A01 != null) {
                r4.A00.post(new RunnableEBaseShape5S0200000_I1_0(r4, surface, 32));
            }
        }
    }

    public final void A0I() {
        MediaCodec mediaCodec;
        this.A0R = false;
        if (AnonymousClass0W2.A00 >= 23 && this.A0S && (mediaCodec = ((AbstractC461628i) this).A08) != null) {
            this.A0P = new AnonymousClass163(this, mediaCodec);
        }
    }

    public final void A0J() {
        int i = this.A08;
        if (i > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.A0G;
            AnonymousClass169 r6 = this.A0X;
            if (r6.A01 != null) {
                r6.A00.post(new RunnableC234615x(r6, i, j));
            }
            this.A08 = 0;
            this.A0G = elapsedRealtime;
        }
    }

    public final void A0K() {
        int i = this.A07;
        if (i != -1 || this.A05 != -1) {
            if (this.A0D != i || this.A0B != this.A05 || this.A0C != this.A06 || this.A02 != this.A00) {
                AnonymousClass169 r2 = this.A0X;
                int i2 = this.A05;
                int i3 = this.A06;
                float f = this.A00;
                if (r2.A01 != null) {
                    r2.A00.post(new RunnableC234515w(r2, i, i2, i3, f));
                }
                this.A0D = this.A07;
                this.A0B = this.A05;
                this.A0C = this.A06;
                this.A02 = this.A00;
            }
        }
    }

    public final void A0L() {
        int i = this.A0D;
        if (i != -1 || this.A0B != -1) {
            AnonymousClass169 r2 = this.A0X;
            int i2 = this.A0B;
            int i3 = this.A0C;
            float f = this.A02;
            if (r2.A01 != null) {
                r2.A00.post(new RunnableC234515w(r2, i, i2, i3, f));
            }
        }
    }

    public void A0M(int i) {
        C227412z r3 = super.A0C;
        r3.A02 += i;
        int i2 = this.A08 + i;
        this.A08 = i2;
        int i3 = this.A04 + i;
        this.A04 = i3;
        r3.A05 = Math.max(i3, r3.A05);
        int i4 = this.A0T;
        if (i4 > 0 && i2 >= i4) {
            A0J();
        }
    }

    public void A0N(MediaCodec mediaCodec, int i) {
        A0K();
        AnonymousClass0N2.A1T("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        AnonymousClass0N2.A0x();
        this.A0K = SystemClock.elapsedRealtime() * 1000;
        super.A0C.A06++;
        this.A04 = 0;
        A0H();
    }

    public final void A0O(MediaCodec mediaCodec, int i, int i2) {
        this.A07 = i;
        this.A05 = i2;
        float f = this.A01;
        this.A00 = f;
        if (AnonymousClass0W2.A00 >= 21) {
            int i3 = this.A0A;
            if (i3 == 90 || i3 == 270) {
                this.A07 = i2;
                this.A05 = i;
                this.A00 = 1.0f / f;
            }
        } else {
            this.A06 = this.A0A;
        }
        mediaCodec.setVideoScalingMode(this.A0E);
    }

    public void A0P(MediaCodec mediaCodec, int i, long j) {
        A0K();
        AnonymousClass0N2.A1T("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        AnonymousClass0N2.A0x();
        this.A0K = SystemClock.elapsedRealtime() * 1000;
        super.A0C.A06++;
        this.A04 = 0;
        A0H();
    }

    public final boolean A0Q(AnonymousClass13V r3) {
        if (AnonymousClass0W2.A00 < 23 || this.A0S || A03(r3.A02)) {
            return false;
        }
        return !r3.A06 || AnonymousClass161.A02(this.A0V);
    }

    @Override // X.AbstractC461628i, X.AbstractC33821hR
    public boolean ABS() {
        Surface surface;
        if (!super.ABS() || (!this.A0R && (((surface = this.A0M) == null || this.A0N != surface) && ((AbstractC461628i) this).A08 != null && !this.A0S))) {
            long j = this.A0I;
            if (j == -9223372036854775807L) {
                return false;
            }
            if (SystemClock.elapsedRealtime() < j) {
                return true;
            }
            this.A0I = -9223372036854775807L;
            return false;
        }
        this.A0I = -9223372036854775807L;
        return true;
    }
}
