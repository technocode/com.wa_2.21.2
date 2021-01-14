package X;

/* renamed from: X.33A  reason: invalid class name */
public class AnonymousClass33A {
    public final C29241Xq A00;
    public final String A01;
    public final String A02;

    public AnonymousClass33A(String str, String str2, C29241Xq r3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = r3;
    }

    public void A00(C29241Xq r3) {
        C29241Xq r1 = this.A00;
        r1.A0D = r3.A0D;
        r1.A06 = r3.A06;
        r1.A05 = r3.A05;
        r1.A09 = r3.A09;
        r1.A08 = r3.A08;
        r1.A00 = r3.A00;
        r1.A03 = r3.A03;
        r1.A02 = r3.A02;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("RecentStickerIdentifier{fileHash='");
        AnonymousClass008.A1W(A0S, this.A01, '\'', ", imageHash='");
        AnonymousClass008.A1W(A0S, this.A02, '\'', ", sticker=");
        A0S.append(this.A00.toString());
        A0S.append('}');
        return A0S.toString();
    }
}
