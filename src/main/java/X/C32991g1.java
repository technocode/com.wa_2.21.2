package X;

import com.facebook.msys.mci.NotificationCenter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.1g1  reason: invalid class name and case insensitive filesystem */
public class C32991g1 extends AbstractRunnableC20910xi {
    public final /* synthetic */ Object A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ ArrayList A02;
    public final /* synthetic */ Map A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32991g1(ArrayList arrayList, String str, Object obj, Map map) {
        super("dispatchNotificationToCallbacks");
        this.A02 = arrayList;
        this.A01 = str;
        this.A00 = obj;
        this.A03 = map;
    }

    public void run() {
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((NotificationCenter.NotificationCallback) it.next()).onNewNotification(this.A01, this.A00, this.A03);
        }
    }
}
