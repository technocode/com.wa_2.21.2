package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0ho  reason: invalid class name and case insensitive filesystem */
public class C12260ho implements AbstractC12270hp {
    public final AnonymousClass0HJ A00;
    public final C007003k A01;

    public C12260ho(AnonymousClass0HJ r2) {
        this.A00 = r2;
        this.A01 = null;
    }

    public C12260ho(AnonymousClass0HJ r1, C007003k r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    @Override // X.AbstractC12270hp
    public void APi(ImageView imageView, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null || z) {
                imageView.setImageBitmap(bitmap);
                return;
            }
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                if (layerDrawable.getNumberOfLayers() > 0) {
                    drawable = layerDrawable.getDrawable(layerDrawable.getNumberOfLayers() - 1);
                }
            }
            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, new BitmapDrawable(bitmap)});
            transitionDrawable.setCrossFadeEnabled(false);
            transitionDrawable.startTransition(300);
            imageView.setImageDrawable(transitionDrawable);
            return;
        }
        APu(imageView);
    }

    @Override // X.AbstractC12270hp
    public void APu(ImageView imageView) {
        int A03;
        C007003k r1 = this.A01;
        if (r1 == null) {
            A03 = R.drawable.avatar_contact;
        } else {
            A03 = this.A00.A03(r1);
        }
        AnonymousClass0HJ r0 = this.A00;
        Bitmap A002 = r0.A00.A00(imageView.getContext(), A03);
        if (!(imageView.getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable) imageView.getDrawable()).getBitmap() != A002) {
            imageView.setImageBitmap(A002);
        }
    }
}
