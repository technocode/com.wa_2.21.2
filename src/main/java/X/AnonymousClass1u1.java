package X;

import android.view.KeyEvent;
import com.whatsapp.TextStatusComposerActivity;

/* renamed from: X.1u1  reason: invalid class name */
public class AnonymousClass1u1 implements AbstractC26561Lk {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public AnonymousClass1u1(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A08.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00.A08, iArr, 0);
    }
}
