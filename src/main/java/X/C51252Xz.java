package X;

import android.text.Editable;
import com.whatsapp.components.PhoneNumberEntry;

/* renamed from: X.2Xz  reason: invalid class name and case insensitive filesystem */
public class C51252Xz extends AnonymousClass34Y {
    public final /* synthetic */ PhoneNumberEntry A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51252Xz(PhoneNumberEntry phoneNumberEntry, String str) {
        super(str);
        this.A00 = phoneNumberEntry;
    }

    @Override // X.AnonymousClass34Y
    public synchronized void afterTextChanged(Editable editable) {
        super.afterTextChanged(editable);
        AbstractC46882Fk r1 = this.A00.A03;
        if (r1 != null && (r1 instanceof C70773Mi)) {
            ((C70773Mi) r1).A00.A0X();
        }
    }
}
