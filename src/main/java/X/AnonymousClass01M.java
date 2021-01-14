package X;

import com.whatsapp.jid.DeviceJid;
import java.util.Iterator;

/* renamed from: X.01M  reason: invalid class name */
public class AnonymousClass01M extends AnonymousClass01G {
    public static volatile AnonymousClass01M A01;
    public final C001400w A00;

    public AnonymousClass01M(C001400w r1) {
        this.A00 = r1;
    }

    public static AnonymousClass01M A00() {
        if (A01 == null) {
            synchronized (AnonymousClass01M.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass01M(C001400w.A02);
                }
            }
        }
        return A01;
    }

    public void A02(DeviceJid deviceJid) {
        this.A00.A00();
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass01V) r1.next()).AGh(deviceJid);
                }
            }
        }
    }

    public void A03(DeviceJid deviceJid) {
        this.A00.A00();
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass01V) r1.next()).AGi(deviceJid);
                }
            }
        }
    }

    public void A04(DeviceJid deviceJid) {
        this.A00.A00();
        synchronized (super.A00) {
            Iterator it = super.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it;
                if (r1.hasNext()) {
                    ((AnonymousClass01V) r1.next()).AGj(deviceJid);
                }
            }
        }
    }
}
