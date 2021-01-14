package X;

import android.view.KeyEvent;
import com.whatsapp.group.NewGroup;

/* renamed from: X.2fv  reason: invalid class name and case insensitive filesystem */
public class C55052fv implements AbstractC26561Lk {
    public final /* synthetic */ NewGroup A00;

    public C55052fv(NewGroup newGroup) {
        this.A00 = newGroup;
    }

    @Override // X.AbstractC26561Lk
    public void ADI() {
        this.A00.A08.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    @Override // X.AbstractC26561Lk
    public void AFR(int[] iArr) {
        NewGroup newGroup = this.A00;
        C002001d.A2l(newGroup.A08, iArr, newGroup.A0E.A06(AbstractC000400g.A40));
    }
}
