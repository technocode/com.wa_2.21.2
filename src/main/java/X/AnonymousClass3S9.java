package X;

import android.graphics.Bitmap;
import java.lang.ref.SoftReference;

/* renamed from: X.3S9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3S9 implements AnonymousClass0DE {
    public final /* synthetic */ C02580Cq A00;

    public /* synthetic */ AnonymousClass3S9(C02580Cq r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0DE
    public final void AJH(String str, Bitmap bitmap) {
        this.A00.A06.put(str, new SoftReference(bitmap));
    }
}
