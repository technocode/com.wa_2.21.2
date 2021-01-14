package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3UD  reason: invalid class name */
public class AnonymousClass3UD implements AbstractC12270hp {
    @Override // X.AbstractC12270hp
    public void APi(ImageView imageView, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    @Override // X.AbstractC12270hp
    public void APu(ImageView imageView) {
        imageView.setImageResource(R.drawable.avatar_contact_call);
    }
}
