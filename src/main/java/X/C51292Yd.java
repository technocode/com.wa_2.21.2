package X;

import android.view.KeyEvent;
import com.whatsapp.contact.picker.SharedTextPreviewDialogFragment;

/* renamed from: X.2Yd  reason: invalid class name and case insensitive filesystem */
public class C51292Yd implements AbstractC26561Lk {
    public final /* synthetic */ SharedTextPreviewDialogFragment A00;

    public C51292Yd(SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment) {
        this.A00 = sharedTextPreviewDialogFragment;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A02.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00.A02, iArr, 0);
    }
}
