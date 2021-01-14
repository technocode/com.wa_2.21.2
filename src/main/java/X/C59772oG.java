package X;

import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewFragment;

/* renamed from: X.2oG  reason: invalid class name and case insensitive filesystem */
public class C59772oG extends C54212eX {
    public final /* synthetic */ ImagePreviewFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59772oG(ImagePreviewFragment imagePreviewFragment) {
        super(imagePreviewFragment);
        this.A00 = imagePreviewFragment;
    }

    @Override // X.C54212eX
    public void A02() {
        ImagePreviewFragment imagePreviewFragment = this.A00;
        ((AnonymousClass2PF) imagePreviewFragment.A0A()).AFE();
        AnonymousClass2PX r0 = imagePreviewFragment.A00.A04;
        if (r0.A00 <= r0.A03 && !((MediaPreviewFragment) imagePreviewFragment).A01.A0D.A05()) {
            ((MediaPreviewFragment) imagePreviewFragment).A02.A01();
        }
    }
}
