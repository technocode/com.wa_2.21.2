package X;

import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.3GR  reason: invalid class name */
public class AnonymousClass3GR implements AnonymousClass34f {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass1VM A01;
    public final /* synthetic */ C62942vb A02;
    public final /* synthetic */ boolean A03;

    @Override // X.AnonymousClass34f
    public void AKx() {
    }

    public AnonymousClass3GR(C62942vb r1, boolean z, AnonymousClass1VM r3, ImageView imageView) {
        this.A02 = r1;
        this.A03 = z;
        this.A01 = r3;
        this.A00 = imageView;
    }

    @Override // X.AnonymousClass34f
    public void AH4() {
        StringBuilder A0S = AnonymousClass008.A0S("PAY: Failed to display card art, empty image shown. Re-fetch ");
        boolean z = this.A03;
        A0S.append(z);
        Log.w(A0S.toString());
        if (z) {
            this.A02.A01(this.A01, this.A00);
        }
    }
}
