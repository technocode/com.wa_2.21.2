package X;

import android.graphics.Bitmap;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2dq  reason: invalid class name and case insensitive filesystem */
public class C53792dq implements AnonymousClass2PJ {
    public final /* synthetic */ AbstractC48882Od A00;
    public final /* synthetic */ C53812ds A01;
    public final /* synthetic */ C53822dt A02;
    public final /* synthetic */ C59592ny A03;

    public C53792dq(C53812ds r1, C59592ny r2, C53822dt r3, AbstractC48882Od r4) {
        this.A01 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A00 = r4;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        return C28051Sr.A0q(this.A00.A4W());
    }

    @Override // X.AnonymousClass2PJ
    public Bitmap ABl() {
        if (this.A03.getTag() != this || this.A02.A01() == -1) {
            return null;
        }
        Bitmap AQZ = this.A00.AQZ(this.A01.A04.A03);
        return AQZ == null ? MediaGalleryFragmentBase.A0O : AQZ;
    }
}
