package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.1fe  reason: invalid class name and case insensitive filesystem */
public class C32811fe implements AbstractC20020vz {
    public final /* synthetic */ C20600wy A00;

    public C32811fe(C20600wy r1) {
        this.A00 = r1;
    }

    @Override // X.AbstractC20020vz
    public void AMp(C20070w4 r7, Throwable th) {
        String obj;
        if (this.A00 != null) {
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(System.identityHashCode(this));
            objArr[1] = Integer.valueOf(System.identityHashCode(r7));
            objArr[2] = r7.A00().getClass().getName();
            if (th == null) {
                obj = "";
            } else {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                obj = stringWriter.toString();
            }
            objArr[3] = obj;
            C19960vt.A00.A00(5, "Fresco", String.format(null, "Finalized without closing: %x %x (type = %s).\nStack:\n%s", objArr));
            return;
        }
        throw null;
    }

    @Override // X.AbstractC20020vz
    public boolean AMx() {
        if (this.A00 != null) {
            return false;
        }
        throw null;
    }
}
