package X;

import android.graphics.Bitmap;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.3Ob  reason: invalid class name and case insensitive filesystem */
public class C71223Ob implements AnonymousClass2PJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC48882Od A01;
    public final /* synthetic */ C74003Zv A02;

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        return "MY_PHOTOS_VIEW_HOLDER_TAG";
    }

    public C71223Ob(C74003Zv r1, AbstractC48882Od r2, int i) {
        this.A02 = r1;
        this.A01 = r2;
        this.A00 = i;
    }

    @Override // X.AnonymousClass2PJ
    public Bitmap ABl() {
        if (this.A02.A09.getTag() != this) {
            return null;
        }
        Bitmap AQZ = this.A01.AQZ(this.A00);
        return AQZ == null ? MediaGalleryFragmentBase.A0O : AQZ;
    }
}
