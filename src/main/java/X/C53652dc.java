package X;

import com.whatsapp.gallery.MediaGalleryFragment;

/* renamed from: X.2dc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53652dc implements AbstractC48952Ok {
    public final /* synthetic */ MediaGalleryFragment A00;

    public /* synthetic */ C53652dc(MediaGalleryFragment mediaGalleryFragment) {
        this.A00 = mediaGalleryFragment;
    }

    @Override // X.AbstractC48952Ok
    public final AbstractC48892Oe A3O(boolean z) {
        MediaGalleryFragment mediaGalleryFragment = this.A00;
        C53852dw r5 = new C53852dw(mediaGalleryFragment.A02, mediaGalleryFragment.A03, mediaGalleryFragment.A06, mediaGalleryFragment.A00);
        if (r5.A01 == null) {
            r5.A01 = new C47942Kh(r5.A02, r5.A04, r5.A00(), false);
        }
        return r5;
    }
}
