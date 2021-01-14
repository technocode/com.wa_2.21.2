package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass00E;
import X.AnonymousClass01A;
import X.AnonymousClass01X;
import X.AnonymousClass02N;
import X.AnonymousClass037;
import X.AnonymousClass0MB;
import X.AnonymousClass0MC;
import X.AnonymousClass2I9;
import X.C007003k;
import X.C014308b;
import X.DialogInterface$OnClickListenerC47312Hi;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.google.android.search.verification.client.R;
import com.whatsapp.base.WaDialogFragment;
import java.util.ArrayList;

public class ConversationRow$ConversationRowDialogFragment extends WaDialogFragment {
    public final AnonymousClass01A A00 = AnonymousClass01A.A00();
    public final C014308b A01 = C014308b.A00();
    public final AnonymousClass01X A02 = AnonymousClass01X.A00();

    @Override // androidx.fragment.app.DialogFragment
    public Dialog A0p(Bundle bundle) {
        String string = ((AnonymousClass037) this).A06.getString("jid");
        AnonymousClass02N A012 = AnonymousClass02N.A01(string);
        StringBuilder sb = new StringBuilder("ConversationRow/onCreateDialog/invalid jid=");
        sb.append(string);
        AnonymousClass00E.A04(A012, sb.toString());
        C007003k A0A = this.A00.A0A(A012);
        ArrayList arrayList = new ArrayList();
        if (A0A.A08 == null) {
            AnonymousClass01X r3 = this.A02;
            arrayList.add(new AnonymousClass2I9(r3.A06(R.string.add_contact), (int) R.id.menuitem_add_to_contacts));
            arrayList.add(new AnonymousClass2I9(r3.A06(R.string.add_exist), (int) R.id.menuitem_add_to_existing_contact));
        }
        String A04 = this.A01.A04(A0A);
        AnonymousClass01X r6 = this.A02;
        arrayList.add(new AnonymousClass2I9(r6.A0D(R.string.message_contact_name, A04), (int) R.id.menuitem_message_contact));
        arrayList.add(new AnonymousClass2I9(r6.A0D(R.string.voice_call_contact_name, A04), (int) R.id.menuitem_voice_call_contact));
        arrayList.add(new AnonymousClass2I9(r6.A0D(R.string.video_call_contact_name, A04), (int) R.id.menuitem_video_call_contact));
        AnonymousClass0MB r32 = new AnonymousClass0MB(A00());
        ArrayAdapter arrayAdapter = new ArrayAdapter(A00(), 17367043, arrayList);
        DialogInterface$OnClickListenerC47312Hi r1 = new DialogInterface$OnClickListenerC47312Hi(this, arrayList, A012);
        AnonymousClass0MC r0 = r32.A01;
        r0.A0D = arrayAdapter;
        r0.A05 = r1;
        return r32.A00();
    }
}
