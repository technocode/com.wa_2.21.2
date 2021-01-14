package X;

import android.animation.Animator;
import android.content.res.Configuration;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.activity.OnBackPressedDispatcher$LifecycleOnBackPressedCancellable;
import com.google.android.search.verification.client.R;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.search.SearchFragment;
import java.io.PrintWriter;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0LW  reason: invalid class name */
public abstract class AnonymousClass0LW {
    public int A00 = -1;
    public AnonymousClass0S8 A01;
    public AnonymousClass037 A02;
    public AnonymousClass037 A03;
    public AnonymousClass0SQ A04;
    public AnonymousClass0O1 A05;
    public AnonymousClass0SZ A06 = new AnonymousClass0SY(this);
    public AnonymousClass0WT A07;
    public Runnable A08 = new RunnableEBaseShape0S0100000_I0_0(this, 15);
    public ArrayList A09;
    public ArrayList A0A;
    public ArrayList A0B;
    public ArrayList A0C;
    public ArrayList A0D;
    public ArrayList A0E;
    public ArrayList A0F;
    public ConcurrentHashMap A0G = new ConcurrentHashMap();
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final AnonymousClass0SU A0N = new AnonymousClass0ST(this);
    public final AnonymousClass0SS A0O = new AnonymousClass0SS(this);
    public final AnonymousClass0SX A0P = new AnonymousClass0SX(this);
    public final AnonymousClass0QA A0Q = new AnonymousClass0QA();
    public final AnonymousClass0SW A0R = new AnonymousClass0SV(this);
    public final ArrayList A0S = new ArrayList();
    public final AtomicInteger A0T = new AtomicInteger();

