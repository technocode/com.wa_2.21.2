package X;

import java.util.ArrayList;

/* renamed from: X.1re  reason: invalid class name and case insensitive filesystem */
public class C39511re implements AnonymousClass0YR {
    public final /* synthetic */ AnonymousClass2DH A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public C39511re(AnonymousClass2DH r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        AnonymousClass2DH r1 = this.A00;
        r1.A07 = str;
        ArrayList A03 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) r1).A01);
        r1.A08 = A03;
        if (A03.isEmpty()) {
            r1.A08 = null;
        }
        AnonymousClass2DH.A04(r1);
        return false;
    }
}
