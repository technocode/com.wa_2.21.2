package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.3HP  reason: invalid class name */
public abstract class AnonymousClass3HP {
    public boolean A00 = false;
    public final ActivityC004602e A01;
    public final AnonymousClass01X A02;
    public final C61902tv A03;
    public final C61932ty A04;
    public final C61942tz A05;
    public final AbstractC63142vv A06;

    public AnonymousClass3HP(ActivityC004602e r2, AnonymousClass01X r3, C61932ty r4, C61942tz r5, C61902tv r6) {
        this.A04 = r4;
        this.A02 = r3;
        this.A05 = r5;
        this.A03 = r6;
        this.A01 = r2;
        this.A06 = (AbstractC63142vv) r2;
    }

    public AnonymousClass0MD A00(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, int i) {
        AnonymousClass01X r5 = this.A02;
        C61162sb r4 = new C61162sb(r5);
        DialogInterface$OnDismissListenerC63132vu r3 = new DialogInterface$OnDismissListenerC63132vu(pinBottomSheetDialogFragment);
        DialogInterface$OnDismissListenerC63122vt r2 = new DialogInterface$OnDismissListenerC63122vt(pinBottomSheetDialogFragment);
        ActivityC004602e r1 = this.A01;
        AnonymousClass0MD A012 = r4.A01(r1, i, r3, r2);
        if (A012 == null && (A012 = r4.A00(r1, i, r3, r2)) == null) {
            return r4.A03(r1, r5.A06(R.string.payments_generic_error), r2);
        }
        return A012;
    }
}
