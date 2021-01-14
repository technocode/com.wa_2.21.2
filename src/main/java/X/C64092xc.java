package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Comparator;

/* renamed from: X.2xc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64092xc implements Comparator {
    public final /* synthetic */ AnonymousClass0OT A00;

    public /* synthetic */ C64092xc(AnonymousClass0OT r1) {
        this.A00 = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AnonymousClass0M5 r7 = (AnonymousClass0M5) obj;
        AnonymousClass0M5 r8 = (AnonymousClass0M5) obj2;
        try {
            AnonymousClass009 r2 = this.A00.A04;
            boolean isPrimary = ((DeviceJid) r7.A09(DeviceJid.class, "jid", r2)).isPrimary();
            if (isPrimary != ((DeviceJid) r8.A09(DeviceJid.class, "jid", r2)).isPrimary()) {
                return isPrimary ? -1 : 1;
            }
            return 0;
        } catch (AnonymousClass1XC unused) {
            return 0;
        }
    }
}
