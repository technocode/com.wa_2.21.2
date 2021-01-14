package X;

import android.content.SharedPreferences;
import java.util.UUID;

/* renamed from: X.0Ff  reason: invalid class name and case insensitive filesystem */
public class C03210Ff implements AbstractC03220Fg {
    public static volatile C03210Ff A02;
    public final AnonymousClass00S A00;
    public final AnonymousClass00D A01;

    public C03210Ff(AnonymousClass00S r1, AnonymousClass00D r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C03210Ff A00() {
        if (A02 == null) {
            synchronized (C03210Ff.class) {
                if (A02 == null) {
                    A02 = new C03210Ff(AnonymousClass00S.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A02;
    }

    @Override // X.AbstractC03220Fg
    public synchronized AnonymousClass0PC A8L() {
        SharedPreferences sharedPreferences = this.A01.A00;
        String string = sharedPreferences.getString("phoneid_id", null);
        long j = sharedPreferences.getLong("phoneid_timestamp", -1);
        if (string == null || j == -1) {
            AnonymousClass0PC r0 = new AnonymousClass0PC(UUID.randomUUID().toString(), this.A00.A05());
            AOm(r0);
            return r0;
        }
        return new AnonymousClass0PC(string, j);
    }

    @Override // X.AbstractC03220Fg
    public synchronized void AOm(AnonymousClass0PC r7) {
        AnonymousClass00D r0 = this.A01;
        String str = r7.A01;
        long j = r7.A00;
        SharedPreferences sharedPreferences = r0.A00;
        sharedPreferences.edit().putString("phoneid_id", str).apply();
        sharedPreferences.edit().putLong("phoneid_timestamp", j).apply();
    }
}
