package X;

import com.whatsapp.jid.GroupJid;
import java.util.LinkedHashMap;

/* renamed from: X.0cY  reason: invalid class name and case insensitive filesystem */
public class C09250cY {
    public long A00 = -1;
    public final int A01;
    public final GroupJid A02;
    public final String A03;
    public final LinkedHashMap A04;
    public final boolean A05;
    public final boolean A06;

    public C09250cY(String str, LinkedHashMap linkedHashMap, boolean z, GroupJid groupJid, int i, boolean z2) {
        this.A03 = str;
        this.A04 = linkedHashMap;
        this.A05 = z;
        this.A02 = groupJid;
        this.A01 = i;
        this.A06 = z2;
    }

    public String toString() {
        StringBuilder A0S = AnonymousClass008.A0S("callId=");
        A0S.append(this.A03);
        A0S.append(" isVideoCall=");
        A0S.append(this.A05);
        A0S.append(" groupJid=");
        A0S.append(this.A02);
        A0S.append(" jids=[ ");
        for (Object obj : this.A04.keySet()) {
            A0S.append(obj);
            A0S.append(" ");
        }
        A0S.append("]");
        return A0S.toString();
    }
}
