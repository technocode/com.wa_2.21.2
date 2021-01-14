package X;

import android.content.DialogInterface;
import android.content.Intent;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;

/* renamed from: X.2G3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2G3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public /* synthetic */ AnonymousClass2G3(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ContactPickerFragment contactPickerFragment = this.A00;
        Intent intent = new Intent();
        ArrayList<String> arrayList = new ArrayList<>(1);
        Jid jid = contactPickerFragment.A0O.A09;
        if (jid != null) {
            arrayList.add(jid.getRawString());
            intent.putStringArrayListExtra("jids", arrayList);
            intent.putExtra("file_path", contactPickerFragment.A0o().getString("file_path"));
            contactPickerFragment.A0H.A01(intent);
            C002001d.A2N(contactPickerFragment.A0A(), 2);
            contactPickerFragment.A1a.A08(false, 1);
            contactPickerFragment.A0H.A00();
            return;
        }
        throw null;
    }
}
