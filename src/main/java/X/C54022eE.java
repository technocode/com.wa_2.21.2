package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.whatsapp.gallerypicker.ImagePreviewFragment;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.2eE  reason: invalid class name and case insensitive filesystem */
public class C54022eE implements AnonymousClass2PJ {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ ImagePreviewFragment A01;

    public C54022eE(ImagePreviewFragment imagePreviewFragment, Uri uri) {
        this.A01 = imagePreviewFragment;
        this.A00 = uri;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        return ((MediaPreviewFragment) this.A01).A00.toString();
    }

    @Override // X.AnonymousClass2PJ
    public Bitmap ABl() {
        try {
            ImagePreviewFragment imagePreviewFragment = this.A01;
            int A06 = imagePreviewFragment.A04.A06(AbstractC000400g.A3F);
            Bitmap A062 = imagePreviewFragment.A08.A06(this.A00, A06, A06);
            AnonymousClass2OT r1 = ((MediaPreviewFragment) imagePreviewFragment).A02;
            if (A062 == null) {
                Log.d("FilterUi/setMediaBitmap/mediaBitmap is null");
            } else {
                r1.A05 = A062;
                r1.A0C = false;
            }
            ((MediaPreviewFragment) imagePreviewFragment).A02.A03();
            return A062;
        } catch (C666835k | IOException | OutOfMemoryError e) {
            Log.e("imagepreview/loadbitmap", e);
            return null;
        }
    }
}
