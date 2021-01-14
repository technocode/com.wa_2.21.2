package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPreviewActivity;
import com.whatsapp.gallerypicker.MediaPreviewFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.2eT  reason: invalid class name and case insensitive filesystem */
public class C54172eT implements AnonymousClass2PJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Uri A01;
    public final /* synthetic */ Uri A02;
    public final /* synthetic */ C60752q7 A03;
    public final /* synthetic */ C54202eW A04;
    public final /* synthetic */ AnonymousClass2PG A05;

    public C54172eT(C54202eW r1, C60752q7 r2, Uri uri, Uri uri2, int i, AnonymousClass2PG r6) {
        this.A04 = r1;
        this.A03 = r2;
        this.A02 = uri;
        this.A01 = uri2;
        this.A00 = i;
        this.A05 = r6;
    }

    @Override // X.AnonymousClass2PJ
    public String A9J() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A02.toString());
        sb.append("-thumb");
        return sb.toString();
    }

    @Override // X.AnonymousClass2PJ
    public Bitmap ABl() {
        Rect rect;
        Bitmap bitmap = null;
        if (this.A03.getTag() != this) {
            return null;
        }
        MediaPreviewActivity mediaPreviewActivity = this.A04.A04;
        C02220Bc r2 = mediaPreviewActivity.A1C;
        byte A052 = r2.A05(this.A02);
        if (A052 == 1) {
            try {
                Uri uri = this.A01;
                int i = this.A00;
                bitmap = r2.A06(uri, i, i);
            } catch (C666835k | IOException unused) {
                bitmap = MediaGalleryFragmentBase.A0O;
            }
        } else if (A052 == 3 || A052 == 13) {
            File A042 = this.A05.A04();
            if (A042 != null) {
                Bitmap A0V = C002001d.A0V(A042);
                if (A0V != null) {
                    Bitmap.Config config = A0V.getConfig();
                    int i2 = this.A00;
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = Bitmap.createBitmap(i2, i2, config);
                    Canvas canvas = new Canvas(bitmap);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    paint.setFilterBitmap(true);
                    paint.setDither(true);
                    int width = A0V.getWidth();
                    int height = A0V.getHeight();
                    if (width > height) {
                        rect = new Rect((width - height) >> 1, 0, (width + height) >> 1, height);
                    } else {
                        rect = new Rect(0, (height - width) >> 1, width, (height + width) >> 1);
                    }
                    canvas.drawBitmap(A0V, rect, new Rect(0, 0, i2, i2), paint);
                    A0V.recycle();
                } else {
                    bitmap = MediaGalleryFragmentBase.A0O;
                }
            } else {
                throw null;
            }
        }
        MediaPreviewFragment A0V2 = mediaPreviewActivity.A0V();
        if (bitmap != null) {
            AnonymousClass2PG r1 = this.A05;
            if (!(r1.A07() == null || A0V2 == null)) {
                try {
                    if (!bitmap.isMutable()) {
                        bitmap = bitmap.copy(Bitmap.Config.ARGB_8888, true);
                    }
                    AnonymousClass2Mt r11 = new AnonymousClass2Mt();
                    r11.A08(r1.A07(), mediaPreviewActivity, ((ActivityC004702f) mediaPreviewActivity).A0M, mediaPreviewActivity.A0k, mediaPreviewActivity.A12, ((AnonymousClass2C0) mediaPreviewActivity).A01, A0V2.A0D);
                    r11.A03(bitmap, 0, false, false);
                } catch (Exception unused2) {
                    Log.d("mediapreview/cannot create thumbnail with doodle");
                }
            }
        }
        return bitmap == null ? MediaGalleryFragmentBase.A0O : bitmap;
    }
}
