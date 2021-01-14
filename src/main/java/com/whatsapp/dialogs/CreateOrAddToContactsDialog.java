package com.whatsapp.dialogs;

import X.AbstractC48332Lu;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.C48322Lt;
import X.DialogInterface$OnClickListenerC48282Lp;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.ArrayList;

public class CreateOrAddToContactsDialog extends WaDialogFragment {
    public AbstractC48332Lu A00;
    public final AnonymousClass01X A01 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        AnonymousClass01X r3 = this.A01;
        arrayList.add(new C48322Lt(r3.A06(R.string.create_contact), R.id.menuitem_conversations_add_new_contact));
        arrayList.add(new C48322Lt(r3.A06(R.string.add_exist), R.id.menuitem_conversations_add_to_existing_contact));
        AnonymousClass0MB r32 = new AnonymousClass0MB(A00());
        ArrayAdapter arrayAdapter = new ArrayAdapter(A00(), 17367043, arrayList);
        DialogInterface$OnClickListenerC48282Lp r1 = new DialogInterface$OnClickListenerC48282Lp(this, arrayList);
        AnonymousClass0MC r0 = r32.A01;
        r0.A0D = arrayAdapter;
        r0.A05 = r1;
        return r32.A00();
    }
}
