package X;

import android.graphics.Matrix;
import com.whatsapp.doodle.ImagePreviewContentLayout;
import com.whatsapp.gallerypicker.MediaPreviewFragment;

/* renamed from: X.2c2  reason: invalid class name */
public class AnonymousClass2c2 {
    public final /* synthetic */ ImagePreviewContentLayout A00;

    public AnonymousClass2c2(ImagePreviewContentLayout imagePreviewContentLayout) {
        this.A00 = imagePreviewContentLayout;
    }

    public void A00(Matrix matrix) {
        ImagePreviewContentLayout imagePreviewContentLayout = this.A00;
        imagePreviewContentLayout.A02.setZoomMatrixUpdated(matrix);
        imagePreviewContentLayout.A02.invalidate();
        imagePreviewContentLayout.invalidate();
    }

    public void A01(boolean z) {
        AnonymousClass2MK r0 = this.A00.A03;
        if (r0 == null) {
            return;
        }
        if (z) {
            ((MediaPreviewFragment) ((C54042eG) r0).A00).A02.A01();
        } else {
            ((MediaPreviewFragment) ((C54042eG) r0).A00).A02.A07(true);
        }
    }
}
