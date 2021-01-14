package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.Voip;
import java.util.List;

/* renamed from: X.1YO  reason: invalid class name */
public class AnonymousClass1YO {
    public final int A00;
    public final int A01;
    public final GroupJid A02;
    public final Voip.CallLogInfo A03;
    public final String A04;
    public final List A05;
    public final boolean A06;

    public AnonymousClass1YO(int i, String str, int i2, List list, String str2, boolean z, Voip.CallLogInfo callLogInfo) {
        this.A01 = i;
        this.A04 = str;
        this.A00 = i2;
        this.A05 = list;
        this.A02 = GroupJid.getNullable(str2);
        this.A06 = z;
        this.A03 = callLogInfo;
    }
}
