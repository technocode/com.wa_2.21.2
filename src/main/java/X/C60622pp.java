package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2pp  reason: invalid class name and case insensitive filesystem */
public class C60622pp extends AbstractRunnableC459527e {
    public long A00;
    public AnonymousClass1W5 A01;
    public AnonymousClass3ZL A02;
    public File A03;
    public String A04;
    public AtomicReference A05 = new AtomicReference(null);
    public boolean A06;
    public final AnonymousClass009 A07;
    public final AnonymousClass088 A08;
    public final C000300f A09;
    public final AnonymousClass0CL A0A;
    public final C03140Ey A0B = new C03140Ey();
    public final C03140Ey A0C = new C03140Ey();
    public final C03140Ey A0D = new C03140Ey();
    public final C03140Ey A0E = new C03140Ey();
    public final AnonymousClass00S A0F;
    public final AnonymousClass2KJ A0G;
    public final AnonymousClass2KO A0H;
    public final AnonymousClass0BV A0I;
    public final C02110Ar A0J;
    public final AnonymousClass0CW A0K;
    public final C02450Cb A0L;
    public final AnonymousClass0CK A0M;
    public final C02530Cl A0N;
    public final C02460Cc A0O;
    public final AnonymousClass1WC A0P;
    public final C50092Tj A0Q;
    public final C50142To A0R;
    public final C50162Tq A0S;
    public final C02540Cm A0T;
    public final C02480Ce A0U;
    public final C02520Ck A0V;
    public final AnonymousClass2U8 A0W;
    public final AnonymousClass022 A0X;
    public final AnonymousClass0CT A0Y;
    public final AnonymousClass00T A0Z;

    public C60622pp(AnonymousClass00S r9, AnonymousClass02M r10, AnonymousClass009 r11, AnonymousClass00T r12, AnonymousClass088 r13, AnonymousClass0CK r14, AnonymousClass0CL r15, C000300f r16, AnonymousClass0CT r17, C02450Cb r18, C02460Cc r19, C02480Ce r20, AnonymousClass0BV r21, C02520Ck r22, C02110Ar r23, C02530Cl r24, AnonymousClass0CW r25, AnonymousClass022 r26, C02540Cm r27, AnonymousClass1WC r28) {
        AnonymousClass2U8 r1 = new AnonymousClass2U8(r25);
        this.A0F = r9;
        this.A07 = r11;
        this.A0Z = r12;
        this.A0M = r14;
        this.A08 = r13;
        this.A0A = r15;
        this.A09 = r16;
        this.A0Y = r17;
        this.A0L = r18;
        this.A0O = r19;
        this.A0U = r20;
        this.A0I = r21;
        this.A0V = r22;
        this.A0T = r27;
        this.A0J = r23;
        this.A0N = r24;
        this.A0K = r25;
        this.A0X = r26;
        this.A0S = r28.A04;
        this.A0P = r28;
        this.A0W = r1;
        C50142To r3 = new C50142To();
        this.A0R = r3;
        synchronized (r3) {
            AnonymousClass2TF r110 = r28.A02;
            r3.A00 = r110.A03;
            r3.A08 = r110.A08;
            r3.A07 = r110.A07;
            r3.A01 = r110.A04;
        }
        AnonymousClass2KO r0 = r28.A00;
        this.A0H = r0;
        this.A0G = r0.A71();
        this.A0Q = new C50092Tj(r9, r20, r21);
        C57272jz r111 = new C57272jz(this);
        Executor executor = r10.A06;
        ((C41191ud) this).A01.A03(r111, executor);
        ((C41191ud) this).A00.A03(new AnonymousClass2k0(this), executor);
        this.A0B.A04(Boolean.TRUE);
        r17.A0A(this.A0P.A02.A05.A02, null, null, 0);
    }

    @Override // X.AbstractRunnableC459527e, X.C41191ud
    public void A02() {
        super.A02();
        this.A0B.A01();
        this.A0D.A01();
        this.A0E.A01();
        this.A0C.A01();
    }

