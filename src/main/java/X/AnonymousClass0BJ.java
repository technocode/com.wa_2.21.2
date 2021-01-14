package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0BJ  reason: invalid class name */
public class AnonymousClass0BJ extends SQLiteOpenHelper {
    public AnonymousClass0BK A00;
    public final Context A01;
    public final AnonymousClass04q A02;
    public final AnonymousClass0BF A03;
    public final String A04;
    public final ReentrantReadWriteLock A05 = new ReentrantReadWriteLock();

    public AnonymousClass0BJ(Context context, String str, AnonymousClass04q r5, AnonymousClass0BF r6) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
        this.A04 = str;
        this.A01 = context;
        this.A02 = r5;
        this.A03 = r6;
    }

    public static void A00(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        if (!str.contains(sb.toString())) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ALTER TABLE ");
                sb2.append("settings");
                sb2.append(" ADD ");
                sb2.append(str2);
                sb2.append(" ");
                sb2.append(str3);
                sQLiteDatabase.execSQL(sb2.toString());
            } catch (SQLiteException e) {
                StringBuilder sb3 = new StringBuilder("chat-settings-store/add-column ");
                sb3.append(str2);
                Log.e(sb3.toString(), e);
            }
        }
    }

    public synchronized AnonymousClass0BK A01() {
        return A02();
    }

    public synchronized AnonymousClass0BK A02() {
        AnonymousClass0BK r0 = this.A00;
        if (r0 == null || !r0.A00.isOpen()) {
            try {
                AnonymousClass0BK A0D = C001801b.A0D(super.getWritableDatabase(), this.A02);
                this.A00 = A0D;
                return A0D;
            } catch (SQLiteDatabaseCorruptException e) {
                Log.w("chat-settings-store/corrupt/removing", e);
                A03();
                AnonymousClass0BK A0D2 = C001801b.A0D(super.getWritableDatabase(), this.A02);
                this.A00 = A0D2;
                return A0D2;
            } catch (SQLiteException e2) {
                if (e2.toString().contains("file is encrypted")) {
                    Log.w("chat-settings-store/encrypted/removing", e2);
                    A03();
                    AnonymousClass0BK A0D3 = C001801b.A0D(super.getWritableDatabase(), this.A02);
                    this.A00 = A0D3;
                    return A0D3;
                }
                throw e2;
            } catch (StackOverflowError e3) {
                Log.w("chat-settings-store/stackoverflowerror", e3);
                for (StackTraceElement stackTraceElement : e3.getStackTrace()) {
                    if (stackTraceElement.getMethodName().equals("onCorruption")) {
                        Log.w("chat-settings-store/stackoverflowerror/corrupt/removing");
                        A03();
                        AnonymousClass0BK A0D4 = C001801b.A0D(super.getWritableDatabase(), this.A02);
                        this.A00 = A0D4;
                        return A0D4;
                    }
                }
                throw e3;
            }
        } else {
            return this.A00;
        }
    }

    public boolean A03() {
        boolean delete;
        synchronized (this) {
            close();
            Log.i("chat-settings-store/delete-database");
            Context context = this.A01;
            File databasePath = context.getDatabasePath(this.A04);
            delete = databasePath.delete();
            C001801b.A1p(databasePath, "chat-settings-store");
            StringBuilder sb = new StringBuilder();
            sb.append("chat-settings-store/delete-database/result=");
            sb.append(delete);
            Log.i(sb.toString());
            if (delete && Build.VERSION.SDK_INT >= 26 && getDatabaseName().equals("chatsettings.db")) {
                Log.i("chat-settings-store/deleteDatabaseFiles success");
                AnonymousClass0BF.A06(context);
            }
        }
        return delete;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A01().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A02().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("chat-settings-store/create");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS settings");
        sQLiteDatabase.execSQL("CREATE TABLE settings (_id INTEGER PRIMARY KEY AUTOINCREMENT,jid TEXT,deleted INTEGER,mute_end INTEGER,muted_notifications BOOLEAN,use_custom_notifications BOOLEAN,message_tone TEXT,message_vibrate INTEGER,message_popup INTEGER,message_light INTEGER,call_tone TEXT,call_vibrate INTEGER,status_muted INTEGER,pinned BOOLEAN,pinned_time INTEGER,low_pri_notifications BOOLEAN,media_visibility INTEGER);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_index ON settings(jid);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("chat-settings-store/downgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r3 == null) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOpen(android.database.sqlite.SQLiteDatabase r5) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0BJ.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("chat-settings-store/upgrade from ", i, " to ", i2);
        onCreate(sQLiteDatabase);
    }
}
