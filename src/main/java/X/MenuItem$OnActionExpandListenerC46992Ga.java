package X;

import android.view.MenuItem;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.2Ga  reason: invalid class name and case insensitive filesystem */
public class MenuItem$OnActionExpandListenerC46992Ga implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ PhoneContactsSelector A00;

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }

    public MenuItem$OnActionExpandListenerC46992Ga(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        PhoneContactsSelector phoneContactsSelector = this.A00;
        phoneContactsSelector.A0D = null;
        PhoneContactsSelector.A05(phoneContactsSelector);
        return true;
    }
}
