package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.2aH  reason: invalid class name and case insensitive filesystem */
public class C51932aH implements AnonymousClass0D9 {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass2Iq A01;
    public final /* synthetic */ AbstractC007503q A02;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C51932aH(AnonymousClass2Iq r1, AbstractC007503q r2, ImageView imageView) {
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = imageView;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A01.A0E.A03();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r5) {
        if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            AbstractC007503q r1 = this.A02;
            if (!(r1 instanceof C02850Ds) && !(r1 instanceof AnonymousClass0ZE)) {
                ImageView imageView = this.A00;
                imageView.setVisibility(0);
                imageView.setImageBitmap(bitmap);
                return;
            }
        }
        this.A00.setVisibility(8);
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A00.setImageDrawable(new ColorDrawable(-7829368));
    }
}
