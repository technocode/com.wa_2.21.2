package X;

import android.graphics.Bitmap;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2dr  reason: invalid class name and case insensitive filesystem */
public class C53802dr implements AnonymousClass2PK {
    public final /* synthetic */ AbstractC48882Od A00;
    public final /* synthetic */ C53812ds A01;
    public final /* synthetic */ C59592ny A02;
    public final /* synthetic */ AnonymousClass2PJ A03;

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    public C53802dr(C53812ds r1, C59592ny r2, AnonymousClass2PJ r3, AbstractC48882Od r4) {
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = r4;
    }

    @Override // X.AnonymousClass2PK
    public void A2A() {
        C59592ny r1 = this.A02;
        r1.setBackgroundColor(this.A01.A04.A01);
        r1.setImageDrawable(null);
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        Bitmap bitmap2 = bitmap;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01.A04;
        if (mediaGalleryFragmentBase.A0A() != null) {
            C59592ny r3 = this.A02;
            if (r3.getTag() == this.A03) {
                AbstractC48882Od r4 = this.A00;
                if (bitmap == MediaGalleryFragmentBase.A0O) {
                    bitmap2 = null;
                }
                C28051Sr.A1c(r3, r4, bitmap2, mediaGalleryFragmentBase.A01, mediaGalleryFragmentBase.A04, !z);
            }
        }
    }
}
