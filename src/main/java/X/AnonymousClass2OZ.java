package X;

import android.view.View;
import com.whatsapp.gallery.GalleryFragmentBase;
import com.whatsapp.gallery.ProductGalleryFragment;

/* renamed from: X.2OZ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2OZ implements View.OnLongClickListener {
    public final /* synthetic */ C53882dz A00;

    public /* synthetic */ AnonymousClass2OZ(C53882dz r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C53882dz r3 = this.A00;
        ProductGalleryFragment productGalleryFragment = r3.A04;
        if (productGalleryFragment.A0o().AAO()) {
            productGalleryFragment.A0o().AQh(r3.A00);
        } else {
            productGalleryFragment.A0o().AQ6(r3.A00);
        }
        ((AbstractC16300pa) ((GalleryFragmentBase) productGalleryFragment).A03).A01.A00();
        return true;
    }
}
