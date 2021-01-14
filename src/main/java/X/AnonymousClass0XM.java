package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.0XM  reason: invalid class name */
public class AnonymousClass0XM {
    public static volatile AnonymousClass0XM A08;
    public final AnonymousClass09G A00;
    public final AnonymousClass00D A01;
    public final AnonymousClass09A A02;
    public final C03120Ew A03;
    public final AnonymousClass09E A04;
    public final AnonymousClass0IA A05;
    public final C02360Br A06;
    public final AnonymousClass0BB A07;

    public AnonymousClass0XM(AnonymousClass09E r1, AnonymousClass09G r2, C02360Br r3, AnonymousClass0BB r4, AnonymousClass09A r5, C03120Ew r6, AnonymousClass00D r7, AnonymousClass0IA r8) {
        this.A04 = r1;
        this.A00 = r2;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = r5;
        this.A03 = r6;
        this.A01 = r7;
        this.A05 = r8;
    }

    public static AnonymousClass0XM A00() {
        if (A08 == null) {
            synchronized (AnonymousClass0XM.class) {
                if (A08 == null) {
                    AnonymousClass00S.A00();
                    A08 = new AnonymousClass0XM(AnonymousClass09E.A00(), AnonymousClass09G.A00(), C02360Br.A00(), AnonymousClass0BB.A00(), AnonymousClass09A.A02, C03120Ew.A00(), AnonymousClass00D.A00(), AnonymousClass0IA.A00());
                }
            }
        }
        return A08;
    }

    public void A01(UserJid userJid, boolean z) {
        AnonymousClass0BB r2 = this.A07;
        AnonymousClass0BG A082 = r2.A08(userJid);
        boolean z2 = false;
        if (!A082.A0G) {
            z2 = true;
            A082.A0G = true;
            r2.A0H(A082);
            AnonymousClass08B r0 = r2.A04;
            AnonymousClass00E.A01();
            Iterator it = r0.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (!r1.hasNext()) {
                    break;
                }
                AnonymousClass0BP r12 = (AnonymousClass0BP) r1.next();
                if (r12 instanceof C09160cO) {
                    ((C09160cO) r12).A00.A0q();
                }
            }
        }
        StringBuilder sb = new StringBuilder("statusmanager/mute-status-user returned ");
        sb.append(z2);
        sb.append(" for ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (z2 && z) {
            this.A05.A04(userJid);
        }
    }

    public void A02(UserJid userJid, boolean z) {
        AnonymousClass0BB r3 = this.A07;
        AnonymousClass0BG A082 = r3.A08(userJid);
        boolean z2 = false;
        if (A082.A0G) {
            A082.A0G = false;
            r3.A0H(A082);
            AnonymousClass08B r0 = r3.A04;
            AnonymousClass00E.A01();
            Iterator it = r0.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (!r1.hasNext()) {
                    break;
                }
                AnonymousClass0BP r12 = (AnonymousClass0BP) r1.next();
                if (r12 instanceof C09160cO) {
                    ((C09160cO) r12).A00.A0q();
                }
            }
            z2 = true;
        }
        StringBuilder sb = new StringBuilder("statusmanager/unmute-status-user returned ");
        sb.append(z2);
        sb.append(" for ");
        sb.append(userJid);
        Log.i(sb.toString());
        if (z2 && z) {
            this.A05.A04(userJid);
        }
    }
}
