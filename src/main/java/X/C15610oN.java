package X;

import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0oN  reason: invalid class name and case insensitive filesystem */
public final class C15610oN {
    public static final Class[] A03;
    public final AbstractC16900qd A00;
    public final Map A01;
    public final Map A02;

    static {
        Class[] clsArr = new Class[29];
        clsArr[0] = Boolean.TYPE;
        clsArr[1] = boolean[].class;
        clsArr[2] = Double.TYPE;
        clsArr[3] = double[].class;
        Class<SizeF> cls = Integer.TYPE;
        clsArr[4] = cls;
        clsArr[5] = int[].class;
        clsArr[6] = Long.TYPE;
        clsArr[7] = long[].class;
        clsArr[8] = String.class;
        clsArr[9] = String[].class;
        clsArr[10] = Binder.class;
        clsArr[11] = Bundle.class;
        clsArr[12] = Byte.TYPE;
        clsArr[13] = byte[].class;
        clsArr[14] = Character.TYPE;
        clsArr[15] = char[].class;
        clsArr[16] = CharSequence.class;
        clsArr[17] = CharSequence[].class;
        clsArr[18] = ArrayList.class;
        clsArr[19] = Float.TYPE;
        clsArr[20] = float[].class;
        clsArr[21] = Parcelable.class;
        clsArr[22] = Parcelable[].class;
        clsArr[23] = Serializable.class;
        clsArr[24] = Short.TYPE;
        clsArr[25] = short[].class;
        clsArr[26] = SparseArray.class;
        int i = Build.VERSION.SDK_INT;
        clsArr[27] = i >= 21 ? Size.class : cls;
        if (i >= 21) {
            cls = SizeF.class;
        }
        clsArr[28] = cls;
        A03 = clsArr;
    }

    public C15610oN() {
        this.A01 = new HashMap();
        this.A00 = new C30251b1(this);
        this.A02 = new HashMap();
    }

    public C15610oN(Map map) {
        this.A01 = new HashMap();
        this.A00 = new C30251b1(this);
        this.A02 = new HashMap(map);
    }

    public static C15610oN A00(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new C15610oN();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new C15610oN(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i = 0; i < parcelableArrayList.size(); i++) {
            hashMap.put(parcelableArrayList.get(i), parcelableArrayList2.get(i));
        }
        return new C15610oN(hashMap);
    }

    public final C02270Bi A01(String str, boolean z, Object obj) {
        C452423s r0;
        Map map = this.A01;
        C02270Bi r02 = (C02270Bi) map.get(str);
        if (r02 != null) {
            return r02;
        }
        Map map2 = this.A02;
        if (map2.containsKey(str)) {
            r0 = new C452423s(this, str, map2.get(str));
        } else if (z) {
            r0 = new C452423s(this, str, obj);
        } else {
            r0 = new C452423s(this, str);
        }
        map.put(str, r0);
        return r0;
    }

    public void A02(String str, Object obj) {
        if (obj != null) {
            for (Class cls : A03) {
                if (!cls.isInstance(obj)) {
                }
            }
            StringBuilder A0S = AnonymousClass008.A0S("Can't put value with type ");
            A0S.append(obj.getClass());
            A0S.append(" into saved state");
            throw new IllegalArgumentException(A0S.toString());
        }
        AbstractC02280Bj r0 = (AbstractC02280Bj) this.A01.get(str);
        if (r0 != null) {
            r0.A07(obj);
        } else {
            this.A02.put(str, obj);
        }
    }
}
