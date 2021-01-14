package com.google.android.gms.common.api.internal;

import X.AbstractC04610La;
import X.AnonymousClass037;
import X.AnonymousClass05V;
import X.HandlerC242019j;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class zzc extends AnonymousClass037 implements AbstractC04610La {
    public static WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public Map A02 = new AnonymousClass05V();

    @Override // X.AnonymousClass037
    public final void A0R(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.A0R(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // X.AnonymousClass037
    public final void A0c() {
        this.A0U = true;
        this.A00 = 5;
        for (Object obj : this.A02.values()) {
            if (obj == null) {
                throw null;
            }
        }
    }

    @Override // X.AnonymousClass037
    public final void A0e() {
        this.A0U = true;
        this.A00 = 3;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A00();
        }
    }

    @Override // X.AnonymousClass037
    public final void A0f() {
        this.A0U = true;
        this.A00 = 2;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A01();
        }
    }

    @Override // X.AnonymousClass037
    public final void A0g(int i, int i2, Intent intent) {
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A03(i, i2, intent);
        }
    }

    @Override // X.AnonymousClass037
    public final void A0i(Bundle bundle) {
        Bundle bundle2;
        super.A0i(bundle);
        this.A00 = 1;
        this.A01 = bundle;
        for (Map.Entry entry : this.A02.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.A04(bundle2);
        }
    }

    @Override // X.AnonymousClass037
    public final void A0j(Bundle bundle) {
        if (bundle != null) {
            for (Map.Entry entry : this.A02.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).A05(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // X.AbstractC04610La
    public final void A1h(String str, LifecycleCallback lifecycleCallback) {
        if (!this.A02.containsKey(str)) {
            this.A02.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new HandlerC242019j(Looper.getMainLooper()).post(new RunnableEBaseShape1S1200000_I1(lifecycleCallback, this, str, 7));
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 59);
        sb.append("LifecycleCallback with tag ");
        sb.append(str);
        sb.append(" already added to this fragment.");
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // X.AbstractC04610La
    public final LifecycleCallback A57(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.A02.get(str));
    }

    @Override // X.AbstractC04610La
    public final /* synthetic */ Activity A76() {
        return A0A();
    }
}
