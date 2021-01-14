package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* renamed from: X.14b  reason: invalid class name and case insensitive filesystem */
public final class C230114b {
    public List A00;
    public final long A01;
    public final long A02;
    public final C230314d A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final HashMap A08;
    public final HashMap A09;
    public final boolean A0A;
    public final String[] A0B;

    public C230114b(String str, String str2, long j, long j2, C230314d r8, String[] strArr, String str3, String str4) {
        this.A06 = str;
        this.A07 = str2;
        this.A04 = str4;
        this.A03 = r8;
        this.A0B = strArr;
        this.A0A = str2 != null;
        this.A02 = j;
        this.A01 = j2;
        if (str3 != null) {
            this.A05 = str3;
            this.A09 = new HashMap();
            this.A08 = new HashMap();
            return;
        }
        throw null;
    }

    public static SpannableStringBuilder A00(String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return (SpannableStringBuilder) map.get(str);
    }

    public final void A01(long j, String str, List list) {
        int size;
        String str2;
        String str3 = this.A05;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (!A05(j) || !"div".equals(this.A06) || (str2 = this.A04) == null) {
            int i = 0;
            while (true) {
                List list2 = this.A00;
                if (list2 == null) {
                    size = 0;
                } else {
                    size = list2.size();
                }
                if (i < size) {
                    List list3 = this.A00;
                    if (list3 != null) {
                        ((C230114b) list3.get(i)).A01(j, str, list);
                        i++;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        } else {
            list.add(new Pair(str, str2));
        }
    }

    public final void A02(long j, Map map, Map map2) {
        int i;
        int size;
        int i2;
        if (A05(j)) {
            Iterator it = this.A08.entrySet().iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                HashMap hashMap = this.A09;
                if (hashMap.containsKey(key)) {
                    i2 = ((Number) hashMap.get(key)).intValue();
                } else {
                    i2 = 0;
                }
                int intValue = ((Number) entry.getValue()).intValue();
                if (i2 != intValue) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) map2.get(key);
                    C230314d r7 = this.A03;
                    String[] strArr = this.A0B;
                    if (r7 == null) {
                        if (strArr != null) {
                            int length = strArr.length;
                            if (length == 1) {
                                r7 = (C230314d) map.get(strArr[0]);
                                if (r7 == null) {
                                }
                            } else if (length > 1) {
                                r7 = new C230314d();
                                while (i < length) {
                                    r7.A00((C230314d) map.get(strArr[i]));
                                    i++;
                                }
                            }
                        }
                    } else if (strArr != null) {
                        int length2 = strArr.length;
                        if (length2 == 1) {
                            r7.A00((C230314d) map.get(strArr[0]));
                        } else if (length2 > 1) {
                            while (i < length2) {
                                r7.A00((C230314d) map.get(strArr[i]));
                                i++;
                            }
                        }
                    }
                    int i3 = r7.A02;
                    int i4 = -1;
                    if (!(i3 == -1 && r7.A05 == -1)) {
                        int i5 = 0;
                        int i6 = 0;
                        if (i3 == 1) {
                            i6 = 1;
                        }
                        if (r7.A05 == 1) {
                            i5 = 2;
                        }
                        i4 = i6 | i5;
                    }
                    if (i4 != -1) {
                        spannableStringBuilder.setSpan(new StyleSpan(i4), i2, intValue, 33);
                    }
                    if (r7.A06 == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, intValue, 33);
                    }
                    if (r7.A07 == 1) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), i2, intValue, 33);
                    }
                    if (r7.A0C) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(r7.A03), i2, intValue, 33);
                    }
                    if (r7.A0B) {
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(r7.A01), i2, intValue, 33);
                    }
                    String str = r7.A09;
                    if (str != null) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(str), i2, intValue, 33);
                    }
                    Layout.Alignment alignment = r7.A08;
                    if (alignment != null) {
                        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(alignment), i2, intValue, 33);
                    }
                    int i7 = r7.A04;
                    if (i7 == 1) {
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) r7.A00, true), i2, intValue, 33);
                    } else if (i7 == 2) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(r7.A00), i2, intValue, 33);
                    } else if (i7 == 3) {
                        spannableStringBuilder.setSpan(new RelativeSizeSpan(r7.A00 / 100.0f), i2, intValue, 33);
                    }
                }
            }
            while (true) {
                List list = this.A00;
                if (list == null) {
                    size = 0;
                } else {
                    size = list.size();
                }
                if (i < size) {
                    List list2 = this.A00;
                    if (list2 != null) {
                        ((C230114b) list2.get(i)).A02(j, map, map2);
                        i++;
                    } else {
                        throw new IndexOutOfBoundsException();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void A03(long j, boolean z, String str, Map map) {
        int size;
        boolean z2;
        String str2 = str;
        HashMap hashMap = this.A09;
        hashMap.clear();
        HashMap hashMap2 = this.A08;
        hashMap2.clear();
        String str3 = this.A06;
        if (!"metadata".equals(str3)) {
            String str4 = this.A05;
            if (!"".equals(str4)) {
                str2 = str4;
            }
            if (this.A0A && z) {
                A00(str2, map).append((CharSequence) this.A07);
            } else if ("br".equals(str3) && z) {
                A00(str2, map).append('\n');
            } else if (A05(j)) {
                for (Map.Entry entry : map.entrySet()) {
                    hashMap.put(entry.getKey(), Integer.valueOf(((SpannableStringBuilder) entry.getValue()).length()));
                }
                boolean equals = "p".equals(str3);
                int i = 0;
                while (true) {
                    List list = this.A00;
                    if (list == null) {
                        size = 0;
                    } else {
                        size = list.size();
                    }
                    if (i < size) {
                        List list2 = this.A00;
                        if (list2 != null) {
                            C230114b r6 = (C230114b) list2.get(i);
                            if (!z) {
                                z2 = false;
                                if (!equals) {
                                    r6.A03(j, z2, str2, map);
                                    i++;
                                }
                            }
                            z2 = true;
                            r6.A03(j, z2, str2, map);
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        if (equals) {
                            SpannableStringBuilder A002 = A00(str2, map);
                            int length = A002.length();
                            while (true) {
                                length--;
                                if (length < 0) {
                                    break;
                                } else if (A002.charAt(length) != ' ') {
                                    if (A002.charAt(length) != '\n') {
                                        A002.append('\n');
                                    }
                                }
                            }
                        }
                        for (Map.Entry entry2 : map.entrySet()) {
                            hashMap2.put(entry2.getKey(), Integer.valueOf(((SpannableStringBuilder) entry2.getValue()).length()));
                        }
                        return;
                    }
                }
            }
        }
    }

    public final void A04(TreeSet treeSet, boolean z) {
        boolean z2;
        String str = this.A06;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.A04 != null)) {
            long j = this.A02;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.A01;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.A00 != null) {
            for (int i = 0; i < this.A00.size(); i++) {
                C230114b r1 = (C230114b) this.A00.get(i);
                if (!z) {
                    z2 = false;
                    if (!equals) {
                        r1.A04(treeSet, z2);
                    }
                }
                z2 = true;
                r1.A04(treeSet, z2);
            }
        }
    }

    public boolean A05(long j) {
        long j2 = this.A02;
        if (j2 == -9223372036854775807L && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.A01 == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.A01) {
            return j2 <= j && j < this.A01;
        }
        return true;
    }
}
