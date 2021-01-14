package X;

import com.whatsapp.DeleteMessagesDialogFragment;
import com.whatsapp.RevokeNuxDialogFragment;

/* renamed from: X.1sL  reason: invalid class name and case insensitive filesystem */
public class C39931sL implements AnonymousClass0MF {
    public final /* synthetic */ DeleteMessagesDialogFragment A00;

    public C39931sL(DeleteMessagesDialogFragment deleteMessagesDialogFragment) {
        this.A00 = deleteMessagesDialogFragment;
    }

    @Override // X.AnonymousClass0MF
    public void AJF() {
        this.A00.A0w(false, false);
    }

    @Override // X.AnonymousClass0MF
    public void AK9() {
        new RevokeNuxDialogFragment().A0u(this.A00.A0C(), null);
    }
}
