package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.InviteNonWhatsAppContactPickerActivity;
import java.util.ArrayList;

/* renamed from: X.1NU  reason: invalid class name */
public class AnonymousClass1NU implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ AnonymousClass1NV A00;

    public AnonymousClass1NU(AnonymousClass1NV r1) {
        this.A00 = r1;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        AnonymousClass1NV r0 = this.A00;
        if (r0 == null) {
            return true;
        }
        C51362Yk r3 = ((InviteNonWhatsAppContactPickerActivity) r0).A04;
        ArrayList A03 = AnonymousClass1YB.A03(null, r3.A07);
        r3.A04.A07(0);
        r3.A00.A07(A03);
        return true;
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}
