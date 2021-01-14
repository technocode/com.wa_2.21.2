package X;

import android.graphics.Bitmap;
import com.whatsapp.mediaview.PhotoView;

/* renamed from: X.1wE  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C42151wE implements AnonymousClass2US {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ C42371wb A01;
    public final /* synthetic */ PhotoView A02;

    public /* synthetic */ C42151wE(C42371wb r1, PhotoView photoView, Bitmap bitmap) {
        this.A01 = r1;
        this.A02 = photoView;
        this.A00 = bitmap;
    }

    @Override // X.AnonymousClass2US
    public final void ALF(boolean z) {
        ActivityC004902h A0A;
        C42371wb r0 = this.A01;
        PhotoView photoView = this.A02;
        Bitmap bitmap = this.A00;
        if (z && (A0A = r0.A02.A0A()) != null && !A0A.isFinishing()) {
            photoView.A06(bitmap);
        }
    }
}
