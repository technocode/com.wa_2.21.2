package X;

import android.graphics.Bitmap;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2eB  reason: invalid class name and case insensitive filesystem */
public class C53992eB implements AnonymousClass2PJ {
    public final /* synthetic */ AbstractC48882Od A00;
    public final /* synthetic */ AnonymousClass2P3 A01;
    public final /* synthetic */ View$OnClickListenerC54012eD A02;

    public C53992eB(View$OnClickListenerC54012eD r1, AbstractC48882Od r2, AnonymousClass2P3 r3) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        AnonymousClass2P3 r3 = this.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(r3.A02);
        sb.append("-");
        sb.append(r3.A04);
        sb.append("-");
        sb.append(r3.A01);
        return sb.toString();
    }

    @Override // X.AnonymousClass2PJ
    public Bitmap ABl() {
        View$OnClickListenerC54012eD r2 = this.A02;
        if (r2.A02.getTag() != this) {
            return null;
        }
        Bitmap AQZ = this.A00.AQZ(r2.A05.A02);
        return AQZ == null ? MediaGalleryFragmentBase.A0O : AQZ;
    }
}
