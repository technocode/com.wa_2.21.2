package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2dy  reason: invalid class name and case insensitive filesystem */
public class C53872dy implements AnonymousClass0D9 {
    public final /* synthetic */ C53882dz A00;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C53872dy(C53882dz r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00.A04.A06.A03();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r6) {
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
            ImageView imageView = this.A00.A02;
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.ic_business);
            imageView.setBackgroundColor(C004302a.A00(imageView.getContext(), R.color.white));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            return;
        }
        ImageView imageView2 = this.A00.A02;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setImageBitmap(bitmap);
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        ImageView imageView = this.A00.A02;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(new ColorDrawable(-7829368));
    }
}
