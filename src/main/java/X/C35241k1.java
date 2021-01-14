package X;

import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.1k1  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C35241k1 implements AbstractC27861Rw {
    public static final /* synthetic */ C35241k1 A00 = new C35241k1();

    @Override // X.AbstractC27861Rw
    public final void AH7(C42301wU r4) {
        ImageView imageView = (ImageView) r4.A09.get();
        if (imageView != null) {
            imageView.setBackgroundResource(R.color.light_gray);
            imageView.setImageResource(R.drawable.product_broken_image);
            C002001d.A2m(imageView, C004302a.A00(imageView.getContext(), R.color.black_alpha_20));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
        }
    }
}
