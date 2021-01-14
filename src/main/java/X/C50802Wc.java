package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.2Wc  reason: invalid class name and case insensitive filesystem */
public class C50802Wc implements AnonymousClass2PK {
    public final /* synthetic */ C50822We A00;
    public final /* synthetic */ AbstractC48882Od A01;
    public final /* synthetic */ C60522pc A02;
    public final /* synthetic */ AnonymousClass2PJ A03;

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    public C50802Wc(C50822We r1, C60522pc r2, AnonymousClass2PJ r3, AbstractC48882Od r4) {
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    @Override // X.AnonymousClass2PK
    public void A2A() {
        C60522pc r1 = this.A02;
        r1.setBackgroundColor(this.A00.A01);
        r1.setImageDrawable(null);
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        C60522pc r3 = this.A02;
        if (r3.getTag() != this.A03) {
            return;
        }
        if (bitmap == MediaGalleryFragmentBase.A0O) {
            r3.setScaleType(ImageView.ScaleType.CENTER);
            AbstractC48882Od r6 = this.A01;
            int A9V = r6.A9V();
            if (A9V == 0) {
                r3.setBackgroundColor(this.A00.A01);
                r3.setImageResource(R.drawable.ic_missing_thumbnail_picture);
            } else if (A9V == 1 || A9V == 2) {
                r3.setBackgroundColor(this.A00.A01);
                r3.setImageResource(R.drawable.ic_missing_thumbnail_video);
            } else if (A9V == 3) {
                r3.setBackgroundColor(C004302a.A00(this.A00.A03.A0L, R.color.music_scrubber));
                r3.setImageResource(R.drawable.gallery_audio_item);
            } else if (A9V != 4) {
                r3.setBackgroundColor(this.A00.A01);
                r3.setImageResource(0);
            } else {
                C50822We r1 = this.A00;
                r3.setBackgroundColor(r1.A01);
                r3.setImageDrawable(AnonymousClass0ZD.A04(r1.A03.A0L, r6.A7T(), null, false));
            }
        } else {
            r3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            r3.setBackgroundResource(0);
            ((C59592ny) r3).A00 = bitmap;
            if (!z) {
                C50822We r12 = this.A00;
                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{r12.A02, new BitmapDrawable(r12.A03.A0L.getResources(), bitmap)});
                transitionDrawable.setCrossFadeEnabled(true);
                transitionDrawable.startTransition(150);
                r3.setImageDrawable(transitionDrawable);
                return;
            }
            r3.setImageBitmap(bitmap);
        }
    }
}
