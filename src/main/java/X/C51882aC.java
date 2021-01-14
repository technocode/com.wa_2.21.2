package X;

import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.2aC  reason: invalid class name and case insensitive filesystem */
public class C51882aC extends AbstractC003401r {
    public static final C51882aC A00 = new C51882aC();

    public void A02() {
        Log.i("messageaudio/play");
        AnonymousClass00E.A01();
        Iterator it = this.A00.iterator();
        while (true) {
            AnonymousClass0AY r1 = (AnonymousClass0AY) it;
            if (r1.hasNext()) {
                ((C47502If) r1.next()).A00();
            } else {
                return;
            }
        }
    }
}
