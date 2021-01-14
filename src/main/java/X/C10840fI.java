package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;
import java.lang.ref.WeakReference;

/* renamed from: X.0fI  reason: invalid class name and case insensitive filesystem */
public class C10840fI extends AnonymousClass0JW {
    public final float A00;
    public final int A01;
    public final C002301g A02;
    public final AnonymousClass0HJ A03;
    public final AnonymousClass0HK A04;
    public final C007003k A05;
    public final WeakReference A06;

    public C10840fI(C002301g r3, AnonymousClass0HJ r4, AnonymousClass0HK r5, C007003k r6, ImageView imageView) {
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A01 = imageView.getContext().getResources().getDimensionPixelSize(R.dimen.conversation_profile_photo_size);
        this.A00 = imageView.getContext().getResources().getDimension(R.dimen.small_avatar_radius);
        this.A06 = new WeakReference(imageView);
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        ImageView imageView = (ImageView) this.A06.get();
        if (imageView != null) {
            if (bitmap == null) {
                AnonymousClass0HJ r3 = this.A03;
                bitmap = r3.A00.A00(imageView.getContext(), r3.A03(this.A05));
            }
            imageView.setImageDrawable(new AnonymousClass2HW(this.A02, imageView.getContext().getResources(), bitmap));
            imageView.setVisibility(0);
        }
    }
}
