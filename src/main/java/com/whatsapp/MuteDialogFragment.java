package com.whatsapp;

import X.AbstractC000400g;
import X.ActivityC004902h;
import X.AnonymousClass00D;
import X.AnonymousClass00S;
import X.AnonymousClass00T;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02M;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass08B;
import X.AnonymousClass0A8;
import X.AnonymousClass0BB;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1VY;
import X.C000300f;
import X.C002001d;
import X.C002101e;
import X.C002801l;
import X.C04360Kb;
import X.C667435r;
import X.DialogInterface$OnClickListenerC25751Ie;
import X.DialogInterface$OnClickListenerC25771Ig;
import X.DialogInterface$OnClickListenerC25781Ih;
import android.app.Dialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MuteDialogFragment extends WaDialogFragment {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final C000300f A01 = C000300f.A00();
    public final C04360Kb A02 = C04360Kb.A00();
    public final AnonymousClass01A A03 = AnonymousClass01A.A00();
    public final AnonymousClass08B A04 = AnonymousClass08B.A00;
    public final AnonymousClass00S A05 = AnonymousClass00S.A00();
    public final AnonymousClass00D A06 = AnonymousClass00D.A00();
    public final AnonymousClass01X A07 = AnonymousClass01X.A00();
    public final AnonymousClass0A8 A08 = AnonymousClass0A8.A00;
    public final AnonymousClass0BB A09 = AnonymousClass0BB.A00();
    public final AnonymousClass00T A0A = C002101e.A00();

    public static MuteDialogFragment A00(AnonymousClass02N r4) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", r4.getRawString());
        muteDialogFragment.A0N(bundle);
        return muteDialogFragment;
    }

    public static MuteDialogFragment A01(Collection collection) {
        MuteDialogFragment muteDialogFragment = new MuteDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("jids", AnonymousClass1VY.A0F(collection));
        bundle.putBoolean("mute_in_conversation_fragment", true);
        muteDialogFragment.A0N(bundle);
        return muteDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        int[] iArr;
        int[] iArr2;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            AnonymousClass02N A012 = AnonymousClass02N.A01(bundle2.getString("jid"));
            ArrayList<String> stringArrayList = ((AnonymousClass037) this).A06.getStringArrayList("jids");
            List A0G = stringArrayList == null ? null : AnonymousClass1VY.A0G(AnonymousClass02N.class, stringArrayList);
            Bundle bundle3 = ((AnonymousClass037) this).A06;
            if (bundle3 != null) {
                boolean z = bundle3.getBoolean("mute_in_conversation_fragment");
                SharedPreferences sharedPreferences = this.A06.A00;
                int[] iArr3 = {sharedPreferences.getInt("last_mute_selection", 0)};
                C000300f r4 = this.A01;
                C002801l r1 = AbstractC000400g.A1j;
                if (r4.A0D(r1)) {
                    iArr = C667435r.A00;
                } else {
                    iArr = C667435r.A02;
                }
                if (r4.A0D(r1)) {
                    iArr2 = C667435r.A01;
                } else {
                    iArr2 = C667435r.A03;
                }
                int length = iArr.length;
                String[] strArr = new String[length];
                for (int i = 0; i < length; i++) {
                    strArr[i] = C002001d.A1S(this.A07, iArr[i], iArr2[i]);
                }
                if (iArr3[0] >= length) {
                    iArr3[0] = 0;
                }
                ActivityC004902h A0A2 = A0A();
                if (A0A2 != null) {
                    View inflate = A0A2.getLayoutInflater().inflate(R.layout.mute_notifications, (ViewGroup) null, false);
                    CheckBox checkBox = (CheckBox) inflate.findViewById(R.id.mute_show_notifications);
                    if (A012 != null) {
                        AnonymousClass0BB r2 = this.A09;
                        if (r2.A08(A012).A09()) {
                            checkBox.setChecked(r2.A08(A012).A0F);
                            AnonymousClass0MB r3 = new AnonymousClass0MB(A0A());
                            AnonymousClass01X r9 = this.A07;
                            String A062 = r9.A06(R.string.mute_dialog_title);
                            AnonymousClass0MC r22 = r3.A01;
                            r22.A0I = A062;
                            int i2 = iArr3[0];
                            DialogInterface$OnClickListenerC25751Ie r0 = new DialogInterface$OnClickListenerC25751Ie(iArr3);
                            r22.A0M = strArr;
                            r22.A05 = r0;
                            r22.A00 = i2;
                            r22.A0L = true;
                            r3.A07(r9.A06(R.string.ok), new DialogInterface$OnClickListenerC25771Ig(this, checkBox, iArr3, z, A0G, A012));
                            r3.A05(r9.A06(R.string.cancel), new DialogInterface$OnClickListenerC25781Ih(this, A0G));
                            r22.A0C = inflate;
                            r22.A01 = 0;
                            return r3.A00();
                        }
                    }
                    checkBox.setChecked(sharedPreferences.getBoolean("last_mute_show_notifications", false));
                    AnonymousClass0MB r32 = new AnonymousClass0MB(A0A());
                    AnonymousClass01X r92 = this.A07;
                    String A0622 = r92.A06(R.string.mute_dialog_title);
                    AnonymousClass0MC r222 = r32.A01;
                    r222.A0I = A0622;
                    int i22 = iArr3[0];
                    DialogInterface$OnClickListenerC25751Ie r02 = new DialogInterface$OnClickListenerC25751Ie(iArr3);
                    r222.A0M = strArr;
                    r222.A05 = r02;
                    r222.A00 = i22;
                    r222.A0L = true;
                    r32.A07(r92.A06(R.string.ok), new DialogInterface$OnClickListenerC25771Ig(this, checkBox, iArr3, z, A0G, A012));
                    r32.A05(r92.A06(R.string.cancel), new DialogInterface$OnClickListenerC25781Ih(this, A0G));
                    r222.A0C = inflate;
                    r222.A01 = 0;
                    return r32.A00();
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }
}
