package X;

import java.io.File;

/* renamed from: X.1tC  reason: invalid class name and case insensitive filesystem */
public class C40391tC extends AnonymousClass0JW {
    public Exception A00;
    public final AnonymousClass088 A01;
    public final AbstractC02970Eh A02;
    public final String A03;
    public final String A04;

    public C40391tC(AnonymousClass088 r1, String str, String str2, AbstractC02970Eh r4) {
        this.A01 = r1;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = r4;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        File file = (File) obj;
        if (file != null) {
            this.A02.AG3(this.A04, file, null);
            return;
        }
        Exception exc = this.A00;
        if (exc != null) {
            this.A02.AFt(exc);
        }
    }
}
