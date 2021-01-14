package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.google.android.search.verification.client.R;

/* renamed from: X.2a3  reason: invalid class name and case insensitive filesystem */
public class C51802a3 implements AnonymousClass0D9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass2IP A01;
    public final /* synthetic */ Bitmap[] A02;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C51802a3(AnonymousClass2IP r1, Bitmap[] bitmapArr, int i) {
        this.A01 = r1;
        this.A02 = bitmapArr;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r6) {
        ImageView imageView = this.A01.A04;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            this.A02[0] = bitmap;
            return;
        }
        imageView.setBackgroundColor(C004302a.A00(imageView.getContext(), R.color.primary_surface));
        imageView.setImageDrawable(null);
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        this.A01.A04.setBackgroundColor(-7829368);
    }
}
