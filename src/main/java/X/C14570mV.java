package X;

import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.0mV  reason: invalid class name and case insensitive filesystem */
public class C14570mV {
    public static Field A00;
    public static boolean A01;
    public static final Object A02 = new Object();

    public static Bundle A00(C14550mT r4) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", r4.A00);
        bundle2.putCharSequence("title", r4.A03);
        bundle2.putParcelable("actionIntent", r4.A01);
        Bundle bundle3 = r4.A07;
        if (bundle3 != null) {
            bundle = new Bundle(bundle3);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", r4.A04);
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", A01(r4.A09));
        bundle2.putBoolean("showsUserInterface", r4.A05);
        bundle2.putInt("semanticAction", r4.A06);
        return bundle2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.os.Bundle[] */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: android.os.Bundle */
    /* JADX WARN: Multi-variable type inference failed */
    public static Bundle[] A01(C14630mc[] r7) {
        if (r7 == null) {
            return null;
        }
        int length = r7.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < length; i++) {
            C14630mc r2 = r7[i];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", r2.A02);
            bundle.putCharSequence("label", r2.A01);
            bundle.putCharSequenceArray("choices", r2.A05);
            bundle.putBoolean("allowFreeFormInput", r2.A04);
            bundle.putBundle("extras", r2.A00);
            Set<Object> set = r2.A03;
            if (set != null && !set.isEmpty()) {
                ArrayList arrayList = new ArrayList(set.size());
                for (Object obj : set) {
                    arrayList.add(obj);
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i] = bundle;
        }
        return bundleArr;
    }
}
