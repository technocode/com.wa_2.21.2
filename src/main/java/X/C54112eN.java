package X;

import android.net.Uri;

/* renamed from: X.2eN  reason: invalid class name and case insensitive filesystem */
public class C54112eN implements AbstractC48952Ok {
    public final int A00;
    public final Uri A01;
    public final AnonymousClass009 A02 = AnonymousClass009.A00();
    public final C000300f A03 = C000300f.A00();
    public final AnonymousClass00G A04 = AnonymousClass00G.A01;
    public final AnonymousClass03S A05 = AnonymousClass03S.A00();
    public final AnonymousClass0XO A06 = AnonymousClass0XO.A00();
    public final C007703s A07 = C007703s.A00();

    public C54112eN(Uri uri, int i) {
        this.A01 = uri;
        this.A00 = i;
    }

    @Override // X.AbstractC48952Ok
    public AbstractC48892Oe A3O(boolean z) {
        String str;
        AnonymousClass2PA r6;
        Uri uri = this.A01;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = "";
        }
        String str2 = null;
        if (str.startsWith(C59652o4.A00.toString())) {
            AnonymousClass00G r3 = this.A04;
            C000300f r4 = this.A03;
            AnonymousClass0XO r5 = this.A06;
            C007703s r62 = this.A07;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            return new C59652o4(r3, r4, r5, r62, str2, this.A00);
        }
        if (!z) {
            r6 = new AnonymousClass2PA();
            r6.A04 = true;
        } else {
            int i = this.A00;
            if (uri != null) {
                str2 = uri.getQueryParameter("bucketId");
            }
            r6 = new AnonymousClass2PA();
            r6.A01 = 2;
            r6.A00 = i;
            r6.A02 = 2;
            r6.A03 = str2;
        }
        return AnonymousClass2PB.A00(this.A04, this.A02, this.A03, this.A06, this.A05, this.A07, r6);
    }
}
