package X;

import com.whatsapp.ViewProfilePhoto;
import com.whatsapp.jid.Jid;

/* renamed from: X.1r6  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C39191r6 implements AbstractC49342Qc {
    public final /* synthetic */ ViewProfilePhoto A00;

    public /* synthetic */ C39191r6(ViewProfilePhoto viewProfilePhoto) {
        this.A00 = viewProfilePhoto;
    }

    @Override // X.AbstractC49342Qc
    public final void ACU(AnonymousClass02N r3) {
        ViewProfilePhoto viewProfilePhoto = this.A00;
        C007003k r0 = viewProfilePhoto.A00;
        if (r0 != null) {
            Jid jid = r0.A09;
            if (jid == null) {
                throw null;
            } else if (jid.equals(r3)) {
                viewProfilePhoto.A05();
            }
        }
    }
}
