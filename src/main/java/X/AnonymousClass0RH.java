package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;

/* renamed from: X.0RH  reason: invalid class name */
public abstract class AnonymousClass0RH extends SQLiteOpenHelper implements AnonymousClass08N {
    public static final String[] A06 = {"jid", "merchant", "default_payment_type", "country_data"};
    public static final String[] A07 = {"credential_id", "country", "readable_name", "issuer_name", "type", "subtype", "creation_ts", "updated_ts", "debit_mode", "credit_mode", "balance_1000", "balance_ts", "country_data", "icon"};
    public static final String[] A08 = {"tmp_id", "tmp_metadata", "tmp_ts"};
    public AnonymousClass0BK A00;
    public AnonymousClass0BK A01;
    public final AnonymousClass009 A02;
    public final AnonymousClass08J A03;
    public final C018709t A04;
    public final AnonymousClass04q A05;

    public AnonymousClass0RH(Context context, AnonymousClass009 r5, AnonymousClass04q r6, C018709t r7, AnonymousClass08J r8) {
        super(context, "payments.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.A02 = r5;
        this.A05 = r6;
        this.A04 = r7;
        this.A03 = r8;
        setWriteAheadLoggingEnabled(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(android.database.sqlite.SQLiteDatabase r4, java.lang.String r5) {
        /*
            java.lang.String r3 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0039 }
            r1.<init>()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = "select sql from sqlite_master where type='table' and name='"
            r1.append(r0)     // Catch:{ Exception -> 0x0039 }
            r1.append(r5)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r0 = "';"
            r1.append(r0)     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0039 }
            r0 = 0
            android.database.Cursor r1 = r4.rawQuery(r1, r0)     // Catch:{ Exception -> 0x0039 }
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002c }
            if (r0 == 0) goto L_0x0033
            r0 = 0
            java.lang.String r3 = r1.getString(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0032 }
        L_0x0032:
            throw r0
        L_0x0033:
            if (r1 == 0) goto L_0x004b
            r1.close()
            return r3
        L_0x0039:
            r2 = move-exception
            java.lang.String r1 = "payments-store/schema "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r2)
        L_0x004b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0RH.A00(android.database.sqlite.SQLiteDatabase, java.lang.String):java.lang.String");
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append(" ");
        sb.append(str4);
        if (!str.contains(sb.toString())) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ALTER TABLE ");
                sb2.append(str2);
                sb2.append(" ADD ");
                sb2.append(str3);
                sb2.append(" ");
                sb2.append(str4);
                sQLiteDatabase.execSQL(sb2.toString());
            } catch (SQLiteException e) {
                StringBuilder sb3 = new StringBuilder("payments-store/add-column ");
                sb3.append(str3);
                Log.e(sb3.toString(), e);
            }
        }
    }

    @Override // X.AnonymousClass08N
    public AnonymousClass08J A7k() {
        return this.A03;
    }

    @Override // X.AnonymousClass08N
    public synchronized AnonymousClass0BK A8g() {
        AnonymousClass0BK r0;
        AnonymousClass0BK r02 = this.A00;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A05);
                this.A00 = r0;
            } catch (SQLiteException e) {
                Log.e("failed to open payment store", e);
                this.A04.A0B();
                r0 = C001801b.A0D(super.getReadableDatabase(), this.A05);
                this.A00 = r0;
            }
            return r0;
        }
        return this.A00;
    }

    @Override // X.AnonymousClass08N
    public synchronized AnonymousClass0BK A9x() {
        AnonymousClass0BK r0;
        AnonymousClass00E.A00();
        AnonymousClass0BK r02 = this.A01;
        if (r02 == null || !r02.A00.isOpen()) {
            try {
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A05);
                this.A01 = r0;
            } catch (SQLiteException e) {
                Log.e("failed to open payment store", e);
                this.A04.A0B();
                r0 = C001801b.A0D(super.getWritableDatabase(), this.A05);
                this.A01 = r0;
            }
            return r0;
        }
        return this.A01;
    }

    public synchronized SQLiteDatabase getReadableDatabase() {
        AnonymousClass00E.A08(false, "Use getReadableLoggableDatabase instead");
        return A8g().A00;
    }

    public synchronized SQLiteDatabase getWritableDatabase() {
        AnonymousClass00E.A08(false, "Use getWritableLoggableDatabase instead");
        return A9x().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("PAY: creating payments database version 2");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS methods");
        sQLiteDatabase.execSQL("CREATE TABLE methods (credential_id TEXT NOT NULL PRIMARY KEY, country TEXT, readable_name TEXT, issuer_name TEXT, type INTEGER NOT NULL, subtype INTEGER, creation_ts INTEGER, updated_ts INTEGER, debit_mode INTEGER NOT NULL, credit_mode INTEGER NOT NULL, balance_1000 INTEGER, balance_ts INTEGER, country_data TEXT, icon BLOB)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_methods_index ON methods (credential_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tmp_transactions");
        AnonymousClass008.A0c(sQLiteDatabase, "CREATE TABLE tmp_transactions (tmp_id TEXT NOT NULL, tmp_metadata TEXT, tmp_ts INTEGER)", "CREATE UNIQUE INDEX IF NOT EXISTS message_payment_transactions_index ON tmp_transactions (tmp_id)", "DROP TABLE IF EXISTS contacts", "CREATE TABLE contacts (jid NOT NULL, country_data TEXT, merchant INTEGER, default_payment_type INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS payment_constacts_index ON contacts (jid)");
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        String A002 = A00(sQLiteDatabase, "methods");
        if (A002 != null) {
            A01(sQLiteDatabase, A002, "methods", "icon", "BLOB");
        }
        String A003 = A00(sQLiteDatabase, "contacts");
        if (A003 != null) {
            A01(sQLiteDatabase, A003, "contacts", "merchant", "INTEGER");
            A01(sQLiteDatabase, A003, "contacts", "default_payment_type", "INTEGER");
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass008.A0y("PaymentDbHelper/onUpgrade/old version: ", i, ", new version: ", i2);
        if (i != 1) {
            Log.w("PaymentDbHelper/onUpgrade/unknown old version");
            onCreate(sQLiteDatabase);
        }
    }
}
