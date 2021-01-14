package X;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.1jk  reason: invalid class name and case insensitive filesystem */
public final class FragmentC35081jk extends Fragment implements AbstractC04610La {
    public static WeakHashMap A03 = new WeakHashMap();
    public int A00 = 0;
    public Bundle A01;
    public Map A02 = new AnonymousClass05V();

    @Override // X.AbstractC04610La
    public final void A1h(String str, LifecycleCallback lifecycleCallback) {
        if (!this.A02.containsKey(str)) {
            this.A02.put(str, lifecycleCallback);
            if (this.A00 > 0) {
                new HandlerC242019j(Looper.getMainLooper()).post(new RunnableEBaseShape1S1200000_I1(lifecycleCallback, this, str, 6));
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
    public final Activity A76() {
        return getActivity();
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.A02.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A03(i, i2, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
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

    public final void onDestroy() {
        super.onDestroy();
        this.A00 = 5;
        for (Object obj : this.A02.values()) {
            if (obj == null) {
                throw null;
            }
        }
    }

    public final void onResume() {
        super.onResume();
        this.A00 = 3;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A00();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.A02.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).A05(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.A00 = 2;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A01();
        }
    }

    public final void onStop() {
        super.onStop();
        this.A00 = 4;
        for (LifecycleCallback lifecycleCallback : this.A02.values()) {
            lifecycleCallback.A02();
        }
    }
}
