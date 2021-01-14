package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.PaymentContactPickerFragment;

/* renamed from: X.2GD  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2GD implements AdapterView.OnItemLongClickListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public /* synthetic */ AnonymousClass2GD(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass2YM r2;
        boolean z;
        ContactPickerFragment contactPickerFragment = this.A00;
        ListAdapter adapter = contactPickerFragment.A0A.getAdapter();
        if (adapter instanceof HeaderViewListAdapter) {
            r2 = (AnonymousClass2YM) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
        } else {
            r2 = (AnonymousClass2YM) adapter;
        }
        ListAdapter adapter2 = contactPickerFragment.A0A.getAdapter();
        if (adapter2 instanceof HeaderViewListAdapter) {
            i -= ((HeaderViewListAdapter) adapter2).getHeadersCount();
        }
        if (i < 0 || i >= contactPickerFragment.A0I.getCount()) {
            return true;
        }
        C007003k A5O = ((AnonymousClass2GM) r2.A02.get(i)).A5O();
        if (A5O == null || !A5O.A0X || contactPickerFragment.A12.A0H((UserJid) A5O.A02(UserJid.class))) {
            return false;
        }
        if (!(contactPickerFragment instanceof PaymentContactPickerFragment)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        contactPickerFragment.A17(A5O, view);
        return true;
    }
}
