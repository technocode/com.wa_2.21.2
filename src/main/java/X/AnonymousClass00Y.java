package X;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.util.Log;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.00Y  reason: invalid class name */
public class AnonymousClass00Y {
    public static volatile AnonymousClass00Y A0L;
    public C05600Pi A00;
    public C05600Pi A01;
    public C05600Pi A02;
    public AnonymousClass0Q3 A03;
    public AnonymousClass0Q3 A04;
    public AnonymousClass0Q3 A05;
    public AnonymousClass0KT A06;
    public AnonymousClass0KT A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final AnonymousClass00D A0B;
    public final AnonymousClass03O A0C;
    public final AnonymousClass038 A0D;
    public final AnonymousClass03K A0E;
    public final AnonymousClass03J A0F;
    public final CountDownLatch A0G = new CountDownLatch(1);
    public final CountDownLatch A0H = new CountDownLatch(1);
    public final CountDownLatch A0I = new CountDownLatch(1);
    public volatile int A0J;
    public volatile boolean A0K;

    public AnonymousClass00Y(AnonymousClass03J r3, AnonymousClass03K r4, AnonymousClass038 r5, AnonymousClass00D r6, AnonymousClass03O r7) {
        this.A0F = r3;
        this.A0E = r4;
        this.A0D = r5;
        this.A0B = r6;
        this.A0C = r7;
    }

    public static AnonymousClass00Y A00() {
        if (A0L == null) {
            synchronized (AnonymousClass00Y.class) {
                if (A0L == null) {
                    A0L = new AnonymousClass00Y(AnonymousClass03J.A00(), AnonymousClass03K.A02(), AnonymousClass038.A00(), AnonymousClass00D.A00(), AnonymousClass03O.A00());
                }
            }
        }
        return A0L;
    }

    public static final void A01(AnonymousClass00X r2, String str) {
        if (r2 instanceof WamCall) {
            StringBuilder A0Z = AnonymousClass008.A0Z("wamruntime/printevent", str, ": ");
            A0Z.append(r2.toString());
            Log.i(A0Z.toString());
        }
    }

    public final int A02(boolean z) {
        if (this.A0J > 0) {
            int currentTimeMillis = ((int) (System.currentTimeMillis() / 1000)) % 86400;
            if (currentTimeMillis < 90 || currentTimeMillis > 86370 || Math.abs(currentTimeMillis - 7200) < 30) {
                return new Random().nextInt(this.A0J << 1) + 10;
            }
            if (!z) {
                return new Random().nextInt(this.A0J) + 5;
            }
        }
        return 0;
    }

    public final Integer A03(int i, AnonymousClass00Z r5, boolean z) {
        int i2 = this.A0C.A00.getInt(String.valueOf(i), 0);
        if (i2 != 0) {
            int abs = Math.abs(i2);
            r5 = new AnonymousClass00Z(abs, abs, abs, false);
        } else {
            i2 = r5.A00;
            if (z) {
                i2 = -i2;
            }
        }
        if (r5.A00()) {
            return Integer.valueOf(i2);
        }
        return null;
    }

    public void A04() {
        this.A0F.A01.execute(new RunnableEBaseShape3S0100000_I0_3(this, 1));
    }

    public final void A05() {
        if (this.A04.A00() > this.A02.A02.A3X().A04.A05.remaining() && !this.A02.A02.A3X().A04()) {
            if (this.A02.A02.A2U()) {
                this.A02.A02();
                this.A04.A01();
            } else {
                A06();
                return;
            }
        }
        if (this.A04.A00() > this.A02.A00()) {
            Log.e("wamruntime/logevent: dropping wam real time event because it is larger than the buffer itself");
            return;
        }
        C05600Pi r2 = this.A02;
        AnonymousClass0Q3 r0 = this.A04;
        r2.A03(r0.A00, r0.A01);
        this.A02.A01();
        this.A07.ANb(this.A02, false);
    }

    public final void A06() {
        AnonymousClass03K r4 = this.A0E;
        Long l = r4.A0I;
        if (l == null) {
            r4.A0I = 0L;
            l = 0L;
        }
        Long l2 = r4.A0J;
        if (l2 == null) {
            r4.A0J = 0L;
            l2 = 0L;
        }
        r4.A0I = AnonymousClass008.A05(l);
        r4.A0J = Long.valueOf(l2.longValue() + ((long) this.A05.A00()));
        r4.A07();
        Log.w("wamruntime/logevent: no room for a new event record");
    }

    public void A07(AnonymousClass00X r3) {
        A0B(r3, null, false);
    }

