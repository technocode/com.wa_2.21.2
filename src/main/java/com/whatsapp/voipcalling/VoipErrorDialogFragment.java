package com.whatsapp.voipcalling;

import X.AbstractC000400g;
import X.AbstractC676839t;
import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass3UV;
import X.C000300f;
import X.C002001d;
import X.C014308b;
import android.os.Bundle;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VoipErrorDialogFragment extends WaDialogFragment {
    public int A00;
    public int A01;
    public AbstractC676839t A02;
    public ArrayList A03 = new ArrayList();
    public final C000300f A04 = C000300f.A00();
    public final AnonymousClass01A A05 = AnonymousClass01A.A00();
    public final C014308b A06 = C014308b.A00();
    public final AnonymousClass01X A07 = AnonymousClass01X.A00();

    public static VoipErrorDialogFragment A00(int i, AbstractC676839t r2) {
        Bundle A012 = AnonymousClass008.A01("error", i);
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        voipErrorDialogFragment.A0N(A012);
        voipErrorDialogFragment.A02 = r2;
        return voipErrorDialogFragment;
    }

    public static VoipErrorDialogFragment A01(List list, int i, boolean z) {
        VoipErrorDialogFragment voipErrorDialogFragment = new VoipErrorDialogFragment();
        Bundle bundle = new Bundle();
        int i2 = 1;
        if (z) {
            i2 = 2;
        }
        bundle.putInt("error", i2);
        bundle.putParcelableArrayList("user_jids", new ArrayList<>(list));
        bundle.putInt("call_size", i);
        voipErrorDialogFragment.A0N(bundle);
        voipErrorDialogFragment.A02 = new AnonymousClass3UV();
        return voipErrorDialogFragment;
    }

    @Override // X.AnonymousClass037, androidx.fragment.app.DialogFragment
    public void A0i(Bundle bundle) {
        super.A0i(bundle);
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            this.A01 = bundle2.getInt("error");
            this.A03 = bundle2.getParcelableArrayList("user_jids");
            this.A00 = bundle2.getInt("call_size");
        }
        if (this.A03 == null) {
            this.A03 = new ArrayList();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x0017;
     */
    @Override // androidx.fragment.app.DialogFragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A0p(android.os.Bundle r7) {
        /*
        // Method dump skipped, instructions count: 190
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.VoipErrorDialogFragment.A0p(android.os.Bundle):android.app.Dialog");
    }

    public final String A0x() {
        switch (this.A01) {
            case 1:
                AnonymousClass01X r5 = this.A07;
                int i = this.A00;
                return r5.A0A(R.plurals.voip_error_group_call_size_not_supported, (long) i, Integer.valueOf(i));
            case 2:
                ArrayList arrayList = this.A03;
                if (arrayList.size() == 1) {
                    return this.A07.A0A(R.plurals.voip_error_one_participant_group_call_size_not_supported, (long) this.A00, A0z(arrayList), Integer.valueOf(this.A00));
                }
                AnonymousClass01X r52 = this.A07;
                int i2 = this.A00;
                return r52.A0A(R.plurals.voip_error_multiple_participant_group_call_size_not_supported, (long) i2, Integer.valueOf(i2));
            case 3:
                return this.A07.A06(R.string.voip_joinable_no_internet_connection_body);
            case 4:
                return this.A07.A0D(R.string.voip_joinable_max_participants_invited_body, Integer.valueOf(this.A04.A06(AbstractC000400g.A39)));
            case 5:
                return this.A07.A06(R.string.voip_joinable_call_full_add_participant_body);
            case 6:
                return this.A07.A06(R.string.voip_joinable_call_full_rering_body);
            case 7:
                return this.A07.A06(R.string.voip_joinable_call_full_join_body);
            case 8:
                return this.A07.A06(R.string.voip_joinable_call_ended_while_joining_body);
            case 9:
                return this.A07.A06(R.string.voip_joinable_call_full_info_body);
            default:
                AnonymousClass00E.A08(false, "Unknown error");
                return "";
        }
    }

    public final String A0y() {
        switch (this.A01) {
            case 1:
                ArrayList arrayList = this.A03;
                if (arrayList.size() <= 3) {
                    return this.A07.A0A(R.plurals.voip_error_add_participant_failed_dialog_title, (long) arrayList.size(), A0z(arrayList));
                }
                return this.A07.A0A(R.plurals.voip_error_add_four_or_more_participant_failed_dialog_title, (long) (arrayList.size() - 1), A0z(arrayList.subList(0, 1)), Integer.valueOf(this.A03.size() - 1));
            case 2:
                return this.A07.A06(R.string.voip_error_select_fewer_participants);
            case 3:
                return this.A07.A06(R.string.voip_joinable_no_internet_connection_title);
            case 4:
                return this.A07.A06(R.string.voip_joinable_max_participants_invited_title);
            case 5:
            case 6:
            case 7:
            case 9:
                return this.A07.A06(R.string.voip_joinable_call_full_title);
            case 8:
                return this.A07.A06(R.string.voip_joinable_call_ended_while_joining_title);
            default:
                AnonymousClass00E.A08(false, "Unknown error");
                return "";
        }
    }

    public final String A0z(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.A06.A04(this.A05.A0A((AnonymousClass02N) it.next())));
        }
        if (arrayList.size() <= 3) {
            return C002001d.A1g(this.A06.A02, true, arrayList);
        }
        int size = arrayList.size() - 1;
        return this.A07.A0A(R.plurals.group_voip_call_participants_label, (long) size, arrayList.get(0), Integer.valueOf(size));
    }
}
