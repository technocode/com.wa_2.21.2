package X;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2GG  reason: invalid class name */
public final /* synthetic */ class AnonymousClass2GG implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass0QH A00;

    public /* synthetic */ AnonymousClass2GG(AnonymousClass0QH r1) {
        this.A00 = r1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        AnonymousClass0QH r3 = this.A00;
        View findViewById = view.findViewById(R.id.selection_check);
        if (findViewById != null) {
            C007003k r2 = (C007003k) findViewById.getTag();
            if (r3.A0O.A0H((UserJid) r2.A02(UserJid.class))) {
                r3.A0j(r2);
            } else {
                r3.A0i(r2);
            }
        }
    }
}
