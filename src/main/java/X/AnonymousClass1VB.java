package X;

import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;

/* renamed from: X.1VB  reason: invalid class name */
public class AnonymousClass1VB {
    public final SQLiteStatement A00;

    public AnonymousClass1VB(SQLiteStatement sQLiteStatement) {
        this.A00 = sQLiteStatement;
    }

    public int A00() {
        return this.A00.executeUpdateDelete();
    }

    public long A01() {
        return this.A00.executeInsert();
    }

    public void A02() {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.clearBindings();
            return;
        }
        AnonymousClass2bY r1 = (AnonymousClass2bY) this;
        ((AnonymousClass1VB) r1).A00.clearBindings();
        r1.A00 = null;
    }

    public void A03() {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.execute();
            return;
        }
        AnonymousClass2bY r4 = (AnonymousClass2bY) this;
        long uptimeMillis = SystemClock.uptimeMillis();
        ((AnonymousClass1VB) r4).A00.execute();
        r4.A0B(-1, uptimeMillis);
    }

    public void A04(int i) {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.bindNull(i);
            return;
        }
        AnonymousClass2bY r1 = (AnonymousClass2bY) this;
        ((AnonymousClass1VB) r1).A00.bindNull(i);
        r1.A0A(i, null);
    }

    public void A05(int i, double d) {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.bindDouble(i, d);
            return;
        }
        AnonymousClass2bY r1 = (AnonymousClass2bY) this;
        ((AnonymousClass1VB) r1).A00.bindDouble(i, d);
        r1.A0A(i, Double.valueOf(d));
    }

    public void A06(int i, long j) {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.bindLong(i, j);
            return;
        }
        AnonymousClass2bY r1 = (AnonymousClass2bY) this;
        ((AnonymousClass1VB) r1).A00.bindLong(i, j);
        r1.A0A(i, Long.valueOf(j));
    }

    public void A07(int i, String str) {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.bindString(i, str);
            return;
        }
        AnonymousClass2bY r1 = (AnonymousClass2bY) this;
        ((AnonymousClass1VB) r1).A00.bindString(i, str);
        r1.A0A(i, str);
    }

    public void A08(int i, byte[] bArr) {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.bindBlob(i, bArr);
            return;
        }
        AnonymousClass2bY r1 = (AnonymousClass2bY) this;
        ((AnonymousClass1VB) r1).A00.bindBlob(i, bArr);
        r1.A0A(i, bArr);
    }

    public void A09(String[] strArr) {
        if (!(this instanceof AnonymousClass2bY)) {
            this.A00.bindAllArgsAsStrings(strArr);
            return;
        }
        AnonymousClass2bY r3 = (AnonymousClass2bY) this;
        ((AnonymousClass1VB) r3).A00.bindAllArgsAsStrings(strArr);
        int length = strArr.length;
        while (length != 0) {
            int i = length - 1;
            r3.A0A(length, strArr[i]);
            length = i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((AnonymousClass1VB) obj).A00);
    }

    public int hashCode() {
        return this.A00.hashCode();
    }
}
