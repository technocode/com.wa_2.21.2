package com.whatsapp.group;

import X.ActivityC004702f;
import X.AnonymousClass09H;
import X.AnonymousClass0M5;
import X.AnonymousClass0OS;
import X.AnonymousClass0QU;
import X.AnonymousClass2DH;
import X.AnonymousClass2RT;
import X.AnonymousClass2RZ;
import X.C08580bN;
import X.C54732fP;
import X.C55382gS;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GroupAddBlacklistPickerActivity extends AnonymousClass2DH implements AnonymousClass2RZ {
    public boolean A00;
    public final AnonymousClass2RT A01 = AnonymousClass2RT.A00();

    public final void A0Z() {
        Set hashSet;
        ((ActivityC004702f) this).A0F.A05(0, R.string.info_update_dialog_title);
        AnonymousClass2RT r7 = this.A01;
        Set set = this.A0Q;
        if (r7 != null) {
            C08580bN r3 = new C08580bN();
            String string = r7.A02.A00.getString("group_add_blacklist_hash", null);
            if (string != null) {
                hashSet = r7.A03();
            } else {
                hashSet = new HashSet();
            }
            HashSet hashSet2 = new HashSet(set);
            HashSet hashSet3 = new HashSet();
            for (Object obj : hashSet) {
                if (!hashSet2.remove(obj)) {
                    hashSet3.add(obj);
                }
            }
            AnonymousClass09H r0 = r7.A03;
            String A02 = r0.A02();
            AnonymousClass0M5[] r10 = new AnonymousClass0M5[(hashSet3.size() + hashSet2.size())];
            int i = 2;
            int i2 = 2;
            if (string != null) {
                i2 = 3;
            }
            AnonymousClass0OS[] r9 = new AnonymousClass0OS[i2];
            r9[0] = new AnonymousClass0OS("name", "groupadd", null, (byte) 0);
            r9[1] = new AnonymousClass0OS("value", "contact_blacklist", null, (byte) 0);
            if (string != null) {
                r9[2] = new AnonymousClass0OS("dhash", string, null, (byte) 0);
            }
            AnonymousClass0OS r14 = new AnonymousClass0OS("action", "add", null, (byte) 0);
            AnonymousClass0OS r13 = new AnonymousClass0OS("action", "remove", null, (byte) 0);
            Iterator it = hashSet2.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                AnonymousClass0OS[] r2 = new AnonymousClass0OS[i];
                r2[0] = r14;
                r2[1] = new AnonymousClass0OS("jid", (Jid) it.next());
                r10[i3] = new AnonymousClass0M5("user", r2, null, null);
                i3++;
                i = 2;
            }
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                r10[i3] = new AnonymousClass0M5("user", new AnonymousClass0OS[]{r13, new AnonymousClass0OS("jid", (Jid) it2.next())}, null, null);
                i3++;
            }
            AnonymousClass0M5 r92 = new AnonymousClass0M5("privacy", (AnonymousClass0OS[]) null, new AnonymousClass0M5("category", r9, r10, null));
            r0.A07(228, A02, new AnonymousClass0M5("iq", new AnonymousClass0OS[]{new AnonymousClass0OS("id", A02, null, (byte) 0), new AnonymousClass0OS("to", AnonymousClass0QU.A00), new AnonymousClass0OS("xmlns", "privacy", null, (byte) 0), new AnonymousClass0OS("type", "set", null, (byte) 0)}, r92), new C55382gS(r7, set, r3), 32000);
            r3.A03(this, new C54732fP(this));
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass2RZ
    public void A33() {
        A0Z();
    }

    @Override // X.AnonymousClass2C0, X.AnonymousClass2DH, X.ActivityC004602e, X.ActivityC004802g, X.ActivityC004702f, X.AnonymousClass02i, X.ActivityC004902h, X.ActivityC005002j
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = getIntent().getBooleanExtra("was_nobody", false);
    }
}
