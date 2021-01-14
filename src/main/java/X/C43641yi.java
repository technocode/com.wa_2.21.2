package X;

import android.database.Cursor;
import android.util.Pair;
import com.whatsapp.jid.Jid;

/* renamed from: X.1yi  reason: invalid class name and case insensitive filesystem */
public class C43641yi extends AnonymousClass0PN {
    public final C015308l A00;
    public final C018609s A01;
    public final C015408m A02;
    public final C015708p A03;

    public C43641yi(C015308l r3, C015408m r4, C015708p r5, C018609s r6, AnonymousClass0PQ r7) {
        super("payment_transaction", 1, r7);
        this.A00 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r6;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        Jid nullable;
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("message_row_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("key_remote_jid");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("key_id");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("interop_id");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("id");
        int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("status");
        int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("error_code");
        int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("sender");
        int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("receiver");
        int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("type");
        int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("currency");
        int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("amount_1000");
        int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("credential_id");
        int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("methods");
        int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("bank_transaction_id");
        int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("metadata");
        int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("init_timestamp");
        int columnIndexOrThrow20 = cursor.getColumnIndexOrThrow("request_key_id");
        int columnIndexOrThrow21 = cursor.getColumnIndexOrThrow("country");
        int columnIndexOrThrow22 = cursor.getColumnIndexOrThrow("version");
        int columnIndexOrThrow23 = cursor.getColumnIndexOrThrow("future_data");
        int columnIndexOrThrow24 = cursor.getColumnIndexOrThrow("service_id");
        int i = 0;
        long j = -1;
        while (cursor.moveToNext()) {
            AnonymousClass1VB A012 = this.A03.A01("INSERT INTO pay_transaction ( _id, message_row_id, remote_jid_row_id, key_id, interop_id, id, timestamp, status, error_code, sender_jid_row_id, receiver_jid_row_id, type, currency_code, amount_1000, credential_id, methods, bank_transaction_id, metadata, init_timestamp, request_key_id, country, version, future_data, service_id ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "INSERT_PAY_TRANSACTION_TABLE");
            j = cursor.getLong(columnIndexOrThrow);
            A012.A06(1, j);
            if (!cursor.isNull(columnIndexOrThrow2)) {
                A012.A06(2, cursor.getLong(columnIndexOrThrow2));
            }
            if (!cursor.isNull(columnIndexOrThrow3) && (nullable = Jid.getNullable(cursor.getString(columnIndexOrThrow3))) != null) {
                long A022 = this.A00.A02(nullable);
                if (A022 != -1) {
                    A012.A06(3, A022);
                }
            }
            String string = cursor.getString(columnIndexOrThrow4);
            if (string == null) {
                A012.A04(4);
            } else {
                A012.A07(4, string);
            }
            String string2 = cursor.getString(columnIndexOrThrow5);
            if (string2 == null) {
                A012.A04(5);
            } else {
                A012.A07(5, string2);
            }
            String string3 = cursor.getString(columnIndexOrThrow6);
            if (string3 == null) {
                A012.A04(6);
            } else {
                A012.A07(6, string3);
            }
            if (!cursor.isNull(columnIndexOrThrow7)) {
                A012.A06(7, cursor.getLong(columnIndexOrThrow7));
            }
            if (!cursor.isNull(columnIndexOrThrow8)) {
                A012.A06(8, cursor.getLong(columnIndexOrThrow8));
            }
            String string4 = cursor.getString(columnIndexOrThrow9);
            if (string4 == null) {
                A012.A04(9);
            } else {
                A012.A07(9, string4);
            }
            Jid nullable2 = Jid.getNullable(cursor.getString(columnIndexOrThrow10));
            if (nullable2 != null) {
                long A023 = this.A00.A02(nullable2);
                if (A023 != -1) {
                    A012.A06(10, A023);
                }
            }
            Jid nullable3 = Jid.getNullable(cursor.getString(columnIndexOrThrow11));
            if (nullable3 != null) {
                long A024 = this.A00.A02(nullable3);
                if (A024 != -1) {
                    A012.A06(11, A024);
                }
            }
            A012.A06(12, cursor.getLong(columnIndexOrThrow12));
            String string5 = cursor.getString(columnIndexOrThrow13);
            if (string5 == null) {
                A012.A04(13);
            } else {
                A012.A07(13, string5);
            }
            A012.A06(14, cursor.getLong(columnIndexOrThrow14));
            String string6 = cursor.getString(columnIndexOrThrow15);
            if (string6 == null) {
                A012.A04(15);
            } else {
                A012.A07(15, string6);
            }
            String string7 = cursor.getString(columnIndexOrThrow16);
            if (string7 == null) {
                A012.A04(16);
            } else {
                A012.A07(16, string7);
            }
            String string8 = cursor.getString(columnIndexOrThrow17);
            if (string8 == null) {
                A012.A04(17);
            } else {
                A012.A07(17, string8);
            }
            String string9 = cursor.getString(columnIndexOrThrow18);
            if (string9 == null) {
                A012.A04(18);
            } else {
                A012.A07(18, string9);
            }
            if (!cursor.isNull(columnIndexOrThrow19)) {
                A012.A06(19, cursor.getLong(columnIndexOrThrow19));
            }
            String string10 = cursor.getString(columnIndexOrThrow20);
            if (string10 == null) {
                A012.A04(20);
            } else {
                A012.A07(20, string10);
            }
            String string11 = cursor.getString(columnIndexOrThrow21);
            if (string11 == null) {
                A012.A04(21);
            } else {
                A012.A07(21, string11);
            }
            A012.A06(22, cursor.getLong(columnIndexOrThrow22));
            byte[] blob = cursor.getBlob(columnIndexOrThrow23);
            if (blob == null) {
                A012.A04(23);
            } else {
                A012.A08(23, blob);
            }
            A012.A06(24, cursor.getLong(columnIndexOrThrow24));
            A012.A01();
            i++;
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
            r5 = this;
            super.A0D()
            r0 = 0
            X.AnonymousClass00E.A07(r0)
            X.08d r0 = r5.A05
            X.0OQ r4 = r0.A04()
            X.0Rk r3 = r4.A00()     // Catch:{ all -> 0x0047 }
            X.0BK r2 = r4.A04     // Catch:{ all -> 0x0040 }
            java.lang.String r1 = "DELETE FROM pay_transaction"
            java.lang.String r0 = "CLEAR_TABLE_PAY_TRANSACTION"
            r2.A0C(r1, r0)     // Catch:{ all -> 0x0040 }
            X.08m r1 = r5.A02     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "new_pay_transaction_ready"
            r1.A02(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "migration_pay_transaction_index"
            r1.A02(r0)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "migration_pay_transaction_retry"
            r1.A02(r0)     // Catch:{ all -> 0x0040 }
            r3.A00()     // Catch:{ all -> 0x0040 }
            r3.close()
            r4.close()
            java.lang.String r1 = "PaymentTransactionDatabaseMigration"
            java.lang.String r0 = "PaymentTransactionStore/resetDatabaseMigrationForDebug/done"
            java.lang.String r0 = X.C018809u.A01(r1, r0)
            com.whatsapp.util.Log.i(r0)
            return
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0046 }
        L_0x0046:
            throw r0
        L_0x0047:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x004d }
        L_0x004d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43641yi.A0D():void");
    }
}
