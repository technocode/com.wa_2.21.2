package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: X.1iH  reason: invalid class name and case insensitive filesystem */
public final class C34331iH implements AnonymousClass14F {
    public final C230114b A00;
    public final Map A01;
    public final Map A02;
    public final Map A03;
    public final long[] A04;

    public C34331iH(C230114b r7, Map map, Map map2, Map map3) {
        this.A00 = r7;
        this.A03 = map2;
        this.A02 = map3;
        this.A01 = Collections.unmodifiableMap(map);
        if (r7 != null) {
            TreeSet treeSet = new TreeSet();
            int i = 0;
            r7.A04(treeSet, false);
            long[] jArr = new long[treeSet.size()];
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                jArr[i] = ((Number) it.next()).longValue();
                i++;
            }
            this.A04 = jArr;
            return;
        }
        throw null;
    }

    @Override // X.AnonymousClass14F
    public List A5d(long j) {
        int i;
        int i2;
        C230114b r5 = this.A00;
        Map map = this.A01;
        Map map2 = this.A03;
        Map map3 = this.A02;
        if (r5 != null) {
            ArrayList arrayList = new ArrayList();
            String str = r5.A05;
            r5.A01(j, str, arrayList);
            TreeMap treeMap = new TreeMap();
            r5.A03(j, false, str, treeMap);
            r5.A02(j, map, treeMap);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                String str2 = (String) map3.get(pair.second);
                if (str2 != null) {
                    byte[] decode = Base64.decode(str2, 0);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    C230214c r4 = (C230214c) map2.get(pair.first);
                    arrayList2.add(new AnonymousClass14E(decodeByteArray, r4.A01, 1, r4.A00, r4.A04, r4.A03, Float.MIN_VALUE));
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                C230214c r10 = (C230214c) map2.get(entry.getKey());
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
                int length = spannableStringBuilder.length();
                for (int i3 = 0; i3 < length; i3++) {
                    if (spannableStringBuilder.charAt(i3) == ' ') {
                        int i4 = i3 + 1;
                        int i5 = i4;
                        while (i5 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i5) == ' ') {
                            i5++;
                        }
                        int i6 = i5 - i4;
                        if (i6 > 0) {
                            spannableStringBuilder.delete(i3, i3 + i6);
                            length -= i6;
                        }
                    }
                }
                if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
                    spannableStringBuilder.delete(0, 1);
                    length--;
                }
                int i7 = 0;
                while (true) {
                    i = length - 1;
                    if (i7 >= i) {
                        break;
                    }
                    if (spannableStringBuilder.charAt(i7) == '\n') {
                        int i8 = i7 + 1;
                        if (spannableStringBuilder.charAt(i8) == ' ') {
                            spannableStringBuilder.delete(i8, i7 + 2);
                            length = i;
                        }
                    }
                    i7++;
                }
                if (length > 0 && spannableStringBuilder.charAt(i) == ' ') {
                    spannableStringBuilder.delete(i, length);
                    length = i;
                }
                int i9 = 0;
                while (true) {
                    i2 = length - 1;
                    if (i9 >= i2) {
                        break;
                    }
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        int i10 = i9 + 1;
                        if (spannableStringBuilder.charAt(i10) == '\n') {
                            spannableStringBuilder.delete(i9, i10);
                            length = i2;
                        }
                    }
                    i9++;
                }
                if (length > 0 && spannableStringBuilder.charAt(i2) == '\n') {
                    spannableStringBuilder.delete(i2, length);
                }
                arrayList2.add(new AnonymousClass14E(spannableStringBuilder, null, null, r10.A00, r10.A05, r10.A04, r10.A01, EditorInfoCompat.IME_FLAG_FORCE_ASCII, r10.A06, r10.A02, r10.A03, Float.MIN_VALUE, false, -16777216));
            }
            return arrayList2;
        }
        throw null;
    }

    @Override // X.AnonymousClass14F
    public long A6H(int i) {
        return this.A04[i];
    }

    @Override // X.AnonymousClass14F
    public int A6I() {
        return this.A04.length;
    }

    @Override // X.AnonymousClass14F
    public int A7e(long j) {
        long[] jArr = this.A04;
        int A032 = AnonymousClass0W2.A03(jArr, j, false, false);
        if (A032 >= jArr.length) {
            return -1;
        }
        return A032;
    }
}
