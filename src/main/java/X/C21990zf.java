package X;

import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0zf  reason: invalid class name and case insensitive filesystem */
public class C21990zf {
    public static final Rect A00 = new Rect(-1000, -1000, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
    public static final boolean A01;

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 17) {
            z = true;
        }
        A01 = z;
    }

    public static C21970zd A00(Camera.Parameters parameters, String str, String str2) {
        String str3 = parameters.get(str);
        ArrayList A02 = A02(str2);
        SparseArray sparseArray = new SparseArray();
        ArrayList arrayList = new ArrayList(A02.size());
        Iterator it = A02.iterator();
        int i = -1;
        while (it.hasNext()) {
            String str4 = (String) it.next();
            try {
                String str5 = str4;
                if (str4.startsWith("ISO")) {
                    str5 = str4.substring(3);
                }
                Integer valueOf = Integer.valueOf(Integer.parseInt(str5));
                int intValue = valueOf.intValue();
                sparseArray.put(intValue, str4);
                arrayList.add(valueOf);
                if (str4.equals(str3)) {
                    i = intValue;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return new C21970zd(str, str3, i, sparseArray, arrayList);
    }

    public static String A01(List list) {
        if (list.isEmpty()) {
            return "()";
        }
        StringBuilder sb = new StringBuilder("(");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Camera.Area area = (Camera.Area) list.get(i);
            sb.append('[');
            sb.append(area.rect.flattenToString());
            sb.append(' ');
            sb.append(area.weight);
            sb.append("] ");
        }
        sb.append(')');
        return sb.toString();
    }

    public static ArrayList A02(String str) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        TextUtils.SimpleStringSplitter simpleStringSplitter = new TextUtils.SimpleStringSplitter(',');
        simpleStringSplitter.setString(str);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = simpleStringSplitter.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A03(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21990zf.A03(java.lang.String):java.util.ArrayList");
    }

    public static List A04(Rect rect) {
        int i;
        Rect rect2 = A00;
        if (!rect.intersect(rect2) && !rect2.contains(rect)) {
            int i2 = rect.right;
            int i3 = rect2.left;
            int i4 = 0;
            if (i2 <= i3) {
                i = i3 - rect.left;
            } else {
                int i5 = rect.left;
                int i6 = rect2.right;
                i = 0;
                if (i5 >= i6) {
                    i = i6 - i2;
                }
            }
            int i7 = rect.bottom;
            int i8 = rect2.top;
            if (i7 <= i8) {
                i4 = i8 - rect.top;
            } else {
                int i9 = rect.top;
                int i10 = rect2.bottom;
                if (i9 >= i10) {
                    i4 = i10 - i7;
                }
            }
            rect.offset(i, i4);
            rect.intersect(rect2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Camera.Area(rect, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
        return arrayList;
    }

    public static List A05(List list) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Camera.Size size2 = (Camera.Size) list.get(i);
            arrayList.add(new C07070Vu(size2.width, size2.height));
        }
        return arrayList;
    }

    public static List A06(List list) {
        if (list == null) {
            return Collections.emptyList();
        }
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Camera.Size size2 = (Camera.Size) list.get(i);
            arrayList.add(new C07070Vu(size2.width, size2.height));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
