package X;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.08d  reason: invalid class name and case insensitive filesystem */
public class C014508d {
    public static volatile C014508d A0B;
    public boolean A00;
    public boolean A01;
    public final C015008i A02 = new C015008i();
    public final AnonymousClass009 A03;
    public final AnonymousClass01I A04;
    public final AnonymousClass039 A05;
    public final C014908h A06;
    public final C015108j A07;
    public final File A08;
    public final ReentrantReadWriteLock.WriteLock A09;
    public final ReentrantReadWriteLock A0A;

    public C014508d(AnonymousClass00S r11, AnonymousClass009 r12, AnonymousClass01I r13, AnonymousClass00G r14, C000300f r15, AnonymousClass04q r16, C014608e r17, AnonymousClass00D r18, C014708f r19, C014908h r20) {
        Application application = r14.A00;
        this.A08 = application.getDatabasePath("msgstore.db");
        this.A07 = new C015108j(application, r15, r16, r17, r18, new AnonymousClass08J(), r19, this.A08);
        this.A03 = r12;
        this.A04 = r13;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A0A = reentrantReadWriteLock;
        this.A09 = reentrantReadWriteLock.writeLock();
        this.A06 = r20;
        this.A05 = new AnonymousClass039();
    }

    public static C014508d A00() {
        if (A0B == null) {
            synchronized (C014508d.class) {
                if (A0B == null) {
                    A0B = new C014508d(AnonymousClass00S.A00(), AnonymousClass009.A00(), AnonymousClass01I.A00(), AnonymousClass00G.A01, C000300f.A00(), AnonymousClass04q.A00(), C014608e.A01, AnonymousClass00D.A00(), C014708f.A00(), C014908h.A00);
                }
            }
        }
        return A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008b, code lost:
        if (r8 != null) goto L_0x008d;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0089 */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01() {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C014508d.A01():int");
    }

    public long A02() {
        A05();
        return this.A08.length();
    }

    public AnonymousClass0OQ A03() {
        A05();
        ReentrantReadWriteLock.ReadLock readLock = this.A0A.readLock();
        A05();
        return new AnonymousClass0OQ(readLock, this.A07, this.A02, false, this.A03);
    }

    public AnonymousClass0OQ A04() {
        A05();
        ReentrantReadWriteLock.ReadLock readLock = this.A0A.readLock();
        A05();
        return new AnonymousClass0OQ(readLock, this.A07, this.A02, true, this.A03);
    }

    public void A05() {
        boolean z;
        AnonymousClass039 r3 = this.A05;
        if (r3.A03()) {
            r3.A02(new AnonymousClass1UZ(this));
            synchronized (r3) {
                z = false;
                if (r3.A00 == 1) {
                    z = true;
                }
            }
            if (z) {
                A08(true);
            }
            r3.A00();
        }
    }

    public final void A06() {
        C015108j r0 = this.A07;
        r0.close();
        File file = r0.A0B;
        AnonymousClass008.A1H("msgstore-manager/deletedb/result/", file.delete() & C001801b.A1p(file, "databasehelper"));
    }

    public final void A07() {
        Log.i("msgstore-manager/setup");
        AnonymousClass00E.A07(this.A09.isHeldByCurrentThread());
        synchronized (this) {
            C015108j r3 = this.A07;
            try {
                File file = r3.A0B;
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                file.delete();
                C001801b.A1p(file, "databasehelper");
                C006803i.A0c(file, "msgstore/create-db/list ");
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), null, 805306384);
                if (openDatabase != null) {
                    r3.onCreate(openDatabase);
                    C006803i.A0c(file, "msgstore/create-db/done/list ");
                    synchronized (r3) {
                        r3.A00 = C001801b.A0D(openDatabase, r3.A09);
                    }
                    r3.A9x();
                    this.A01 = true;
                } else {
                    throw null;
                }
            } catch (Throwable th) {
                C006803i.A0c(r3.A0B, "msgstore/create-db/done/list ");
                throw th;
            }
        }
    }

    public final boolean A08(boolean z) {
        boolean z2;
        Log.i("msgstore-manager/checkhealth");
        ReentrantReadWriteLock.WriteLock writeLock = this.A09;
        writeLock.lock();
        synchronized (this) {
            if (z) {
                try {
                    AnonymousClass039 r4 = this.A05;
                    synchronized (r4) {
                        z2 = false;
                        if (r4.A00 > 3) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        boolean z3 = this.A01;
                        writeLock.unlock();
                        r4.A01();
                        return z3;
                    }
                } catch (Throwable th) {
                    writeLock.unlock();
                    this.A05.A01();
                    throw th;
                }
            }
            if (!this.A01) {
                AnonymousClass039 r1 = this.A05;
                synchronized (r1) {
                    r1.A00 = 3;
                }
                File file = this.A08;
                String parent = file.getParent();
                StringBuilder sb = new StringBuilder();
                sb.append(file.getName());
                sb.append("-journal");
                boolean delete = new File(parent, sb.toString()).delete();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("msgstore-manager/checkhealth/journal/delete ");
                sb2.append(delete);
                Log.i(sb2.toString());
                String parent2 = file.getParent();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(file.getName());
                sb3.append(".back");
                boolean delete2 = new File(parent2, sb3.toString()).delete();
                StringBuilder sb4 = new StringBuilder();
                sb4.append("msgstore-manager/checkhealth/back/delete ");
                sb4.append(delete2);
                Log.i(sb4.toString());
                try {
                    this.A07.A9x();
                    this.A01 = true;
                    this.A00 = true;
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e("msgstore-manager/checkhealth ", e);
                    A06();
                } catch (SQLiteException e2) {
                    Log.w("msgstore-manager/checkhealth no db", e2);
                }
            }
            writeLock.unlock();
            this.A05.A01();
            A05();
            return this.A01;
        }
    }
}
