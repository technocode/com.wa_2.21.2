package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1wY  reason: invalid class name and case insensitive filesystem */
public class C42341wY {
    public final /* synthetic */ AnonymousClass1S3 A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ String A02;

    public C42341wY(AnonymousClass1S3 r1, String str, UserJid userJid) {
        this.A00 = r1;
        this.A02 = str;
        this.A01 = userJid;
    }

    public void A00(int i) {
        AnonymousClass1S3 r6 = this.A00;
        r6.A00 = false;
        if (i == 406 || i == 404) {
            AnonymousClass0HL r5 = r6.A04;
            UserJid userJid = this.A01;
            synchronized (r5) {
                Map map = r5.A00;
                AnonymousClass1Rs r0 = (AnonymousClass1Rs) map.get(userJid);
                if (r0 != null) {
                    Iterator it = r0.A01.iterator();
                    while (it.hasNext()) {
                        Map map2 = r5.A02;
                        String str = ((C48052Ks) it.next()).A06;
                        map2.remove(str);
                        r5.A01.remove(str);
                    }
                }
                map.remove(userJid);
            }
        }
        C42391wd r02 = r6.A05;
        UserJid userJid2 = this.A01;
        if (r02 != null) {
            AnonymousClass00E.A01();
            Iterator it2 = r02.A00.iterator();
            while (true) {
                AnonymousClass0AY r1 = (AnonymousClass0AY) it2;
                if (r1.hasNext()) {
                    ((AbstractC03690Hg) r1.next()).AFu(userJid2, i);
                } else {
                    return;
                }
            }
        } else {
            throw null;
        }
    }
}
