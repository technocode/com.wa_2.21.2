package X;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.175  reason: invalid class name */
public final class AnonymousClass175 {
    public int A00 = -1;
    public Looper A01;
    public AnonymousClass0LP A02 = AnonymousClass0LP.A00;
    public AbstractC34691j1 A03 = C24561Bl.A00;
    public String A04;
    public String A05;
    public final Context A06;
    public final ArrayList A07 = new ArrayList();
    public final ArrayList A08 = new ArrayList();
    public final Map A09 = new AnonymousClass05V();
    public final Map A0A = new AnonymousClass05V();
    public final Set A0B = new HashSet();
    public final Set A0C = new HashSet();

    public AnonymousClass175(Context context) {
        this.A06 = context;
        this.A01 = context.getMainLooper();
        this.A04 = context.getPackageName();
        this.A05 = context.getClass().getName();
    }

    public final AnonymousClass178 A00() {
        Map map = this.A0A;
        C001801b.A1a(!map.isEmpty(), "must call addApi() to add at least one API");
        C36121lc r4 = C36121lc.A00;
        AnonymousClass16z r1 = C24561Bl.A04;
        if (map.containsKey(r1)) {
            r4 = (C36121lc) map.get(r1);
        }
        AnonymousClass16z r10 = null;
        Set set = this.A0B;
        C238417u r15 = new C238417u(set, this.A09, this.A04, this.A05, r4);
        Map map2 = r15.A04;
        AnonymousClass05V r6 = new AnonymousClass05V();
        AnonymousClass05V r5 = new AnonymousClass05V();
        ArrayList arrayList = new ArrayList();
        Iterator it = map.keySet().iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                AnonymousClass16z r3 = (AnonymousClass16z) it.next();
                Object obj = map.get(r3);
                boolean z2 = false;
                if (map2.get(r3) != null) {
                    z2 = true;
                }
                r6.put(r3, Boolean.valueOf(z2));
                C35031jc r13 = new C35031jc(r3, z2);
                arrayList.add(r13);
                AbstractC34691j1 r12 = r3.A00;
                if (r12 != null) {
                    z = true;
                }
                C001801b.A1b(z, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
                AbstractC34701j2 A002 = r12.A00(this.A06, this.A01, r15, obj, r13, r13);
                r5.put(r3.A00(), A002);
                if (A002.AMD()) {
                    if (r10 == null) {
                        r10 = r3;
                    } else {
                        String str = r3.A02;
                        String str2 = r10.A02;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 21);
                        sb.append(str);
                        sb.append(" cannot be used with ");
                        sb.append(str2);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            } else {
                if (r10 != null) {
                    String str3 = r10.A02;
                    C001801b.A1d(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", str3);
                    C001801b.A1d(set.equals(this.A0C), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", str3);
                }
                C34881jN.A00(r5.values(), true);
                C34881jN r11 = new C34881jN(this.A06, new ReentrantLock(), this.A01, r15, this.A02, this.A03, r6, this.A07, this.A08, r5, arrayList);
                Set set2 = AnonymousClass178.A00;
                synchronized (set2) {
                    set2.add(r11);
                }
                return r11;
            }
        }
    }

    public final void A01(AnonymousClass16z r3) {
        List arrayList;
        C001801b.A1R(r3, "Api must not be null");
        this.A0A.put(r3, null);
        if (!(r3.A00 instanceof C456925x)) {
            arrayList = Collections.emptyList();
        } else {
            GoogleSignInOptions googleSignInOptions = null;
            if (googleSignInOptions == null) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList(googleSignInOptions.A06);
            }
        }
        this.A0C.addAll(arrayList);
        this.A0B.addAll(arrayList);
    }
}
