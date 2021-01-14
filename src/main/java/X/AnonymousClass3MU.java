package X;

import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3MU  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MU implements AbstractC011806y {
    public final /* synthetic */ ChangeNumber A00;

    public /* synthetic */ AnonymousClass3MU(ChangeNumber changeNumber) {
        this.A00 = changeNumber;
    }

    @Override // X.AbstractC011806y
    public final void AFt(Exception exc) {
        ChangeNumber changeNumber = this.A00;
        Log.e("changenumber/smsretriever/onfailure/ ", exc);
        changeNumber.A0V();
    }
}
