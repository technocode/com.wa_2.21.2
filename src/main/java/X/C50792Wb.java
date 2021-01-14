package X;

import android.graphics.Bitmap;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2Wb  reason: invalid class name and case insensitive filesystem */
public class C50792Wb implements AnonymousClass2PJ {
    public final /* synthetic */ C50822We A00;
    public final /* synthetic */ AbstractC48882Od A01;
    public final /* synthetic */ C60522pc A02;

    public C50792Wb(C50822We r1, C60522pc r2, AbstractC48882Od r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        return C28051Sr.A0q(this.A01.A4W());
    }

    @Override // X.AnonymousClass2PJ
    public Bitmap ABl() {
        if (this.A02.getTag() != this) {
            return null;
        }
        Bitmap AQZ = this.A01.AQZ(this.A00.A03.A0L.getResources().getDimensionPixelSize(R.dimen.camera_thumb_size));
        return AQZ == null ? MediaGalleryFragmentBase.A0O : AQZ;
    }
}
