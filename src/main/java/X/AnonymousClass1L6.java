package X;

import android.database.DataSetObserver;
import com.whatsapp.Conversation;
import com.whatsapp.util.Log;

/* renamed from: X.1L6  reason: invalid class name */
public class AnonymousClass1L6 extends DataSetObserver {
    public final /* synthetic */ Conversation A00;

    public AnonymousClass1L6(Conversation conversation) {
        this.A00 = conversation;
    }

    public void onChanged() {
        Object valueOf;
        StringBuilder A0S = AnonymousClass008.A0S("conversation/adapterobserver/changed cursor=");
        Conversation conversation = this.A00;
        if (conversation.A0q.getCursor() == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(conversation.A0q.getCursor().getCount());
        }
        A0S.append(valueOf);
        A0S.append(" appended=");
        A0S.append(conversation.A0q.A0N.size());
        Log.d(A0S.toString());
    }
}
