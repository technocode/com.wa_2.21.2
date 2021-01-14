package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import com.whatsapp.BidiToolbar;
import com.whatsapp.ViewProfilePhoto;

/* renamed from: X.1u9  reason: invalid class name and case insensitive filesystem */
public class C40931u9 implements AnonymousClass2PS {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Drawable A01;
    public final /* synthetic */ BidiToolbar A02;
    public final /* synthetic */ ViewProfilePhoto A03;
    public final /* synthetic */ boolean A04;

    @Override // X.AnonymousClass2PS
    public void AFL(int i) {
    }

    @Override // X.AnonymousClass2PS
    public void AK2(View view) {
    }

    public C40931u9(ViewProfilePhoto viewProfilePhoto, boolean z, Drawable drawable, BidiToolbar bidiToolbar, int i) {
        this.A03 = viewProfilePhoto;
        this.A04 = z;
        this.A01 = drawable;
        this.A02 = bidiToolbar;
        this.A00 = i;
    }

    @Override // X.AnonymousClass2PS
    public void AF9(View view) {
        if (this.A04) {
            this.A03.onBackPressed();
            return;
        }
        ViewProfilePhoto viewProfilePhoto = this.A03;
        viewProfilePhoto.finish();
        viewProfilePhoto.overridePendingTransition(0, 0);
    }

    @Override // X.AnonymousClass2PS
    public void AKE(View view, float f) {
        float f2;
        int i;
        float f3 = 1.0f - f;
        if (f3 < 0.8f) {
            f2 = 0.0f;
        } else {
            f2 = (f3 - 0.8f) / 0.19999999f;
        }
        this.A01.setAlpha((int) (255.0f * f2));
        this.A02.setAlpha(f2);
        if (Build.VERSION.SDK_INT >= 21 && (i = this.A00) != 0) {
            this.A03.getWindow().setStatusBarColor(C004402b.A04(i, -16777216, f2));
        }
    }
}
