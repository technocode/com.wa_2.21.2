package X;

import com.google.android.search.verification.client.R;
import com.whatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0db  reason: invalid class name and case insensitive filesystem */
public class C09830db extends AnonymousClass0JW {
    public final /* synthetic */ MyStatusesActivity A00;

    public C09830db(MyStatusesActivity myStatusesActivity) {
        this.A00 = myStatusesActivity;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        List list = (List) obj;
        StringBuilder A0S = AnonymousClass008.A0S("mystatuses/loaded ");
        A0S.append(list.size());
        A0S.append(" messages");
        Log.i(A0S.toString());
        if (list.isEmpty()) {
            this.A00.finish();
            return;
        }
        MyStatusesActivity myStatusesActivity = this.A00;
        AnonymousClass32K r0 = myStatusesActivity.A06;
        r0.A00 = list;
        r0.notifyDataSetChanged();
        myStatusesActivity.A0X();
        AnonymousClass02M r02 = ((ActivityC004702f) myStatusesActivity).A0F;
        r02.A02.removeCallbacks(myStatusesActivity.A0p);
        myStatusesActivity.A0m.ANF(new RunnableEBaseShape4S0100000_I0_4(myStatusesActivity, 23));
        myStatusesActivity.findViewById(R.id.progress).setVisibility(8);
    }
}
