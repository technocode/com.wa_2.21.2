package com.whatsapp.voipcalling;

import X.AnonymousClass02N;
import X.AnonymousClass0QH;
import X.AnonymousClass2C0;
import X.C09190cR;
import X.C09200cS;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupCallParticipantPicker extends AnonymousClass0QH {
    public View A00;
    public final C09190cR A01 = C09190cR.A00();
    public final C09200cS A02 = C09200cS.A00();

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e2, code lost:
        if (r1 != null) goto L_0x00e4;
     */
    @Override // X.ActivityC03630Ha
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(android.widget.ListAdapter r12) {
        /*
        // Method dump skipped, instructions count: 239
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.GroupCallParticipantPicker.A0U(android.widget.ListAdapter):void");
    }

    @Override // X.AnonymousClass0QH
    public void A0g(int i) {
        if (i > 0 || A09() == null) {
            super.A0g(i);
        } else {
            A09().A07(((AnonymousClass2C0) this).A01.A06(R.string.add_paticipants));
        }
    }

    public final void A0k(ArrayList arrayList, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A0R.A0A((AnonymousClass02N) it.next()));
        }
    }

    public /* synthetic */ void lambda$createRoomView$2711$GroupCallParticipantPicker(View view) {
        C09190cR r3 = this.A01;
        AnonymousClass02N r2 = (AnonymousClass02N) getIntent().getParcelableExtra("source_group_jid");
        DialogFragment A04 = r3.A04(r2, 1);
        if (A04 != null) {
            APm(A04);
        } else {
            r3.A06(r2, 1);
        }
    }

    @Override // X.AnonymousClass0QH, X.ActivityC004702f, X.AnonymousClass02i
    public void onBackPressed() {
        super.onBackPressed();
        setResult(0);
    }
}
