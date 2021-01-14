package X;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.28i  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC461628i extends AnonymousClass25L {
    public static final byte[] A0j;
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public MediaCodec A08;
    public AnonymousClass126 A09;
    public AnonymousClass126 A0A;
    public AnonymousClass126 A0B;
    public C227412z A0C;
    public AnonymousClass13V A0D;
    public AnonymousClass13W A0E;
    public ByteBuffer A0F;
    public ArrayDeque A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public ByteBuffer[] A0Y;
    public ByteBuffer[] A0Z;
    public final float A0a;
    public final MediaCodec.BufferInfo A0b;
    public final AnonymousClass127 A0c;
    public final C33961hf A0d;
    public final C33961hf A0e;
    public final AnonymousClass138 A0f;
    public final AnonymousClass13X A0g;
    public final C234415v A0h;
    public final List A0i;

    public abstract boolean A0G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z, AnonymousClass126 v);

    static {
        int length = "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".length() >> 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            bArr[i] = (byte) (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2 + 1), 16) + (Character.digit("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78".charAt(i2), 16) << 4));
        }
        A0j = bArr;
    }

    public AbstractC461628i(int i, AnonymousClass13X r6, AnonymousClass138 r7, float f) {
        super(i);
        C002001d.A3A(AnonymousClass0W2.A00 >= 16);
        this.A0g = r6;
        this.A0f = r7;
        this.A0a = f;
        this.A0d = new C33961hf(0);
        this.A0e = new C33961hf(0);
        this.A0c = new AnonymousClass127();
        this.A0h = new C234415v();
        this.A0i = new ArrayList();
        this.A0b = new MediaCodec.BufferInfo();
        this.A03 = 0;
        this.A04 = 0;
        this.A00 = -1.0f;
        this.A01 = 1.0f;
    }

    @Override // X.AnonymousClass25L
    public void A04() {
        this.A09 = null;
        this.A0G = null;
        A08();
    }

    @Override // X.AnonymousClass25L
    public void A05(long j, boolean z) {
        this.A0T = false;
        this.A0U = false;
        if (this.A08 != null) {
            A07();
        }
        this.A0h.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass126 A06(long r12) {
        /*
            r11 = this;
            X.15v r7 = r11.A0h
            monitor-enter(r7)
            r10 = 0
            r2 = r10
        L_0x0005:
            int r8 = r7.A01     // Catch:{ all -> 0x0030 }
            if (r8 <= 0) goto L_0x0028
            long[] r0 = r7.A02     // Catch:{ all -> 0x0030 }
            int r9 = r7.A00     // Catch:{ all -> 0x0030 }
            r0 = r0[r9]     // Catch:{ all -> 0x0030 }
            long r5 = r12 - r0
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0028
            java.lang.Object[] r0 = r7.A03     // Catch:{ all -> 0x0030 }
            r2 = r0[r9]     // Catch:{ all -> 0x0030 }
            r0[r9] = r10     // Catch:{ all -> 0x0030 }
            int r1 = r9 + 1
            int r0 = r0.length     // Catch:{ all -> 0x0030 }
            int r1 = r1 % r0
            r7.A00 = r1     // Catch:{ all -> 0x0030 }
            int r0 = r8 + -1
            r7.A01 = r0     // Catch:{ all -> 0x0030 }
            goto L_0x0005
        L_0x0028:
            monitor-exit(r7)
            X.126 r2 = (X.AnonymousClass126) r2
            if (r2 == 0) goto L_0x002f
            r11.A0A = r2
        L_0x002f:
            return r2
        L_0x0030:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC461628i.A06(long):X.126");
    }

    public void A07() {
        this.A07 = -9223372036854775807L;
        A0C();
        this.A06 = -1;
        this.A0F = null;
        this.A0X = true;
        this.A0W = false;
        this.A0i.clear();
        this.A0I = false;
        this.A0V = false;
        if (this.A0N || (this.A0K && this.A0R)) {
            A08();
            A0A();
        } else if (this.A04 != 0) {
            A08();
            A0A();
        } else {
            this.A08.flush();
            this.A0Q = false;
        }
        if (this.A0S && this.A09 != null) {
            this.A03 = 1;
        }
    }

    public void A08() {
        this.A07 = -9223372036854775807L;
        A0C();
        this.A06 = -1;
        this.A0F = null;
        this.A0W = false;
        this.A0i.clear();
        if (AnonymousClass0W2.A00 < 21) {
            this.A0Y = null;
            this.A0Z = null;
        }
        this.A0D = null;
        this.A0S = false;
        this.A0Q = false;
        this.A0J = false;
        this.A0N = false;
        this.A02 = 0;
        this.A0P = false;
        this.A0K = false;
        this.A0O = false;
        this.A0I = false;
        this.A0V = false;
        this.A0M = false;
        this.A0R = false;
        this.A03 = 0;
        this.A04 = 0;
        this.A0H = false;
        MediaCodec mediaCodec = this.A08;
        if (mediaCodec != null) {
            this.A0C.A01++;
            try {
                mediaCodec.stop();
                try {
                    this.A08.release();
                } finally {
                }
            } catch (Throwable th) {
                this.A08.release();
                throw th;
            } finally {
                this.A08 = null;
            }
        }
    }

    public void A09() {
        if (this instanceof AnonymousClass2AL) {
            AnonymousClass2AL r7 = (AnonymousClass2AL) this;
            try {
                C33891hY r8 = (C33891hY) r7.A0G;
                if (!r8.A0W) {
                    boolean z = false;
                    if (r8.A0M != null) {
                        z = true;
                    }
                    if (z && r8.A06()) {
                        C226412p r6 = r8.A0g;
                        long A002 = r8.A00();
                        r6.A0F = r6.A00();
                        r6.A0G = SystemClock.elapsedRealtime() * 1000;
                        r6.A06 = A002;
                        r8.A0M.stop();
                        r8.A03 = 0;
                        r8.A0W = true;
                    }
                }
            } catch (C226012k e) {
                throw new AnonymousClass11w(1, e, ((AnonymousClass25L) r7).A00);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:119:0x024c, code lost:
        if (r4.A08 == -1) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x033e, code lost:
        r11 = java.lang.Math.max(r11, r14.x);
        r10 = java.lang.Math.max(r10, r14.y);
        r9 = java.lang.Math.max(r9, X.AnonymousClass2AM.A02(r2, r2.A0P, r11, r10));
        r2 = new java.lang.StringBuilder("Codec max resolution adjusted to: ");
        r2.append(r11);
        r2.append("x");
        r2.append(r10);
        android.util.Log.w("MediaCodecVideoRenderer", r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05e1, code lost:
        if ("OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(r6) == false) goto L_0x05e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05f9, code lost:
        if ("OMX.MTK.VIDEO.DECODER.AVC".equals(r6) == false) goto L_0x05fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0638, code lost:
        if ("stvm8".equals(r8) == false) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0648, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r6) == false) goto L_0x06db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0656, code lost:
        if ("OMX.google.aac.decoder".equals(r6) == false) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x066c, code lost:
        if ("OMX.MTK.AUDIO.DECODER.MP3".equals(r6) != false) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        if (r3 != false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x06d3, code lost:
        if (r2 != false) goto L_0x069f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01a2, code lost:
        if (r3.startsWith("ms01") == false) goto L_0x0160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01e4 A[Catch:{ Exception -> 0x0507 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0314 A[Catch:{ Exception -> 0x0507 }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x048e A[Catch:{ Exception -> 0x0507 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x04bd A[Catch:{ Exception -> 0x0507 }] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x033e A[EDGE_INSN: B:362:0x033e->B:158:0x033e ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x017c A[Catch:{ Exception -> 0x0507 }] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01b2 A[Catch:{ Exception -> 0x0507 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01dd A[Catch:{ Exception -> 0x0507 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A() {
        /*
        // Method dump skipped, instructions count: 1858
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC461628i.A0A():void");
    }

    public final void A0B() {
        if (this.A04 == 2) {
            A08();
            A0A();
            return;
        }
        this.A0U = true;
        A09();
    }

    public final void A0C() {
        this.A05 = -1;
        this.A0d.A01 = null;
    }

    public final void A0D() {
        float f;
        if (this.A09 != null && AnonymousClass0W2.A00 >= 23) {
            float f2 = this.A01;
            AnonymousClass126[] r7 = super.A07;
            if (!(this instanceof AnonymousClass2AM)) {
                int i = -1;
                for (AnonymousClass126 r0 : r7) {
                    int i2 = r0.A0C;
                    if (i2 != -1) {
                        i = Math.max(i, i2);
                    }
                }
                f = i == -1 ? -1.0f : f2 * ((float) i);
            } else {
                float f3 = -1.0f;
                float f4 = -1.0f;
                for (AnonymousClass126 r02 : r7) {
                    float f5 = r02.A01;
                    if (f5 != -1.0f) {
                        f4 = Math.max(f4, f5);
                    }
                }
                if (f4 != -1.0f) {
                    f3 = f4 * f2;
                }
                f = f3;
            }
            if (this.A00 != f) {
                this.A00 = f;
                if (this.A08 != null && this.A04 == 0) {
                    if (f == -1.0f && this.A0H) {
                        this.A0G = null;
                        if (this.A0Q) {
                            this.A04 = 1;
                            return;
                        }
                        A08();
                        A0A();
                    } else if (f != -1.0f) {
                        if (this.A0H || f > this.A0a) {
                            Bundle bundle = new Bundle();
                            bundle.putFloat("operating-rate", f);
                            this.A08.setParameters(bundle);
                            this.A0H = true;
                        }
                    }
                }
            }
        }
    }

    public void A0E(long j) {
        if (!(this instanceof AnonymousClass2AM)) {
            AnonymousClass2AL r6 = (AnonymousClass2AL) this;
            while (true) {
                int i = r6.A05;
                if (i != 0) {
                    long[] jArr = r6.A0H;
                    if (j >= jArr[0]) {
                        C33891hY r2 = (C33891hY) r6.A0G;
                        if (r2.A0D == 1) {
                            r2.A0D = 2;
                        }
                        int i2 = i - 1;
                        r6.A05 = i2;
                        System.arraycopy(jArr, 1, jArr, 0, i2);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            AnonymousClass2AM r7 = (AnonymousClass2AM) this;
            r7.A03--;
            while (true) {
                int i3 = r7.A09;
                if (i3 != 0) {
                    long[] jArr2 = r7.A0a;
                    if (j >= jArr2[0]) {
                        long[] jArr3 = r7.A0Z;
                        r7.A0L = jArr3[0];
                        int i4 = i3 - 1;
                        r7.A09 = i4;
                        System.arraycopy(jArr3, 1, jArr3, 0, i4);
                        System.arraycopy(jArr2, 1, jArr2, 0, r7.A09);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r8.A07 == 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007e, code lost:
        if (r2.A08 == r4.A08) goto L_0x0080;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0F(X.AnonymousClass126 r12) {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC461628i.A0F(X.126):void");
    }

    @Override // X.AbstractC33821hR
    public boolean AB1() {
        if (!(this instanceof AnonymousClass2AL)) {
            return this.A0U;
        }
        AnonymousClass2AL r1 = (AnonymousClass2AL) this;
        if (r1.A0U) {
            C33891hY r3 = (C33891hY) r1.A0G;
            boolean z = false;
            if (r3.A0M != null) {
                z = true;
            }
            if (!z) {
                return true;
            }
            if (!r3.A0W || (z && r3.A0g.A01(r3.A00()))) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // X.AbstractC33821hR
    public boolean ABS() {
        boolean ABS;
        if (this.A09 == null) {
            return false;
        }
        if (super.A05) {
            ABS = super.A06;
        } else {
            ABS = super.A04.ABS();
        }
        if (!ABS && this.A06 < 0) {
            long j = this.A07;
            if (j == -9223372036854775807L || SystemClock.elapsedRealtime() >= j) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v23, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r3v24, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x03a9, code lost:
        throw new X.C225712h(X.AnonymousClass008.A0F("Unsupported channel count: ", r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01a5, code lost:
        if (r5 == 4) goto L_0x01a7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x023b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0253  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02a4  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x045e A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0460  */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x039e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:412:0x043c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c7  */
    @Override // X.AbstractC33821hR
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AMl(long r28, long r30) {
        /*
        // Method dump skipped, instructions count: 1744
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC461628i.AMl(long, long):void");
    }
}
