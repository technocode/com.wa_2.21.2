package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.0qI  reason: invalid class name and case insensitive filesystem */
public class C16720qI {
    public static final String[] A0A = {"UPDATE", "DELETE", "INSERT"};
    public C16690qF A00;
    public Runnable A01 = new RunnableEBaseShape5S0100000_I1_0(this, 16);
    public Map A02;
    public AtomicBoolean A03 = new AtomicBoolean(false);
    public final C014107y A04 = new C014107y();
    public final AbstractC16780qQ A05;
    public final HashMap A06;
    public final String[] A07;
    public volatile AbstractC30751bt A08;
    public volatile boolean A09 = false;

    public C16720qI(AbstractC16780qQ r7, Map map, Map map2, String... strArr) {
        this.A05 = r7;
        int length = strArr.length;
        this.A00 = new C16690qF(length);
        this.A06 = new HashMap();
        this.A02 = map2;
        Collections.newSetFromMap(new IdentityHashMap());
        this.A07 = new String[length];
        for (int i = 0; i < length; i++) {
            String lowerCase = strArr[i].toLowerCase(Locale.US);
            this.A06.put(lowerCase, Integer.valueOf(i));
            String str = (String) map.get(strArr[i]);
            if (str != null) {
                this.A07[i] = str.toLowerCase(Locale.US);
            } else {
                this.A07[i] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String lowerCase2 = ((String) entry.getValue()).toLowerCase(Locale.US);
            if (this.A06.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(Locale.US);
                HashMap hashMap = this.A06;
                hashMap.put(lowerCase3, hashMap.get(lowerCase2));
            }
        }
    }

    public void A00() {
        AbstractC16780qQ r1 = this.A05;
        AbstractC16990qn r0 = r1.A08;
        if (r0 != null && ((C30761bu) r0).A00.isOpen()) {
            A02(r1.A00.A9w());
        }
    }

    public void A01(AbstractC16990qn r3) {
        synchronized (this) {
            if (this.A09) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            C30761bu r32 = (C30761bu) r3;
            r32.A00.execSQL("PRAGMA temp_store = MEMORY;");
            r32.A00.execSQL("PRAGMA recursive_triggers='ON';");
            r32.A00.execSQL("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            A02(r32);
            this.A08 = new AnonymousClass248(r32.A00.compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
            this.A09 = true;
        }
    }

    public void A02(AbstractC16990qn r18) {
        ReentrantReadWriteLock.ReadLock readLock;
        SQLiteDatabase sQLiteDatabase = ((C30761bu) r18).A00;
        if (!sQLiteDatabase.inTransaction()) {
            while (true) {
                try {
                    readLock = this.A05.A07.readLock();
                    readLock.lock();
                    try {
                        C16690qF r6 = this.A00;
                        synchronized (r6) {
                            if (r6.A00 && !r6.A01) {
                                long[] jArr = r6.A03;
                                int length = jArr.length;
                                int i = 0;
                                while (true) {
                                    int i2 = 1;
                                    if (i >= length) {
                                        break;
                                    }
                                    boolean z = false;
                                    if (jArr[i] > 0) {
                                        z = true;
                                    }
                                    boolean[] zArr = r6.A04;
                                    if (z != zArr[i]) {
                                        int[] iArr = r6.A02;
                                        if (!z) {
                                            i2 = 2;
                                        }
                                        iArr[i] = i2;
                                    } else {
                                        r6.A02[i] = 0;
                                    }
                                    zArr[i] = z;
                                    i++;
                                }
                                r6.A01 = true;
                                r6.A00 = false;
                                int[] iArr2 = r6.A02;
                                if (iArr2 == null) {
                                    break;
                                }
                                int length2 = iArr2.length;
                                sQLiteDatabase.beginTransaction();
                                for (int i3 = 0; i3 < length2; i3++) {
                                    try {
                                        int i4 = iArr2[i3];
                                        if (i4 == 1) {
                                            sQLiteDatabase.execSQL(AnonymousClass008.A0G("INSERT OR IGNORE INTO room_table_modification_log VALUES(", i3, ", 0)"));
                                            String str = this.A07[i3];
                                            StringBuilder sb = new StringBuilder();
                                            String[] strArr = A0A;
                                            for (String str2 : strArr) {
                                                sb.setLength(0);
                                                sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
                                                sb.append("`");
                                                sb.append("room_table_modification_trigger_");
                                                AnonymousClass008.A1Y(sb, str, "_", str2, "`");
                                                AnonymousClass008.A1Y(sb, " AFTER ", str2, " ON `", str);
                                                AnonymousClass008.A1Y(sb, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
                                                AnonymousClass008.A1Y(sb, " = 1", " WHERE ", "table_id", " = ");
                                                sb.append(i3);
                                                sb.append(" AND ");
                                                sb.append("invalidated");
                                                sb.append(" = 0");
                                                sb.append("; END");
                                                sQLiteDatabase.execSQL(sb.toString());
                                            }
                                        } else if (i4 == 2) {
                                            String str3 = this.A07[i3];
                                            StringBuilder sb2 = new StringBuilder();
                                            String[] strArr2 = A0A;
                                            for (String str4 : strArr2) {
                                                sb2.setLength(0);
                                                sb2.append("DROP TRIGGER IF EXISTS ");
                                                sb2.append("`");
                                                sb2.append("room_table_modification_trigger_");
                                                sQLiteDatabase.execSQL(AnonymousClass008.A0Q(sb2, str3, "_", str4, "`"));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        sQLiteDatabase.endTransaction();
                                        throw th;
                                    }
                                }
                                sQLiteDatabase.setTransactionSuccessful();
                                sQLiteDatabase.endTransaction();
                                C16690qF r1 = this.A00;
                                synchronized (r1) {
                                    r1.A01 = false;
                                }
                            }
                        }
                    } finally {
                        readLock.unlock();
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                    return;
                }
            }
            readLock.unlock();
        }
    }
}
