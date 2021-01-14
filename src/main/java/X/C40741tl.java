package X;

import com.whatsapp.SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment;
import com.whatsapp.SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment;

/* renamed from: X.1tl  reason: invalid class name and case insensitive filesystem */
public class C40741tl implements AbstractC07200Wh {
    public final ActivityC004902h A00;

    public C40741tl(ActivityC004902h r1) {
        this.A00 = r1;
    }

    public static void A00(ActivityC004902h r4) {
        AnonymousClass0LW A04 = r4.A04();
        if (A04 != null) {
            AnonymousClass0QB r3 = new AnonymousClass0QB(A04);
            r3.A0A(0, new SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment(), null, 1);
            r3.A01();
            return;
        }
        throw null;
    }

    public static void A01(ActivityC004902h r4) {
        AnonymousClass0LW A04 = r4.A04();
        if (A04 != null) {
            AnonymousClass0QB r3 = new AnonymousClass0QB(A04);
            r3.A0A(0, new SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment(), null, 1);
            r3.A01();
            return;
        }
        throw null;
    }

    @Override // X.AbstractC07200Wh
    public void AJ0(String str) {
        A01(this.A00);
    }

    @Override // X.AbstractC07200Wh
    public void AJ1() {
        A00(this.A00);
    }

    @Override // X.AbstractC07200Wh
    public void ALM(String str) {
        A01(this.A00);
    }

    @Override // X.AbstractC07200Wh
    public void ALN() {
        A00(this.A00);
    }
}
