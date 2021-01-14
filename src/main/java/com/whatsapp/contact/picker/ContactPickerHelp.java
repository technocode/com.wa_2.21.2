package com.whatsapp.contact.picker;

import X.ActivityC004602e;
import X.AnonymousClass0S2;
import X.AnonymousClass2C0;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.search.verification.client.R;

public class ContactPickerHelp extends ActivityC004602e {
    @Override // X.AnonymousClass2C0, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(((AnonymousClass2C0) this).A01.A06(R.string.contacts_help));
        AnonymousClass0S2 A09 = A09();
        if (A09 != null) {
            A09.A0A(true);
            setContentView(R.layout.contact_picker_help);
            findViewById(R.id.scroll_view).post(new RunnableEBaseShape8S0100000_I1_3(this, 42));
            return;
        }
        throw null;
    }

    @Override // X.ActivityC004702f
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}
