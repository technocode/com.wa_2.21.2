package X;

import com.whatsapp.group.GroupChatInfo;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;

/* renamed from: X.2oc  reason: invalid class name and case insensitive filesystem */
public class C59992oc extends AbstractC10280eN {
    public final AnonymousClass02M A00 = AnonymousClass02M.A00();
    public final WeakReference A01;

    public C59992oc(GroupChatInfo groupChatInfo, AnonymousClass02U r3, UserJid userJid) {
        super(r3, userJid);
        this.A01 = new WeakReference(groupChatInfo);
    }
}
