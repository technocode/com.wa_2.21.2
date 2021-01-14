package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import com.whatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.gallerypicker.GalleryPickerFragment;

/* renamed from: X.2eC  reason: invalid class name and case insensitive filesystem */
public class C54002eC implements AnonymousClass2PK {
    public final /* synthetic */ AbstractC48882Od A00;
    public final /* synthetic */ View$OnClickListenerC54012eD A01;
    public final /* synthetic */ AnonymousClass2PJ A02;

    @Override // X.AnonymousClass2PK
    public /* synthetic */ void AFq() {
    }

    public C54002eC(View$OnClickListenerC54012eD r1, AnonymousClass2PJ r2, AbstractC48882Od r3) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
    }

    @Override // X.AnonymousClass2PK
    public void A2A() {
        View$OnClickListenerC54012eD r0 = this.A01;
        ImageView imageView = r0.A02;
        imageView.setBackgroundColor(r0.A05.A01);
        imageView.setImageDrawable(null);
    }

    @Override // X.AnonymousClass2PK
    public void AKg(Bitmap bitmap, boolean z) {
        View$OnClickListenerC54012eD r2 = this.A01;
        ImageView imageView = r2.A02;
        if (imageView.getTag() == this.A02) {
            GalleryPickerFragment galleryPickerFragment = r2.A05;
            if (galleryPickerFragment.A0A() == null) {
                return;
            }
            if (bitmap == MediaGalleryFragmentBase.A0O) {
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setBackgroundColor(galleryPickerFragment.A01);
                AbstractC48882Od r5 = this.A00;
                int A9V = r5.A9V();
                if (A9V == 0) {
                    imageView.setBackgroundColor(galleryPickerFragment.A01);
                    imageView.setImageResource(R.drawable.ic_missing_thumbnail_picture);
                } else if (A9V == 1 || A9V == 2) {
                    imageView.setBackgroundColor(galleryPickerFragment.A01);
                    imageView.setImageResource(R.drawable.ic_missing_thumbnail_video);
                } else if (A9V == 3) {
                    imageView.setBackgroundColor(C004302a.A00(galleryPickerFragment.A00(), R.color.music_scrubber));
                    imageView.setImageResource(R.drawable.gallery_audio_item);
                } else if (A9V != 4) {
                    imageView.setBackgroundColor(galleryPickerFragment.A01);
                    imageView.setImageResource(0);
                } else {
                    imageView.setBackgroundColor(galleryPickerFragment.A01);
                    imageView.setImageDrawable(AnonymousClass0ZD.A04(galleryPickerFragment.A0A(), r5.A7T(), null, false));
                }
            } else {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setBackgroundResource(0);
                if (!z) {
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{galleryPickerFragment.A05, new BitmapDrawable(galleryPickerFragment.A02(), bitmap)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    transitionDrawable.startTransition(150);
                    imageView.setImageDrawable(transitionDrawable);
                    return;
                }
                imageView.setImageBitmap(bitmap);
            }
        }
    }
}
