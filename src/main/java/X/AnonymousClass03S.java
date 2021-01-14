package X;

import android.os.Build;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.03S  reason: invalid class name */
public class AnonymousClass03S {
    public static volatile AnonymousClass03S A02;
    public final AnonymousClass00G A00;
    public final AnonymousClass00D A01;

    public AnonymousClass03S(AnonymousClass00G r1, AnonymousClass00D r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static AnonymousClass03S A00() {
        if (A02 == null) {
            synchronized (AnonymousClass03S.class) {
                if (A02 == null) {
                    A02 = new AnonymousClass03S(AnonymousClass00G.A01, AnonymousClass00D.A00());
                }
            }
        }
        return A02;
    }

    public static List A01() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.READ_PHONE_STATE");
        if (Build.VERSION.SDK_INT >= 30) {
            arrayList.add("android.permission.READ_PHONE_NUMBERS");
        }
        return arrayList;
    }

    public int A02(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        int A012 = C004302a.A01(this.A00.A00, str);
        if (A012 == 0) {
            AnonymousClass008.A0j(this.A01, str);
        }
        return A012;
    }

    public boolean A03() {
        return A02("android.permission.READ_CONTACTS") == 0 && A02("android.permission.WRITE_CONTACTS") == 0;
    }

    public boolean A04() {
        return A02("android.permission.ACCESS_COARSE_LOCATION") == 0 || A02("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public boolean A05() {
        if (Build.VERSION.SDK_INT >= 28) {
            if (A02("android.permission.ANSWER_PHONE_CALLS") == 0 && A02("android.permission.READ_CALL_LOG") == 0 && A08()) {
                return true;
            }
            return false;
        } else if (A02("android.permission.CALL_PHONE") != 0 || !A08()) {
            return false;
        } else {
            return true;
        }
    }

    public boolean A06() {
        return A02("android.permission.WRITE_EXTERNAL_STORAGE") == 0 && A02("android.permission.READ_EXTERNAL_STORAGE") == 0;
    }

    public boolean A07() {
        return this.A00.A00.checkCallingOrSelfPermission("android.permission.CAMERA") == 0;
    }

    public boolean A08() {
        Iterator it = ((AbstractCollection) A01()).iterator();
        boolean z = true;
        while (it.hasNext()) {
            boolean z2 = false;
            if (A02((String) it.next()) == 0) {
                z2 = true;
            }
            z &= z2;
        }
        return z;
    }

    public boolean A09() {
        return this.A00.A00.checkCallingOrSelfPermission("android.permission.RECORD_AUDIO") == 0;
    }

    public boolean A0A(String str) {
        return "mounted".equals(str) && A02("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public boolean A0B(boolean z) {
        boolean z2;
        if ((Build.VERSION.SDK_INT >= 23 || A09()) && (Build.VERSION.SDK_INT < 23 || A02("android.permission.RECORD_AUDIO") == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z3 = z && ((Build.VERSION.SDK_INT < 23 && !A07()) || (Build.VERSION.SDK_INT >= 23 && A02("android.permission.CAMERA") != 0));
        if (z2 || z3) {
            return false;
        }
        return true;
    }
}
