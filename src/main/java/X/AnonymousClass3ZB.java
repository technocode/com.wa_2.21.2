package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.qrcode.contactqr.ErrorDialogFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.3ZB  reason: invalid class name */
public class AnonymousClass3ZB extends AnonymousClass3ME {
    public final int A00;
    public final AnonymousClass04j A01;
    public final AnonymousClass01P A02;
    public final WeakReference A03;
    public final boolean A04;

    public AnonymousClass3ZB(AnonymousClass02M r14, AnonymousClass00T r15, AnonymousClass00Y r16, AnonymousClass09H r17, AnonymousClass01A r18, AnonymousClass0EW r19, AnonymousClass0XN r20, AnonymousClass04j r21, AnonymousClass01P r22, AnonymousClass0IA r23, String str, int i, int i2, C07550Yd r27) {
        super(r14, r15, r16, r17, r18, r19, r20, r23, str, i);
        this.A01 = r21;
        this.A02 = r22;
        this.A03 = new WeakReference(r27);
        this.A00 = i2;
        this.A04 = r27.A00;
    }

    @Override // X.AnonymousClass3ME
    public void A01() {
        AbstractC07560Ye r3 = (AbstractC07560Ye) this.A03.get();
        if (r3 == null) {
            return;
        }
        if (this.A01.A05()) {
            if (this.A04) {
                r3.A01.A0G(R.string.contact_qr_wait);
            }
            super.A01();
            return;
        }
        C002001d.A2x(this.A09, this.A00, 3, null, null, null, null, C002001d.A3d(this.A0D));
        r3.A0D = false;
        r3.A01.APl(ErrorDialogFragment.A00(3), "qr_code_scanning_dialog_fragment_tag");
    }
}
