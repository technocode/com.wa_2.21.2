package X;

import android.content.Context;
import com.google.android.search.verification.client.R;

/* renamed from: X.2cX  reason: invalid class name */
public class AnonymousClass2cX implements AbstractC48432Mf {
    public final C000300f A00;
    public final C29241Xq A01;
    public final AnonymousClass0D1 A02;

    @Override // X.AbstractC48432Mf
    public boolean A2S(boolean z, boolean z2) {
        return z;
    }

    @Override // X.AbstractC48432Mf
    public int A7q(Context context, int i) {
        return 0;
    }

    @Override // X.AbstractC48432Mf
    public int A8W(boolean z) {
        return 0;
    }

    @Override // X.AbstractC48432Mf
    public boolean AMt() {
        return true;
    }

    public AnonymousClass2cX(C29241Xq r1, C000300f r2, AnonymousClass0D1 r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC48432Mf
    public AbstractC48582Mw A3S(Context context, AnonymousClass01X r6, boolean z) {
        return new C59472nj(context, this.A01, this.A00, this.A02);
    }

    @Override // X.AbstractC48432Mf
    public String A5S(AnonymousClass01X r2) {
        return r2.A06(R.string.sticker_message_content_description);
    }

    @Override // X.AbstractC48432Mf
    public C03960Il[] A6B() {
        C03960Il[] r0;
        C29251Xr r02 = this.A01.A04;
        return (r02 == null || (r0 = r02.A06) == null) ? AbstractC48432Mf.A00 : r0;
    }

    @Override // X.AbstractC48432Mf
    public String A9J() {
        StringBuilder A0S = AnonymousClass008.A0S("StickerShapeCreator:");
        String str = this.A01.A0A;
        if (str != null) {
            A0S.append(str);
            return A0S.toString();
        }
        throw null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass2cX)) {
            return false;
        }
        String str = ((AnonymousClass2cX) obj).A01.A0A;
        if (str != null) {
            return str.equals(this.A01.A0A);
        }
        throw null;
    }

    public int hashCode() {
        String str = this.A01.A0A;
        if (str != null) {
            return str.hashCode();
        }
        throw null;
    }
}
