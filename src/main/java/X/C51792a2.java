package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.android.search.verification.client.R;

/* renamed from: X.2a2  reason: invalid class name and case insensitive filesystem */
public class C51792a2 implements AnonymousClass0D9 {
    public final /* synthetic */ C60452pS A00;

    public C51792a2(C60452pS r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return (AbstractC59162nB.A04(this.A00.getContext()) * 72) / 100;
    }

    @Override // X.AnonymousClass0D9
    public void AG1() {
        this.A00.A0m();
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r7) {
        if (bitmap != null) {
            C60452pS r2 = this.A00;
            C60452pS.setThumbnail(r2, new BitmapDrawable(r2.getContext().getResources(), bitmap));
            r2.A0D.A00(bitmap.getWidth(), bitmap.getHeight(), false);
            return;
        }
        C60452pS r22 = this.A00;
        r22.A00 = false;
        C60452pS.setThumbnail(r22, new ColorDrawable(C004302a.A00(r22.getContext(), R.color.dark_gray)));
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        C60452pS r2 = this.A00;
        r2.A00 = false;
        C60452pS.setThumbnail(r2, new ColorDrawable(-7829368));
    }
}
