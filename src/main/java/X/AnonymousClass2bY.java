package X;

import android.database.sqlite.SQLiteStatement;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2bY  reason: invalid class name */
public class AnonymousClass2bY extends AnonymousClass1VB {
    public List A00;
    public final AnonymousClass04q A01;
    public final String A02;
    public final String A03;

    public AnonymousClass2bY(SQLiteStatement sQLiteStatement, String str, AnonymousClass04q r3, String str2) {
        super(sQLiteStatement);
        this.A02 = str;
        this.A01 = r3;
        this.A03 = str2;
    }

    @Override // X.AnonymousClass1VB
    public int A00() {
        long uptimeMillis = SystemClock.uptimeMillis();
        int A002 = super.A00();
        A0B((long) A002, uptimeMillis);
        return A002;
    }

    @Override // X.AnonymousClass1VB
    public long A01() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long A012 = super.A01();
        A0B(A012, uptimeMillis);
        return A012;
    }

    public final void A0A(int i, Object obj) {
        String obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        List list = this.A00;
        if (list == null) {
            list = new ArrayList();
            this.A00 = list;
        }
        int i2 = i - 1;
        if (i2 >= list.size()) {
            List list2 = this.A00;
            list2.addAll(Collections.nCopies((i2 - list2.size()) + 1, null));
        }
        this.A00.set(i2, obj2);
    }

    public final void A0B(long j, long j2) {
        String[] strArr;
        AnonymousClass04q r2 = this.A01;
        String str = this.A03;
        String str2 = this.A02;
        List list = this.A00;
        if (list == null) {
            strArr = null;
        } else {
            strArr = (String[]) list.toArray(new String[0]);
        }
        C43851z3 r3 = new C43851z3(str, str2, strArr, j, SystemClock.uptimeMillis() - j2);
        Message obtainMessage = r2.A02.obtainMessage();
        obtainMessage.obj = r3;
        obtainMessage.sendToTarget();
    }
}
