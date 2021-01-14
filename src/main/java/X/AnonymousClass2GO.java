package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.2GO  reason: invalid class name */
public class AnonymousClass2GO implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    public AnonymousClass2GO(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        ContactPickerFragment contactPickerFragment = this.A00;
        contactPickerFragment.A0c = null;
        contactPickerFragment.A0t();
        return true;
    }
}
