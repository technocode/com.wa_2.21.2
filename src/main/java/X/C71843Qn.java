package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.3Qn  reason: invalid class name and case insensitive filesystem */
public class C71843Qn implements AnonymousClass33Y {
    public final String A00;
    public final WeakReference A01;

    public C71843Qn(ImageView imageView, String str) {
        this.A01 = new WeakReference(imageView);
        this.A00 = str;
        imageView.setTag(str);
    }

    @Override // X.AnonymousClass33Y
    public void AH1(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // X.AnonymousClass33Y
    public void AH8() {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageResource(R.drawable.selector_sticker_pack_error);
        }
    }

    @Override // X.AnonymousClass33Y
    public void AHD(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A01.get();
        if (imageView != null && this.A00.equals(imageView.getTag())) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