    public void A08(AnonymousClass00X r3, int i) {
        A09(r3, i);
        StringBuilder sb = new StringBuilder("(with weight=");
        sb.append(i);
        sb.append(")");
        A01(r3, sb.toString());
    }

    public final void A09(AnonymousClass00X r3, int i) {
        if (r3.channel != 2) {
            this.A0F.A01.execute(new RunnableEBaseShape0S0201000_I0(this, i, r3, 15));
        } else if (this.A0K) {
            this.A0F.A02.execute(new RunnableEBaseShape0S0201000_I0(this, i, r3, 14));
        }
    }

    public final void A0A(AnonymousClass00X r3, int i, boolean z) {
        if (A0F()) {
            this.A05.A04(r3, i);
            this.A05.A01();
            A0E(z);
            AnonymousClass03K r1 = this.A0E;
            if (r3 == r1) {
                r1.A0I = null;
                r1.A0J = null;
                ((AnonymousClass03L) r1).A00 = null;
                r1.A0K = null;
                r1.A0L = null;
                r1.A0M = null;
                r1.A0N = null;
                r1.A01 = null;
                r1.A02 = null;
                r1.A03 = null;
                r1.A04 = null;
                r1.A05 = null;
                r1.A06 = null;
                r1.A07 = null;
                r1.A08 = null;
                r1.A09 = null;
                r1.A0A = null;
                r1.A0B = null;
                r1.A0C = null;
                r1.A0D = null;
                r1.A0E = null;
                r1.A0F = null;
                r1.A0G = null;
                r1.A0H = null;
                r1.A07();
            }
            if (!z) {
                this.A00.A01();
            }
        }
    }

    public void A0B(AnonymousClass00X r4, AnonymousClass00Z r5, boolean z) {
        String str;
        int i = r4.code;
        if (r5 == null) {
            r5 = r4.samplingRate;
        }
        Integer A032 = A03(i, r5, z);
        if (A032 != null) {
            A09(r4, A032.intValue());
            StringBuilder sb = new StringBuilder("(sampled with weight ");
            sb.append(A032);
            sb.append(")");
            str = sb.toString();
        } else {
            str = "(dropped)";
        }
        A01(r4, str);
    }

    public final void A0C(CountDownLatch countDownLatch) {
        if (countDownLatch == this.A0H) {
            this.A0F.A02.A00();
        } else {
            this.A0F.A01.A00();
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            StringBuilder sb = new StringBuilder("wamruntime: unexpected thread interrupt (");
            sb.append(e);
            sb.append(")");
            Log.a(sb.toString());
            Thread.currentThread().interrupt();
        }
    }

    public void A0D(boolean z) {
        synchronized (this) {
            boolean z2 = this.A0K;
            this.A0K = z;
            if (!z2 && z) {
                this.A0F.A02.execute(new RunnableEBaseShape3S0100000_I0_3(this, 3));
            }
        }
    }

    public final void A0E(boolean z) {
        if (this.A05.A00() > this.A00.A02.A3X().A04.A05.remaining() && !this.A00.A02.A3X().A04()) {
            if (this.A00.A02.A2U()) {
                this.A00.A02();
                AnonymousClass008.A0n(this.A0B, "wam_is_current_buffer_real_time", false);
                this.A05.A01();
            } else {
                A06();
                return;
            }
        }
        if (this.A05.A00() > this.A00.A00()) {
            Log.e("wamruntime/logevent: dropping event because it is larger than the buffer itself");
            return;
        }
        C05600Pi r2 = this.A00;
        AnonymousClass0Q3 r0 = this.A05;
        r2.A03(r0.A00, r0.A01);
        C05600Pi r3 = this.A00;
        C05740Pw A3X = r3.A02.A3X();
        if (!A3X.A03()) {
            throw new UnsupportedOperationException("No event count available for rotated buffers");
        } else if (A3X.A00 == 1 && !z) {
            if (!r3.A04) {
                this.A0E.A0C = Boolean.TRUE;
            }
            AnonymousClass03K r1 = this.A0E;
            if (!r1.A00()) {
                A0A(r1, 0, true);
            }
        }
    }

    public final boolean A0F() {
        if (!this.A08) {
            A0C(this.A0G);
            this.A0D.A01(0);
            this.A08 = true;
        }
        return this.A00.A04;
    }

    public final boolean A0G() {
        if (!this.A09) {
            A0C(this.A0H);
            this.A0D.A01(2);
            this.A09 = true;
        }
        return this.A01.A04;
    }

    public final boolean A0H() {
        if (!this.A0A) {
            A0C(this.A0I);
            this.A0D.A01(1);
            this.A0A = true;
        }
        return this.A02.A04;
    }
}
