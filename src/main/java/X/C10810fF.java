package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.0fF  reason: invalid class name and case insensitive filesystem */
public class C10810fF implements AnonymousClass0D9 {
    public final int A00;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C10810fF(Context context) {
        this.A00 = context.getResources().getDimensionPixelSize(R.dimen.status_thumbnail_size);
    }

    public static int A00(AbstractC007503q r1) {
        byte b = r1.A0m;
        if (b == 1 || b == 3 || b == 23 || b == 37) {
            return R.drawable.ic_thumbnail_status_unavailable;
        }
        return R.drawable.circle_shade_big;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r4) {
        ImageView imageView = (ImageView) view;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(A00(r4));
        }
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageResource(R.drawable.circle_shade_big);
        }
    }
}
