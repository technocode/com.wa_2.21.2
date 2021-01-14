package X;

import android.view.MenuItem;
import com.whatsapp.voipcalling.CallsFragment;
import java.util.LinkedHashMap;

/* renamed from: X.0fo  reason: invalid class name and case insensitive filesystem */
public class C11160fo extends AnonymousClass0JW {
    public final /* synthetic */ CallsFragment A00;

    public C11160fo(CallsFragment callsFragment) {
        this.A00 = callsFragment;
    }

    @Override // X.AnonymousClass0JW
    public void A00(Object[] objArr) {
        LinkedHashMap linkedHashMap = ((LinkedHashMap[]) objArr)[0];
        if (linkedHashMap != null) {
            CallsFragment callsFragment = this.A00;
            callsFragment.A0B = linkedHashMap;
            callsFragment.A06.getFilter().filter(callsFragment.A08);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c6  */
    @Override // X.AnonymousClass0JW
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(java.lang.Object[] r18) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11160fo.A02(java.lang.Object[]):java.lang.Object");
    }

    @Override // X.AnonymousClass0JW
    public void A03(Object obj) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) obj;
        CallsFragment callsFragment = this.A00;
        callsFragment.A07 = null;
        if (linkedHashMap != null) {
            callsFragment.A0B = linkedHashMap;
            callsFragment.A06.getFilter().filter(callsFragment.A08);
        }
        MenuItem menuItem = callsFragment.A00;
        if (menuItem != null) {
            menuItem.setVisible(!callsFragment.A0B.isEmpty());
        }
        callsFragment.A0s();
        callsFragment.A0u();
    }
}
