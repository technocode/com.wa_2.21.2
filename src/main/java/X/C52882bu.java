package X;

import android.view.KeyEvent;

/* renamed from: X.2bu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C52882bu implements AnonymousClass2ME {
    public final /* synthetic */ AnonymousClass2MQ A00;

    public /* synthetic */ C52882bu(AnonymousClass2MQ r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass2ME
    public final boolean AGv(int i, KeyEvent keyEvent) {
        AnonymousClass2MQ r2 = this.A00;
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        r2.A0C = r2.A0A.getText().toString();
        r2.dismiss();
        return false;
    }
}
