package X;

import android.util.Log;
import com.whatsapp.search.SearchViewModel;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0SD  reason: invalid class name */
public abstract class AnonymousClass0SD {
    public final Map A00 = new HashMap();
    public volatile boolean A01 = false;

    public void A00() {
        if (this instanceof SearchViewModel) {
            SearchViewModel searchViewModel = (SearchViewModel) this;
            searchViewModel.A0f.A00();
            AnonymousClass0AC r1 = searchViewModel.A0i;
            r1.A00(searchViewModel.A0m.A00);
            r1.A00(searchViewModel.A0H);
        } else if (this instanceof C70893Mu) {
            C70893Mu r3 = (C70893Mu) this;
            r3.A03();
            AnonymousClass0Yj r2 = r3.A02;
            C08710ba r12 = (C08710ba) r2.A00.A01(r3.A03);
            if (r12 != null) {
                r12.A01.A06(r12);
            }
            C08710ba r13 = (C08710ba) r2.A00.A01(r3.A01);
            if (r13 != null) {
                r13.A01.A06(r13);
            }
            r3.A0B.A00(r3.A08);
        } else if (this instanceof C30301b6) {
            C30301b6 r4 = (C30301b6) this;
            int A002 = r4.A00.A00();
            for (int i = 0; i < A002; i++) {
                C06540Tt r14 = r4.A00;
                if (r14.A01) {
                    r14.A03();
                }
                ((C08890bv) r14.A03[i]).A09(true);
            }
            C06540Tt r42 = r4.A00;
            int i2 = r42.A00;
            Object[] objArr = r42.A03;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = null;
            }
            r42.A00 = 0;
            r42.A01 = false;
        } else if (this instanceof AnonymousClass0WT) {
            AnonymousClass0WT r22 = (AnonymousClass0WT) this;
            if (AnonymousClass0LW.A01(3)) {
                StringBuilder sb = new StringBuilder("onCleared called for ");
                sb.append(r22);
                Log.d("FragmentManager", sb.toString());
            }
            r22.A00 = true;
        }
    }

    public void A01(Object obj) {
        Object obj2;
        Map map = this.A00;
        synchronized (map) {
            obj2 = map.get("androidx.lifecycle.savedstate.vm.tag");
            if (obj2 == null) {
                map.put("androidx.lifecycle.savedstate.vm.tag", obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.A01 && (obj instanceof Closeable)) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
