package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.3Ts  reason: invalid class name and case insensitive filesystem */
public class C72653Ts implements AbstractC12270hp {
    @Override // X.AbstractC12270hp
    public void APi(ImageView imageView, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.avatar_contact);
        }
    }

    @Override // X.AbstractC12270hp
    public void APu(ImageView imageView) {
        imageView.setImageResource(R.drawable.avatar_contact);
    }
}
