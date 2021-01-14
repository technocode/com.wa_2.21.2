package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3LT  reason: invalid class name */
public class AnonymousClass3LT extends C64392y7 {
    public List A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final UserJid A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public AnonymousClass3LT(String str, boolean z, int i, boolean z2, int i2, UserJid userJid, int i3, List list) {
        super(false);
        super.A00 = 35;
        this.A05 = str;
        this.A07 = z;
        this.A01 = i;
        this.A06 = z2;
        this.A03 = i2;
        this.A04 = userJid;
        this.A02 = i3;
        this.A00 = list == null ? Collections.emptyList() : list;
    }
}
