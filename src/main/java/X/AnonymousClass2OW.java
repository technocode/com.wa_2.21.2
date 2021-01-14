package X;

import android.view.View;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.LinksGalleryFragment;

/* renamed from: X.2OW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2OW implements View.OnLongClickListener {
    public final /* synthetic */ C53732dk A00;

    public /* synthetic */ AnonymousClass2OW(C53732dk r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C53732dk r0 = this.A00;
        AbstractC007503q r2 = r0.A01;
        if (r2 == null) {
            return false;
        }
        LinksGalleryFragment linksGalleryFragment = r0.A0B;
        if (linksGalleryFragment.A0o().AAO()) {
            linksGalleryFragment.A0o().AQh(r2);
        } else {
            linksGalleryFragment.A0o().AQ6(r2);
        }
        ((AbstractC16300pa) ((GalleryFragmentBase) linksGalleryFragment).A03).A01.A00();
        return true;
    }
}
