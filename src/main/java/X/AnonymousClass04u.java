package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteQueryBuilder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: X.04u  reason: invalid class name */
public class AnonymousClass04u extends Handler {
    public final /* synthetic */ AnonymousClass04r A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass04u(Looper looper, AnonymousClass04r r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        AnonymousClass04s r5;
        long j;
        String str;
        long j2;
        String str2;
        String str3;
        String str4;
        AnonymousClass04r r1 = this.A00;
        synchronized (r1) {
            r5 = r1.A00;
        }
        if (r5 != null) {
            AnonymousClass1VN r4 = (AnonymousClass1VN) message.obj;
            long j3 = r4.A01;
            if (r4.A05) {
                j = 3000;
            } else {
                j = 30000;
            }
            if (j3 >= j) {
                AnonymousClass213 r2 = new AnonymousClass213();
                if (TextUtils.isEmpty(r4.A03)) {
                    if (r4 instanceof C43851z3) {
                        C43851z3 r0 = (C43851z3) r4;
                        str2 = r0.A00;
                        if (0 != 0) {
                            str2 = C001801b.A17(str2, r0.A01);
                        }
                    } else if (r4 instanceof C43841z2) {
                        str2 = ((C43841z2) r4).A00;
                    } else if (r4 instanceof C43831z1) {
                        C43831z1 r02 = (C43831z1) r4;
                        String str5 = r02.A04;
                        String[] strArr = r02.A02;
                        String str6 = r02.A01;
                        String[] strArr2 = r02.A03;
                        String str7 = r02.A00;
                        StringBuilder A0S = AnonymousClass008.A0S("SELECT ");
                        if (strArr == null || strArr.length == 0) {
                            A0S.append("* ");
                        } else {
                            SQLiteQueryBuilder.appendColumns(A0S, strArr);
                        }
                        A0S.append("FROM ");
                        A0S.append(str5);
                        if (0 != 0) {
                            str6 = C001801b.A17(str6, strArr2);
                        }
                        C001801b.A1W(A0S, " WHERE ", str6);
                        C001801b.A1W(A0S, " GROUP BY ", null);
                        C001801b.A1W(A0S, " HAVING ", null);
                        C001801b.A1W(A0S, " ORDER BY ", str7);
                        str2 = A0S.toString();
                    } else if (!(r4 instanceof C43821z0)) {
                        C43811yz r8 = (C43811yz) r4;
                        int i = ((AnonymousClass1VN) r8).A00;
                        String str8 = "";
                        if (i == 2) {
                            str2 = C001801b.A15(r8.A04, r8.A00, str8, false);
                        } else if (i == 3) {
                            String str9 = r8.A04;
                            ContentValues contentValues = r8.A00;
                            String str10 = r8.A01;
                            String[] strArr3 = r8.A02;
                            StringBuilder A0Z = AnonymousClass008.A0Z("UPDATE ", str9, " SET ");
                            Iterator it = new TreeSet(contentValues.keySet()).iterator();
                            int i2 = 0;
                            while (it.hasNext()) {
                                String str11 = (String) it.next();
                                int i3 = i2 + 1;
                                if (i2 > 0) {
                                    str3 = ", ";
                                } else {
                                    str3 = str8;
                                }
                                A0Z.append(str3);
                                A0Z.append(str11);
                                A0Z.append("=");
                                A0Z.append(contentValues.get(str11));
                                i2 = i3;
                            }
                            if (!TextUtils.isEmpty(str10)) {
                                A0Z.append(" WHERE ");
                                if (0 != 0) {
                                    str10 = C001801b.A17(str10, strArr3);
                                }
                                A0Z.append(str10);
                            }
                            str2 = A0Z.toString();
                        } else if (i == 4) {
                            String str12 = r8.A04;
                            String str13 = r8.A01;
                            String[] strArr4 = r8.A02;
                            StringBuilder A0Y = AnonymousClass008.A0Y("DELETE FROM ", str12);
                            if (!TextUtils.isEmpty(str13)) {
                                A0Y.append(" WHERE ");
                                if (0 != 0) {
                                    str13 = C001801b.A17(str13, strArr4);
                                }
                                A0Y.append(str13);
                            }
                            str2 = A0Y.toString();
                        } else if (i != 5) {
                            StringBuilder sb = new StringBuilder();
                            String str14 = r8.A04;
                            if (str14 != null) {
                                StringBuilder A0S2 = AnonymousClass008.A0S("Table name:");
                                A0S2.append(str14);
                                str8 = A0S2.toString();
                            }
                            sb.append(str8);
                            sb.append(" WhereClause:");
                            sb.append(r8.A01);
                            sb.append(" Params:");
                            sb.append(Arrays.toString(r8.A02));
                            sb.append(" Values:");
                            ContentValues contentValues2 = r8.A00;
                            if (contentValues2 != null) {
                                str4 = contentValues2.toString();
                            } else {
                                str4 = "null";
                            }
                            sb.append(str4);
                            str2 = sb.toString();
                        } else {
                            str2 = C001801b.A15(r8.A04, r8.A00, " OR REPLACE", false);
                        }
                    } else {
                        C43821z0 r03 = (C43821z0) r4;
                        str2 = r03.A00;
                        if (0 != 0) {
                            str2 = C001801b.A17(str2, r03.A01);
                        }
                    }
                    str = C007603r.A01(str2);
                    if (TextUtils.isEmpty(str)) {
                        str = "NO_ID";
                    }
                } else {
                    str = r4.A03;
                }
                r2.A04 = str;
                r2.A00 = Boolean.valueOf(r4.A05);
                r2.A02 = Long.valueOf(r4.A01);
                int i4 = r4.A00;
                if (i4 == 2 || i4 == 5) {
                    if (r4.A02 > -1) {
                        j2 = 1;
                    } else {
                        j2 = 0;
                    }
                    r2.A03 = Long.valueOf(j2);
                } else {
                    r2.A03 = Long.valueOf(r4.A02);
                }
                r2.A05 = r4.A04;
                int i5 = 0;
                switch (i4) {
                    case 2:
                        i5 = 1;
                        break;
                    case 3:
                        i5 = 2;
                        break;
                    case 4:
                        i5 = 3;
                        break;
                    case 5:
                        i5 = 4;
                        break;
                    case 6:
                        i5 = 5;
                        break;
                    case 7:
                        i5 = 6;
                        break;
                }
                r2.A01 = i5;
                r5.A00.A08(r2, r5.A01.A00);
            }
        }
    }
}
