package X;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

/* renamed from: X.17x  reason: invalid class name and case insensitive filesystem */
public final class C238717x {
    public final int A00;
    public final ComponentName A01;
    public final String A02;
    public final String A03;

    public C238717x(ComponentName componentName) {
        this.A02 = null;
        this.A03 = null;
        C001801b.A1Q(componentName);
        this.A01 = componentName;
        this.A00 = 129;
    }

    public C238717x(String str, String str2) {
        C001801b.A1T(str);
        this.A02 = str;
        C001801b.A1T(str2);
        this.A03 = str2;
        this.A01 = null;
        this.A00 = 129;
    }

    public final Intent A00() {
        String str = this.A02;
        if (str != null) {
            return new Intent(str).setPackage(this.A03);
        }
        return new Intent().setComponent(this.A01);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C238717x)) {
            return false;
        }
        C238717x r5 = (C238717x) obj;
        return AnonymousClass05S.A0H(this.A02, r5.A02) && AnonymousClass05S.A0H(this.A03, r5.A03) && AnonymousClass05S.A0H(this.A01, r5.A01) && this.A00 == r5.A00;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A03, this.A01, Integer.valueOf(this.A00)});
    }

    public final String toString() {
        String str = this.A02;
        return str == null ? this.A01.flattenToString() : str;
    }
}
