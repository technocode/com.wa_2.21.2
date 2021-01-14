package X;

import com.whatsapp.Conversation;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.1sC  reason: invalid class name and case insensitive filesystem */
public class C39841sC extends AnonymousClass0JW {
    public final AnonymousClass01K A00 = AnonymousClass01K.A00();
    public final AnonymousClass02N A01;
    public final WeakReference A02;

    public C39841sC(Conversation conversation, AnonymousClass02N r3) {
        this.A02 = new WeakReference(conversation);
        this.A01 = r3;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        Conversation conversation = (Conversation) this.A02.get();
        if (conversation != null) {
            ArrayList arrayList2 = conversation.A4Z;
            arrayList2.clear();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
            }
            if (arrayList2.isEmpty()) {
                conversation.A0I.setVisibility(8);
                return;
            }
            conversation.A0b.setText(((AnonymousClass2C0) conversation).A01.A0G().format((long) arrayList2.size()));
            conversation.A0I.setVisibility(0);
        }
    }
}
