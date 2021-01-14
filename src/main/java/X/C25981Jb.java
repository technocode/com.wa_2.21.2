package X;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.StatusConfirmMuteDialogFragment;
import com.whatsapp.StatusConfirmUnmuteDialogFragment;
import com.whatsapp.StatusesFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1Jb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25981Jb implements AdapterView.OnItemLongClickListener {
    public final /* synthetic */ StatusesFragment A00;

    public /* synthetic */ C25981Jb(StatusesFragment statusesFragment) {
        this.A00 = statusesFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        StatusesFragment statusesFragment = this.A00;
        C27071Nv r3 = (C27071Nv) view.getTag();
        ActivityC004902h A0A = statusesFragment.A0A();
        if (A0A == null) {
            throw null;
        } else if (r3 == null) {
            return false;
        } else {
            UserJid userJid = r3.A01;
            if (AnonymousClass02Z.A02(userJid) || AnonymousClass1VY.A0a(userJid) || A0A.A04().A0s()) {
                return false;
            }
            AnonymousClass0BB r0 = statusesFragment.A0m;
            if (userJid != null) {
                boolean z = r0.A08(userJid).A0G;
                UserJid userJid2 = r3.A01;
                if (z) {
                    StatusConfirmUnmuteDialogFragment statusConfirmUnmuteDialogFragment = new StatusConfirmUnmuteDialogFragment();
                    Bundle bundle = new Bundle();
                    bundle.putString("jid", userJid2.getRawString());
                    statusConfirmUnmuteDialogFragment.A0N(bundle);
                    C008805h.A17(statusesFragment, statusConfirmUnmuteDialogFragment);
                    return true;
                }
                StatusConfirmMuteDialogFragment statusConfirmMuteDialogFragment = new StatusConfirmMuteDialogFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString("jid", userJid2.getRawString());
                statusConfirmMuteDialogFragment.A0N(bundle2);
                C008805h.A17(statusesFragment, statusConfirmMuteDialogFragment);
                return true;
            }
            throw null;
        }
    }
}