    public void A05() {
        int i;
        int i2;
        AnonymousClass1WC r2 = this.A0P;
        AnonymousClass1XO r1 = r2.A02.A05;
        if (r1 == AnonymousClass1XO.A0N || r1 == AnonymousClass1XO.A04 || r1 == AnonymousClass1XO.A0Q) {
            try {
                AnonymousClass36I r3 = new AnonymousClass36I(this.A09, r2.A01());
                AnonymousClass009 r12 = this.A07;
                if (r3.A03(r12)) {
                    i = r3.A01;
                } else {
                    i = r3.A03;
                }
                if (r3.A03(r12)) {
                    i2 = r3.A03;
                } else {
                    i2 = r3.A01;
                }
                C50142To r13 = this.A0R;
                synchronized (r13) {
                    r13.A03 = Integer.valueOf(i2);
                    r13.A04 = Integer.valueOf(i);
                }
            } catch (AnonymousClass3SE e) {
                Log.w("MMS upload unable to get video meta", e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r0 != 0) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(long r8) {
        /*
        // Method dump skipped, instructions count: 106
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60622pp.A06(long):void");
    }

    public final void A07(Integer num) {
        C50142To r4;
        boolean z;
        StringBuilder sb = new StringBuilder("mediaupload/onpostexecute, result=");
        sb.append(num);
        sb.append(", this=");
        sb.append(this);
        Log.d(sb.toString());
        if (this.A09.A0D(AbstractC000400g.A1b) && this.A0P.A02.A0B) {
            C50142To r42 = this.A0R;
            r42.A07(this.A0L.A01(C002001d.A1q(r42.A03(), this.A0F.A05())));
        }
        if (num.intValue() == 18) {
            this.A0K.A04();
        }
        if (((AbstractRunnableC459527e) this).A02.isCancelled()) {
            num = 1;
        }
        C03140Ey r1 = this.A0E;
        AnonymousClass1WC r3 = this.A0P;
        C50142To r2 = this.A0R;
        synchronized (r2) {
            r4 = new C50142To();
            r4.A00 = r2.A00;
            r4.A0F = r2.A0F;
            r4.A0H = r2.A0H;
            r4.A0I = r2.A0I;
            r4.A03 = r2.A03;
            r4.A04 = r2.A04;
            r4.A08 = r2.A08;
            r4.A07 = r2.A07;
            r4.A02 = r2.A02;
            r4.A09 = r2.A09;
            r4.A06 = r2.A06;
            r4.A05 = r2.A05;
            r4.A0C = r2.A0C;
            r4.A0E = r2.A0E;
            r4.A0D = r2.A0D;
            r4.A0B = r2.A0B;
            r4.A0A = r2.A0A;
            r4.A0G = r2.A0G;
            r4.A01 = r2.A01;
        }
        int intValue = num.intValue();
        boolean z2 = this.A06;
        if (!(this instanceof C60772qB)) {
            z = false;
        } else {
            z = true;
        }
        r1.A04(new C50152Tp(r3, r4, intValue, z2, z, this.A03));
    }

    public final boolean A08() {
        AnonymousClass2TF r2 = this.A0P.A02;
        AnonymousClass1XO r1 = r2.A05;
        if (!C05450Op.A00(r1)) {
            return false;
        }
        if (r1 == AnonymousClass1XO.A0N || r1 == AnonymousClass1XO.A0M || r1 == AnonymousClass1XO.A0Q) {
            return true;
        }
        int[] iArr = r2.A0E;
        return iArr != null && iArr.length > 0;
    }

    @Override // X.AbstractC27381Pn, X.AbstractRunnableC459527e
    public void cancel() {
        boolean z;
        StringBuilder A0S2 = AnonymousClass008.A0S("mediaupload/cancel request=");
        A0S2.append(this.A0P);
        A0S2.append(", this=");
        A0S2.append(this);
        Log.d(A0S2.toString());
        if (this.A05.get() != null) {
            if (!(this instanceof C60772qB)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (this.A02 != null) {
                    this.A0Z.ANF(new RunnableEBaseShape10S0100000_I1_5(this, 47));
                } else {
                    throw null;
                }
            }
        }
        super.cancel();
    }
}
