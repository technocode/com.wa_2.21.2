package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.internal.RunnablezaauShape0S0200000_I1;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.1jG  reason: invalid class name and case insensitive filesystem */
public final class C34811jG implements AnonymousClass17V {
    public int A00;
    public int A01 = 0;
    public int A02;
    public C34661ix A03;
    public IAccountAccessor A04;
    public AbstractC458426o A05;
    public ArrayList A06 = new ArrayList();
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Context A0C;
    public final Bundle A0D = new Bundle();
    public final AnonymousClass0LQ A0E;
    public final AbstractC34691j1 A0F;
    public final AnonymousClass262 A0G;
    public final C238417u A0H;
    public final Map A0I;
    public final Set A0J = new HashSet();
    public final Lock A0K;

    public C34811jG(AnonymousClass262 r2, C238417u r3, Map map, AnonymousClass0LQ r5, AbstractC34691j1 r6, Lock lock, Context context) {
        this.A0G = r2;
        this.A0H = r3;
        this.A0I = map;
        this.A0E = r5;
        this.A0F = r6;
        this.A0K = lock;
        this.A0C = context;
    }

    @Override // X.AnonymousClass17V
    public final void connect() {
    }

    public final void A00() {
        if (this.A02 == 0) {
            if (!this.A08 || this.A09) {
                ArrayList arrayList = new ArrayList();
                this.A01 = 1;
                AnonymousClass262 r5 = this.A0G;
                Map map = r5.A0A;
                this.A02 = map.size();
                for (Object obj : map.keySet()) {
                    if (!r5.A0B.containsKey(obj)) {
                        arrayList.add(map.get(obj));
                    } else if (A06()) {
                        A01();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.A06.add(AnonymousClass17X.A00.submit(new RunnablezaauShape0S0200000_I1(this, arrayList)));
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A01() {
        AnonymousClass262 r3 = this.A0G;
        Lock lock = r3.A0D;
        lock.lock();
        try {
            r3.A05.A07();
            r3.A0E = new C34791jE(r3);
            r3.A0E.A2C();
            r3.A0C.signalAll();
            lock.unlock();
            AnonymousClass17X.A00.execute(new RunnableEBaseShape5S0100000_I1_0(this, 41));
            AbstractC458426o r2 = this.A05;
            if (r2 != null) {
                if (this.A0A) {
                    r2.ARS(this.A04, this.A0B);
                }
                A05(false);
            }
            for (Object obj : r3.A0B.keySet()) {
                ((AbstractC34701j2) r3.A0A.get(obj)).A3k();
            }
            Bundle bundle = this.A0D;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            r3.A07.ARY(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final void A02() {
        this.A08 = false;
        AnonymousClass262 r6 = this.A0G;
        r6.A05.A05 = Collections.emptySet();
        for (Object obj : this.A0J) {
            Map map = r6.A0B;
            if (!map.containsKey(obj)) {
                map.put(obj, new C34661ix(17, null));
            }
        }
    }

    public final void A03(C34661ix r6) {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.A06.clear();
        A05(!r6.A01());
        AnonymousClass262 r0 = this.A0G;
        r0.A00(r6);
        r0.A07.ARa(r6);
    }

    public final void A04(C34661ix r5, AnonymousClass16z r6, boolean z) {
        if (r6.A00 != null) {
            if ((!z || r5.A01() || this.A0E.A01(null, r5.A01, null) != null) && (this.A03 == null || Integer.MAX_VALUE < this.A00)) {
                this.A03 = r5;
                this.A00 = Integer.MAX_VALUE;
            }
            this.A0G.A0B.put(r6.A00(), r5);
            return;
        }
        throw null;
    }

    public final void A05(boolean z) {
        AbstractC458426o r0 = this.A05;
        if (r0 != null) {
            if (r0.isConnected() && z) {
                this.A05.ARc();
            }
            this.A05.A3k();
            this.A04 = null;
        }
    }

    public final boolean A06() {
        int i = this.A02 - 1;
        this.A02 = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            C34881jN r2 = this.A0G.A05;
            if (r2 != null) {
                StringWriter stringWriter = new StringWriter();
                r2.A06(new PrintWriter(stringWriter));
                Log.w("GoogleApiClientConnecting", stringWriter.toString());
                Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                A03(new C34661ix(8, null));
                return false;
            }
            throw null;
        }
        C34661ix r22 = this.A03;
        if (r22 == null) {
            return true;
        }
        this.A0G.A00 = this.A00;
        A03(r22);
        return false;
    }

    public final boolean A07(int i) {
        String str;
        if (this.A01 == i) {
            return true;
        }
        C34881jN r2 = this.A0G.A05;
        if (r2 != null) {
            StringWriter stringWriter = new StringWriter();
            r2.A06(new PrintWriter(stringWriter));
            Log.w("GoogleApiClientConnecting", stringWriter.toString());
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Unexpected callback in ");
            sb.append(valueOf);
            Log.w("GoogleApiClientConnecting", sb.toString());
            int i2 = this.A02;
            StringBuilder sb2 = new StringBuilder(33);
            sb2.append("mRemainingConnections=");
            sb2.append(i2);
            Log.w("GoogleApiClientConnecting", sb2.toString());
            int i3 = this.A01;
            String str2 = "UNKNOWN";
            if (i3 != 0) {
                str = "STEP_GETTING_REMOTE_SERVICE";
                if (i3 != 1) {
                    str = str2;
                }
            } else {
                str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            }
            if (i == 0) {
                str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            } else if (i == 1) {
                str2 = "STEP_GETTING_REMOTE_SERVICE";
            }
            Log.wtf("GoogleApiClientConnecting", AnonymousClass008.A09(str2.length() + str.length() + 70, "GoogleApiClient connecting is in step ", str, " but received callback for step ", str2), new Exception());
            A03(new C34661ix(8, null));
            return false;
        }
        throw null;
    }

    @Override // X.AnonymousClass17V
    public final void A2C() {
        AnonymousClass262 r2 = this.A0G;
        r2.A0B.clear();
        this.A08 = false;
        this.A03 = null;
        this.A01 = 0;
        this.A07 = true;
        this.A09 = false;
        this.A0A = false;
        HashMap hashMap = new HashMap();
        Map map = this.A0I;
        for (AnonymousClass16z r6 : map.keySet()) {
            AbstractC34701j2 r5 = (AbstractC34701j2) r2.A0A.get(r6.A00());
            if (r6.A00 != null) {
                boolean booleanValue = ((Boolean) map.get(r6)).booleanValue();
                if (r5.AMw()) {
                    this.A08 = true;
                    if (booleanValue) {
                        this.A0J.add(r6.A00());
                    } else {
                        this.A07 = false;
                    }
                }
                hashMap.put(r5, new C34821jH(this, r6, booleanValue));
            } else {
                throw null;
            }
        }
        if (this.A08) {
            C238417u r7 = this.A0H;
            C34881jN r1 = r2.A05;
            r7.A00 = Integer.valueOf(System.identityHashCode(r1));
            C34861jL r9 = new C34861jL(this);
            this.A05 = (AbstractC458426o) this.A0F.A00(this.A0C, r1.A08, r7, r7.A01, r9, r9);
        }
        this.A02 = r2.A0A.size();
        this.A06.add(AnonymousClass17X.A00.submit(new RunnablezaauShape0S0200000_I1(this, hashMap)));
    }

    @Override // X.AnonymousClass17V
    public final boolean A3m() {
        ArrayList arrayList = this.A06;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.A06.clear();
        A05(true);
        this.A0G.A00(null);
        return true;
    }

    @Override // X.AnonymousClass17V
    public final AbstractC457025y A47(AbstractC457025y r2) {
        this.A0G.A05.A0K.add(r2);
        return r2;
    }

    @Override // X.AnonymousClass17V
    public final AbstractC457025y A4A(AbstractC457025y r3) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // X.AnonymousClass17V
    public final void AEX(Bundle bundle) {
        if (A07(1)) {
            if (bundle != null) {
                this.A0D.putAll(bundle);
            }
            if (A06()) {
                A01();
            }
        }
    }

    @Override // X.AnonymousClass17V
    public final void AEZ(int i) {
        A03(new C34661ix(8, null));
    }

    @Override // X.AnonymousClass17V
    public final void ARQ(C34661ix r2, AnonymousClass16z r3, boolean z) {
        if (A07(1)) {
            A04(r2, r3, z);
            if (A06()) {
                A01();
            }
        }
    }
}
