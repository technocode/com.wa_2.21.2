package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass008;
import X.AnonymousClass01X;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass1VY;
import X.AnonymousClass2I9;
import X.AnonymousClass36B;
import X.DialogInterface$OnClickListenerC47352Hm;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ConversationRowContact$MessageSharedContactDialogFragment extends WaDialogFragment {
    public final AnonymousClass01X A00 = AnonymousClass01X.A00();
    public final AnonymousClass36B A01 = AnonymousClass36B.A01();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        String A0O;
        Bundle bundle2 = ((AnonymousClass037) this).A06;
        if (bundle2 != null) {
            List A0G = AnonymousClass1VY.A0G(UserJid.class, bundle2.getStringArrayList("jids"));
            ArrayList<String> stringArrayList = ((AnonymousClass037) this).A06.getStringArrayList("phones");
            ArrayList<String> stringArrayList2 = ((AnonymousClass037) this).A06.getStringArrayList("labels");
            String string = ((AnonymousClass037) this).A06.getString("business_name");
            ArrayList arrayList = new ArrayList();
            if (stringArrayList2 != null && stringArrayList != null) {
                int i = 0;
                while (true) {
                    AbstractList abstractList = (AbstractList) A0G;
                    if (i >= abstractList.size()) {
                        break;
                    }
                    if (abstractList.get(i) != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(this.A00.A0D(R.string.message_contact_name, stringArrayList.get(i)));
                        if (TextUtils.isEmpty(stringArrayList2.get(i))) {
                            A0O = "";
                        } else {
                            A0O = AnonymousClass008.A0O(AnonymousClass008.A0S(" ("), stringArrayList2.get(i), ")");
                        }
                        sb.append(A0O);
                        arrayList.add(new AnonymousClass2I9(sb.toString(), (UserJid) abstractList.get(i)));
                    }
                    i++;
                }
            }
            Context A002 = A00();
            if (A002 != null) {
                AnonymousClass0MB r3 = new AnonymousClass0MB(A002);
                ArrayAdapter arrayAdapter = new ArrayAdapter(A00(), (int) R.layout.select_phone_dialog_item, arrayList);
                DialogInterface$OnClickListenerC47352Hm r1 = new DialogInterface$OnClickListenerC47352Hm(this, arrayList, string);
                AnonymousClass0MC r0 = r3.A01;
                r0.A0D = arrayAdapter;
                r0.A05 = r1;
                return r3.A00();
            }
            throw null;
        }
        throw null;
    }
}
