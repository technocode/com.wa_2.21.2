package X;

import android.graphics.Bitmap;
import com.whatsapp.components.button.ThumbnailButton;

/* renamed from: X.2ZY  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2ZY implements AnonymousClass0SG {
    public final /* synthetic */ C59202nF A00;

    public /* synthetic */ AnonymousClass2ZY(C59202nF r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0SG
    public final void ADy(Object obj) {
        C59202nF r0 = this.A00;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ThumbnailButton thumbnailButton = r0.A05;
            thumbnailButton.setImageBitmap(bitmap);
            thumbnailButton.setVisibility(0);
            return;
        }
        ThumbnailButton thumbnailButton2 = r0.A05;
        thumbnailButton2.setImageDrawable(null);
        thumbnailButton2.setVisibility(8);
    }
}
