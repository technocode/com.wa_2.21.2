package X;

import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.1yj  reason: invalid class name and case insensitive filesystem */
public class C43651yj extends AnonymousClass0PN {
    public final C017609i A00;
    public final C018509r A01;
    public final C018209o A02;
    public final AnonymousClass09Q A03;
    public final AnonymousClass09Z A04;
    public final C017709j A05;
    public final C018409q A06;
    public final C016809a A07;
    public final C018109n A08;
    public final C015408m A09;
    public final C017509h A0A;
    public final C015708p A0B;
    public final AnonymousClass09X A0C;
    public final C016909b A0D;

    public C43651yj(AnonymousClass09Q r4, AnonymousClass09X r5, C016809a r6, C015408m r7, C015708p r8, C017509h r9, C016909b r10, C017609i r11, C018109n r12, C017709j r13, C018209o r14, AnonymousClass09Z r15, C018409q r16, C018509r r17, AnonymousClass0PQ r18) {
        super("message_quoted", 2, r18);
        this.A03 = r4;
        this.A0C = r5;
        this.A07 = r6;
        this.A09 = r7;
        this.A0B = r8;
        this.A0A = r9;
        this.A0D = r10;
        this.A00 = r11;
        this.A08 = r12;
        this.A05 = r13;
        this.A02 = r14;
        this.A04 = r15;
        this.A06 = r16;
        this.A01 = r17;
    }

    @Override // X.AnonymousClass0PN
    public Pair A07(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("parent_row_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("parent_key_remote_jid");
        long j = -1;
        int i = 0;
        while (cursor.moveToNext()) {
            j = cursor.getLong(columnIndexOrThrow);
            AnonymousClass02N A012 = AnonymousClass02N.A01(cursor.getString(columnIndexOrThrow2));
            if (A012 == null) {
                StringBuilder sb = new StringBuilder("QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing chatJid; rowId=");
                sb.append(j);
                Log.e(sb.toString());
            } else {
                AbstractC007503q A022 = this.A03.A02(cursor);
                if (A022 == null) {
                    StringBuilder sb2 = new StringBuilder("QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing quotedMessage; rowId=");
                    sb2.append(j);
                    Log.e(sb2.toString());
                } else {
                    A022.A0U(2);
                    try {
                        C017509h r7 = this.A0A;
                        r7.A05(A022, j);
                        AnonymousClass1VB A013 = this.A0B.A01("INSERT OR REPLACE INTO message_quoted(    message_row_id,    parent_message_chat_row_id,    chat_row_id,    from_me,    sender_jid_row_id,    key_id,    timestamp,    message_type,    origin,    text_data,    payment_transaction_id,    lookup_tables) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", "INSERT_MESSAGE_QUOTED_SQL");
                        r7.A06(A022, j, A012, A013);
                        A013.A01();
                        if (A022.A0B() != null) {
                            A022.A0B().A02(A022.A0B().A07());
                        }
                        if (A022 instanceof AnonymousClass0Z9) {
                            this.A08.A01((AnonymousClass0Z9) A022, j);
                        }
                        if (A022 instanceof C12210hj) {
                            this.A00.A01((C12210hj) A022, j);
                        }
                        if (A022 instanceof AnonymousClass0ZF) {
                            this.A01.A05((AnonymousClass0ZF) A022, j);
                        }
                        if (A022 instanceof AnonymousClass0ZA) {
                            this.A07.A02((AnonymousClass0ZA) A022, j);
                        }
                        if (A022 instanceof AnonymousClass0ZN) {
                            this.A06.A06((AnonymousClass0ZN) A022, j);
                        }
                        if (A022.A0q()) {
                            this.A06.A02(A022.A0A().A00, j, "message_quoted_ui_elements");
                        }
                        if (A022 instanceof AnonymousClass0ZP) {
                            this.A06.A08((AnonymousClass0ZP) A022, j);
                        }
                        if (A022 instanceof AnonymousClass28A) {
                            this.A06.A04((AnonymousClass28A) A022, j);
                        }
                        if (A022 instanceof AbstractC02860Dt) {
                            this.A02.A03((AbstractC02860Dt) A022, j);
                        }
                        if (A022 instanceof AnonymousClass0M3) {
                            this.A04.A0D((AnonymousClass0M3) A022, j);
                        }
                        if (A022.A0r()) {
                            this.A05.A02(A022, j);
                        }
                        if (A022 instanceof C04830Lz) {
                            C016909b r5 = this.A0D;
                            C04830Lz r0 = (C04830Lz) A022;
                            if (r5 != null) {
                                String A0u = r0.A0u();
                                if (!TextUtils.isEmpty(A0u)) {
                                    r5.A07(A0u, j);
                                }
                            } else {
                                throw null;
                            }
                        } else if (A022 instanceof AnonymousClass0M1) {
                            this.A0D.A05((AnonymousClass0M1) A022, j);
                        }
                        if (A022 instanceof C05490Ot) {
                            this.A0C.A02(A022, j, false);
                        }
                        i++;
                    } catch (IllegalArgumentException | IllegalStateException unused) {
                        StringBuilder sb3 = new StringBuilder("QuotedMessageStore/QuotedMessageDatabaseMigration/processBatch/missing information, skipping; rowId=");
                        sb3.append(j);
                        Log.e(sb3.toString());
                    }
                }
            }
        }
        return Pair.create(Long.valueOf(j), Integer.valueOf(i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x007e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0082, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0089, code lost:
        throw r0;
     */
    @Override // X.AnonymousClass0PN
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D() {
        /*
        // Method dump skipped, instructions count: 138
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43651yj.A0D():void");
    }
}
