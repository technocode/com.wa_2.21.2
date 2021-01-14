package X;

import android.graphics.drawable.Drawable;
import com.google.android.search.verification.client.R;

/* renamed from: X.22x  reason: invalid class name and case insensitive filesystem */
public final class C450822x implements AbstractC28311Tv {
    public final /* synthetic */ AnonymousClass02M A00;

    @Override // X.AbstractC28311Tv
    public void A2k() {
    }

    @Override // X.AbstractC28311Tv
    public void ARJ() {
    }

    public C450822x(AnonymousClass02M r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC28311Tv
    public void APM(Drawable drawable) {
        if (drawable == null) {
            this.A00.A06(R.string.wallpaper_reset, 0);
        } else {
            this.A00.A06(R.string.wallpaper_set_successful, 0);
        }
    }
}
