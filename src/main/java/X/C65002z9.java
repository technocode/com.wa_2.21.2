package X;

import android.widget.CompoundButton;
import com.google.android.search.verification.client.R;
import com.whatsapp.RequestPermissionActivity;
import com.whatsapp.registration.ChangeNumberNotifyContacts;

/* renamed from: X.2z9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C65002z9 implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ChangeNumberNotifyContacts A00;

    public /* synthetic */ C65002z9(ChangeNumberNotifyContacts changeNumberNotifyContacts) {
        this.A00 = changeNumberNotifyContacts;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ChangeNumberNotifyContacts changeNumberNotifyContacts = this.A00;
        if (!z) {
            changeNumberNotifyContacts.A01 = 0;
            changeNumberNotifyContacts.A03.setVisibility(8);
            changeNumberNotifyContacts.A0B.clear();
            changeNumberNotifyContacts.A0V();
        } else if (!changeNumberNotifyContacts.A0E.A03()) {
            RequestPermissionActivity.A08(changeNumberNotifyContacts, R.string.permission_contacts_access_on_notify_contacts_change_number_request, R.string.permission_contacts_access_on_notify_contacts_change_number);
        } else {
            changeNumberNotifyContacts.A0U();
            changeNumberNotifyContacts.A0V();
        }
    }
}
