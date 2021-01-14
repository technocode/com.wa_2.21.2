package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.0bX  reason: invalid class name and case insensitive filesystem */
public class C08680bX {
    public int A00;
    public int A01;
    public int A02;
    public AnonymousClass02R A03;
    public AnonymousClass01X A04 = AnonymousClass01X.A00();
    public AnonymousClass02N A05;
    public AnonymousClass1X3 A06;
    public Boolean A07 = null;
    public Boolean A08 = null;
    public CharSequence A09;
    public List A0A;
    public List A0B = null;
    public List A0C;
    public List A0D;
    public Map A0E;
    public boolean A0F = true;
    public boolean A0G = true;
    public final Object A0H = new Object();

    public final AnonymousClass02R A00() {
        AnonymousClass02R A002;
        if (TextUtils.isEmpty(this.A09)) {
            A002 = new AnonymousClass02R(new ArrayList(), new ArrayList());
        } else {
            A002 = AnonymousClass1YB.A00(A02(), false, this.A04);
        }
        this.A03 = A002;
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == false) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean A01() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A08
            if (r0 == 0) goto L_0x000b
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08680bX.A01():java.lang.Boolean");
    }

    public String A02() {
        if (this.A09 == null) {
            AnonymousClass02R r0 = this.A03;
            if (r0 == null) {
                return "";
            }
            Object obj = r0.A01;
            if (obj == null) {
                throw null;
            } else if (((List) obj).isEmpty()) {
                return "";
            }
        }
        CharSequence charSequence = this.A09;
        if (charSequence == null) {
            return TextUtils.join(" ", A03());
        }
        return charSequence.toString();
    }

    public List A03() {
        List list;
        AnonymousClass02R r0 = this.A03;
        if (r0 != null && (list = (List) r0.A01) != null && !list.isEmpty()) {
            return list;
        }
        Object obj = A00().A01;
        if (obj != null) {
            return (List) obj;
        }
        throw null;
    }

    public void A04(List list) {
        if (list == null) {
            list = new ArrayList();
        }
        if (this.A03 == null) {
            this.A03 = new AnonymousClass02R(new ArrayList(), list);
        }
        this.A09 = null;
    }

    public boolean A05() {
        return !A03().isEmpty();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0086, code lost:
        if (r0 != false) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08680bX.toString():java.lang.String");
    }
}
