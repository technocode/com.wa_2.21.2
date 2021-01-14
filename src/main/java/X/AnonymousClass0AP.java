package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.0AP  reason: invalid class name */
public class AnonymousClass0AP {
    public static volatile AnonymousClass0AP A09;
    public final AnonymousClass00S A00;
    public final AnonymousClass09V A01;
    public final C014408c A02;
    public final C006903j A03;
    public final C015508n A04;
    public final C015308l A05;
    public final C017809k A06;
    public final AnonymousClass094 A07;
    public final C014508d A08;

    public AnonymousClass0AP(AnonymousClass00S r1, C015308l r2, C014408c r3, C006903j r4, AnonymousClass09V r5, C015508n r6, C017809k r7, C014508d r8, AnonymousClass094 r9) {
        this.A00 = r1;
        this.A05 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r5;
        this.A04 = r6;
        this.A06 = r7;
        this.A08 = r8;
        this.A07 = r9;
    }

    public static AnonymousClass0AP A00() {
        if (A09 == null) {
            synchronized (AnonymousClass0AP.class) {
                if (A09 == null) {
                    A09 = new AnonymousClass0AP(AnonymousClass00S.A00(), C015308l.A00(), C014408c.A00(), C006903j.A00(), AnonymousClass09V.A00(), C015508n.A00(), C017809k.A00(), C014508d.A00(), AnonymousClass094.A00());
                }
            }
        }
        return A09;
    }

    public AbstractC007503q A01(AnonymousClass02N r8) {
        if (r8 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C006903j r2 = this.A03;
        if (r2.A05(r8) == null) {
            AnonymousClass008.A13("msgstore/last/message/no chat for ", r8);
            return null;
        }
        C08560bL A052 = r2.A05(r8);
        if (A052 == null) {
            return null;
        }
        long j = A052.A0F;
        if (j == 1) {
            return null;
        }
        AbstractC007503q r0 = A052.A0N;
        if (r0 != null) {
            return r0;
        }
        AbstractC007503q A053 = A05(r8, j);
        A052.A0N = A053;
        return A053;
    }

    public AbstractC007503q A02(AnonymousClass02N r12) {
        AbstractC007503q r9 = null;
        if (r12 == null) {
            Log.e("msgstore/last/message/jid is null");
            return null;
        }
        C006903j r1 = this.A03;
        C08560bL A052 = r1.A05(r12);
        if (A052 == null) {
            AnonymousClass008.A13("msgstore/last/message/no chat for ", r12);
            return null;
        }
        AbstractC007503q r0 = A052.A0O;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass00S r8 = this.A00;
        long A042 = r8.A04();
        C08560bL A053 = r1.A05(r12);
        if (A053 != null) {
            long j = A053.A0I;
            if (j != 1) {
                r9 = A05(r12, j);
                AnonymousClass008.A0h(r8, A042, this.A04, "LastMessageStore/getLastChatsListDisplayedMessageFromDb");
            }
        }
        A052.A0O = r9;
        return r9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r4 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC007503q A03(X.AnonymousClass02N r10) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A03(X.02N):X.03q");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (r5 != null) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0095, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AbstractC007503q A04(X.AnonymousClass02N r11, int r12) {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A04(X.02N, int):X.03q");
    }

    public final AbstractC007503q A05(AnonymousClass02N r7, long j) {
        AbstractC007503q A012 = this.A01.A01(j);
        if (!AnonymousClass1VY.A0d(r7) || !(A012 instanceof C05390Oi)) {
            return A012;
        }
        C05390Oi r5 = (C05390Oi) A012;
        if (r5.A00 != 2) {
            return A012;
        }
        Log.i("msgstore/initialize/update-group-create-failed-msg");
        C05390Oi A002 = AnonymousClass01R.A00(r5.A0n, r5.A0E, 3);
        A002.A0d(r5.A0D());
        A002.A0m(((C05400Oj) r5).A01);
        this.A06.A04(A002);
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        if (r1 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A06(X.AnonymousClass02N r15, int r16) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0AP.A06(X.02N, int):java.util.ArrayList");
    }

    public final void A07(AnonymousClass02N r4, ArrayList arrayList, Cursor cursor, boolean z) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    AbstractC007503q A032 = this.A01.A03(cursor, r4);
                    if (A032 != null) {
                        if (!(A032 instanceof AnonymousClass0MP) || A032.A04 != 1) {
                            arrayList.add(A032);
                        } else {
                            AnonymousClass0M4 r0 = ((AnonymousClass0M3) ((AnonymousClass0MP) A032)).A02;
                            if (r0 != null && r0.A0P) {
                                arrayList.add(A032);
                            } else if (z) {
                                Log.d("lastmessagestore/populatenotificationmessages/not transferred");
                            }
                        }
                    } else if (z) {
                        Log.d("lastmessagestore/populatenotificationmessages/null");
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e(e);
                    this.A07.A02();
                } catch (IllegalStateException e2) {
                    Log.i("msgstore/getlastmessagesfornotification/IllegalStateException ", e2);
                } catch (Throwable th) {
                    cursor.close();
                    throw th;
                }
            }
            cursor.close();
        }
    }
}
