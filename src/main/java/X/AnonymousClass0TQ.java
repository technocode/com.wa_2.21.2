package X;

import android.view.Window;

/* renamed from: X.0TQ  reason: invalid class name */
public final class AnonymousClass0TQ implements AnonymousClass0TR {
    public final /* synthetic */ AnonymousClass0MW A00;

    public AnonymousClass0TQ(AnonymousClass0MW r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0TR
    public void AEI(AnonymousClass0T8 r10, boolean z) {
        AnonymousClass0T8 A01;
        AnonymousClass0T8 r0;
        if (!(r10 instanceof AnonymousClass0TY)) {
            A01 = r10;
        } else {
            A01 = ((AnonymousClass0TY) r10).A00.A01();
        }
        boolean z2 = false;
        if (A01 != r10) {
            z2 = true;
        }
        AnonymousClass0MW r5 = this.A00;
        if (z2) {
            r10 = A01;
        }
        AnonymousClass0T2[] r4 = r5.A0i;
        if (r4 != null) {
            for (AnonymousClass0T2 r2 : r4) {
                if (r2 != null && (r0 = r2.A0A) == r10) {
                    if (z2) {
                        int i = r2.A01;
                        if (A01 == null) {
                            A01 = r0;
                        }
                        if (r2.A0C && !r5.A0a) {
                            ((AnonymousClass0TK) r5.A0D).A00.onPanelClosed(i, A01);
                        }
                        r5.A0S(r2, true);
                        return;
                    } else {
                        r5.A0S(r2, z);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.AnonymousClass0TR
    public boolean AI7(AnonymousClass0T8 r4) {
        Window.Callback callback;
        if (r4 != null) {
            return true;
        }
        AnonymousClass0MW r2 = this.A00;
        if (!r2.A0Y || (callback = r2.A08.getCallback()) == null || r2.A0a) {
            return true;
        }
        callback.onMenuOpened(AnonymousClass0PW.A03, r4);
        return true;
    }
}
