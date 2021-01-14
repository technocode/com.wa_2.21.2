package X;

import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.36v  reason: invalid class name and case insensitive filesystem */
public class C670036v {
    public static volatile C670036v A01;
    public final C669936u A00;

    public C670036v(AnonymousClass02M r2, AnonymousClass00T r3, AnonymousClass03P r4, AnonymousClass01X r5) {
        this.A00 = new C669936u(r2, r3, r4, r5);
    }

    public static C670036v A00() {
        if (A01 == null) {
            synchronized (C670036v.class) {
                if (A01 == null) {
                    A01 = new C670036v(AnonymousClass02M.A00(), C002101e.A00(), AnonymousClass03P.A00(), AnonymousClass01X.A00());
                }
            }
        }
        return A01;
    }

    public void A01() {
        C669936u r4 = this.A00;
        if (r4 != null) {
            AnonymousClass00E.A01();
            StringBuilder sb = new StringBuilder("ExoPlayerVideoPlayerPoolManager/stopAllVideoPlayers/videoPlayersRequested=");
            List<C72403Ss> list = r4.A07;
            sb.append(list.size());
            sb.append(" videoPlayersReleased=");
            List<C72403Ss> list2 = r4.A06;
            sb.append(list2.size());
            Log.d(sb.toString());
            for (C72403Ss r0 : list2) {
                r0.A0F();
                r0.A08();
            }
            list2.clear();
            for (C72403Ss r02 : list) {
                r02.A0F();
                r02.A08();
            }
            list.clear();
            r4.A00 = 0;
            return;
        }
        throw null;
    }
}
