package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.2Zl  reason: invalid class name and case insensitive filesystem */
public class C51622Zl implements AnonymousClass0D9 {
    public final /* synthetic */ C60342pH A00;

    public C51622Zl(C60342pH r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return (int) (C002301g.A0K.A00 * 252.0f);
    }

    @Override // X.AnonymousClass0D9
    public void AG1() {
        this.A00.A0m();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r7) {
        C60342pH r3 = this.A00;
        if (bitmap != null) {
            ImageView imageView = r3.A06;
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
            r3.A04.setVisibility(0);
            return;
        }
        ImageView imageView2 = r3.A06;
        imageView2.setTag(null);
        imageView2.setVisibility(8);
        r3.A04.setVisibility(8);
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        C60342pH r3 = this.A00;
        ImageView imageView = r3.A06;
        imageView.setImageDrawable(new ColorDrawable(-7829368));
        imageView.setVisibility(0);
        r3.A04.setVisibility(0);
    }
}
