package X;

import com.whatsapp.util.Log;

/* renamed from: X.09U  reason: invalid class name */
public class AnonymousClass09U {
    public static volatile AnonymousClass09U A0A;
    public final AnonymousClass09T A00;
    public final AnonymousClass09A A01;
    public final AnonymousClass09V A02;
    public final C014408c A03;
    public final C006903j A04;
    public final AnonymousClass09Q A05;
    public final C014608e A06;
    public final AnonymousClass094 A07;
    public final C014508d A08;
    public final AnonymousClass09E A09;

    public AnonymousClass09U(C014408c r1, C006903j r2, AnonymousClass09E r3, AnonymousClass09Q r4, AnonymousClass09T r5, AnonymousClass09A r6, AnonymousClass09V r7, C014608e r8, C014508d r9, AnonymousClass094 r10) {
        this.A03 = r1;
        this.A04 = r2;
        this.A09 = r3;
        this.A05 = r4;
        this.A00 = r5;
        this.A01 = r6;
        this.A02 = r7;
        this.A06 = r8;
        this.A08 = r9;
        this.A07 = r10;
    }

    public static AnonymousClass09U A00() {
        if (A0A == null) {
            synchronized (AnonymousClass09U.class) {
                if (A0A == null) {
                    C015308l.A00();
                    A0A = new AnonymousClass09U(C014408c.A00(), C006903j.A00(), AnonymousClass09E.A00(), AnonymousClass09Q.A00(), AnonymousClass09T.A00(), AnonymousClass09A.A02, AnonymousClass09V.A00(), C014608e.A01, C014508d.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A0A;
    }

    public void A01(AnonymousClass02N r5, long j) {
        StringBuilder sb = new StringBuilder("msgstore/setchatreadreceiptssent/");
        sb.append(r5);
        sb.append(" ");
        sb.append(j);
        Log.i(sb.toString());
        C08560bL A052 = this.A04.A05(r5);
        if (A052 == null) {
            AnonymousClass008.A13("msgstore/setchatreadreceiptssent/no chat for ", r5);
        } else if (j > A052.A0H) {
            A052.A0H = j;
            this.A01.A01(new RunnableEBaseShape2S0200000_I0_1(this, A052, 44), 43);
        }
    }
}
