package X;

import java.util.ArrayList;

/* renamed from: X.2YQ  reason: invalid class name */
public class AnonymousClass2YQ implements AnonymousClass0YR {
    public final /* synthetic */ AnonymousClass0QH A00;

    @Override // X.AnonymousClass0YR
    public boolean AIz(String str) {
        return false;
    }

    public AnonymousClass2YQ(AnonymousClass0QH r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0YR
    public boolean AIy(String str) {
        AnonymousClass0QH r1 = this.A00;
        r1.A0I = str;
        ArrayList A03 = AnonymousClass1YB.A03(str, ((AnonymousClass2C0) r1).A01);
        r1.A0J = A03;
        if (A03.isEmpty()) {
            r1.A0J = null;
        }
        r1.A0a();
        return false;
    }
}
