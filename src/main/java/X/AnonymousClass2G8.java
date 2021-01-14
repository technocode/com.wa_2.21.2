package X;

import android.view.View;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.UnblockDialogFragment;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2G8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2G8 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ContactPickerFragment A00;

    public /* synthetic */ AnonymousClass2G8(ContactPickerFragment contactPickerFragment) {
        this.A00 = contactPickerFragment;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass2YM r2;
        C007003k A5O;
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
        if (i >= 0 && i < r2.getCount() && (A5O = ((AnonymousClass2GM) r2.A02.get(i)).A5O()) != null) {
            if (contactPickerFragment.A12.A0H((UserJid) A5O.A02(UserJid.class))) {
                AnonymousClass01X r6 = contactPickerFragment.A1O;
                boolean z = contactPickerFragment.A0p;
                int i2 = R.string.unblock_before_chat;
                if (z) {
                    i2 = R.string.unblock_before_call;
                }
                UnblockDialogFragment.A00(r6.A0D(i2, contactPickerFragment.A1F.A08(A5O, false)), R.string.blocked_title, false, new AnonymousClass2Y2(contactPickerFragment, A5O)).A0u(contactPickerFragment.A0A().A04(), null);
            } else if (!A5O.A0X) {
                contactPickerFragment.A15(A5O);
            } else if (contactPickerFragment.A0z || contactPickerFragment.A0t || contactPickerFragment.A0x || !contactPickerFragment.A1q.isEmpty()) {
                contactPickerFragment.A17(A5O, view);
            } else {
                contactPickerFragment.A1F(A5O, null);
            }
        }
    }
}
