package X;

import android.view.KeyEvent;

/* renamed from: X.2e3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53922e3 implements AnonymousClass2HT {
    public final /* synthetic */ AnonymousClass2P5 A00;

    public /* synthetic */ C53922e3(AnonymousClass2P5 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass2HT
    public final boolean AGv(int i, KeyEvent keyEvent) {
        AnonymousClass2P5 r2 = this.A00;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        r2.dismiss();
        return false;
    }
}
