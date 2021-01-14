package X;

import android.graphics.Canvas;
import android.graphics.Picture;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.0u5  reason: invalid class name and case insensitive filesystem */
public class C18890u5 {
    public float A00 = 96.0f;
    public C18550tX A01 = new C18550tX();
    public AnonymousClass2CJ A02 = null;
    public Map A03 = new HashMap();

    public Picture A00() {
        C18700tm r2;
        AnonymousClass2CJ r5 = this.A02;
        C18660ti r4 = ((AnonymousClass2BN) r5).A00;
        C18700tm r3 = r5.A01;
        if (r3 != null) {
            EnumC18880u4 r0 = r3.A01;
            EnumC18880u4 r1 = EnumC18880u4.percent;
            if (r0 != r1 && (r2 = r5.A00) != null && r2.A01 != r1) {
                return A01((int) Math.ceil((double) r3.A00(96.0f)), (int) Math.ceil((double) r2.A00(96.0f)));
            }
            if (r4 != null) {
                float A002 = r3.A00(96.0f);
                return A01((int) Math.ceil((double) A002), (int) Math.ceil((double) ((r4.A00 * A002) / r4.A03)));
            }
        }
        C18700tm r12 = r5.A00;
        if (r12 == null || r4 == null) {
            return A01(512, 512);
        }
        float A003 = r12.A00(96.0f);
        return A01((int) Math.ceil((double) ((r4.A03 * A003) / r4.A00)), (int) Math.ceil((double) A003));
    }

    public Picture A01(int i, int i2) {
        C18660ti r5;
        C18640tg r4;
        List list;
        List list2;
        Picture picture = new Picture();
        Canvas beginRecording = picture.beginRecording(i, i2);
        C18650th r6 = new C18650th();
        r6.A03 = new C18660ti(0.0f, 0.0f, (float) i, (float) i2);
        C18930u9 r8 = new C18930u9(beginRecording);
        r8.A02 = this;
        AnonymousClass2CJ r7 = this.A02;
        if (r7 == null) {
            Log.w("SVGAndroidRenderer", String.format("Nothing to render. Document is empty.", new Object[0]));
        } else {
            String str = r6.A04;
            if (str != null) {
                AbstractC31941e3 A032 = A03(str);
                if (A032 == null || !(A032 instanceof AnonymousClass2CN)) {
                    Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" not found.", r6.A04));
                } else {
                    AnonymousClass2BN r1 = (AnonymousClass2BN) A032;
                    r5 = r1.A00;
                    if (r5 == null) {
                        Log.w("SVGAndroidRenderer", String.format("View element with id \"%s\" is missing a viewBox attribute.", r6.A04));
                    } else {
                        r4 = ((AnonymousClass2AG) r1).A00;
                    }
                }
            } else {
                r5 = r6.A02;
                if (r5 == null) {
                    r5 = ((AnonymousClass2BN) r7).A00;
                }
                r4 = r6.A01;
                if (r4 == null) {
                    r4 = ((AnonymousClass2AG) r7).A00;
                }
            }
            C18550tX r0 = r6.A00;
            if (!(r0 == null || (list2 = r0.A00) == null || list2.size() <= 0)) {
                this.A01.A01(r6.A00);
            }
            r8.A03 = new C18910u7();
            r8.A06 = new Stack();
            r8.A0f(r8.A03, C18820ty.A00());
            C18910u7 r2 = r8.A03;
            r2.A03 = null;
            r2.A07 = false;
            r8.A06.push(new C18910u7(r2));
            r8.A04 = new Stack();
            r8.A05 = new Stack();
            Boolean bool = ((AbstractC31941e3) r7).A02;
            if (bool != null) {
                r8.A03.A07 = bool.booleanValue();
            }
            r8.A0K();
            C18660ti r22 = new C18660ti(r6.A03);
            C18700tm r12 = r7.A01;
            if (r12 != null) {
                r22.A03 = r12.A04(r8, r22.A03);
            }
            C18700tm r13 = r7.A00;
            if (r13 != null) {
                r22.A00 = r13.A04(r8, r22.A00);
            }
            r8.A0T(r7, r22, r5, r4);
            r8.A0J();
            C18550tX r02 = r6.A00;
            if (!(r02 == null || (list = r02.A00) == null || list.size() <= 0)) {
                C18550tX r03 = this.A01;
                EnumC18580ta r23 = EnumC18580ta.RenderOptions;
                List list3 = r03.A00;
                if (list3 != null) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (((C18530tV) it.next()).A01 == r23) {
                            it.remove();
                        }
                    }
                }
            }
        }
        picture.endRecording();
        return picture;
    }

    public final AbstractC31941e3 A02(AbstractC18840u0 r5, String str) {
        AbstractC31941e3 A022;
        AbstractC31941e3 r1 = (AbstractC31941e3) r5;
        if (str.equals(r1.A03)) {
            return r1;
        }
        for (C18850u1 r2 : r5.A5H()) {
            if (r2 instanceof AbstractC31941e3) {
                AbstractC31941e3 r12 = (AbstractC31941e3) r2;
                if (str.equals(r12.A03)) {
                    return r12;
                }
                if ((r2 instanceof AbstractC18840u0) && (A022 = A02((AbstractC18840u0) r2, str)) != null) {
                    return A022;
                }
            }
        }
        return null;
    }

    public AbstractC31941e3 A03(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        AnonymousClass2CJ r1 = this.A02;
        if (str.equals(((AbstractC31941e3) r1).A03)) {
            return r1;
        }
        if (this.A03.containsKey(str)) {
            return (AbstractC31941e3) this.A03.get(str);
        }
        AbstractC31941e3 A022 = A02(this.A02, str);
        this.A03.put(str, A022);
        return A022;
    }

    public C18850u1 A04(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("\"") && str.endsWith("\"")) {
            str = str.substring(1, str.length() - 1).replace("\\\"", "\"");
        } else if (str.startsWith("'") && str.endsWith("'")) {
            str = str.substring(1, str.length() - 1).replace("\\'", "'");
        }
        String replace = str.replace("\\\n", "").replace("\\A", "\n");
        if (replace.length() <= 1 || !replace.startsWith("#")) {
            return null;
        }
        return A03(replace.substring(1));
    }
}
