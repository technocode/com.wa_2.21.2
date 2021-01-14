package com.whatsapp.storage;

import X.AbstractC007503q;
import X.AnonymousClass00T;
import X.AnonymousClass01X;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1LT;
import X.AnonymousClass1LV;
import X.AnonymousClass340;
import X.AnonymousClass341;
import X.AnonymousClass3RK;
import X.AnonymousClass3RL;
import X.AnonymousClass3RN;
import X.C002101e;
import X.C04360Kb;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class StorageUsageDeleteMessagesDialogFragment extends WaDialogFragment {
    public AnonymousClass3RN A00;
    public Collection A01;
    public Collection A02;
    public boolean A03;
    public boolean A04;
    public final C04360Kb A05 = C04360Kb.A00();
    public final AnonymousClass01X A06 = AnonymousClass01X.A00();
    public final AnonymousClass00T A07 = C002101e.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        boolean z;
        boolean z2;
        AnonymousClass01X r4;
        String A08;
        Iterator it = this.A02.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AbstractC007503q) it.next()).A0j) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        Iterator it2 = this.A01.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((AbstractC007503q) it2.next()).A0j) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z) {
            r4 = this.A06;
            int size = this.A02.size();
            int i = R.string.storage_usage_delete_dialog_starred_item_multiple_subtitle;
            if (size == 1) {
                i = R.string.storage_usage_delete_dialog_starred_item_single_subtitle;
            }
            A08 = r4.A06(i);
        } else if (z2 || this.A01.size() <= this.A02.size()) {
            r4 = this.A06;
            A08 = r4.A08(R.plurals.storage_usage_delete_dialog_subtitle, (long) this.A02.size());
        } else {
            r4 = this.A06;
            A08 = r4.A08(R.plurals.storage_usage_delete_dialog_duplicate_item_subtitle, (long) this.A02.size());
        }
        Context A002 = A00();
        ArrayList arrayList = new ArrayList();
        String A082 = r4.A08(R.plurals.storage_usage_delete_messages_title, (long) this.A02.size());
        if (z) {
            if (this.A02.size() == 1) {
                this.A04 = true;
            } else {
                arrayList.add(new AnonymousClass1LT(r4.A06(R.string.storage_usage_delete_dialog_starred_checkbox_text), new AnonymousClass3RL(this)));
            }
        } else if (!z2 && this.A01.size() > this.A02.size()) {
            arrayList.add(new AnonymousClass1LT(r4.A06(R.string.storage_usage_delete_dialog_duplicate_checkbox_text), new AnonymousClass3RK(this)));
        }
        AnonymousClass340 r1 = new AnonymousClass340(this);
        AnonymousClass0MB r42 = new AnonymousClass0MB(A00());
        AnonymousClass1LV r0 = new AnonymousClass1LV(A002, A082, A08, arrayList);
        AnonymousClass0MC r2 = r42.A01;
        r2.A0C = r0;
        r2.A01 = 0;
        r42.A04(R.string.delete, r1);
        r42.A03(R.string.cancel, new AnonymousClass341(this));
        r2.A0J = true;
        return r42.A00();
    }
}
