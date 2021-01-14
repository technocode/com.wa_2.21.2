package X;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.2GH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2GH implements AdapterView.OnItemClickListener {
    public final /* synthetic */ PhoneContactsSelector A00;

    public /* synthetic */ AnonymousClass2GH(PhoneContactsSelector phoneContactsSelector) {
        this.A00 = phoneContactsSelector;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        PhoneContactsSelector phoneContactsSelector = this.A00;
        View findViewById = view.findViewById(R.id.selection_check);
        if (findViewById != null) {
            phoneContactsSelector.A0Y((C12310ht) findViewById.getTag());
        }
    }
}
