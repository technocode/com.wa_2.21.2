package X;

import android.app.Application;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.094  reason: invalid class name */
public class AnonymousClass094 {
    public static volatile AnonymousClass094 A02;
    public final AnonymousClass00G A00;
    public final C014508d A01;

    public AnonymousClass094(AnonymousClass00G r1, C014508d r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass094 A00() {
        if (A02 == null) {
            synchronized (AnonymousClass094.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass094(AnonymousClass00G.A01, C014508d.A00());
                }
            }
        }
        return A02;
    }

    public void A01() {
        StringBuilder A0S = AnonymousClass008.A0S("msgstore-manager/finish/db-is-ready ");
        C014508d r1 = this.A01;
        r1.A05();
        AnonymousClass008.A1a(A0S, r1.A01);
        synchronized (this) {
            r1.A05();
            if (!r1.A01) {
                Log.w("msgstore-manager/finish/db is not ready yet", new Throwable());
            } else {
                r1.A00 = true;
            }
        }
    }

    public void A02() {
        C014508d r2 = this.A01;
        r2.A05();
        r2.A07.A04 = true;
        r2.A05();
        r2.A06();
        try {
            Application application = this.A00.A00;
            Intent intent = new Intent(application, Class.forName("com.whatsapp.Main"));
            intent.setFlags(268468224);
            application.startActivity(intent);
            System.exit(0);
        } catch (ClassNotFoundException e) {
            Log.e(e);
        }
    }
}
