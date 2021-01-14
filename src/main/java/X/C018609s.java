package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.09s  reason: invalid class name and case insensitive filesystem */
public class C018609s {
    public static final String[] A08 = {"key_remote_jid", "key_from_me", "key_id", "id", "timestamp", "init_timestamp", "status", "error_code", "sender", "receiver", "type", "currency", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id"};
    public static final String[] A09 = {"message_row_id", "remote_jid_row_id", "key_id", "interop_id", "id", "timestamp", "init_timestamp", "status", "error_code", "sender_jid_row_id", "receiver_jid_row_id", "type", "currency_code", "amount_1000", "credential_id", "methods", "bank_transaction_id", "request_key_id", "metadata", "country", "version", "future_data", "service_id"};
    public static volatile C018609s A0A;
    public AbstractC449322f A00;
    public final AnonymousClass01I A01;
    public final AnonymousClass00S A02;
    public final C015308l A03;
    public final C014508d A04;
    public final C015408m A05;
    public final C018709t A06;
    public final C018809u A07 = C018809u.A00("PaymentTransactionStore", "database", "COMMON");

    public C018609s(AnonymousClass00S r4, C015308l r5, AnonymousClass01I r6, C018709t r7, C015408m r8, C014508d r9) {
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r6;
        this.A06 = r7;
        this.A05 = r8;
        this.A04 = r9;
    }

    public static final Pair A00() {
        return Pair.create(new String[]{"19", "12", "17", String.valueOf(1), String.valueOf(2), "20", "10"}, "((status!=?) AND (status!=?) AND (status!=?) AND (type=? OR type=? OR type=? OR type=?))");
    }

    public static final Pair A01(String str, String str2) {
        String[] strArr;
        String str3;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (isEmpty && isEmpty2) {
            return null;
        }
        if (isEmpty) {
            strArr = new String[]{str2};
            str3 = "id=?";
        } else if (!isEmpty2) {
            strArr = new String[]{str, str2};
            str3 = "key_id=? OR id=?";
        } else {
            strArr = new String[]{str};
            str3 = "key_id=?";
        }
        return new Pair(str3, strArr);
    }

    public static final Pair A02(boolean z) {
        String str;
        if (z) {
            str = "(status=? OR status=?)";
        } else {
            str = "(status!=? AND status!=?)";
        }
        return Pair.create(new String[]{"405", "106"}, str);
    }

    public static Pair A03(int[] iArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        int length = iArr.length;
        int length2 = iArr2.length;
        String[] strArr = new String[(length + length2)];
        for (int i = 0; i < length; i++) {
            sb.append("status=?");
            if (i != length - 1) {
                sb.append(" OR ");
            }
            strArr[i] = String.valueOf(iArr[i]);
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < length2; i2++) {
            sb2.append("type=?");
            if (i2 != length2 - 1) {
                sb2.append(" OR ");
            }
            strArr[length + i2] = String.valueOf(iArr2[i2]);
        }
        StringBuilder A0S = AnonymousClass008.A0S("((");
        A0S.append(sb.toString());
        A0S.append(") AND (");
        A0S.append(sb2.toString());
        A0S.append("))");
        return Pair.create(strArr, A0S.toString());
    }

    public static C018609s A04() {
        if (A0A == null) {
            synchronized (C018609s.class) {
                if (A0A == null) {
                    A0A = new C018609s(AnonymousClass00S.A00(), C015308l.A00(), AnonymousClass01I.A00(), C018709t.A01(), C015408m.A00(), C014508d.A00());
                }
            }
        }
        return A0A;
    }

    public static final void A05(AnonymousClass0MH r5, ContentValues contentValues, AnonymousClass0OQ r7) {
        r7.A04.A00("pay_transaction", contentValues, "id=?", new String[]{r5.A0G}, "expireOldPendingRequestsV2/UPDATE_PAY_TRANSACTION");
    }

    public static final void A06(AnonymousClass0MH r5, ContentValues contentValues, AnonymousClass0OQ r7) {
        r7.A04.A00("pay_transaction", contentValues, "id=?", new String[]{r5.A0G}, "failPendingTransactionV2/UPDATE_PAY_TRANSACTION");
    }

    public ContentValues A07(AnonymousClass0MH r10, AnonymousClass0MH r11) {
        AnonymousClass02N r0;
        ArrayList arrayList;
        AbstractC43791yx r3;
        int i;
        if (r10 == null || r10.A0P(r11)) {
            ContentValues contentValues = new ContentValues();
            AnonymousClass02N r02 = r11.A08;
            if (r02 != null) {
                contentValues.put("key_remote_jid", r02.getRawString());
                contentValues.put("key_from_me", Integer.valueOf(r11.A0M ? 1 : 0));
            } else if (!(r10 == null || (r0 = r10.A08) == null)) {
                contentValues.put("key_remote_jid", r0.getRawString());
                contentValues.put("key_from_me", Integer.valueOf(r10.A0M ? 1 : 0));
            }
            if (!TextUtils.isEmpty(r11.A0H)) {
                contentValues.put("key_id", r11.A0H);
            }
            int i2 = r11.A02;
            if (i2 != 0) {
                contentValues.put("type", Integer.valueOf(i2));
            }
            if (!TextUtils.isEmpty(r11.A0G)) {
                contentValues.put("id", r11.A0G);
            }
            UserJid userJid = r11.A0A;
            if (userJid != null) {
                contentValues.put("sender", userJid.getRawString());
            }
            UserJid userJid2 = r11.A09;
            if (userJid2 != null) {
                contentValues.put("receiver", userJid2.getRawString());
            }
            if (!TextUtils.isEmpty(r11.A0E)) {
                contentValues.put("currency", r11.A0E);
            }
            C05900Qy r03 = r11.A06;
            if (r03 != null && r03.A01()) {
                contentValues.put("amount_1000", Long.valueOf(r11.A06.A00.scaleByPowerOfTen(3).longValue()));
            }
            long j = r11.A04;
            if (j > 0) {
                contentValues.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
            }
            int i3 = r11.A01;
            if (i3 != 0) {
                contentValues.put("status", Integer.valueOf(i3));
            } else if (r10 != null) {
                contentValues.put("status", Integer.valueOf(r10.A01));
            }
            long j2 = r11.A05;
            if (j2 > 0) {
                contentValues.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
            }
            if (!TextUtils.isEmpty(r11.A0D)) {
                contentValues.put("credential_id", r11.A0D);
            }
            if (!TextUtils.isEmpty(r11.A0F)) {
                contentValues.put("error_code", r11.A0F);
            }
            if (!TextUtils.isEmpty(r11.A0B)) {
                contentValues.put("bank_transaction_id", r11.A0B);
            }
            if (!TextUtils.isEmpty(r11.A0I)) {
                contentValues.put("request_key_id", r11.A0I);
            }
            ArrayList arrayList2 = r11.A0J;
            if (arrayList2 != null && arrayList2.size() > 0) {
                contentValues.put("methods", AnonymousClass0MH.A04(arrayList2));
            } else if (!(r10 == null || (arrayList = r10.A0J) == null)) {
                contentValues.put("methods", AnonymousClass0MH.A04(arrayList));
            }
            if (r10 == null || (r3 = r10.A07) == null) {
                AbstractC43791yx r04 = r11.A07;
                if (r04 != null) {
                    contentValues.put("metadata", r04.A08());
                }
            } else {
                AbstractC43791yx r05 = r11.A07;
                if (r05 != null) {
                    r3.A0A(r05);
                    r3 = r10.A07;
                    int i4 = r10.A01;
                    if (!(r3 instanceof AnonymousClass3Y3)) {
                        ((AnonymousClass3XM) r3).A01 = i4;
                    }
                }
                contentValues.put("metadata", r3.A08());
            }
            if (!TextUtils.isEmpty(r11.A0C)) {
                contentValues.put("country", r11.A0C);
            }
            contentValues.put("version", Integer.valueOf(r11.A03));
            byte[] bArr = r11.A0N;
            if (bArr != null) {
                contentValues.put("future_data", bArr);
            }
            contentValues.put("service_id", Integer.valueOf(r11.A00));
            return contentValues;
        }
        C018809u r5 = this.A07;
        StringBuilder A0S = AnonymousClass008.A0S("writeTransactionToCValues skipping transaction with: ");
        A0S.append(r11.A0G);
        A0S.append(" as status is not updated ");
        A0S.append(" old ts: ");
        A0S.append(r10.A05);
        A0S.append(" counter: ");
        AbstractC43791yx r06 = r10.A07;
        int i5 = 0;
        if (r06 != null) {
            i = r06.A03();
        } else {
            i = 0;
        }
        A0S.append(i);
        A0S.append(" new ts: ");
        A0S.append(r11.A05);
        A0S.append(" counter: ");
        AbstractC43791yx r07 = r11.A07;
        if (r07 != null) {
            i5 = r07.A03();
        }
        AnonymousClass008.A1N(A0S, i5, r5);
        return null;
    }

    public ContentValues A08(AnonymousClass0MH r9, AnonymousClass0MH r10) {
        AnonymousClass02N r1;
        ArrayList arrayList;
        AbstractC43791yx r12;
        int i;
        if (r9 == null || r9.A0P(r10)) {
            ContentValues contentValues = new ContentValues();
            AnonymousClass02N r13 = r10.A08;
            if (r13 != null) {
                long A022 = this.A03.A02(r13);
                if (A022 != -1) {
                    contentValues.put("remote_jid_row_id", Long.valueOf(A022));
                }
            } else if (!(r9 == null || (r1 = r9.A08) == null)) {
                long A023 = this.A03.A02(r1);
                if (A023 != -1) {
                    contentValues.put("remote_jid_row_id", Long.valueOf(A023));
                }
            }
            if (!TextUtils.isEmpty(r10.A0H)) {
                contentValues.put("key_id", r10.A0H);
            }
            int i2 = r10.A02;
            if (i2 != 0) {
                contentValues.put("type", Integer.valueOf(i2));
            }
            if (!TextUtils.isEmpty(r10.A0G)) {
                contentValues.put("id", r10.A0G);
            }
            UserJid userJid = r10.A0A;
            if (userJid != null) {
                contentValues.put("sender_jid_row_id", Long.valueOf(this.A03.A02(userJid)));
            }
            UserJid userJid2 = r10.A09;
            if (userJid2 != null) {
                contentValues.put("receiver_jid_row_id", Long.valueOf(this.A03.A02(userJid2)));
            }
            if (!TextUtils.isEmpty(r10.A0E)) {
                contentValues.put("currency_code", r10.A0E);
            }
            C05900Qy r0 = r10.A06;
            if (r0 != null && r0.A01()) {
                contentValues.put("amount_1000", Long.valueOf(r10.A06.A00.scaleByPowerOfTen(3).longValue()));
            }
            long j = r10.A04;
            if (j > 0) {
                contentValues.put("init_timestamp", Integer.valueOf((int) (j / 1000)));
            }
            int i3 = r10.A01;
            if (i3 != 0) {
                contentValues.put("status", Integer.valueOf(i3));
            } else if (r9 != null) {
                contentValues.put("status", Integer.valueOf(r9.A01));
            }
            long j2 = r10.A05;
            if (j2 > 0) {
                contentValues.put("timestamp", Integer.valueOf((int) (j2 / 1000)));
            }
            if (!TextUtils.isEmpty(r10.A0D)) {
                contentValues.put("credential_id", r10.A0D);
            }
            if (!TextUtils.isEmpty(r10.A0F)) {
                contentValues.put("error_code", r10.A0F);
            }
            if (!TextUtils.isEmpty(r10.A0B)) {
                contentValues.put("bank_transaction_id", r10.A0B);
            }
            if (!TextUtils.isEmpty(r10.A0I)) {
                contentValues.put("request_key_id", r10.A0I);
            }
            ArrayList arrayList2 = r10.A0J;
            if (arrayList2 != null && arrayList2.size() > 0) {
                contentValues.put("methods", AnonymousClass0MH.A04(arrayList2));
            } else if (!(r9 == null || (arrayList = r9.A0J) == null)) {
                contentValues.put("methods", AnonymousClass0MH.A04(arrayList));
            }
            if (r9 == null || (r12 = r9.A07) == null) {
                AbstractC43791yx r02 = r10.A07;
                if (r02 != null) {
                    contentValues.put("metadata", r02.A08());
                }
            } else {
                AbstractC43791yx r03 = r10.A07;
                if (r03 != null) {
                    r12.A0A(r03);
                }
                contentValues.put("metadata", r9.A07.A08());
            }
            if (!TextUtils.isEmpty(r10.A0C)) {
                contentValues.put("country", r10.A0C);
            }
            contentValues.put("version", Integer.valueOf(r10.A03));
            byte[] bArr = r10.A0N;
            if (bArr != null) {
                contentValues.put("future_data", bArr);
            }
            contentValues.put("service_id", Integer.valueOf(r10.A00));
            return contentValues;
        }
        C018809u r5 = this.A07;
        StringBuilder A0S = AnonymousClass008.A0S("writeTransactionToCValuesV2 skipping transaction with: ");
        A0S.append(r10.A0G);
        A0S.append(" as status is not updated ");
        A0S.append(" old ts: ");
        A0S.append(r9.A05);
        A0S.append(" counter: ");
        AbstractC43791yx r04 = r9.A07;
        int i4 = 0;
        if (r04 != null) {
            i = r04.A03();
        } else {
            i = 0;
        }
        A0S.append(i);
        A0S.append(" new ts: ");
        A0S.append(r10.A05);
        A0S.append(" counter: ");
        AbstractC43791yx r05 = r10.A07;
        if (r05 != null) {
            i4 = r05.A03();
        }
        AnonymousClass008.A1N(A0S, i4, r5);
        return null;
    }

    public final Pair A09(int i) {
        String str;
        if (i == 0) {
            return new Pair(new String[0], null);
        }
        if (i == 1) {
            str = "( sender=? OR receiver=? )";
        } else if (i == 2) {
            str = "( sender=? )";
        } else if (i == 3) {
            str = "( receiver=? )";
        } else {
            throw new IllegalArgumentException("Inappropriate selection target for sender receiver selection");
        }
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        AnonymousClass0HR r02 = r0.A01;
        if (r02 != null) {
            Jid jid = r02.A09;
            if (jid != null) {
                String rawString = jid.getRawString();
                return new Pair(i == 1 ? new String[]{rawString, rawString} : new String[]{rawString}, str);
            }
            throw null;
        }
        throw null;
    }

    public final Pair A0A(int i) {
        String str;
        if (i == 0) {
            return new Pair(new String[0], null);
        }
        if (i == 1) {
            str = "( sender_jid_row_id=? OR receiver_jid_row_id=? )";
        } else if (i == 2) {
            str = "( sender_jid_row_id=? )";
        } else if (i == 3) {
            str = "( receiver_jid_row_id=? )";
        } else {
            throw new IllegalArgumentException("Inappropriate selection target for sender receiver selection");
        }
        AnonymousClass01I r0 = this.A01;
        r0.A04();
        AnonymousClass0HR r02 = r0.A01;
        if (r02 != null) {
            Jid jid = r02.A09;
            if (jid != null) {
                String l = Long.toString(this.A03.A02(jid));
                return new Pair(i == 1 ? new String[]{l, l} : new String[]{l}, str);
            }
            throw null;
        }
        throw null;
    }

    public final Pair A0B(int i) {
        Pair A092;
        if (i == 2) {
            A092 = A0A(0);
        } else {
            A092 = A09(0);
        }
        String[] strArr = (String[]) A092.first;
        Object obj = A092.second;
        String str = "((type=? AND status=?) OR (type=? AND (status=? OR status=?)))";
        if (obj != null) {
            StringBuilder A0Y = AnonymousClass008.A0Y(str, " AND ");
            A0Y.append((String) obj);
            str = A0Y.toString();
        }
        int length = strArr.length;
        int i2 = 5;
        String[] strArr2 = new String[(length + 5)];
        int i3 = 0;
        strArr2[0] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr2[1] = num;
        strArr2[2] = Integer.toString(10);
        strArr2[3] = num;
        strArr2[4] = Integer.toString(19);
        while (i3 < length) {
            strArr2[i2] = strArr[i3];
            i3++;
            i2++;
        }
        return new Pair(str, strArr2);
    }

    public final Pair A0C(int i) {
        Pair A092;
        Pair A093;
        if (i == 2) {
            A092 = A0A(1);
        } else {
            A092 = A09(1);
        }
        StringBuilder A0S = AnonymousClass008.A0S("( type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR type=? OR (type=? AND ");
        AnonymousClass008.A1Y(A0S, (String) A092.second, ") OR (", "type", "=? AND ");
        AnonymousClass008.A1Y(A0S, "status", "!=? AND ", "status", "!=?) OR (");
        AnonymousClass008.A1Y(A0S, "type", "=? AND ", "status", "!=? AND ");
        String A0Q = AnonymousClass008.A0Q(A0S, "status", "!=? AND ", "status", "!=?))");
        if (i == 2) {
            A093 = A0A(0);
        } else {
            A093 = A09(0);
        }
        String[] strArr = (String[]) A093.first;
        Object obj = A093.second;
        if (obj != null) {
            StringBuilder A0Y = AnonymousClass008.A0Y(A0Q, " AND ");
            A0Y.append((String) obj);
            A0Q = A0Y.toString();
        }
        int i2 = !TextUtils.isEmpty(null) ? 1 : 0;
        if (i2 != 0) {
            A0Q = AnonymousClass008.A0K(A0Q, " AND credential_id=?");
        }
        int length = strArr.length;
        String[] strArr2 = new String[(i2 + 17 + length)];
        int i3 = 0;
        strArr2[0] = Integer.toString(1);
        strArr2[1] = Integer.toString(2);
        strArr2[2] = Integer.toString(100);
        strArr2[3] = Integer.toString(200);
        strArr2[4] = Integer.toString(6);
        strArr2[5] = Integer.toString(7);
        strArr2[6] = Integer.toString(8);
        strArr2[7] = Integer.toString(SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS);
        String[] strArr3 = (String[]) A092.first;
        strArr2[8] = strArr3[0];
        strArr2[9] = strArr3[1];
        strArr2[10] = Integer.toString(20);
        String num = Integer.toString(12);
        strArr2[11] = num;
        int i4 = 17;
        String num2 = Integer.toString(17);
        strArr2[12] = num2;
        strArr2[13] = Integer.toString(10);
        strArr2[14] = num;
        strArr2[15] = Integer.toString(19);
        strArr2[16] = num2;
        while (i3 < length) {
            strArr2[i4] = strArr[i3];
            i3++;
            i4++;
        }
        if (i2 != 0) {
            strArr2[i4] = null;
        }
        return new Pair(A0Q, strArr2);
    }

    public final Pair A0D(int i, AnonymousClass02N r13) {
        String str;
        Pair A0C = A0C(i);
        Pair A0B = A0B(i);
        String[] strArr = new String[(((String[]) A0C.second).length + 1 + ((String[]) A0B.second).length)];
        if (i == 1) {
            strArr[0] = r13.getRawString();
            str = "key_remote_jid=?";
        } else {
            long A022 = this.A03.A02(r13);
            if (A022 != -1) {
                strArr[0] = String.valueOf(A022);
                str = "remote_jid_row_id=?";
            } else {
                C018809u r2 = this.A07;
                StringBuilder A0S = AnonymousClass008.A0S("getPendingRequestsAndTransactionsQueryAndParams/no row id for jid/jid=");
                A0S.append(r13.getRawString());
                r2.A04(A0S.toString());
                return null;
            }
        }
        StringBuilder A0Z = AnonymousClass008.A0Z("(", str, " AND (");
        A0Z.append((String) A0C.first);
        A0Z.append(" OR ");
        String A0O = AnonymousClass008.A0O(A0Z, (String) A0B.first, "))");
        Object obj = A0C.second;
        System.arraycopy(obj, 0, strArr, 1, ((String[]) obj).length);
        Object obj2 = A0B.second;
        System.arraycopy(obj2, 0, strArr, ((String[]) A0C.second).length + 1, ((String[]) obj2).length);
        return new Pair(A0O, strArr);
    }

    public final Pair A0E(AnonymousClass1X3 r7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass1X4 r0 = r7.A00;
        if (r0 != null) {
            Collections.addAll(arrayList, r0.A01);
            arrayList2.add(r7.A00.A00);
        } else if (r7.A03) {
            Pair A002 = A00();
            Collections.addAll(arrayList, (Object[]) A002.first);
            arrayList2.add(A002.second);
        }
        AnonymousClass01I r02 = this.A01;
        r02.A04();
        AnonymousClass0HR r03 = r02.A01;
        if (r03 != null) {
            Jid jid = r03.A09;
            if (jid != null) {
                String rawString = jid.getRawString();
                if (r7.A06) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(1));
                    arrayList.add(Integer.toString(10));
                } else if (r7.A05) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(2));
                    arrayList.add(Integer.toString(20));
                }
                arrayList2.add("( sender=? OR receiver=?)");
                arrayList.add(rawString);
                arrayList.add(rawString);
                if (r7.A01) {
                    Pair A022 = A02(true);
                    Collections.addAll(arrayList, (Object[]) A022.first);
                    arrayList2.add(A022.second);
                } else if (r7.A02) {
                    Pair A023 = A02(false);
                    Collections.addAll(arrayList, (Object[]) A023.first);
                    arrayList2.add(A023.second);
                }
                StringBuilder A0S = AnonymousClass008.A0S("(");
                A0S.append(TextUtils.join(" AND ", arrayList2));
                A0S.append(")");
                return Pair.create(arrayList.toArray(new String[0]), A0S.toString());
            }
            throw null;
        }
        throw null;
    }

    public final Pair A0F(AnonymousClass1X3 r7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        AnonymousClass1X4 r0 = r7.A00;
        if (r0 != null) {
            Collections.addAll(arrayList, r0.A01);
            arrayList2.add(r7.A00.A00);
        } else if (r7.A03) {
            Pair A002 = A00();
            Collections.addAll(arrayList, (Object[]) A002.first);
            arrayList2.add(A002.second);
        }
        AnonymousClass01I r02 = this.A01;
        r02.A04();
        AnonymousClass0HR r03 = r02.A01;
        if (r03 != null) {
            Jid jid = r03.A09;
            if (jid != null) {
                String l = Long.toString(this.A03.A02(jid));
                if (r7.A06) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(1));
                    arrayList.add(Integer.toString(10));
                } else if (r7.A05) {
                    arrayList2.add("(type=? OR type=?)");
                    arrayList.add(Integer.toString(2));
                    arrayList.add(Integer.toString(20));
                }
                arrayList2.add("( receiver_jid_row_id=? OR sender_jid_row_id=?)");
                arrayList.add(l);
                arrayList.add(l);
                if (r7.A01) {
                    Pair A022 = A02(true);
                    Collections.addAll(arrayList, (Object[]) A022.first);
                    arrayList2.add(A022.second);
                } else if (r7.A02) {
                    Pair A023 = A02(false);
                    Collections.addAll(arrayList, (Object[]) A023.first);
                    arrayList2.add(A023.second);
                }
                StringBuilder A0S = AnonymousClass008.A0S("(");
                A0S.append(TextUtils.join(" AND ", arrayList2));
                A0S.append(")");
                return Pair.create(arrayList.toArray(new String[0]), A0S.toString());
            }
            throw null;
        }
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0097, code lost:
        if (r4 != null) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r7 != null) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0MH A0G(long r12, java.lang.String r14, java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0G(long, java.lang.String, java.lang.String):X.0MH");
    }

    public final AnonymousClass0MH A0H(Cursor cursor) {
        if (A0b()) {
            return A0J(cursor);
        }
        return A0I(cursor);
    }

    public final AnonymousClass0MH A0I(Cursor cursor) {
        AnonymousClass0MH A032;
        int i;
        AbstractC07650Yy paymentService;
        AbstractC449322f r1;
        AnonymousClass02N A012 = AnonymousClass02N.A01(cursor.getString(cursor.getColumnIndex("key_remote_jid")));
        String string = cursor.getString(cursor.getColumnIndex("key_id"));
        boolean z = true;
        if (cursor.getInt(cursor.getColumnIndex("key_from_me")) != 1) {
            z = false;
        }
        String string2 = cursor.getString(cursor.getColumnIndex("id"));
        long j = ((long) cursor.getInt(cursor.getColumnIndex("init_timestamp"))) * 1000;
        long j2 = ((long) cursor.getInt(cursor.getColumnIndex("timestamp"))) * 1000;
        int i2 = cursor.getInt(cursor.getColumnIndex("status"));
        UserJid nullable = UserJid.getNullable(cursor.getString(cursor.getColumnIndex("sender")));
        UserJid nullable2 = UserJid.getNullable(cursor.getString(cursor.getColumnIndex("receiver")));
        int i3 = cursor.getInt(cursor.getColumnIndex("type"));
        String string3 = cursor.getString(cursor.getColumnIndex("currency"));
        long j3 = cursor.getLong(cursor.getColumnIndex("amount_1000"));
        String string4 = cursor.getString(cursor.getColumnIndex("credential_id"));
        String string5 = cursor.getString(cursor.getColumnIndex("error_code"));
        String string6 = cursor.getString(cursor.getColumnIndex("bank_transaction_id"));
        String string7 = cursor.getString(cursor.getColumnIndex("methods"));
        String string8 = cursor.getString(cursor.getColumnIndex("metadata"));
        String string9 = cursor.getString(cursor.getColumnIndex("request_key_id"));
        String string10 = cursor.getString(cursor.getColumnIndex("country"));
        if (TextUtils.isEmpty(string10)) {
            string10 = AnonymousClass0MH.A0O;
        }
        int i4 = cursor.getInt(cursor.getColumnIndex("version"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("future_data"));
        int i5 = cursor.getInt(cursor.getColumnIndex("service_id"));
        C018809u r8 = this.A07;
        StringBuilder sb = new StringBuilder("readTransactionInfoByTransId got from db: id: ");
        sb.append(string2);
        sb.append(" timestamp: ");
        sb.append(j2);
        sb.append(" type: ");
        sb.append(i3);
        sb.append(" status: ");
        sb.append(i2);
        sb.append(" description: ");
        sb.append(" peer: ");
        sb.append(nullable2);
        r8.A03(sb.toString());
        if (i3 != 5 || !TextUtils.isEmpty(string3)) {
            BigDecimal scaleByPowerOfTen = new BigDecimal(j3).scaleByPowerOfTen(-3);
            if (i3 != 4) {
                A032 = r24;
                AnonymousClass0MH r24 = new AnonymousClass0MH(i3, nullable, nullable2, string3, new C05900Qy(scaleByPowerOfTen, AnonymousClass1VK.A01(string3).A5z()), j, string2, i2, j2, string4, string5, string6, null, string10, i4, i5);
                A032.A0N = blob;
                A032.A0K = false;
            } else {
                A032 = AnonymousClass0MH.A03(j);
            }
        } else {
            A032 = new AnonymousClass0MH(5, j, string10, i4);
            A032.A0N = blob;
        }
        A032.A08 = A012;
        A032.A0M = z;
        if (!TextUtils.isEmpty(string)) {
            A032.A0H = string;
        }
        if (!TextUtils.isEmpty(string9)) {
            A032.A0I = string9;
        }
        if (!TextUtils.isEmpty(string7)) {
            A032.A0E(AnonymousClass0MH.A05(string7, A032.A08()));
        }
        if (!TextUtils.isEmpty(string8) && (r1 = this.A00) != null) {
            AbstractC07650Yy paymentService2 = r1.getPaymentService(string10, string3);
            if (paymentService2 != null) {
                A032.A07 = paymentService2.AAd();
            }
            AbstractC43791yx r12 = A032.A07;
            if (r12 != null) {
                r12.A02(string8);
                if (A032.A0J() && A032.A07.A04() < this.A02.A05()) {
                    A032.A01 = 16;
                }
            }
        }
        if (A032.A00 == 0) {
            AbstractC449322f r2 = this.A00;
            if (r2 == null || (paymentService = r2.getPaymentService(A032.A0C, A032.A0E)) == null) {
                i = 0;
            } else {
                i = paymentService.A92();
            }
            A032.A00 = i;
        }
        StringBuilder sb2 = new StringBuilder("readTransactionFromCursor: ");
        sb2.append(A032);
        sb2.append(" countryData: ");
        sb2.append(A032.A07);
        r8.A05(sb2.toString());
        return A032;
    }

    public final AnonymousClass0MH A0J(Cursor cursor) {
        AnonymousClass02N r7;
        boolean z;
        AnonymousClass0MH A032;
        int i;
        AbstractC07650Yy paymentService;
        AbstractC449322f r1;
        C015308l r6 = this.A03;
        Jid A042 = r6.A04(cursor.getLong(cursor.getColumnIndex("remote_jid_row_id")));
        if (A042 instanceof AnonymousClass02N) {
            r7 = (AnonymousClass02N) A042;
        } else {
            r7 = null;
        }
        String string = cursor.getString(cursor.getColumnIndex("key_id"));
        String string2 = cursor.getString(cursor.getColumnIndex("id"));
        long j = ((long) cursor.getInt(cursor.getColumnIndex("init_timestamp"))) * 1000;
        long j2 = ((long) cursor.getInt(cursor.getColumnIndex("timestamp"))) * 1000;
        int i2 = cursor.getInt(cursor.getColumnIndex("status"));
        UserJid of = UserJid.of(r6.A04(cursor.getLong(cursor.getColumnIndex("sender_jid_row_id"))));
        UserJid of2 = UserJid.of(r6.A04(cursor.getLong(cursor.getColumnIndex("receiver_jid_row_id"))));
        int i3 = cursor.getInt(cursor.getColumnIndex("type"));
        String string3 = cursor.getString(cursor.getColumnIndex("currency_code"));
        long j3 = cursor.getLong(cursor.getColumnIndex("amount_1000"));
        String string4 = cursor.getString(cursor.getColumnIndex("credential_id"));
        String string5 = cursor.getString(cursor.getColumnIndex("error_code"));
        String string6 = cursor.getString(cursor.getColumnIndex("bank_transaction_id"));
        String string7 = cursor.getString(cursor.getColumnIndex("methods"));
        String string8 = cursor.getString(cursor.getColumnIndex("metadata"));
        String string9 = cursor.getString(cursor.getColumnIndex("request_key_id"));
        String string10 = cursor.getString(cursor.getColumnIndex("country"));
        if (TextUtils.isEmpty(string10)) {
            string10 = AnonymousClass0MH.A0O;
        }
        int i4 = cursor.getInt(cursor.getColumnIndex("version"));
        byte[] blob = cursor.getBlob(cursor.getColumnIndex("future_data"));
        int i5 = cursor.getInt(cursor.getColumnIndex("service_id"));
        AnonymousClass01I r4 = this.A01;
        if ((!r4.A09(of2) || !(i3 == 20 || i3 == 40 || i3 == 10 || i3 == 30)) && (!r4.A09(of) || !(i3 == 2 || i3 == 200 || i3 == 1 || i3 == 100 || i3 == 3))) {
            z = false;
        } else {
            z = true;
        }
        String string11 = cursor.getString(cursor.getColumnIndex("interop_id"));
        C018809u r3 = this.A07;
        StringBuilder sb = new StringBuilder();
        sb.append("readTransactionInfoByTransId got from db: id: ");
        sb.append(string2);
        sb.append(" timestamp: ");
        sb.append(j2);
        sb.append(" service_id: ");
        sb.append(i5);
        sb.append(" type: ");
        sb.append(i3);
        sb.append(" status: ");
        sb.append(i2);
        sb.append(" description: ");
        sb.append(" peer: ");
        sb.append(of2);
        r3.A03(sb.toString());
        if (i3 != 5 || !TextUtils.isEmpty(string3)) {
            BigDecimal scaleByPowerOfTen = new BigDecimal(j3).scaleByPowerOfTen(-3);
            if (i3 != 4) {
                A032 = r27;
                AnonymousClass0MH r27 = new AnonymousClass0MH(i3, of, of2, string3, new C05900Qy(scaleByPowerOfTen, AnonymousClass1VK.A01(string3).A5z()), j, string2, i2, j2, string4, string5, string6, null, string10, i4, i5);
                A032.A0N = blob;
                A032.A0K = false;
            } else {
                A032 = AnonymousClass0MH.A03(j);
            }
        } else {
            A032 = new AnonymousClass0MH(5, j, string10, i4);
            A032.A0N = blob;
        }
        A032.A08 = r7;
        A032.A0M = z;
        if (!TextUtils.isEmpty(string)) {
            A032.A0H = string;
        } else if (!TextUtils.isEmpty(string11)) {
            A032.A0H = string11;
        }
        if (!TextUtils.isEmpty(string9)) {
            A032.A0I = string9;
        }
        if (!TextUtils.isEmpty(string7)) {
            A032.A0E(AnonymousClass0MH.A05(string7, A032.A08()));
        }
        if (!TextUtils.isEmpty(string11)) {
            A032.A0L = true;
        }
        if (!TextUtils.isEmpty(string8) && (r1 = this.A00) != null) {
            AbstractC07650Yy paymentService2 = r1.getPaymentService(string10, string3);
            if (paymentService2 != null) {
                A032.A07 = paymentService2.AAd();
            }
            AbstractC43791yx r12 = A032.A07;
            if (r12 != null) {
                r12.A02(string8);
                if (A032.A0J() && A032.A07.A04() < this.A02.A05()) {
                    A032.A01 = 16;
                }
            }
        }
        if (A032.A00 == 0) {
            AbstractC449322f r42 = this.A00;
            if (r42 == null || (paymentService = r42.getPaymentService(A032.A0C, A032.A0E)) == null) {
                i = 0;
            } else {
                i = paymentService.A92();
            }
            A032.A00 = i;
        }
        StringBuilder sb2 = new StringBuilder("readTransactionFromCursor: ");
        sb2.append(A032);
        sb2.append(" countryData: ");
        sb2.append(A032.A07);
        r3.A05(sb2.toString());
        return A032;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        if (r5 != null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0080, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0MH A0K(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 129
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0K(java.lang.String):X.0MH");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006d, code lost:
        if (r5 != null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0072, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0075, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0079, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0MH A0L(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 122
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0L(java.lang.String):X.0MH");
    }

    public AnonymousClass0MH A0M(String str, String str2) {
        if (A0b()) {
            return A0G(-1, str, str2);
        }
        return A0N(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r2 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a7, code lost:
        if (r4 != null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b3, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0092  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0MH A0N(java.lang.String r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 180
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0N(java.lang.String, java.lang.String):X.0MH");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0373, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0377, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0121  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0O(X.AbstractC007503q r26, boolean r27) {
        /*
        // Method dump skipped, instructions count: 911
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0O(X.03q, boolean):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0P() {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0P():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00da, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0Q() {
        /*
        // Method dump skipped, instructions count: 231
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0Q():java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r5 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0083, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0086, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x010b, code lost:
        if (r5 != null) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0110, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0113, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0117, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0R(int r12) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0R(int):java.util.List");
    }

    public synchronized List A0S(int i) {
        ArrayList arrayList;
        int[] iArr = AnonymousClass0MH.A0P;
        int length = iArr.length;
        int[] iArr2 = AnonymousClass0MH.A0R;
        int length2 = iArr2.length;
        int[] iArr3 = AnonymousClass0MH.A0Q;
        int length3 = iArr3.length;
        arrayList = new ArrayList(length + length2 + length3);
        for (int i2 : iArr) {
            arrayList.add(Integer.valueOf(i2));
        }
        for (int i3 : iArr2) {
            arrayList.add(Integer.valueOf(i3));
        }
        for (int i4 : iArr3) {
            arrayList.add(Integer.valueOf(i4));
        }
        return A0U(i, (Integer[]) arrayList.toArray(new Integer[0]), new Integer[]{2, 1, 200, 100, 20, 10, 6, 7, 8});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009b, code lost:
        if (r5 != null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0133, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0134, code lost:
        if (r4 != null) goto L_0x0136;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0139, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x013c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0140, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0T(int r11, X.AnonymousClass02N r12) {
        /*
        // Method dump skipped, instructions count: 321
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0T(int, X.02N):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0108, code lost:
        if (r5 != null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0110, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0114, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0U(int r12, java.lang.Integer[] r13, java.lang.Integer[] r14) {
        /*
        // Method dump skipped, instructions count: 300
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0U(int, java.lang.Integer[], java.lang.Integer[]):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List A0V(com.whatsapp.jid.GroupJid r19, com.whatsapp.jid.UserJid r20) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0V(com.whatsapp.jid.GroupJid, com.whatsapp.jid.UserJid):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0114, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0118, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x011b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List A0W(boolean r20) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0W(boolean):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0084, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A0X(X.AnonymousClass0MH r16) {
        /*
        // Method dump skipped, instructions count: 145
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0X(X.0MH):void");
    }

    public void A0Y(AbstractC007503q r4) {
        String str;
        if (r4.A0m == 0) {
            String str2 = "UNSET";
            if (str2.equals(r4.A0b)) {
                AnonymousClass0MH A0M = A0M(r4.A0n.A01, null);
                if (A0M == null && !AnonymousClass0MH.A06(r4.A0F)) {
                    A0O(r4, false);
                }
                r4.A0F = A0M;
                if (!(A0M == null || (str = A0M.A0G) == null)) {
                    str2 = str;
                }
                r4.A0b = str2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00be, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Z(java.lang.String r10, int r11, long r12, long r14, int r16) {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0Z(java.lang.String, int, long, long, int):void");
    }

    public boolean A0a() {
        String A012;
        return (!this.A03.A0C() || (A012 = this.A05.A01("new_pay_transaction_ready")) == null || Long.parseLong(A012) == 0) ? false : true;
    }

    public boolean A0b() {
        String A012;
        return (!this.A03.A0C() || (A012 = this.A05.A01("new_pay_transaction_ready")) == null || Long.parseLong(A012) == 0) ? false : true;
    }

    public boolean A0c(AnonymousClass0MH r4) {
        AnonymousClass0MH A0M = A0M(r4.A0H, r4.A0G);
        if (A0M == null) {
            return false;
        }
        r4.A05 = this.A02.A05();
        return A0e(r4.A0H, r4, A0M);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r2.A04.A00("pay_transaction", r11, (java.lang.String) r0.first, (java.lang.String[]) r0.second, "updateMessagePaymentInfoV2/UPDATE_PAY_TRANSACTION") <= 0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0129, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x012d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d(X.C007303n r16, X.AnonymousClass0MH r17, int r18, long r19, int r21) {
        /*
        // Method dump skipped, instructions count: 311
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0d(X.03n, X.0MH, int, long, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0235, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0239, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(java.lang.String r27, X.AnonymousClass0MH r28, X.AnonymousClass0MH r29) {
        /*
        // Method dump skipped, instructions count: 602
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0e(java.lang.String, X.0MH, X.0MH):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r17.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0f(java.util.List r26) {
        /*
        // Method dump skipped, instructions count: 450
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018609s.A0f(java.util.List):boolean");
    }
}
