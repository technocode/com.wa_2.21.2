package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;

/* renamed from: X.0cu  reason: invalid class name and case insensitive filesystem */
public class C09450cu {
    public int A00 = -1;
    public final AnonymousClass037 A01;
    public final AnonymousClass0SX A02;

    public C09450cu(AnonymousClass0SX r2, AnonymousClass037 r3) {
        this.A02 = r2;
        this.A01 = r3;
    }

    public C09450cu(AnonymousClass0SX r3, AnonymousClass037 r4, C15500oB r5) {
        String str;
        this.A02 = r3;
        this.A01 = r4;
        r4.A08 = null;
        r4.A01 = 0;
        r4.A0b = false;
        r4.A0T = false;
        AnonymousClass037 r0 = r4.A0E;
        if (r0 != null) {
            str = r0.A0S;
        } else {
            str = null;
        }
        r4.A0R = str;
        r4.A0E = null;
        Bundle bundle = r5.A00;
        if (bundle != null) {
            r4.A07 = bundle;
        } else {
            r4.A07 = new Bundle();
        }
    }

    public C09450cu(AnonymousClass0SX r4, ClassLoader classLoader, AnonymousClass0SZ r6, C15500oB r7) {
        this.A02 = r4;
        this.A01 = r6.A00(classLoader, r7.A05);
        Bundle bundle = r7.A04;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        AnonymousClass037 r2 = this.A01;
        r2.A0N(bundle);
        r2.A0S = r7.A07;
        r2.A0X = r7.A09;
        r2.A0h = true;
        r2.A03 = r7.A02;
        r2.A02 = r7.A01;
        r2.A0Q = r7.A06;
        r2.A0i = r7.A0C;
        r2.A0g = r7.A0B;
        r2.A0W = r7.A08;
        r2.A0Z = r7.A0A;
        r2.A0J = EnumC014207z.values()[r7.A03];
        Bundle bundle2 = r7.A00;
        if (bundle2 != null) {
            this.A01.A07 = bundle2;
        } else {
            this.A01.A07 = new Bundle();
        }
        if (AnonymousClass0LW.A01(2)) {
            StringBuilder A0S = AnonymousClass008.A0S("Instantiated fragment ");
            A0S.append(this.A01);
            Log.v("FragmentManager", A0S.toString());
        }
    }

    public final Bundle A00() {
        Bundle bundle = new Bundle();
        AnonymousClass037 r3 = this.A01;
        r3.A0j(bundle);
        r3.A0N.A00.A02(bundle);
        Parcelable A04 = r3.A0G.A04();
        if (A04 != null) {
            bundle.putParcelable("android:support:fragments", A04);
        }
        this.A02.A05(r3, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        View view = r3.A0A;
        if (!(view == null || view == null)) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            view.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                r3.A08 = sparseArray;
            }
        }
        if (r3.A08 != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", r3.A08);
        }
        if (!r3.A0k) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", r3.A0k);
        }
        return bundle;
    }

    public void A01(ClassLoader classLoader) {
        boolean z;
        AnonymousClass037 r3 = this.A01;
        Bundle bundle = r3.A07;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            r3.A08 = r3.A07.getSparseParcelableArray("android:view_state");
            String string = r3.A07.getString("android:target_state");
            r3.A0R = string;
            if (string != null) {
                r3.A05 = r3.A07.getInt("android:target_req_state", 0);
            }
            Boolean bool = r3.A0P;
            if (bool != null) {
                z = bool.booleanValue();
                r3.A0k = z;
                r3.A0P = null;
            } else {
                z = r3.A07.getBoolean("android:user_visible_hint", true);
                r3.A0k = z;
            }
            if (!z) {
                r3.A0V = true;
            }
        }
    }
}
