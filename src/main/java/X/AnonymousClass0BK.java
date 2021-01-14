package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import android.os.Message;
import android.os.OperationCanceledException;
import android.os.SystemClock;

/* renamed from: X.0BK  reason: invalid class name */
public class AnonymousClass0BK {
    public final SQLiteDatabase A00;
    public final AnonymousClass04q A01;

    public AnonymousClass0BK(SQLiteDatabase sQLiteDatabase, AnonymousClass04q r2) {
        this.A00 = sQLiteDatabase;
        this.A01 = r2;
    }

    public int A00(String str, ContentValues contentValues, String str2, String[] strArr, String str3) {
        AnonymousClass04q r5 = this.A01;
        ContentValues contentValues2 = null;
        if (r5 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int update = this.A00.update(str, contentValues, str2, strArr);
            if (A0E()) {
                if (contentValues != null) {
                    contentValues2 = new ContentValues(contentValues);
                }
                AnonymousClass1VN A0E = C001801b.A0E(str3, str, contentValues2, str2, strArr, 3, (long) update, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r5.A02.obtainMessage();
                obtainMessage.obj = A0E;
                obtainMessage.sendToTarget();
            }
            return update;
        }
        throw null;
    }

    public int A01(String str, String str2, String[] strArr, String str3) {
        AnonymousClass04q r5 = this.A01;
        if (r5 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int delete = this.A00.delete(str, str2, strArr);
            if (A0E()) {
                AnonymousClass1VN A0E = C001801b.A0E(str3, str, null, str2, strArr, 4, (long) delete, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r5.A02.obtainMessage();
                obtainMessage.obj = A0E;
                obtainMessage.sendToTarget();
            }
            return delete;
        }
        throw null;
    }

    public long A02(String str, ContentValues contentValues, String str2) {
        AnonymousClass04q r3 = this.A01;
        ContentValues contentValues2 = null;
        if (r3 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long insert = this.A00.insert(str, null, contentValues);
            if (A0E()) {
                if (contentValues != null) {
                    contentValues2 = new ContentValues(contentValues);
                }
                AnonymousClass1VN A0E = C001801b.A0E(str2, str, contentValues2, null, null, 2, insert, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r3.A02.obtainMessage();
                obtainMessage.obj = A0E;
                obtainMessage.sendToTarget();
            }
            return insert;
        }
        throw null;
    }

    public long A03(String str, ContentValues contentValues, String str2) {
        AnonymousClass04q r4 = this.A01;
        if (r4 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long insertOrThrow = this.A00.insertOrThrow(str, null, contentValues);
            if (A0E()) {
                AnonymousClass1VN A0E = C001801b.A0E(str2, str, new ContentValues(contentValues), null, null, 2, insertOrThrow, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r4.A02.obtainMessage();
                obtainMessage.obj = A0E;
                obtainMessage.sendToTarget();
            }
            return insertOrThrow;
        }
        throw null;
    }

    public long A04(String str, ContentValues contentValues, String str2) {
        AnonymousClass04q r4 = this.A01;
        if (r4 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long replace = this.A00.replace(str, null, contentValues);
            if (A0E()) {
                AnonymousClass1VN A0E = C001801b.A0E(str2, str, new ContentValues(contentValues), null, null, 5, replace, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r4.A02.obtainMessage();
                obtainMessage.obj = A0E;
                obtainMessage.sendToTarget();
            }
            return replace;
        }
        throw null;
    }

    public long A05(String str, ContentValues contentValues, String str2) {
        AnonymousClass04q r4 = this.A01;
        if (r4 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long replaceOrThrow = this.A00.replaceOrThrow(str, null, contentValues);
            if (A0E()) {
                AnonymousClass1VN A0E = C001801b.A0E(str2, str, new ContentValues(contentValues), null, null, 5, replaceOrThrow, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r4.A02.obtainMessage();
                obtainMessage.obj = A0E;
                obtainMessage.sendToTarget();
            }
            return replaceOrThrow;
        }
        throw null;
    }

    public Cursor A06(String str, String[] strArr, C04080Iy r15, String str2) {
        AnonymousClass04q r3 = this.A01;
        CancellationSignal cancellationSignal = null;
        if (r3 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (r15 != null) {
                try {
                    cancellationSignal = (CancellationSignal) r15.A00();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new C14750mp();
                    }
                    throw e;
                }
            }
            C28471Ul r2 = new C28471Ul(this.A00.rawQuery(str, strArr, cancellationSignal));
            if (A0E()) {
                AnonymousClass1VN A0F = C001801b.A0F(str2, str, strArr, (long) r2.getCount(), SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r3.A02.obtainMessage();
                obtainMessage.obj = A0F;
                obtainMessage.sendToTarget();
            }
            return r2;
        }
        throw null;
    }

    public Cursor A07(String str, String[] strArr, String str2) {
        AnonymousClass04q r5 = this.A01;
        if (r5 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Cursor rawQuery = this.A00.rawQuery(str, strArr);
            if (A0E()) {
                AnonymousClass1VN A0F = C001801b.A0F(str2, str, strArr, (long) rawQuery.getCount(), SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r5.A02.obtainMessage();
                obtainMessage.obj = A0F;
                obtainMessage.sendToTarget();
            }
            return rawQuery;
        }
        throw null;
    }

    public final Cursor A08(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        return A09(str, strArr, str2, strArr2, str3, null, str4);
    }

    public final Cursor A09(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        AnonymousClass04q r5 = this.A01;
        if (r5 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Cursor query = this.A00.query(false, str, strArr, str2, strArr2, null, null, str3, str4);
            if (A0E()) {
                C43831z1 r6 = new C43831z1(str5, str, strArr, str2, strArr2, str3, (long) query.getCount(), SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r5.A02.obtainMessage();
                obtainMessage.obj = r6;
                obtainMessage.sendToTarget();
            }
            return query;
        }
        throw null;
    }

    public AnonymousClass1VB A0A(String str, String str2) {
        AnonymousClass04q r7 = this.A01;
        if (r7 == null) {
            throw null;
        } else if (!A0E()) {
            return new AnonymousClass1VB(this.A00.compileStatement(str));
        } else {
            long uptimeMillis = SystemClock.uptimeMillis();
            SQLiteStatement compileStatement = this.A00.compileStatement(str);
            C43841z2 r1 = new C43841z2(str2, str, SystemClock.uptimeMillis() - uptimeMillis);
            Message obtainMessage = r7.A02.obtainMessage();
            obtainMessage.obj = r1;
            obtainMessage.sendToTarget();
            return new AnonymousClass2bY(compileStatement, str, r7, str2);
        }
    }

    public void A0B(String str, ContentValues contentValues, String str2) {
        AnonymousClass04q r4 = this.A01;
        if (r4 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long insertWithOnConflict = this.A00.insertWithOnConflict(str, null, contentValues, 5);
            if (A0E()) {
                AnonymousClass1VN A0E = C001801b.A0E(str2, str, new ContentValues(contentValues), null, null, 2, insertWithOnConflict, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r4.A02.obtainMessage();
                obtainMessage.obj = A0E;
                obtainMessage.sendToTarget();
                return;
            }
            return;
        }
        throw null;
    }

    public void A0C(String str, String str2) {
        AnonymousClass04q r3 = this.A01;
        if (r3 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A00.execSQL(str);
            if (A0E()) {
                AnonymousClass1VN A0F = C001801b.A0F(str2, str, null, -1, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r3.A02.obtainMessage();
                obtainMessage.obj = A0F;
                obtainMessage.sendToTarget();
                return;
            }
            return;
        }
        throw null;
    }

    public void A0D(String str, Object[] objArr, String str2) {
        AnonymousClass04q r2 = this.A01;
        if (r2 != null) {
            long uptimeMillis = SystemClock.uptimeMillis();
            this.A00.execSQL(str, objArr);
            if (!A0E()) {
                return;
            }
            if (objArr instanceof String[]) {
                AnonymousClass1VN A0F = C001801b.A0F(str2, str, (String[]) objArr, -1, SystemClock.uptimeMillis() - uptimeMillis);
                Message obtainMessage = r2.A02.obtainMessage();
                obtainMessage.obj = A0F;
                obtainMessage.sendToTarget();
                return;
            }
            AnonymousClass1VN A0F2 = C001801b.A0F(str2, str, new String[0], -1, SystemClock.uptimeMillis() - uptimeMillis);
            Message obtainMessage2 = r2.A02.obtainMessage();
            obtainMessage2.obj = A0F2;
            obtainMessage2.sendToTarget();
            return;
        }
        throw null;
    }

    public final boolean A0E() {
        AnonymousClass04s r0;
        AnonymousClass04r r1 = this.A01.A00;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 == null || !r0.A01.A00()) {
            return false;
        }
        return true;
    }
}
