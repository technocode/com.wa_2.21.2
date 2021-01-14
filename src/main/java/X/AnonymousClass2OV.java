package X;

import android.view.View;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import com.whatsapp.gallery.GalleryFragmentBase;

/* renamed from: X.2OV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2OV implements View.OnLongClickListener {
    public final /* synthetic */ C53682df A00;

    public /* synthetic */ AnonymousClass2OV(C53682df r1) {
        this.A00 = r1;
    }

    public final boolean onLongClick(View view) {
        C53682df r0 = this.A00;
        AnonymousClass0M2 r2 = r0.A00;
        if (r2 == null) {
            return false;
        }
        DocumentsGalleryFragment documentsGalleryFragment = r0.A0A;
        if (documentsGalleryFragment.A0o().AAO()) {
            documentsGalleryFragment.A0o().AQh(r2);
        } else {
            documentsGalleryFragment.A0o().AQ6(r2);
        }
        ((AbstractC16300pa) ((GalleryFragmentBase) documentsGalleryFragment).A03).A01.A00();
        return true;
    }
}
