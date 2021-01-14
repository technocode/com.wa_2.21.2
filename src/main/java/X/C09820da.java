package X;

import com.whatsapp.status.playback.MyStatusesActivity;
import java.util.HashMap;

/* renamed from: X.0da  reason: invalid class name and case insensitive filesystem */
public class C09820da extends AnonymousClass0JW {
    public final AbstractC007503q A00;
    public final /* synthetic */ MyStatusesActivity A01;

    public C09820da(MyStatusesActivity myStatusesActivity, AbstractC007503q r2) {
        this.A01 = myStatusesActivity;
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        MyStatusesActivity myStatusesActivity = this.A01;
        HashMap hashMap = myStatusesActivity.A0q;
        C007303n r1 = this.A00.A0n;
        hashMap.put(r1, obj);
        myStatusesActivity.A0r.remove(r1);
        myStatusesActivity.A06.notifyDataSetChanged();
    }
}
