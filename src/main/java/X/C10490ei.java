package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.0ei  reason: invalid class name and case insensitive filesystem */
public class C10490ei extends AnonymousClass0JW {
    public final C53662dd A00;
    public final AbstractC48892Oe A01;

    public C10490ei(AbstractC48892Oe r1, C53662dd r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A00.A00;
        mediaGalleryFragmentBase.A0E = true;
        AbstractC48892Oe r0 = mediaGalleryFragmentBase.A08;
        if (r0 != null) {
            mediaGalleryFragmentBase.A00 = r0.getCount();
        }
        mediaGalleryFragmentBase.A06.A01.A00();
    }
}
