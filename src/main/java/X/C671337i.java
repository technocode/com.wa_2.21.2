package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.whatsapp.voipcalling.CallsFragment;

/* renamed from: X.37i  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C671337i implements AdapterView.OnItemLongClickListener {
    public final /* synthetic */ CallsFragment A00;

    public /* synthetic */ C671337i(CallsFragment callsFragment) {
        this.A00 = callsFragment;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public final boolean onItemLongClick(AdapterView adapterView, View view, int i, long j) {
        CallsFragment callsFragment = this.A00;
        if (!(view.getTag() instanceof AnonymousClass390)) {
            return false;
        }
        AnonymousClass390 r3 = (AnonymousClass390) view.getTag();
        if (r3 != null) {
            AbstractC675238y r4 = r3.A00;
            if (r4.A6u() == 2 && callsFragment.A0C) {
                if (TextUtils.isEmpty(((C72483Ta) r4).A00.A03())) {
                    AnonymousClass008.A0v("calls/longclick/empty callgroup id/pos ", i);
                    return false;
                }
                callsFragment.A0v(((C72483Ta) r3.A00).A00, (AnonymousClass3TO) r3);
                return true;
            }
        }
        StringBuilder A0T = AnonymousClass008.A0T("calls/longclick position = ", i, " holder == null ? ");
        boolean z = false;
        if (r3 == null) {
            z = true;
        }
        A0T.append(z);
        A0T.append(" searching = ");
        AnonymousClass008.A1a(A0T, !callsFragment.A09.isEmpty());
        return false;
    }
}
