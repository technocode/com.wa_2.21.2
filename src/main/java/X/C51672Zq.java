package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Zq  reason: invalid class name and case insensitive filesystem */
public class C51672Zq implements AnonymousClass0D9 {
    public final /* synthetic */ C60372pK A00;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C51672Zq(C60372pK r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return (AbstractC59162nB.A04(this.A00.getContext()) * 72) / 200;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r4) {
        ImageView imageView = (ImageView) view;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.media_image);
        }
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        ImageView imageView = (ImageView) view;
        imageView.setImageDrawable(null);
        imageView.setBackgroundColor(-7829368);
    }
}
