package X;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Ge  reason: invalid class name and case insensitive filesystem */
public class C03420Ge implements AbstractC03430Gf {
    public static volatile C03420Ge A03;
    public final C03440Gg A00;
    public final ReentrantReadWriteLock.ReadLock A01;
    public volatile List A02;

    public C03420Ge(C03440Gg r2) {
        this.A00 = r2;
        this.A01 = r2.A01().A04.readLock();
    }

    @Override // X.AbstractC03430Gf
    public AnonymousClass2QD A3H(Object obj, float f) {
        return new C54612fD(f, (AnonymousClass2Q0) obj);
    }

    @Override // X.AbstractC03430Gf
    public Object A6b(String str) {
        for (C54612fD r0 : this.A02) {
            AnonymousClass2Q0 r1 = r0.A01;
            if (str.equals(r1.A00)) {
                return r1;
            }
        }
        return new AnonymousClass2Q0(str);
    }

    @Override // X.AbstractC03430Gf
    public String A70(Object obj) {
        return ((AnonymousClass2Q0) obj).A00;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r7 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        throw r0;
     */
    @Override // X.AbstractC03430Gf
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List AAW() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03420Ge.AAW():java.util.List");
    }

    /* JADX INFO: finally extract failed */
    @Override // X.AbstractC03430Gf
    public void AM3(List list) {
        AnonymousClass00E.A00();
        this.A02 = new ArrayList(list);
        List<C54612fD> list2 = this.A02;
        ReentrantReadWriteLock.ReadLock readLock = this.A01;
        readLock.lock();
        try {
            readLock.lock();
            try {
                C03440Gg r5 = this.A00;
                r5.A01().A01().A0C("DELETE FROM recent_gifs", "CLEAR_RECENT_GIF_TABLE");
                readLock.unlock();
                for (C54612fD r2 : list2) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("plaintext_hash", r2.A01.A00);
                    contentValues.put("entry_weight", Float.valueOf(r2.A00));
                    r5.A01().A01().A04("recent_gifs", contentValues, "saveWeightedGifIdentifierToDB/REPLACE_RECENT_GIFS");
                }
                readLock.unlock();
            } catch (Throwable th) {
                readLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            readLock.unlock();
            throw th2;
        }
    }
}
