package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0Ga  reason: invalid class name and case insensitive filesystem */
public class C03400Ga {
    public static volatile C03400Ga A0C;
    public final C03320Fs A00;
    public final AnonymousClass009 A01;
    public final AnonymousClass088 A02;
    public final C000300f A03;
    public final AnonymousClass00S A04;
    public final AnonymousClass01K A05;
    public final AnonymousClass0AC A06;
    public final C03440Gg A07;
    public final AnonymousClass0Gb A08;
    public final C03460Gi A09;
    public final AnonymousClass02H A0A;
    public final AnonymousClass00T A0B;

    public C03400Ga(AnonymousClass00S r3, AnonymousClass009 r4, AnonymousClass00T r5, AnonymousClass088 r6, AnonymousClass0Gb r7, C000300f r8, C03460Gi r9, C03440Gg r10, AnonymousClass01K r11, AnonymousClass0AC r12, C03320Fs r13) {
        this.A04 = r3;
        this.A01 = r4;
        this.A0B = r5;
        this.A02 = r6;
        this.A08 = r7;
        this.A03 = r8;
        this.A09 = r9;
        this.A07 = r10;
        this.A0A = new AnonymousClass02H(r5, false);
        this.A05 = r11;
        this.A06 = r12;
        this.A00 = r13;
    }

    public static C03400Ga A00() {
        if (A0C == null) {
            synchronized (C03400Ga.class) {
                if (A0C == null) {
                    A0C = new C03400Ga(AnonymousClass00S.A00(), AnonymousClass009.A00(), C002101e.A00(), AnonymousClass088.A00(), AnonymousClass0Gb.A00(), C000300f.A00(), C03460Gi.A00(), C03440Gg.A00(), AnonymousClass01K.A00(), AnonymousClass0AC.A00, C03320Fs.A00);
                }
            }
        }
        return A0C;
    }

    public static void A01(C03400Ga r3, AbstractC007503q r4) {
        AnonymousClass0M3 r42;
        AnonymousClass0M4 r1;
        if ((r4 instanceof AnonymousClass0ZB) && (r1 = (r42 = (AnonymousClass0M3) r4).A02) != null && r1.A0O && !r1.A0a && r1.A0P) {
            r3.A0A.execute(new RunnableEBaseShape3S0200000_I0_2(r3, r42, 5));
        }
    }

    /* JADX INFO: finally extract failed */
    public final boolean A02(C49232Po r7) {
        AnonymousClass088 r4 = this.A02;
        File file = new File(r4.A08(), r7.A04.replace('/', '-'));
        try {
            if (!file.exists()) {
                C006803i.A0X(r4.A04, new File(r7.A03), file);
            }
            r7.A03 = file.getAbsolutePath();
            C49212Pm A022 = this.A07.A02();
            ReentrantReadWriteLock.ReadLock readLock = A022.A01;
            readLock.lock();
            try {
                AnonymousClass0BK A012 = A022.A00.A01();
                SQLiteDatabase sQLiteDatabase = A012.A00;
                sQLiteDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("plain_file_hash", r7.A04);
                    contentValues.put("file_path", r7.A03);
                    contentValues.put("height", Integer.valueOf(r7.A01));
                    contentValues.put("width", Integer.valueOf(r7.A02));
                    contentValues.put("gif_attribution", Integer.valueOf(r7.A00));
                    A012.A0B("gifs", contentValues, "addGifToTable/INSERT_GIF");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                    readLock.unlock();
                    return true;
                } catch (Throwable th) {
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                readLock.unlock();
                throw th2;
            }
        } catch (Exception unused) {
            Log.e("GifManager/add/error saving gif to disk");
            return false;
        }
    }
}
