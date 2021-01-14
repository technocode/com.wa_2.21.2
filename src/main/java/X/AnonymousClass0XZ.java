package X;

import android.app.Application;
import android.content.Intent;
import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0XZ  reason: invalid class name */
public class AnonymousClass0XZ implements AnonymousClass0EF, AnonymousClass0ED {
    public static volatile AnonymousClass0XZ A09;
    public final AnonymousClass00S A00;
    public final AnonymousClass00G A01;
    public final AnonymousClass01S A02;
    public final C02770Dj A03;
    public final AnonymousClass0AR A04;
    public final C02360Br A05;
    public final Object A06 = new Object();
    public final Set A07 = new HashSet();
    public final Set A08 = new HashSet();

    @Override // X.AnonymousClass0EF
    public void AJ5(C02900Dx r1) {
    }

    @Override // X.AnonymousClass0EF
    public void AJ6(AnonymousClass02N r1, UserJid userJid) {
    }

    public AnonymousClass0XZ(AnonymousClass00G r2, AnonymousClass00S r3, AnonymousClass0AR r4, C02770Dj r5, C02360Br r6, AnonymousClass01S r7) {
        this.A01 = r2;
        this.A00 = r3;
        if (r4 != null) {
            this.A04 = r4;
            if (r5 != null) {
                this.A03 = r5;
                if (r6 != null) {
                    this.A05 = r6;
                    if (r7 != null) {
                        this.A02 = r7;
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public static AnonymousClass0XZ A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0XZ.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0XZ(AnonymousClass00G.A01, AnonymousClass00S.A00(), AnonymousClass0AR.A00(), C02770Dj.A00(), C02360Br.A00(), AnonymousClass01S.A00());
                }
            }
        }
        return A09;
    }

    public void A01(AnonymousClass02N r3, AnonymousClass1W2 r4) {
        synchronized (this.A06) {
            this.A07.add(r3);
            this.A04.A0J(r4);
        }
    }

    public void A02(AnonymousClass02N r6, AnonymousClass1Xa r7) {
        synchronized (this.A06) {
            Set set = this.A08;
            set.remove(r6);
            if (set.isEmpty()) {
                AnonymousClass01S r1 = this.A02;
                r1.A0X.remove(this);
                r1.A0W.remove(this);
            }
            if (!this.A07.contains(r6)) {
                this.A04.A0K(new RunnableC448121t(r6, r7));
            }
            AnonymousClass01S r2 = this.A02;
            if (r2.A0e(r6)) {
                Iterator it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (r2.A0e((AnonymousClass02N) it.next())) {
                            break;
                        }
                    } else {
                        Application application = this.A01.A00;
                        Log.d("LocationSharingService/stop-location-updates");
                        C004302a.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"));
                        break;
                    }
                }
            }
        }
    }

    @Override // X.AnonymousClass0EF
    public void AJ7(AnonymousClass02N r7, UserJid userJid) {
        synchronized (this.A06) {
            if (this.A08.contains(r7)) {
                C02360Br r1 = this.A05;
                if (r1.A0D.A03() && r7 != null) {
                    r1.A0B.A09(Message.obtain(null, 0, 173, 0, new AnonymousClass22A(r7, userJid)));
                }
            }
        }
    }

    @Override // X.AnonymousClass0ED
    public void AKN(AnonymousClass02N r5) {
        synchronized (this.A06) {
            if (this.A08.contains(r5)) {
                LocationSharingService.A01(this.A01.A00, 42000);
            }
        }
    }

    @Override // X.AnonymousClass0ED
    public void AKd(AnonymousClass02N r5) {
        synchronized (this.A06) {
            Set set = this.A08;
            if (set.contains(r5)) {
                Iterator it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Application application = this.A01.A00;
                        Log.d("LocationSharingService/stop-location-updates");
                        C004302a.A06(application, new Intent(application, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.ACTION_STOP_LOCATION_UPDATES_FOR_WEB"));
                        break;
                    }
                    if (this.A02.A0e((AnonymousClass02N) it.next())) {
                        break;
                    }
                }
            }
        }
    }
}
