package X;

import com.whatsapp.jid.UserJid;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.1Rq  reason: invalid class name and case insensitive filesystem */
public class C27831Rq {
    public static volatile C27831Rq A07;
    public String A00;
    public HashSet A01 = new HashSet(Arrays.asList(31, 28, 30, 29, 32, 37, 33, 12, 4, 27, 35, 36, 34));
    public Random A02 = new Random();
    public AtomicInteger A03 = new AtomicInteger();
    public final AnonymousClass01I A04;
    public final AnonymousClass00Y A05;
    public final AnonymousClass00Z A06;

    public C27831Rq(AnonymousClass01I r6, AnonymousClass00Y r7) {
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = AnonymousClass00X.DEFAULT_SAMPLING_RATE;
    }

    public static C27831Rq A00() {
        if (A07 == null) {
            synchronized (C27831Rq.class) {
                if (A07 == null) {
                    A07 = new C27831Rq(AnonymousClass01I.A00(), AnonymousClass00Y.A00());
                }
            }
        }
        return A07;
    }

    public void A01(int i) {
        this.A00 = Long.toHexString(this.A02.nextLong());
        this.A03.set(i);
    }

    public void A02(int i, int i2, String str, UserJid userJid) {
        A03(i, i2, str, userJid, null);
    }

    public void A03(int i, int i2, String str, UserJid userJid, Integer num) {
        C44151za r1;
        AnonymousClass00Z r3 = this.A06;
        boolean A012 = r3.A01(this.A00);
        if (!this.A04.A09(userJid)) {
            HashSet hashSet = this.A01;
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf) || A012) {
                C44151za r12 = new C44151za();
                r12.A03 = valueOf;
                r12.A08 = this.A00;
                r12.A0A = str;
                r12.A04 = num;
                r12.A06 = userJid.getRawString();
                if (!A012) {
                    r12.A00 = Boolean.TRUE;
                }
                A06(r12);
                r1 = r12;
            } else {
                return;
            }
        } else if (A012) {
            C44141zZ r13 = new C44141zZ();
            r13.A00 = Integer.valueOf(i2);
            r13.A03 = this.A00;
            r13.A05 = str;
            r13.A02 = num;
            A05(r13);
            r1 = r13;
        } else {
            return;
        }
        AnonymousClass00Y r2 = this.A05;
        int i3 = 1;
        if (A012) {
            i3 = r3.A00;
        }
        r2.A08(r1, i3);
    }

    public void A04(int i, String str, UserJid userJid, AbstractC27821Rp r9) {
        AnonymousClass00Z r4 = this.A06;
        boolean A012 = r4.A01(this.A00);
        HashSet hashSet = this.A01;
        Integer valueOf = Integer.valueOf(i);
        if (hashSet.contains(valueOf) || A012) {
            C44151za r2 = new C44151za();
            r2.A03 = valueOf;
            r2.A08 = this.A00;
            r2.A0A = str;
            r2.A06 = userJid.getRawString();
            if (!A012) {
                r2.A00 = Boolean.TRUE;
            }
            if (r9 != null) {
                r9.ALT(r2);
            }
            A06(r2);
            AnonymousClass00Y r1 = this.A05;
            int i2 = 1;
            if (A012) {
                i2 = r4.A00;
            }
            r1.A08(r2, i2);
        }
    }

    public final void A05(C44141zZ r3) {
        int andSet = this.A03.getAndSet(0);
        if (andSet != 0) {
            r3.A01 = Integer.valueOf(andSet);
        }
    }

    public final void A06(C44151za r3) {
        int andSet = this.A03.getAndSet(0);
        if (andSet != 0) {
            r3.A02 = Integer.valueOf(andSet);
        }
    }

    public void A07(String str, UserJid userJid, int i) {
        if (this.A04.A09(userJid)) {
            AnonymousClass00Z r3 = this.A06;
            if (r3.A01(this.A00)) {
                C44141zZ r2 = new C44141zZ();
                r2.A00 = Integer.valueOf(i);
                r2.A03 = this.A00;
                r2.A04 = str;
                A05(r2);
                this.A05.A08(r2, r3.A00);
            }
        }
    }
}
