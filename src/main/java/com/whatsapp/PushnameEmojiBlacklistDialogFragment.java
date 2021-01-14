package com.whatsapp;

import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0M9;
import X.AnonymousClass0MB;
import X.AnonymousClass0MD;
import X.AnonymousClass2NU;
import X.C002001d;
import X.C02590Cr;
import X.DialogInterface$OnClickListenerC25841In;
import X.DialogInterface$OnClickListenerC25851Io;
import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.google.android.search.verification.client.R;
import java.util.ArrayList;

public class PushnameEmojiBlacklistDialogFragment extends DialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();
    public final C02590Cr A01 = C02590Cr.A00();
    public final AnonymousClass0M9 A02 = AnonymousClass0M9.A01();

    public static PushnameEmojiBlacklistDialogFragment A00(String str) {
        PushnameEmojiBlacklistDialogFragment pushnameEmojiBlacklistDialogFragment = new PushnameEmojiBlacklistDialogFragment();
        Bundle bundle = new Bundle();
        String[] strArr = AnonymousClass2NU.A01;
        int length = strArr.length;
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (String str2 : strArr) {
            if (str.contains(str2)) {
                arrayList.add(str2);
            }
        }
        bundle.putStringArrayList("invalid_emojis", arrayList);
        pushnameEmojiBlacklistDialogFragment.A0N(bundle);
        return pushnameEmojiBlacklistDialogFragment;
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        AnonymousClass0MB r4 = new AnonymousClass0MB(A0A());
        ArrayList<String> stringArrayList = ((AnonymousClass037) this).A06.getStringArrayList("invalid_emojis");
        if (stringArrayList != null) {
            String obj = this.A02.A03("general", "26000056", null).toString();
            AnonymousClass01X r5 = this.A00;
            r4.A01.A0E = C002001d.A1J(r5.A0A(R.plurals.pushname_blacklisted_emoji_error, (long) stringArrayList.size(), TextUtils.join(" ", stringArrayList)), A0A().getApplicationContext(), this.A01);
            r4.A06(r5.A06(R.string.learn_more), new DialogInterface$OnClickListenerC25851Io(this, obj));
            r4.A07(r5.A06(R.string.ok), DialogInterface$OnClickListenerC25841In.A00);
            AnonymousClass0MD A002 = r4.A00();
            A002.setCanceledOnTouchOutside(true);
            return A002;
        }
        throw null;
    }
}
