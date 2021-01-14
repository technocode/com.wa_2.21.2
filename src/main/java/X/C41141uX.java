package X;

import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.registration.EULA;

/* renamed from: X.1uX  reason: invalid class name and case insensitive filesystem */
public class C41141uX implements AnonymousClass1P5 {
    public final /* synthetic */ DeleteAccountConfirmation A00;

    public C41141uX(DeleteAccountConfirmation deleteAccountConfirmation) {
        this.A00 = deleteAccountConfirmation;
    }

    @Override // X.AnonymousClass1P5
    public void AHI() {
        DeleteAccountConfirmation deleteAccountConfirmation = this.A00;
        C002001d.A2N(deleteAccountConfirmation, 1);
        deleteAccountConfirmation.A0I(EULA.A04(deleteAccountConfirmation), true);
    }

    @Override // X.AnonymousClass1P5
    public void AHJ() {
        this.A00.A01.removeMessages(0);
    }
}
