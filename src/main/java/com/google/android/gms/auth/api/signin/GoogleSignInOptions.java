package com.google.android.gms.auth.api.signin;

import X.AbstractC236416x;
import X.AnonymousClass066;
import X.C001801b;
import X.C008805h;
import X.C235516j;
import X.C235616k;
import X.C34601iq;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GoogleSignInOptions extends AnonymousClass066 implements AbstractC236416x, ReflectedParcelable {
    public static Comparator A09 = new C235516j();
    public static final GoogleSignInOptions A0A;
    public static final Scope A0B = new Scope("profile");
    public static final Scope A0C = new Scope("openid");
    public static final Scope A0D = new Scope("https://www.googleapis.com/auth/games_lite");
    public static final Scope A0E = new Scope("https://www.googleapis.com/auth/games");
    public static final Parcelable.Creator CREATOR = new C235616k();
    public Account A00;
    public String A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public final int A05;
    public final ArrayList A06;
    public final boolean A07;
    public final boolean A08;

    static {
        C001801b.A1V("email", "scopeUri must not be null or empty");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(A0C);
        hashSet.add(A0B);
        if (hashSet.contains(A0E) && hashSet.contains(A0D)) {
            hashSet.remove(A0D);
        }
        A0A = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        Scope scope = A0D;
        hashSet2.add(scope);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(A0E) && hashSet2.contains(scope)) {
            hashSet2.remove(scope);
        }
        new ArrayList(hashSet2);
        new ArrayList(hashMap2.values());
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map) {
        this.A05 = i;
        this.A06 = arrayList;
        this.A00 = account;
        this.A04 = z;
        this.A08 = z2;
        this.A07 = z3;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = new ArrayList(map.values());
    }

    public static Map A00(List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C34601iq r1 = (C34601iq) it.next();
            hashMap.put(Integer.valueOf(r1.A00), r1);
        }
        return hashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r6.A00 == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A01) != false) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.A06;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            arrayList.add(((Scope) obj).A01);
        }
        Collections.sort(arrayList);
        Account account = this.A00;
        int hashCode2 = (arrayList.hashCode() + 31) * 31;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        String str = this.A01;
        int i3 = (hashCode2 + hashCode) * 31;
        if (str != null) {
            i = str.hashCode();
        }
        return ((((((i3 + i) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A032 = C008805h.A03(parcel, 20293);
        C008805h.A0u(parcel, 1, this.A05);
        C008805h.A12(parcel, 2, new ArrayList(this.A06), false);
        C008805h.A0z(parcel, 3, this.A00, i, false);
        C008805h.A13(parcel, 4, this.A04);
        C008805h.A13(parcel, 5, this.A08);
        C008805h.A13(parcel, 6, this.A07);
        C008805h.A10(parcel, 7, this.A01, false);
        C008805h.A10(parcel, 8, this.A02, false);
        C008805h.A12(parcel, 9, this.A03, false);
        C008805h.A0r(parcel, A032);
    }
}
