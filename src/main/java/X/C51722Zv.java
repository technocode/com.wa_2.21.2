package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2Zv  reason: invalid class name and case insensitive filesystem */
public class C51722Zv implements AnonymousClass0D9 {
    public final /* synthetic */ C59142n9 A00;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C51722Zv(C59142n9 r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        C002301g r0 = C002301g.A0K;
        if (r0 != null) {
            return (int) (r0.A00 * 252.0f);
        }
        throw null;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r5) {
        ImageView imageView = this.A00.A0C;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(R.drawable.media_location);
        }
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        ImageView imageView = this.A00.A0C;
        imageView.setImageDrawable(null);
        imageView.setBackgroundColor(-7829368);
    }
}
