package X;

import com.whatsapp.util.Log;

/* renamed from: X.1Wm  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC28981Wm {
    public int A00 = -1;
    public long A01;
    public long A02;
    public final int A03;
    public final long A04;
    public final AnonymousClass009 A05;
    public final AnonymousClass00S A06;
    public final AnonymousClass00Y A07;
    public final C28991Wn A08;
    public final Integer A09;
    public final String A0A;

    public AbstractC28981Wm(AnonymousClass00S r5, AnonymousClass009 r6, AnonymousClass00Y r7, C28991Wn r8, String str, long j, int i, long j2) {
        if (1 != 0) {
            this.A06 = r5;
            this.A05 = r6;
            this.A07 = r7;
            this.A08 = r8;
            this.A0A = str;
            this.A04 = j;
            this.A03 = i;
            this.A00 = 1;
            this.A01 = j2;
            this.A02 = j2;
            AnonymousClass00X A002 = A00(-1, 0);
            if (r7 != null) {
                this.A09 = r7.A03(A002.code, A002.samplingRate, false);
                return;
            }
            throw null;
        }
        throw new IllegalArgumentException("Invalid stage");
    }

    public AnonymousClass00X A00(int i, long j) {
        if (!(this instanceof C448521x)) {
            C448421w r3 = (C448421w) this;
            StringBuilder sb = new StringBuilder("MessageStanza/toEvent stage = ");
            sb.append(i);
            sb.append("; duration = ");
            sb.append(j);
            sb.append("; ");
            sb.append(r3);
            Log.i(sb.toString());
            C444820h r2 = new C444820h();
            r2.A00 = Boolean.valueOf(r3.A05);
            r2.A04 = Integer.valueOf(r3.A00);
            r2.A07 = Long.valueOf(j);
            r2.A01 = Boolean.valueOf(r3.A01);
            r2.A02 = Boolean.valueOf(r3.A04);
            Integer num = r3.A03;
            if (num != null) {
                r2.A08 = Long.valueOf((long) num.intValue());
            }
            r2.A03 = Boolean.valueOf(r3.A06);
            r2.A05 = Integer.valueOf(i);
            r2.A06 = Integer.valueOf(r3.A02);
            return r2;
        }
        C448521x r32 = (C448521x) this;
        StringBuilder sb2 = new StringBuilder("ReceiptStanza/toEvent stage = ");
        sb2.append(i);
        sb2.append("; duration = ");
        sb2.append(j);
        sb2.append("; ");
        sb2.append(r32);
        Log.i(sb2.toString());
        C446120u r22 = new C446120u();
        r22.A03 = Long.valueOf(j);
        r22.A00 = Boolean.valueOf(r32.A02);
        Integer num2 = r32.A04;
        if (num2 != null) {
            r22.A04 = Long.valueOf((long) num2.intValue());
        }
        r22.A05 = Long.valueOf(r32.A00);
        r22.A06 = Long.valueOf(C006803i.A04(r32.A05, 0));
        r22.A02 = Integer.valueOf(i);
        r22.A07 = Long.valueOf(r32.A01);
        r22.A08 = r32.A06;
        r22.A01 = Integer.valueOf(r32.A03);
        return r22;
    }

    public void A01(int i) {
        int i2 = this.A00;
        if (i == i2) {
            StringBuilder A0S = AnonymousClass008.A0S("Invalid stage ");
            A0S.append(i2);
            A0S.append(" ");
            A0S.append(this.A0A);
            this.A05.A04("LoggableStanza/failed new stage check", A0S.toString(), true);
        }
        long A042 = this.A06.A04();
        A02(this.A00, A042 - this.A01);
        this.A00 = i;
        this.A01 = A042;
    }

    public final void A02(int i, long j) {
        Integer num = this.A09;
        if (num != null) {
            this.A07.A08(A00(i, j), num.intValue());
        }
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("stanzaId = ");
        A0S.append(this.A0A);
        A0S.append("; loggableStanzaType = ");
        A0S.append(this.A03);
        A0S.append("; currentStage = ");
        A0S.append(this.A00);
        return A0S.toString();
    }
}
