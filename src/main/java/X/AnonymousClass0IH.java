package X;

import com.whatsapp.jid.DeviceJid;
import java.util.List;
import java.util.Map;

/* renamed from: X.0IH  reason: invalid class name */
public class AnonymousClass0IH {
    public static volatile AnonymousClass0IH A0A;
    public final AnonymousClass009 A00;
    public final AnonymousClass02M A01;
    public final C017009c A02;
    public final AnonymousClass01A A03;
    public final AnonymousClass08B A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass01P A06;
    public final AnonymousClass00Y A07;
    public final AnonymousClass0AR A08;
    public final AnonymousClass0IA A09;

    public AnonymousClass0IH(AnonymousClass02M r1, AnonymousClass009 r2, AnonymousClass00Y r3, AnonymousClass0AR r4, AnonymousClass01A r5, AnonymousClass08B r6, AnonymousClass01K r7, AnonymousClass01P r8, AnonymousClass0IA r9, C017009c r10) {
        this.A01 = r1;
        this.A00 = r2;
        this.A07 = r3;
        this.A08 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A06 = r8;
        this.A09 = r9;
        this.A02 = r10;
    }

    public void A00(DeviceJid deviceJid, Map map, List list) {
        AnonymousClass0OB r8;
        int i;
        int i2;
        String str;
        AnonymousClass0OB r7;
        int i3;
        AnonymousClass0J9 r2 = (AnonymousClass0J9) map.get(deviceJid.userJid);
        AnonymousClass0J9 A0C = this.A06.A02.A0C(deviceJid.userJid);
        String str2 = null;
        if (A0C != null) {
            r8 = A0C.A00();
        } else {
            r8 = null;
        }
        int A002 = AnonymousClass1YL.A00(A0C);
        if (A0C != null) {
            i = A0C.A03;
            str2 = A0C.A08;
        } else {
            i = 0;
        }
        if (r2 != null) {
            i2 = r2.A03;
            str = r2.A08;
            r7 = r2.A00();
            i3 = AnonymousClass1YL.A00(r2);
        } else {
            i2 = i;
            str = str2;
            r7 = r8;
            i3 = A002;
        }
        list.add(deviceJid.userJid);
        this.A05.A0E(deviceJid.userJid, new AnonymousClass1YN(i2, i, str, str2, r7, r8, false, i3, A002));
    }
}
