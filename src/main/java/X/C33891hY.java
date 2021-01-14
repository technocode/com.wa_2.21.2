package X;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: X.1hY  reason: invalid class name and case insensitive filesystem */
public final class C33891hY implements AnonymousClass12l {
    public float A00;
    public int A01;
    public int A02;
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
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;
    public AnonymousClass12F A0N;
    public AnonymousClass12F A0O;
    public AnonymousClass12X A0P;
    public AbstractC225912j A0Q;
    public C226512q A0R;
    public ByteBuffer A0S;
    public ByteBuffer A0T;
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public byte[] A0b;
    public AbstractC225412e[] A0c;
    public ByteBuffer[] A0d;
    public final ConditionVariable A0e = new ConditionVariable(true);
    public final AnonymousClass12Y A0f;
    public final C226412p A0g = new C226412p(new C33881hX(this));
    public final C33861hV A0h;
    public final AbstractC226712s A0i;
    public final C33951he A0j;
    public final ArrayDeque A0k;
    public final AbstractC225412e[] A0l;
    public final AbstractC225412e[] A0m;

    public C33891hY(AnonymousClass12Y r9, AbstractC225412e[] r10) {
        C33871hW r7 = new C33871hW(r10);
        this.A0f = r9;
        this.A0i = r7;
        C33861hV r5 = new C33861hV();
        this.A0h = r5;
        C33951he r4 = new C33951he();
        this.A0j = r4;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C33921hb(), r5, r4);
        Collections.addAll(arrayList, r7.A02);
        this.A0m = (AbstractC225412e[]) arrayList.toArray(new AbstractC225412e[arrayList.size()]);
        this.A0l = new AbstractC225412e[]{new C33901hZ()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0P = AnonymousClass12X.A02;
        this.A01 = 0;
        this.A0R = new C226512q();
        this.A0O = AnonymousClass12F.A04;
        this.A04 = -1;
        this.A0c = new AbstractC225412e[0];
        this.A0d = new ByteBuffer[0];
        this.A0k = new ArrayDeque();
    }

    public final long A00() {
        return this.A0X ? this.A0L / ((long) this.A09) : this.A0K;
    }

    public void A01() {
        boolean z = false;
        if (this.A0M != null) {
            z = true;
        }
        if (z) {
            this.A0J = 0;
            this.A0I = 0;
            this.A0L = 0;
            this.A0K = 0;
            this.A05 = 0;
            AnonymousClass12F r0 = this.A0N;
            if (r0 != null) {
                this.A0O = r0;
                this.A0N = null;
            } else {
                ArrayDeque arrayDeque = this.A0k;
                if (!arrayDeque.isEmpty()) {
                    this.A0O = ((C226812t) arrayDeque.getLast()).A02;
                }
            }
            this.A0k.clear();
            this.A0F = 0;
            this.A0G = 0;
            this.A0j.A07 = 0;
            this.A0T = null;
            this.A0U = null;
            int i = 0;
            while (true) {
                AbstractC225412e[] r1 = this.A0c;
                if (i >= r1.length) {
                    break;
                }
                AbstractC225412e r02 = r1[i];
                r02.flush();
                this.A0d[i] = r02.A7l();
                i++;
            }
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            C226412p r4 = this.A0g;
            AudioTrack audioTrack = r4.A0H;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() == 3) {
                    this.A0M.pause();
                }
                AudioTrack audioTrack2 = this.A0M;
                this.A0M = null;
                r4.A0E = 0;
                r4.A04 = 0;
                r4.A01 = 0;
                r4.A09 = 0;
                r4.A0H = null;
                r4.A0I = null;
                this.A0e.close();
                new C226612r(this, audioTrack2).start();
                return;
            }
            throw null;
        }
    }

    public final void A02() {
        boolean z = false;
        if (this.A0M != null) {
            z = true;
        }
        if (!z) {
            return;
        }
        if (AnonymousClass0W2.A00 >= 21) {
            this.A0M.setVolume(this.A00);
            return;
        }
        AudioTrack audioTrack = this.A0M;
        float f = this.A00;
        audioTrack.setStereoVolume(f, f);
    }

    public final void A03() {
        ArrayList arrayList = new ArrayList();
        AbstractC225412e[] r4 = this.A0m;
        for (AbstractC225412e r1 : r4) {
            if (r1.AAt()) {
                arrayList.add(r1);
            } else {
                r1.flush();
            }
        }
        int size = arrayList.size();
        this.A0c = (AbstractC225412e[]) arrayList.toArray(new AbstractC225412e[size]);
        this.A0d = new ByteBuffer[size];
        int i = 0;
        while (true) {
            AbstractC225412e[] r12 = this.A0c;
            if (i < r12.length) {
                AbstractC225412e r0 = r12[i];
                r0.flush();
                this.A0d[i] = r0.A7l();
                i++;
            } else {
                return;
            }
        }
    }

    public final void A04(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0c.length;
        int i = length;
        do {
            if (i <= 0) {
                byteBuffer = this.A0T;
                if (byteBuffer == null) {
                    byteBuffer = AbstractC225412e.A00;
                }
            } else {
                byteBuffer = this.A0d[i - 1];
            }
            if (i == length) {
                A05(byteBuffer, j);
            } else {
                AbstractC225412e r0 = this.A0c[i];
                r0.AMH(byteBuffer);
                ByteBuffer A7l = r0.A7l();
                this.A0d[i] = A7l;
                if (A7l.hasRemaining()) {
                    i++;
                    continue;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
                continue;
            } else {
                return;
            }
        } while (i >= 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00cc, code lost:
        if (r0 < r1) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.nio.ByteBuffer r10, long r11) {
        /*
        // Method dump skipped, instructions count: 275
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33891hY.A05(java.nio.ByteBuffer, long):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06() {
        /*
            r9 = this;
            int r0 = r9.A04
            r8 = -1
            r7 = 1
            r6 = 0
            if (r0 != r8) goto L_0x0034
            boolean r0 = r9.A0Z
            if (r0 == 0) goto L_0x0030
            r0 = 0
        L_0x000c:
            r9.A04 = r0
        L_0x000e:
            r5 = 1
        L_0x000f:
            X.12e[] r4 = r9.A0c
            int r3 = r4.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 >= r3) goto L_0x0036
            r0 = r4[r0]
            if (r5 == 0) goto L_0x0020
            r0.AMG()
        L_0x0020:
            r9.A04(r1)
            boolean r0 = r0.AB1()
            if (r0 != 0) goto L_0x002a
            return r6
        L_0x002a:
            int r0 = r9.A04
            int r0 = r0 + r7
            r9.A04 = r0
            goto L_0x000e
        L_0x0030:
            X.12e[] r0 = r9.A0c
            int r0 = r0.length
            goto L_0x000c
        L_0x0034:
            r5 = 0
            goto L_0x000f
        L_0x0036:
            java.nio.ByteBuffer r0 = r9.A0U
            if (r0 == 0) goto L_0x0042
            r9.A05(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0U
            if (r0 == 0) goto L_0x0042
            return r6
        L_0x0042:
            r9.A04 = r8
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33891hY.A06():boolean");
    }

    public boolean A07(int i, int i2) {
        if (!AnonymousClass0W2.A07(i2)) {
            AnonymousClass12Y r1 = this.A0f;
            if (r1 == null || Arrays.binarySearch(r1.A01, i2) < 0) {
                return false;
            }
            if (i == -1 || i <= r1.A00) {
                return true;
            }
            return false;
        } else if (i2 != 4 || AnonymousClass0W2.A00 >= 21) {
            return true;
        } else {
            return false;
        }
    }
}
