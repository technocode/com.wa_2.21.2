package X;

import android.content.DialogInterface;
import com.google.android.search.verification.client.R;
import com.whatsapp.dialogs.CreateOrAddToContactsDialog;
import java.util.List;

/* renamed from: X.2Lp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class DialogInterface$OnClickListenerC48282Lp implements DialogInterface.OnClickListener {
    public final /* synthetic */ CreateOrAddToContactsDialog A00;
    public final /* synthetic */ List A01;

    public /* synthetic */ DialogInterface$OnClickListenerC48282Lp(CreateOrAddToContactsDialog createOrAddToContactsDialog, List list) {
        this.A00 = createOrAddToContactsDialog;
        this.A01 = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateOrAddToContactsDialog createOrAddToContactsDialog = this.A00;
        List list = this.A01;
        if (createOrAddToContactsDialog.A00 == null) {
            throw null;
        } else if (((C48322Lt) list.get(i)).A00 == R.id.menuitem_conversations_add_new_contact) {
            createOrAddToContactsDialog.A00.AEl();
        } else {
            createOrAddToContactsDialog.A00.ACd();
        }
    }
}
