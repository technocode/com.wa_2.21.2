package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;

/* renamed from: X.3MD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MD implements AbstractC64722ye {
    public final /* synthetic */ AnonymousClass1Y6 A00;

    public /* synthetic */ AnonymousClass3MD(AnonymousClass1Y6 r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC64722ye
    public final void AJd(String str, int i) {
        AnonymousClass1Y6 r3 = this.A00;
        if (!C002001d.A3D(r3)) {
            r3.A0E = false;
            ((ActivityC004702f) r3).A0K.A00();
            if (i == 0) {
                AnonymousClass0MB r4 = new AnonymousClass0MB(r3);
                r4.A07(r3.A0O.A06(R.string.ok), null);
                r4.A01(R.string.error_load_image);
                r4.A01.A07 = new DialogInterface$OnDismissListenerC64802yp(r3);
                r4.A00().show();
                ((AbstractC07560Ye) r3.A06).A0D = true;
            } else if (i == 1) {
                C002001d.A2x(r3.A0R, 3, 1, null, null, null, null, C002001d.A3d(str));
                C07550Yd r0 = r3.A06;
                ((AbstractC07560Ye) r0).A01.APl(ErrorDialogFragment.A00(6), "qr_code_scanning_dialog_fragment_tag");
                ((AbstractC07560Ye) r3.A06).A0D = true;
            } else if (i == 2 && !r3.A0Y(str, false, 3)) {
                C07550Yd r02 = r3.A06;
                ((AbstractC07560Ye) r02).A01.APl(ErrorDialogFragment.A00(6), "qr_code_scanning_dialog_fragment_tag");
                ((AbstractC07560Ye) r3.A06).A0D = true;
            }
        }
    }
}
