package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.0D8  reason: invalid class name */
public class AnonymousClass0D8 implements AnonymousClass0D9 {
    public final /* synthetic */ C02580Cq A00;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public AnonymousClass0D8(C02580Cq r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00.A03();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r4) {
        if (bitmap != null && (view instanceof ImageView)) {
            ((ImageView) view).setImageBitmap(bitmap);
        }
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        if (view instanceof ImageView) {
            ((ImageView) view).setImageDrawable(new ColorDrawable(-7829368));
        }
    }
}
