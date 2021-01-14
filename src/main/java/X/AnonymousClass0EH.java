package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.0EH  reason: invalid class name */
public class AnonymousClass0EH {
    public static volatile AnonymousClass0EH A05;
    public final AnonymousClass09A A00;
    public final AnonymousClass09V A01;
    public final C014408c A02;
    public final C006903j A03;
    public final AnonymousClass094 A04;

    public AnonymousClass0EH(C014408c r1, C006903j r2, AnonymousClass09A r3, AnonymousClass09V r4, AnonymousClass094 r5) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
        this.A04 = r5;
    }

    public static AnonymousClass0EH A00() {
        if (A05 == null) {
            synchronized (AnonymousClass0EH.class) {
                if (A05 == null) {
                    A05 = new AnonymousClass0EH(C014408c.A00(), C006903j.A00(), AnonymousClass09A.A02, AnonymousClass09V.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A05;
    }

    public C12130hb A01(UserJid userJid) {
        C08560bL A052 = this.A03.A05(userJid);
        if (A052 == null) {
            return null;
        }
        long j = A052.A08;
        if (j == -1) {
            return null;
        }
        AbstractC007503q A012 = this.A01.A01(j);
        if (!(A012 instanceof C05390Oi) || ((C05390Oi) A012).A00 != 28) {
            return null;
        }
        return (C12130hb) A012;
    }
}
