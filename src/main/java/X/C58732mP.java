package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.2mP  reason: invalid class name and case insensitive filesystem */
public class C58732mP implements AnonymousClass0D9 {
    public final int A00;
    public final ImageView A01;
    public final C02580Cq A02;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C58732mP(C02580Cq r1, ImageView imageView, int i) {
        this.A02 = r1;
        this.A01 = imageView;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A02.A03();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r5) {
        ImageView imageView = this.A01;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(this.A00);
        }
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A01.setImageDrawable(new ColorDrawable(-7829368));
    }
}
