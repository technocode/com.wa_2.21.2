package X;

import android.view.KeyEvent;
import com.whatsapp.WaEditText;

/* renamed from: X.3IR  reason: invalid class name */
public class AnonymousClass3IR implements AbstractC26561Lk {
    public final /* synthetic */ WaEditText A00;

    public AnonymousClass3IR(WaEditText waEditText) {
        this.A00 = waEditText;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        WaEditText waEditText = this.A00;
        if (waEditText != null) {
            waEditText.dispatchKeyEvent(new KeyEvent(0, 67));
            return;
        }
        throw null;
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00, iArr, 0);
    }
}
