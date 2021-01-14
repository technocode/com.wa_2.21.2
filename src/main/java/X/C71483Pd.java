package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3Pd  reason: invalid class name and case insensitive filesystem */
public class C71483Pd implements AnonymousClass0D9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C71493Pe A01;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public C71483Pd(C71493Pe r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r4) {
        this.A01.A0G.A06(bitmap);
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        PhotoView photoView = this.A01.A0G;
        photoView.A0J = null;
        photoView.A04 = 0.0f;
    }
}
