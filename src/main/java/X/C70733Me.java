package X;

import android.view.KeyEvent;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.3Me  reason: invalid class name and case insensitive filesystem */
public class C70733Me implements AbstractC26561Lk {
    public final /* synthetic */ RegisterName A00;

    public C70733Me(RegisterName registerName) {
        this.A00 = registerName;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A09.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        C002001d.A2l(this.A00.A09, iArr, 25);
    }
}
