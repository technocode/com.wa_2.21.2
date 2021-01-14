package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.0JZ  reason: invalid class name */
public class AnonymousClass0JZ implements AnonymousClass0By {
    public static volatile AnonymousClass0JZ A03;
    public final AnonymousClass009 A00;
    public final C02430Bz A01;
    public final AnonymousClass0DR A02;

    @Override // X.AnonymousClass0By
    public void AEz(AnonymousClass2F8 r1) {
    }

    @Override // X.AnonymousClass0By
    public void AF0(C05350Oe r1, int i) {
    }

    @Override // X.AnonymousClass0By
    public void AF1(AnonymousClass2F8 r1) {
    }

    @Override // X.AnonymousClass0By
    public void AF3(AnonymousClass1VI r1) {
    }

    public AnonymousClass0JZ(AnonymousClass009 r1, AnonymousClass0DR r2, C02430Bz r3) {
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }

    public static AnonymousClass0JZ A00() {
        if (A03 == null) {
            synchronized (AnonymousClass0JZ.class) {
                if (A03 == null) {
                    A03 = new AnonymousClass0JZ(AnonymousClass009.A00(), AnonymousClass0DR.A00(), C02430Bz.A00());
                }
            }
        }
        return A03;
    }

    @Override // X.AnonymousClass0By
    public void AF2(C05350Oe r4) {
        Iterator it = r4.iterator();
        while (true) {
            C28351Tz r1 = (C28351Tz) it;
            if (r1.hasNext()) {
                this.A02.A06((DeviceJid) r1.next());
            } else {
                return;
            }
        }
    }
}