    public static void A00(AnonymousClass037 r2) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("show: ");
            sb.append(r2);
            Log.v("FragmentManager", sb.toString());
        }
        if (r2.A0Z) {
            r2.A0Z = false;
            r2.A0a = !r2.A0a;
        }
    }

    public static boolean A01(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static final boolean A02(AnonymousClass037 r3) {
        if (!r3.A0Y || !r3.A0e) {
            Iterator it = ((AbstractCollection) r3.A0G.A0Q.A03()).iterator();
            while (it.hasNext()) {
                AnonymousClass037 r0 = (AnonymousClass037) it.next();
                if (r0 == null || !A02(r0)) {
                }
            }
            return false;
        }
        return true;
    }

    public int A03() {
        ArrayList arrayList = this.A09;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable A04() {
        /*
        // Method dump skipped, instructions count: 369
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LW.A04():android.os.Parcelable");
    }

    public final ViewGroup A05(AnonymousClass037 r4) {
        if (r4.A02 > 0 && this.A05.A01()) {
            View A002 = this.A05.A00(r4.A02);
            if (A002 instanceof ViewGroup) {
                return (ViewGroup) A002;
            }
        }
        return null;
    }

    public AnonymousClass037 A06(int i) {
        AnonymousClass0QA r4 = this.A0Q;
        ArrayList arrayList = r4.A00;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AnonymousClass037 r2 = (AnonymousClass037) arrayList.get(size);
            if (r2 != null && r2.A03 == i) {
                return r2;
            }
        }
        for (C09450cu r0 : r4.A01.values()) {
            if (r0 != null) {
                AnonymousClass037 r22 = r0.A01;
                if (r22.A03 == i) {
                    return r22;
                }
            }
        }
        return null;
    }

    public AnonymousClass0SZ A07() {
        AnonymousClass037 r0 = this.A02;
        if (r0 != null) {
            return r0.A0H.A07();
        }
        return this.A06;
    }

    public void A08() {
        this.A0H = true;
        A0q(true);
        A0F();
        A0I(-1);
        this.A04 = null;
        this.A05 = null;
        this.A02 = null;
        if (this.A01 != null) {
            Iterator it = this.A0N.A00.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0WS) it.next()).cancel();
            }
            this.A01 = null;
        }
    }

    public void A09() {
        for (AnonymousClass037 r0 : this.A0Q.A04()) {
            if (r0 != null) {
                r0.onLowMemory();
                r0.A0G.A09();
            }
        }
    }

    public void A0A() {
        A0q(true);
        if (this.A0C != null) {
            while (true) {
                ArrayList arrayList = this.A0C;
                if (!arrayList.isEmpty()) {
                    ((C30211aw) arrayList.remove(0)).A00();
                } else {
                    return;
                }
            }
        }
    }

    public void A0B() {
        this.A0L = false;
        this.A0M = false;
        for (AnonymousClass037 r0 : this.A0Q.A04()) {
            if (r0 != null) {
                r0.A0G.A0B();
            }
        }
    }

    public void A0C() {
        A0h(new AnonymousClass0Yb(this, null, -1, 0), false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r0.isEmpty() != false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A0S
            monitor-enter(r4)
            java.util.ArrayList r0 = r5.A0C     // Catch:{ all -> 0x0033 }
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0033 }
            r1 = 1
            if (r0 == 0) goto L_0x0011
        L_0x0010:
            r1 = 0
        L_0x0011:
            int r0 = r4.size()     // Catch:{ all -> 0x0033 }
            if (r0 != r2) goto L_0x0018
            r3 = 1
        L_0x0018:
            if (r1 != 0) goto L_0x001c
            if (r3 == 0) goto L_0x0031
        L_0x001c:
            X.0SQ r0 = r5.A04     // Catch:{ all -> 0x0033 }
            android.os.Handler r1 = r0.A02     // Catch:{ all -> 0x0033 }
            java.lang.Runnable r0 = r5.A08     // Catch:{ all -> 0x0033 }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x0033 }
            X.0SQ r0 = r5.A04     // Catch:{ all -> 0x0033 }
            android.os.Handler r1 = r0.A02     // Catch:{ all -> 0x0033 }
            java.lang.Runnable r0 = r5.A08     // Catch:{ all -> 0x0033 }
            r1.post(r0)     // Catch:{ all -> 0x0033 }
            r5.A0H()     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0033 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LW.A0D():void");
    }

    public final void A0E() {
        this.A0I = false;
        this.A0E.clear();
        this.A0F.clear();
    }

    public final void A0F() {
        int i;
        if (!this.A0G.isEmpty()) {
            for (AnonymousClass037 r1 : this.A0G.keySet()) {
                A0Z(r1);
                AnonymousClass0O2 r0 = r1.A0C;
                if (r0 == null) {
                    i = 0;
                } else {
                    i = r0.A02;
                }
                A0d(r1, i);
            }
        }
    }

    public final void A0G() {
        Iterator it = ((AbstractCollection) this.A0Q.A03()).iterator();
        while (it.hasNext()) {
            AnonymousClass037 r1 = (AnonymousClass037) it.next();
            if (r1 != null && r1.A0V) {
                if (this.A0I) {
                    this.A0J = true;
                } else {
                    r1.A0V = false;
                    A0d(r1, this.A00);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (A03() <= 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (A0y(r3.A02) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r1.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        r1 = r3.A0N;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H() {
        /*
            r3 = this;
            java.util.ArrayList r1 = r3.A0S
            monitor-enter(r1)
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0026 }
            r2 = 1
            if (r0 != 0) goto L_0x0010
            X.0SU r0 = r3.A0N     // Catch:{ all -> 0x0026 }
            r0.A01 = r2     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            X.0SU r1 = r3.A0N
            int r0 = r3.A03()
            if (r0 <= 0) goto L_0x0024
            X.037 r0 = r3.A02
            boolean r0 = r3.A0y(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0021:
            r1.A01 = r2
            return
        L_0x0024:
            r2 = 0
            goto L_0x0021
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LW.A0H():void");
    }

    /* JADX INFO: finally extract failed */
    public final void A0I(int i) {
        try {
            this.A0I = true;
            AnonymousClass0QA r5 = this.A0Q;
            Iterator it = r5.A00.iterator();
            while (it.hasNext()) {
                C09450cu r0 = (C09450cu) r5.A01.get(((AnonymousClass037) it.next()).A0S);
                if (r0 != null) {
                    r0.A00 = i;
                }
            }
            for (C09450cu r02 : r5.A01.values()) {
                if (r02 != null) {
                    r02.A00 = i;
                }
            }
            A0J(i, false);
            this.A0I = false;
            A0q(true);
        } catch (Throwable th) {
            this.A0I = false;
            throw th;
        }
    }

    public void A0J(int i, boolean z) {
        AnonymousClass0SQ r2;
        if (this.A04 == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.A00) {
            this.A00 = i;
            AnonymousClass0QA r22 = this.A0Q;
            for (AnonymousClass037 r0 : r22.A04()) {
                A0V(r0);
            }
            Iterator it = ((AbstractCollection) r22.A03()).iterator();
            while (it.hasNext()) {
                AnonymousClass037 r1 = (AnonymousClass037) it.next();
                if (r1 != null && !r1.A0d) {
                    A0V(r1);
                }
            }
            A0G();
            if (this.A0K && (r2 = this.A04) != null && this.A00 == 4) {
                r2.A04.A05();
                this.A0K = false;
            }
        }
    }

    public void A0K(Configuration configuration) {
        for (AnonymousClass037 r0 : this.A0Q.A04()) {
            if (r0 != null) {
                r0.onConfigurationChanged(configuration);
                r0.A0G.A0K(configuration);
            }
        }
    }

    public void A0L(Parcelable parcelable) {
        AnonymousClass0SZ r0;
        C09450cu r1;
        if (parcelable != null) {
            C15480o9 r6 = (C15480o9) parcelable;
            if (r6.A02 != null) {
                AnonymousClass0QA r5 = this.A0Q;
                HashMap hashMap = r5.A01;
                hashMap.clear();
                Iterator it = r6.A02.iterator();
                while (it.hasNext()) {
                    C15500oB r10 = (C15500oB) it.next();
                    if (r10 != null) {
                        AnonymousClass0WT r02 = this.A07;
                        AnonymousClass037 r2 = (AnonymousClass037) r02.A02.get(r10.A07);
                        if (r2 != null) {
                            if (A01(2)) {
                                StringBuilder sb = new StringBuilder("restoreSaveState: re-attaching retained ");
                                sb.append(r2);
                                Log.v("FragmentManager", sb.toString());
                            }
                            r1 = new C09450cu(this.A0P, r2, r10);
                        } else {
                            AnonymousClass0SX r7 = this.A0P;
                            ClassLoader classLoader = this.A04.A01.getClassLoader();
                            AnonymousClass037 r03 = this.A02;
                            if (r03 != null) {
                                r0 = r03.A0H.A07();
                            } else {
                                r0 = this.A06;
                            }
                            r1 = new C09450cu(r7, classLoader, r0, r10);
                        }
                        AnonymousClass037 r72 = r1.A01;
                        r72.A0H = this;
                        if (A01(2)) {
                            StringBuilder A0S2 = AnonymousClass008.A0S("restoreSaveState: active (");
                            A0S2.append(r72.A0S);
                            A0S2.append("): ");
                            A0S2.append(r72);
                            Log.v("FragmentManager", A0S2.toString());
                        }
                        r1.A01(this.A04.A01.getClassLoader());
                        hashMap.put(r72.A0S, r1);
                        r1.A00 = this.A00;
                    }
                }
                for (AnonymousClass037 r22 : this.A07.A02.values()) {
                    if (!hashMap.containsKey(r22.A0S)) {
                        if (A01(2)) {
                            StringBuilder sb2 = new StringBuilder("Discarding retained Fragment ");
                            sb2.append(r22);
                            sb2.append(" that was not found in the set of active Fragments ");
                            sb2.append(r6.A02);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        A0d(r22, 1);
                        r22.A0g = true;
                        A0d(r22, -1);
                    }
                }
                ArrayList<String> arrayList = r6.A03;
                r5.A00.clear();
                if (arrayList != null) {
                    for (String str : arrayList) {
                        AnonymousClass037 A002 = r5.A00(str);
                        if (A002 != null) {
                            if (A01(2)) {
                                StringBuilder sb3 = new StringBuilder("restoreSaveState: added (");
                                sb3.append(str);
                                sb3.append("): ");
                                sb3.append(A002);
                                Log.v("FragmentManager", sb3.toString());
                            }
                            r5.A05(A002);
                        } else {
                            throw new IllegalStateException(AnonymousClass008.A0L("No instantiated fragment for (", str, ")"));
                        }
                    }
                }
                C15350nw[] r04 = r6.A04;
                if (r04 != null) {
                    this.A09 = new ArrayList(r04.length);
                    int i = 0;
                    while (true) {
                        C15350nw[] r12 = r6.A04;
                        if (i >= r12.length) {
                            break;
                        }
                        C15350nw r102 = r12[i];
                        AnonymousClass0QB r23 = new AnonymousClass0QB(this);
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int[] iArr = r102.A0D;
                            if (i2 >= iArr.length) {
                                break;
                            }
                            C09130cL r122 = new C09130cL();
                            int i4 = i2 + 1;
                            r122.A00 = iArr[i2];
                            if (A01(2)) {
                                StringBuilder sb4 = new StringBuilder("Instantiate ");
                                sb4.append(r23);
                                sb4.append(" op #");
                                sb4.append(i3);
                                sb4.append(" base fragment #");
                                sb4.append(iArr[i4]);
                                Log.v("FragmentManager", sb4.toString());
                            }
                            String str2 = (String) r102.A07.get(i3);
                            if (str2 != null) {
                                r122.A05 = r5.A00(str2);
                            } else {
                                r122.A05 = null;
                            }
                            r122.A07 = EnumC014207z.values()[r102.A0C[i3]];
                            r122.A06 = EnumC014207z.values()[r102.A0B[i3]];
                            int i5 = i4 + 1;
                            int i6 = iArr[i4];
                            r122.A01 = i6;
                            int i7 = i5 + 1;
                            int i8 = iArr[i5];
                            r122.A02 = i8;
                            int i9 = i7 + 1;
                            int i10 = iArr[i7];
                            r122.A03 = i10;
                            i2 = i9 + 1;
                            int i11 = iArr[i9];
                            r122.A04 = i11;
                            ((AnonymousClass0QC) r23).A02 = i6;
                            r23.A03 = i8;
                            r23.A04 = i10;
                            r23.A05 = i11;
                            r23.A07(r122);
                            i3++;
                        }
                        r23.A06 = r102.A03;
                        r23.A09 = r102.A06;
                        r23.A00 = r102.A02;
                        r23.A0D = true;
                        ((AnonymousClass0QC) r23).A01 = r102.A01;
                        r23.A08 = r102.A05;
                        ((AnonymousClass0QC) r23).A00 = r102.A00;
                        r23.A07 = r102.A04;
                        r23.A0B = r102.A08;
                        r23.A0C = r102.A09;
                        r23.A0F = r102.A0A;
                        r23.A0D(1);
                        if (A01(2)) {
                            StringBuilder A0T2 = AnonymousClass008.A0T("restoreAllState: back stack #", i, " (index ");
                            A0T2.append(r23.A00);
                            A0T2.append("): ");
                            A0T2.append(r23);
                            Log.v("FragmentManager", A0T2.toString());
                            PrintWriter printWriter = new PrintWriter(new C14830mx());
                            r23.A0E("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.A09.add(r23);
                        i++;
                    }
                } else {
                    this.A09 = null;
                }
                this.A0T.set(r6.A00);
                String str3 = r6.A01;
                if (str3 != null) {
                    AnonymousClass037 A003 = r5.A00(str3);
                    this.A03 = A003;
                    A0b(A003);
                }
            }
        }
    }

    public void A0M(Menu menu) {
        if (this.A00 >= 1) {
            for (AnonymousClass037 r1 : this.A0Q.A04()) {
                if (r1 != null && !r1.A0Z) {
                    r1.A0G.A0M(menu);
                }
            }
        }
    }

    public final void A0N(AnonymousClass03V r5) {
        int i = this.A00;
        if (i >= 1) {
            int min = Math.min(i, 3);
            for (AnonymousClass037 r1 : this.A0Q.A04()) {
                if (r1.A04 < min) {
                    A0d(r1, min);
                    if (r1.A0A != null && !r1.A0Z && r1.A0d) {
                        r5.add(r1);
                    }
                }
            }
        }
    }

    public void A0O(AnonymousClass0QB r12, boolean z, boolean z2, boolean z3) {
        View view;
        if (z) {
            r12.A0F(z3);
        } else {
            r12.A0C();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(r12);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C09330ch.A0A(this, arrayList, arrayList2, 0, 1, true, this.A0R);
        }
        if (z3) {
            A0J(this.A00, true);
        }
        Iterator it = ((AbstractCollection) this.A0Q.A03()).iterator();
        while (it.hasNext()) {
            AnonymousClass037 r5 = (AnonymousClass037) it.next();
            if (r5 != null && (view = r5.A0A) != null && r5.A0d && r12.A0G(r5.A02)) {
                float f = r5.A00;
                if (f > 0.0f) {
                    view.setAlpha(f);
                }
                if (z3) {
                    r5.A00 = 0.0f;
                } else {
                    r5.A00 = -1.0f;
                    r5.A0d = false;
                }
            }
        }
    }

    public void A0P(AnonymousClass037 r3) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("add: ");
            sb.append(r3);
            Log.v("FragmentManager", sb.toString());
        }
        A0U(r3);
        if (!r3.A0W) {
            this.A0Q.A05(r3);
            r3.A0g = false;
            if (r3.A0A == null) {
                r3.A0a = false;
            }
            if (A02(r3)) {
                this.A0K = true;
            }
        }
    }

    public void A0Q(AnonymousClass037 r5) {
        if (!A0s()) {
            HashMap hashMap = this.A07.A02;
            if (!hashMap.containsKey(r5.A0S)) {
                hashMap.put(r5.A0S, r5);
                if (A01(2)) {
                    StringBuilder sb = new StringBuilder("Updating retained Fragments: Added ");
                    sb.append(r5);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        } else if (A01(2)) {
            Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
        }
    }

    public void A0R(AnonymousClass037 r5) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("attach: ");
            sb.append(r5);
            Log.v("FragmentManager", sb.toString());
        }
        if (r5.A0W) {
            r5.A0W = false;
            if (!r5.A0T) {
                this.A0Q.A05(r5);
                if (A01(2)) {
                    StringBuilder sb2 = new StringBuilder("add from attach: ");
                    sb2.append(r5);
                    Log.v("FragmentManager", sb2.toString());
                }
                if (A02(r5)) {
                    this.A0K = true;
                }
            }
        }
    }

    public void A0S(AnonymousClass037 r6) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("detach: ");
            sb.append(r6);
            Log.v("FragmentManager", sb.toString());
        }
        if (!r6.A0W) {
            r6.A0W = true;
            if (r6.A0T) {
                if (A01(2)) {
                    StringBuilder sb2 = new StringBuilder("remove from detach: ");
                    sb2.append(r6);
                    Log.v("FragmentManager", sb2.toString());
                }
                ArrayList arrayList = this.A0Q.A00;
                synchronized (arrayList) {
                    arrayList.remove(r6);
                }
                r6.A0T = false;
                if (A02(r6)) {
                    this.A0K = true;
                }
                A0c(r6);
            }
        }
    }

    public void A0T(AnonymousClass037 r3) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("hide: ");
            sb.append(r3);
            Log.v("FragmentManager", sb.toString());
        }
        if (!r3.A0Z) {
            r3.A0Z = true;
            r3.A0a = true ^ r3.A0a;
            A0c(r3);
        }
    }

    public void A0U(AnonymousClass037 r4) {
        AnonymousClass0QA r1 = this.A0Q;
        String str = r4.A0S;
        HashMap hashMap = r1.A01;
        if (!hashMap.containsKey(str)) {
            C09450cu r12 = new C09450cu(this.A0P, r4);
            r12.A01(this.A04.A01.getClassLoader());
            hashMap.put(r12.A01.A0S, r12);
            if (r4.A0j) {
                if (r4.A0i) {
                    A0Q(r4);
                } else {
                    A0X(r4);
                }
                r4.A0j = false;
            }
            r12.A00 = this.A00;
            if (A01(2)) {
                StringBuilder sb = new StringBuilder("Added fragment to active set ");
                sb.append(r4);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    public void A0V(AnonymousClass037 r7) {
        int i;
        AnonymousClass0O2 r0;
        View view;
        AnonymousClass0QA r2 = this.A0Q;
        if (r2.A01.containsKey(r7.A0S)) {
            A0d(r7, this.A00);
            if (r7.A0A != null) {
                if (r2 != null) {
                    ViewGroup viewGroup = r7.A0B;
                    if (viewGroup != null) {
                        ArrayList arrayList = r2.A00;
                        int indexOf = arrayList.indexOf(r7);
                        while (true) {
                            indexOf--;
                            if (indexOf < 0) {
                                break;
                            }
                            AnonymousClass037 r1 = (AnonymousClass037) arrayList.get(indexOf);
                            if (r1.A0B == viewGroup && (view = r1.A0A) != null) {
                                ViewGroup viewGroup2 = r7.A0B;
                                int indexOfChild = viewGroup2.indexOfChild(view);
                                int indexOfChild2 = viewGroup2.indexOfChild(r7.A0A);
                                if (indexOfChild2 < indexOfChild) {
                                    viewGroup2.removeViewAt(indexOfChild2);
                                    viewGroup2.addView(r7.A0A, indexOfChild);
                                }
                            }
                        }
                    }
                    if (r7.A0d && r7.A0B != null) {
                        float f = r7.A00;
                        if (f > 0.0f) {
                            r7.A0A.setAlpha(f);
                        }
                        r7.A00 = 0.0f;
                        r7.A0d = false;
                        AnonymousClass0O3 A0k = C002001d.A0k(this.A04.A01, this.A05, r7, true);
                        if (A0k != null) {
                            Animation animation = A0k.A01;
                            if (animation != null) {
                                r7.A0A.startAnimation(animation);
                            } else {
                                Animator animator = A0k.A00;
                                animator.setTarget(r7.A0A);
                                animator.start();
                            }
                        }
                    }
                } else {
                    throw null;
                }
            }
            if (r7.A0a) {
                if (r7.A0A != null) {
                    AnonymousClass0O3 A0k2 = C002001d.A0k(this.A04.A01, this.A05, r7, !r7.A0Z);
                    if (A0k2 != null) {
                        Animator animator2 = A0k2.A00;
                        if (animator2 != null) {
                            animator2.setTarget(r7.A0A);
                            if (r7.A0Z) {
                                AnonymousClass0O2 r02 = r7.A0C;
                                if (r02 == null || !r02.A0D) {
                                    ViewGroup viewGroup3 = r7.A0B;
                                    View view2 = r7.A0A;
                                    viewGroup3.startViewTransition(view2);
                                    animator2.addListener(new C15450o6(viewGroup3, view2, r7));
                                } else {
                                    r7.A08().A0D = false;
                                }
                            } else {
                                r7.A0A.setVisibility(0);
                            }
                            animator2.start();
                        } else {
                            View view3 = r7.A0A;
                            Animation animation2 = A0k2.A01;
                            view3.startAnimation(animation2);
                            animation2.start();
                        }
                    }
                    if (!r7.A0Z || ((r0 = r7.A0C) != null && r0.A0D)) {
                        i = 0;
                    } else {
                        i = 8;
                    }
                    r7.A0A.setVisibility(i);
                    AnonymousClass0O2 r03 = r7.A0C;
                    if (r03 != null && r03.A0D) {
                        r7.A08().A0D = false;
                    }
                }
                if (r7.A0T && A02(r7)) {
                    this.A0K = true;
                }
                r7.A0a = false;
            }
        } else if (A01(3)) {
            StringBuilder sb = new StringBuilder("Ignoring moving ");
            sb.append(r7);
            sb.append(" to state ");
            sb.append(this.A00);
            sb.append("since it is not added to ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
    }

    public void A0W(AnonymousClass037 r4) {
        if (A01(2)) {
            StringBuilder sb = new StringBuilder("remove: ");
            sb.append(r4);
            sb.append(" nesting=");
            sb.append(r4.A01);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = false;
        if (r4.A01 > 0) {
            z = true;
        }
        boolean z2 = !z;
        if (!r4.A0W || z2) {
            ArrayList arrayList = this.A0Q.A00;
            synchronized (arrayList) {
                arrayList.remove(r4);
            }
            r4.A0T = false;
            if (A02(r4)) {
                this.A0K = true;
            }
            r4.A0g = true;
            A0c(r4);
        }
    }

    public void A0X(AnonymousClass037 r5) {
        if (A0s()) {
            if (A01(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.A07.A02.remove(r5.A0S) != null && A01(2)) {
            StringBuilder sb = new StringBuilder("Updating retained Fragments: Removed ");
            sb.append(r5);
            Log.v("FragmentManager", sb.toString());
        }
    }

    public void A0Y(AnonymousClass037 r3) {
        if (r3 != null) {
            if (!r3.equals(this.A0Q.A00(r3.A0S)) || !(r3.A0F == null || r3.A0H == this)) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(r3);
                sb.append(" is not an active fragment of FragmentManager ");
                sb.append(this);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        AnonymousClass037 r0 = this.A03;
        this.A03 = r3;
        A0b(r0);
        A0b(this.A03);
    }

    public final void A0Z(AnonymousClass037 r4) {
        AbstractCollection abstractCollection = (AbstractCollection) this.A0G.get(r4);
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((C04080Iy) it.next()).A01();
            }
            abstractCollection.clear();
            A0a(r4);
            this.A0G.remove(r4);
        }
    }

    public final void A0a(AnonymousClass037 r7) {
        r7.A0G.A0I(1);
        if (r7.A0A != null) {
            C09540d7 r0 = r7.A0I;
            r0.A00.A04(AnonymousClass082.ON_DESTROY);
        }
        r7.A04 = 1;
        r7.A0U = false;
        r7.A0X();
        if (r7.A0U) {
            C30301b6 r4 = ((C30311b7) AbstractC15640oQ.A00(r7)).A01;
            int A002 = r4.A00.A00();
            for (int i = 0; i < A002; i++) {
                C06540Tt r1 = r4.A00;
                if (r1.A01) {
                    r1.A03();
                }
                ((C08890bv) r1.A03[i]).A0A();
            }
            r7.A0f = false;
            this.A0P.A0D(r7, false);
            r7.A0B = null;
            r7.A0A = null;
            r7.A0I = null;
            r7.A0L.A07(null);
            r7.A0b = false;
            return;
        }
        throw new C15580oJ(AnonymousClass008.A0C(r7, " did not call through to super.onDestroyView()"));
    }

    public final void A0b(AnonymousClass037 r3) {
        if (r3 != null) {
            if (r3.equals(this.A0Q.A00(r3.A0S))) {
                boolean A0y = r3.A0H.A0y(r3);
                Boolean bool = r3.A0O;
                if (bool == null || bool.booleanValue() != A0y) {
                    r3.A0O = Boolean.valueOf(A0y);
                    AnonymousClass0LW r1 = r3.A0G;
                    r1.A0H();
                    r1.A0b(r1.A03);
                }
            }
        }
    }

    public final void A0c(AnonymousClass037 r3) {
        int i;
        ViewGroup A052 = A05(r3);
        if (A052 != null) {
            if (A052.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                A052.setTag(R.id.visible_removing_fragment_view_tag, r3);
            }
            AnonymousClass037 r1 = (AnonymousClass037) A052.getTag(R.id.visible_removing_fragment_view_tag);
            AnonymousClass0O2 r0 = r3.A0C;
            if (r0 == null) {
                i = 0;
            } else {
                i = r0.A00;
            }
            r1.A0L(i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0433, code lost:
        if (r5 <= -1) goto L_0x0203;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05b2, code lost:
        if (r0 != false) goto L_0x05b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05b5, code lost:
        if (r0 == false) goto L_0x0662;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0090, code lost:
        if (r0 != 3) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0818, code lost:
        if (r4.A01 > 0) goto L_0x081a;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:334:0x06a3 */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x06a3 A[LOOP:1: B:334:0x06a3->B:484:0x06a3, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0d(X.AnonymousClass037 r25, int r26) {
        /*
        // Method dump skipped, instructions count: 2651
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LW.A0d(X.037, int):void");
    }

    public void A0e(AnonymousClass037 r3, EnumC014207z r4) {
        if (!r3.equals(this.A0Q.A00(r3.A0S)) || !(r3.A0F == null || r3.A0H == this)) {
            StringBuilder sb = new StringBuilder("Fragment ");
            sb.append(r3);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        r3.A0J = r4;
    }

    public void A0f(AnonymousClass037 r3, boolean z) {
        ViewGroup A052 = A05(r3);
        if (A052 != null && (A052 instanceof AnonymousClass0Ts)) {
            ((AnonymousClass0Ts) A052).A02 = !z;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: X.037 */
    /* JADX WARN: Multi-variable type inference failed */
    public void A0g(AnonymousClass0SQ r7, AnonymousClass0O1 r8, AnonymousClass037 r9) {
        if (this.A04 == null) {
            this.A04 = r7;
            this.A05 = r8;
            this.A02 = r9;
            if (r9 != 0) {
                A0H();
            }
            if (r7 instanceof AnonymousClass02o) {
                AnonymousClass0SQ r0 = r7;
                AnonymousClass0S8 A7i = r7.A7i();
                this.A01 = A7i;
                if (r9 != 0) {
                    r0 = r9;
                }
                AnonymousClass0SU r3 = this.A0N;
                AbstractC013907w A75 = r0.A75();
                if (((C013807v) A75).A02 != EnumC014207z.DESTROYED) {
                    r3.A00.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(A7i, A75, r3));
                }
            }
            if (r9 != 0) {
                AnonymousClass0WT r32 = r9.A0H.A07;
                HashMap hashMap = r32.A01;
                AnonymousClass0WT r1 = (AnonymousClass0WT) hashMap.get(r9.A0S);
                if (r1 == null) {
                    r1 = new AnonymousClass0WT(r32.A04);
                    hashMap.put(r9.A0S, r1);
                }
                this.A07 = r1;
            } else if (r7 instanceof AbstractC005302m) {
                AnonymousClass0O5 A9n = r7.A9n();
                AnonymousClass0O4 r5 = AnonymousClass0WT.A05;
                String canonicalName = AnonymousClass0WT.class.getCanonicalName();
                if (canonicalName != null) {
                    String A0K2 = AnonymousClass008.A0K("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
                    HashMap hashMap2 = A9n.A00;
                    AnonymousClass0SD r12 = (AnonymousClass0SD) hashMap2.get(A0K2);
                    if (!AnonymousClass0WT.class.isInstance(r12)) {
                        if (r5 instanceof AbstractC06820Uv) {
                            r12 = ((AbstractC06820Uv) r5).A01(A0K2, AnonymousClass0WT.class);
                        } else {
                            r12 = r5.A3B(AnonymousClass0WT.class);
                        }
                        AnonymousClass0SD r02 = (AnonymousClass0SD) hashMap2.put(A0K2, r12);
                        if (r02 != null) {
                            r02.A00();
                        }
                    } else if (r5 instanceof C06830Uw) {
                        ((C06830Uw) r5).A00(r12);
                    }
                    this.A07 = (AnonymousClass0WT) r12;
                    return;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            } else {
                this.A07 = new AnonymousClass0WT(false);
            }
        } else {
            throw new IllegalStateException("Already attached");
        }
    }

    public void A0h(AnonymousClass0QD r4, boolean z) {
        if (!z) {
            if (this.A04 == null) {
                if (this.A0H) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            } else if (A0s()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        ArrayList arrayList = this.A0S;
        synchronized (arrayList) {
            if (this.A04 != null) {
                arrayList.add(r4);
                A0D();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    public void A0i(AnonymousClass0QD r3, boolean z) {
        if (!z || (this.A04 != null && !this.A0H)) {
            A0r(z);
            if (r3.A4X(this.A0F, this.A0E)) {
                this.A0I = true;
                try {
                    A0m(this.A0F, this.A0E);
                } finally {
                    A0E();
                }
            }
            A0H();
            if (this.A0J) {
                this.A0J = false;
                A0G();
            }
            this.A0Q.A01.values().removeAll(Collections.singleton(null));
        }
    }

    public final void A0j(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C14830mx());
        AnonymousClass0SQ r5 = this.A04;
        if (r5 != null) {
            try {
                r5.A04.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        } else {
            try {
                A0k("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw runtimeException;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0103 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0k(java.lang.String r7, java.io.FileDescriptor r8, java.io.PrintWriter r9, java.lang.String[] r10) {
        /*
        // Method dump skipped, instructions count: 419
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LW.A0k(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    public final void A0l(ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        AnonymousClass0QB r1;
        int indexOf;
        boolean z2;
        AnonymousClass0QB r12;
        int indexOf2;
        ArrayList arrayList3 = this.A0C;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                C30211aw r6 = (C30211aw) this.A0C.get(i);
                if (arrayList != null && !(z2 = r6.A02) && (indexOf2 = arrayList.indexOf((r12 = r6.A01))) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                    this.A0C.remove(i);
                    i--;
                    size--;
                    r12.A02.A0O(r12, z2, false, false);
                } else if (r6.A00 == 0 || (arrayList != null && r6.A01.A0H(arrayList, 0, arrayList.size()))) {
                    this.A0C.remove(i);
                    i--;
                    size--;
                    if (arrayList == null || (z = r6.A02) || (indexOf = arrayList.indexOf((r1 = r6.A01))) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                        r6.A00();
                    } else {
                        r1.A02.A0O(r1, z, false, false);
                    }
                }
                i++;
            }
        }
    }

    public final void A0m(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                A0l(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((AnonymousClass0QC) arrayList.get(i)).A0F) {
                        if (i2 != i) {
                            A0n(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((AnonymousClass0QC) arrayList.get(i2)).A0F) {
                                i2++;
                            }
                        }
                        A0n(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    A0n(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    public final void A0n(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        int i3;
        int i4 = i;
        boolean z = ((AnonymousClass0QC) arrayList.get(i4)).A0F;
        ArrayList arrayList3 = this.A0D;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.A0D = arrayList3;
        } else {
            arrayList3.clear();
        }
        arrayList3.addAll(this.A0Q.A04());
        AnonymousClass037 r14 = this.A03;
        boolean z2 = false;
        for (int i5 = i4; i5 < i2; i5++) {
            AnonymousClass0QC r6 = (AnonymousClass0QC) arrayList.get(i5);
            if (!((Boolean) arrayList2.get(i5)).booleanValue()) {
                ArrayList arrayList4 = this.A0D;
                int i6 = 0;
                while (true) {
                    ArrayList arrayList5 = r6.A0A;
                    if (i6 < arrayList5.size()) {
                        C09130cL r13 = (C09130cL) arrayList5.get(i6);
                        int i7 = r13.A00;
                        if (i7 != 1) {
                            if (i7 == 2) {
                                AnonymousClass037 r3 = r13.A05;
                                int i8 = r3.A02;
                                boolean z3 = false;
                                for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                    AnonymousClass037 r1 = (AnonymousClass037) arrayList4.get(size);
                                    if (r1.A02 == i8) {
                                        if (r1 == r3) {
                                            z3 = true;
                                        } else {
                                            if (r1 == r14) {
                                                r6.A0A.add(i6, new C09130cL(9, r1));
                                                i6++;
                                                r14 = null;
                                            }
                                            C09130cL r15 = new C09130cL(3, r1);
                                            r15.A01 = r13.A01;
                                            r15.A03 = r13.A03;
                                            r15.A02 = r13.A02;
                                            r15.A04 = r13.A04;
                                            r6.A0A.add(i6, r15);
                                            arrayList4.remove(r1);
                                            i6++;
                                        }
                                    }
                                }
                                if (z3) {
                                    r6.A0A.remove(i6);
                                    i6--;
                                } else {
                                    r13.A00 = 1;
                                    arrayList4.add(r3);
                                }
                            } else if (i7 == 3 || i7 == 6) {
                                arrayList4.remove(r13.A05);
                                AnonymousClass037 r32 = r13.A05;
                                if (r32 == r14) {
                                    r6.A0A.add(i6, new C09130cL(9, r32));
                                    i6++;
                                    r14 = null;
                                }
                            } else if (i7 != 7) {
                                if (i7 == 8) {
                                    arrayList5.add(i6, new C09130cL(9, r14));
                                    i6++;
                                    r14 = r13.A05;
                                }
                            }
                            i6++;
                        }
                        arrayList4.add(r13.A05);
                        i6++;
                    }
                }
            } else {
                ArrayList arrayList6 = this.A0D;
                for (int size2 = r6.A0A.size() - 1; size2 >= 0; size2--) {
                    C09130cL r2 = (C09130cL) r6.A0A.get(size2);
                    int i9 = r2.A00;
                    if (i9 != 1) {
                        if (i9 != 3) {
                            switch (i9) {
                                case 8:
                                    r14 = null;
                                    break;
                                case 9:
                                    r14 = r2.A05;
                                    break;
                                case 10:
                                    r2.A06 = r2.A07;
                                    break;
                            }
                        }
                        arrayList6.add(r2.A05);
                    }
                    arrayList6.remove(r2.A05);
                }
            }
            if (!z2) {
                z2 = false;
                if (!r6.A0D) {
                }
            }
            z2 = true;
        }
        this.A0D.clear();
        if (!z) {
            C09330ch.A0A(this, arrayList, arrayList2, i4, i2, false, this.A0R);
        }
        for (int i10 = i4; i10 < i2; i10++) {
            AnonymousClass0QB r4 = (AnonymousClass0QB) arrayList.get(i10);
            boolean z4 = true;
            if (((Boolean) arrayList2.get(i10)).booleanValue()) {
                r4.A0D(-1);
                if (i10 != i2 - 1) {
                    z4 = false;
                }
                r4.A0F(z4);
            } else {
                r4.A0D(1);
                r4.A0C();
            }
        }
        if (z) {
            AnonymousClass03V r8 = new AnonymousClass03V(0);
            A0N(r8);
            i3 = i2;
            for (int i11 = i2 - 1; i11 >= i4; i11--) {
                AnonymousClass0QB r132 = (AnonymousClass0QB) arrayList.get(i11);
                boolean booleanValue = ((Boolean) arrayList2.get(i11)).booleanValue();
                int i12 = 0;
                while (true) {
                    ArrayList arrayList7 = r132.A0A;
                    if (i12 < arrayList7.size()) {
                        if (!AnonymousClass0QB.A00((C09130cL) arrayList7.get(i12))) {
                            i12++;
                        } else if (!r132.A0H(arrayList, i11 + 1, i2)) {
                            ArrayList arrayList8 = this.A0C;
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                                this.A0C = arrayList8;
                            }
                            C30211aw r42 = new C30211aw(r132, booleanValue);
                            arrayList8.add(r42);
                            int i13 = 0;
                            while (true) {
                                ArrayList arrayList9 = r132.A0A;
                                if (i13 < arrayList9.size()) {
                                    C09130cL r152 = (C09130cL) arrayList9.get(i13);
                                    if (AnonymousClass0QB.A00(r152)) {
                                        r152.A05.A0P(r42);
                                    }
                                    i13++;
                                } else {
                                    if (booleanValue) {
                                        r132.A0C();
                                    } else {
                                        r132.A0F(false);
                                    }
                                    i3--;
                                    if (i11 != i3) {
                                        arrayList.remove(i11);
                                        arrayList.add(i3, r132);
                                    }
                                    A0N(r8);
                                }
                            }
                        }
                    }
                }
            }
            int i14 = r8.A00;
            for (int i15 = 0; i15 < i14; i15++) {
                AnonymousClass037 r43 = (AnonymousClass037) r8.A03[i15];
                if (!r43.A0T) {
                    View A072 = r43.A07();
                    r43.A00 = A072.getAlpha();
                    A072.setAlpha(0.0f);
                }
            }
        } else {
            i3 = i2;
        }
        if (i3 != i4 && z) {
            C09330ch.A0A(this, arrayList, arrayList2, i4, i3, true, this.A0R);
            A0J(this.A00, true);
        }
        while (i4 < i2) {
            AnonymousClass0QB r12 = (AnonymousClass0QB) arrayList.get(i4);
            if (((Boolean) arrayList2.get(i4)).booleanValue() && r12.A00 >= 0) {
                r12.A00 = -1;
            }
            i4++;
        }
        if (z2 && this.A0A != null) {
            int i16 = 0;
            while (true) {
                ArrayList arrayList10 = this.A0A;
                if (i16 < arrayList10.size()) {
                    ((AbstractC15460o7) arrayList10.get(i16)).onBackStackChanged();
                    i16++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0o(boolean z) {
        for (AnonymousClass037 r0 : this.A0Q.A04()) {
            if (r0 != null) {
                r0.A0G.A0o(z);
            }
        }
    }

    public void A0p(boolean z) {
        for (AnonymousClass037 r0 : this.A0Q.A04()) {
            if (r0 != null) {
                r0.A0G.A0p(z);
            }
        }
    }

    public void A0q(boolean z) {
        A0r(z);
        while (true) {
            ArrayList arrayList = this.A0F;
            ArrayList arrayList2 = this.A0E;
            ArrayList arrayList3 = this.A0S;
            synchronized (arrayList3) {
                if (arrayList3.isEmpty()) {
                    break;
                }
                int size = arrayList3.size();
                boolean z2 = false;
                for (int i = 0; i < size; i++) {
                    z2 |= ((AnonymousClass0QD) arrayList3.get(i)).A4X(arrayList, arrayList2);
                }
                arrayList3.clear();
                this.A04.A02.removeCallbacks(this.A08);
                if (!z2) {
                    break;
                }
                this.A0I = true;
                try {
                    A0m(this.A0F, this.A0E);
                } finally {
                    A0E();
                }
            }
        }
        A0H();
        if (this.A0J) {
            this.A0J = false;
            A0G();
        }
        this.A0Q.A01.values().removeAll(Collections.singleton(null));
    }

    public final void A0r(boolean z) {
        if (this.A0I) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.A04 == null) {
            if (this.A0H) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() != this.A04.A02.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        } else if (z || !A0s()) {
            if (this.A0F == null) {
                this.A0F = new ArrayList();
                this.A0E = new ArrayList();
            }
            this.A0I = true;
            try {
                A0l(null, null);
            } finally {
                this.A0I = false;
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean A0s() {
        return this.A0L || this.A0M;
    }

    public boolean A0t() {
        A0q(false);
        A0r(true);
        AnonymousClass037 r0 = this.A03;
        if (r0 != null && r0.A0C().A0t()) {
            return true;
        }
        ArrayList arrayList = this.A0F;
        ArrayList arrayList2 = this.A0E;
        boolean A0z = A0z(arrayList, arrayList2, null, -1, 0);
        if (A0z) {
            this.A0I = true;
            try {
                A0m(arrayList, arrayList2);
            } finally {
                A0E();
            }
        }
        A0H();
        if (this.A0J) {
            this.A0J = false;
            A0G();
        }
        this.A0Q.A01.values().removeAll(Collections.singleton(null));
        return A0z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bb, code lost:
        if (r14 == false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d4, code lost:
        if (r5 != false) goto L_0x00d6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0u(android.view.Menu r20) {
        /*
        // Method dump skipped, instructions count: 289
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0LW.A0u(android.view.Menu):boolean");
    }

    public boolean A0v(Menu menu, MenuInflater menuInflater) {
        int i = 0;
        if (this.A00 < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AnonymousClass037 r4 : this.A0Q.A04()) {
            if (r4 != null) {
                boolean z2 = false;
                if (!r4.A0Z) {
                    if (r4.A0Y && r4.A0e) {
                        z2 = true;
                        r4.A0k(menu, menuInflater);
                    }
                    if (z2 || r4.A0G.A0v(menu, menuInflater)) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(r4);
                        z = true;
                    }
                }
            }
        }
        if (this.A0B != null) {
            while (true) {
                ArrayList arrayList2 = this.A0B;
                if (i >= arrayList2.size()) {
                    break;
                }
                Object obj = arrayList2.get(i);
                if ((arrayList == null || !arrayList.contains(obj)) && obj == null) {
                    throw null;
                }
                i++;
            }
        }
        this.A0B = arrayList;
        return z;
    }

    public boolean A0w(MenuItem menuItem) {
        boolean z;
        if (this.A00 < 1) {
            return false;
        }
        for (AnonymousClass037 r3 : this.A0Q.A04()) {
            if (r3 != null && !r3.A0Z) {
                if (r3 instanceof ConversationsFragment) {
                    ConversationsFragment conversationsFragment = (ConversationsFragment) r3;
                    z = false;
                    if (conversationsFragment.A0M.A02(conversationsFragment.A0A(), conversationsFragment, menuItem)) {
                        z = true;
                    }
                } else if (r3 instanceof SearchFragment) {
                    SearchFragment searchFragment = (SearchFragment) r3;
                    if (searchFragment.A07.A02(searchFragment.A0A(), searchFragment, menuItem)) {
                        C28301Tu.A05();
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (!(r3 instanceof ContactPickerFragment)) {
                    z = false;
                } else {
                    ContactPickerFragment contactPickerFragment = (ContactPickerFragment) r3;
                    AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (AdapterView.AdapterContextMenuInfo) menuItem.getMenuInfo();
                    ListView listView = contactPickerFragment.A0A;
                    if (listView == null) {
                        listView = (ListView) contactPickerFragment.A07.findViewById(16908298);
                        contactPickerFragment.A0A = listView;
                    }
                    C007003k A5O = ((AnonymousClass2GM) listView.getItemAtPosition(adapterContextMenuInfo.position)).A5O();
                    if (A5O == null || menuItem.getItemId() != 0) {
                        z = false;
                    } else {
                        AnonymousClass0GG r5 = contactPickerFragment.A12;
                        ActivityC004902h A0A2 = contactPickerFragment.A0A();
                        Jid A022 = A5O.A02(UserJid.class);
                        if (A022 != null) {
                            r5.A07(A0A2, null, (UserJid) A022);
                            z = true;
                        } else {
                            throw null;
                        }
                    }
                }
                if (z || r3.A0G.A0w(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A0x(MenuItem menuItem) {
        if (this.A00 < 1) {
            return false;
        }
        for (AnonymousClass037 r1 : this.A0Q.A04()) {
            if (r1 != null && !r1.A0Z) {
                if ((r1.A0Y && r1.A0e && r1.A0m(menuItem)) || r1.A0G.A0x(menuItem)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean A0y(AnonymousClass037 r4) {
        if (r4 == null) {
            return true;
        }
        AnonymousClass0LW r1 = r4.A0H;
        if (!r4.equals(r1.A03) || !A0y(r1.A02)) {
            return false;
        }
        return true;
    }

    public boolean A0z(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList arrayList3 = this.A09;
        if (arrayList3 == null) {
            return false;
        }
        if (str != null || i >= 0) {
            i3 = arrayList3.size() - 1;
            while (i3 >= 0) {
                AnonymousClass0QB r1 = (AnonymousClass0QB) arrayList3.get(i3);
                if ((str == null || !str.equals(r1.getName())) && (i < 0 || i != r1.A00)) {
                    i3--;
                } else if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        AnonymousClass0QB r12 = (AnonymousClass0QB) arrayList3.get(i3);
                        if ((str == null || !str.equals(r12.getName())) && (i < 0 || i != r12.A00)) {
                            break;
                        }
                    }
                }
            }
            return false;
        } else if ((i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(arrayList3.remove(size));
            arrayList2.add(Boolean.TRUE);
            return true;
        } else {
            i3 = -1;
        }
        if (i3 == arrayList3.size() - 1) {
            return false;
        }
        for (int size2 = arrayList3.size() - 1; size2 > i3; size2--) {
            arrayList.add(arrayList3.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AnonymousClass037 r1 = this.A02;
        if (r1 != null) {
            sb.append(r1.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(r1)));
            sb.append("}");
        } else {
            AnonymousClass0SQ r12 = this.A04;
            sb.append(r12.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(r12)));
            sb.append("}");
        }
        sb.append("}}");
        return sb.toString();
    }
}
