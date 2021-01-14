package X;

import java.util.List;

/* renamed from: X.2WU  reason: invalid class name */
public class AnonymousClass2WU implements AbstractC48952Ok {
    public final AnonymousClass009 A00 = AnonymousClass009.A00();
    public final C000300f A01 = C000300f.A00();
    public final AnonymousClass00G A02 = AnonymousClass00G.A01;
    public final AnonymousClass03S A03 = AnonymousClass03S.A00();
    public final AnonymousClass0XO A04 = AnonymousClass0XO.A00();
    public final C007703s A05 = C007703s.A00();
    public final List A06;

    public AnonymousClass2WU(List list) {
        this.A06 = list;
    }

    @Override // X.AbstractC48952Ok
    public AbstractC48892Oe A3O(boolean z) {
        AnonymousClass2PA r6;
        if (!z) {
            r6 = new AnonymousClass2PA();
            r6.A04 = true;
        } else {
            r6 = new AnonymousClass2PA();
            r6.A01 = 2;
            r6.A00 = 7;
            r6.A02 = 2;
            r6.A03 = null;
        }
        return new AnonymousClass2WT(AnonymousClass2PB.A00(this.A02, this.A00, this.A01, this.A04, this.A03, this.A05, r6), this.A06);
    }
}
