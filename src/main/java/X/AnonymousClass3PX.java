package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.3PX  reason: invalid class name */
public class AnonymousClass3PX implements AnonymousClass0D9 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3PY A01;

    @Override // X.AnonymousClass0D9
    public void AG1() {
    }

    public AnonymousClass3PX(AnonymousClass3PY r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    @Override // X.AnonymousClass0D9
    public int A96() {
        return this.A00;
    }

    @Override // X.AnonymousClass0D9
    public void APh(View view, Bitmap bitmap, AbstractC007503q r5) {
        AnonymousClass3PY r1 = this.A01;
        r1.A06.A06(bitmap);
        r1.A02 = true;
    }

    @Override // X.AnonymousClass0D9
    public void APt(View view) {
        AnonymousClass3PY r2 = this.A01;
        PhotoView photoView = r2.A06;
        photoView.A0J = null;
        photoView.A04 = 0.0f;
        r2.A02 = false;
    }
}
