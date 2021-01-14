package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2dj  reason: invalid class name and case insensitive filesystem */
public class C53722dj implements AnonymousClass0D9 {
    public final /* synthetic */ C53732dk A00;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C53722dj(C53732dk r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00.A0B.A05.A03();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r7) {
        if (bitmap == null || bitmap.getHeight() == 0 || bitmap.getWidth() == 0) {
            ImageView imageView = this.A00.A06;
            imageView.setVisibility(0);
            imageView.setImageDrawable(C002001d.A0b(imageView.getContext(), R.drawable.ic_group_invite_link, R.color.white_alpha_80));
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            imageView.setScaleY(1.5f);
            imageView.setScaleX(1.5f);
            imageView.setBackgroundColor(C004302a.A00(imageView.getContext(), R.color.media_link_thumbnail_background));
            return;
        }
        ImageView imageView2 = this.A00.A06;
        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView2.setImageBitmap(bitmap);
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        ImageView imageView = this.A00.A06;
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageDrawable(new ColorDrawable(-7829368));
    }
}
