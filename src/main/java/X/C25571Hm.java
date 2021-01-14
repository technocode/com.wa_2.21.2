package X;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import androidx.appcompat.widget.SearchView;
import com.google.android.search.verification.client.R;
import com.whatsapp.UnblockDialogFragment;
import com.whatsapp.group.GroupAddBlacklistPickerActivity;
import com.whatsapp.jid.UserJid;
import java.util.Set;

/* renamed from: X.1Hm  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C25571Hm implements AdapterView.OnItemClickListener {
    public final /* synthetic */ AnonymousClass2DH A00;

    public /* synthetic */ C25571Hm(AnonymousClass2DH r1) {
        this.A00 = r1;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        SearchView searchView;
        int i2;
        AnonymousClass2DH r4 = this.A00;
        if (view.getTag() instanceof C26451Kx) {
            UserJid userJid = ((C26451Kx) view.getTag()).A03;
            if (r4.A0D.A0H(userJid)) {
                if (!(r4 instanceof GroupAddBlacklistPickerActivity)) {
                    i2 = R.string.unblock_before_status;
                } else {
                    i2 = 0;
                }
                if (i2 != 0) {
                    C007003k A0A = r4.A0E.A0A(userJid);
                    UnblockDialogFragment.A00(((AnonymousClass2C0) r4).A01.A0D(i2, r4.A0H.A08(A0A, false)), R.string.blocked_title, false, new C38471pv(r4, A0A)).A0u(r4.A04(), null);
                    return;
                }
                return;
            }
            Set set = r4.A0Q;
            if (set.contains(userJid)) {
                set.remove(userJid);
            } else {
                set.add(userJid);
            }
            if (!TextUtils.isEmpty(r4.A07) && set.contains(userJid) && (searchView = r4.A05.A01) != null) {
                EditText editText = (EditText) searchView.findViewById(R.id.search_src_text);
                editText.setSelection(0, editText.length());
            }
            r4.A0P.add(userJid);
            Handler handler = r4.A0C;
            Runnable runnable = r4.A0N;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, 200);
            r4.A0Y();
            r4.A02.notifyDataSetChanged();
        }
    }
}
