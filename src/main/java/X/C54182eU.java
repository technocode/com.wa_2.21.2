package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.MediaPreviewActivity;

/* renamed from: X.2eU  reason: invalid class name and case insensitive filesystem */
public class C54182eU implements AnonymousClass2PK {
    public final /* synthetic */ C60752q7 A00;
    public final /* synthetic */ C54202eW A01;
    public final /* synthetic */ AnonymousClass2PJ A02;

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    public C54182eU(C54202eW r1, C60752q7 r2, AnonymousClass2PJ r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass2PK
    public void A2A() {
        C60752q7 r1 = this.A00;
        r1.setBackgroundColor(this.A01.A02);
        r1.setImageDrawable(null);
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        C60752q7 r6 = this.A00;
        Object tag = r6.getTag();
        AnonymousClass2PJ r5 = this.A02;
        if (tag == r5) {
            if (bitmap == MediaGalleryFragmentBase.A0O) {
                r6.setScaleType(ImageView.ScaleType.CENTER);
                r6.setBackgroundColor(this.A01.A02);
                r6.setImageResource(R.drawable.ic_missing_thumbnail_picture);
            } else {
                r6.setScaleType(ImageView.ScaleType.CENTER_CROP);
                r6.setBackgroundResource(0);
                if (!z) {
                    C54202eW r1 = this.A01;
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{r1.A03, new BitmapDrawable(r1.A04.getResources(), bitmap)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    transitionDrawable.startTransition(150);
                    r6.setImageDrawable(transitionDrawable);
                } else {
                    r6.setImageBitmap(bitmap);
                }
            }
            this.A01.A04.A0D.A07(r5.A9J(), bitmap);
        }
        C54202eW r3 = this.A01;
        int i = r3.A00 + 1;
        r3.A00 = i;
        if (Math.min(r3.A05(), r3.A01) <= i) {
            MediaPreviewActivity.A07(r3.A04, 0);
        }
    }
}
