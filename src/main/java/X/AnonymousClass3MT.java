package X;

import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;

/* renamed from: X.3MT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MT implements AbstractC011906z {
    public final /* synthetic */ ChangeNumber A00;

    public /* synthetic */ AnonymousClass3MT(ChangeNumber changeNumber) {
        this.A00 = changeNumber;
    }

    @Override // X.AbstractC011906z
    public final void AKi(Object obj) {
        ChangeNumber changeNumber = this.A00;
        Log.i("changenumber/smsretriever/onsuccess");
        changeNumber.A0X(true);
    }
}
