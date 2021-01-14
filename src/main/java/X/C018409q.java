package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.09q  reason: invalid class name and case insensitive filesystem */
public class C018409q {
    public static volatile C018409q A01;
    public final C014508d A00;

    public C018409q(C014508d r1) {
        this.A00 = r1;
    }

    public static C018409q A00() {
        if (A01 == null) {
            synchronized (C018409q.class) {
                if (A01 == null) {
                    A01 = new C018409q(C014508d.A00());
                }
            }
        }
        return A01;
    }

    public final ContentValues A01(AnonymousClass0ZP r4) {
        ContentValues contentValues = new ContentValues();
        AnonymousClass1XU r0 = r4.A00;
        if (r0 == null) {
            return contentValues;
        }
        int i = r0.A00;
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        contentValues.put("element_type", Integer.valueOf(i2));
        contentValues.put("reply_values", r4.A00.A03);
        contentValues.put("reply_description", r4.A00.A01);
        return contentValues;
    }

    public final void A02(AnonymousClass1XN r14, long j, String str) {
        if (r14 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(j));
            contentValues.put("element_type", (Integer) 2);
            String str2 = null;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("content", r14.A00);
                jSONObject.put("footer", r14.A01);
                JSONArray jSONArray = new JSONArray();
                List<AnonymousClass1XM> list = r14.A02;
                if (list != null) {
                    for (AnonymousClass1XM r3 : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("id", r3.A02);
                        jSONObject2.put("displayText", r3.A01);
                        jSONObject2.put("selected", r3.A00);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("buttons", jSONArray);
                str2 = jSONObject.toString();
            } catch (JSONException e) {
                Log.w("ButtonsConverter/toJSONObject/serialization error", e);
            }
            if (!TextUtils.isEmpty(str2)) {
                contentValues.put("element_content", str2);
            }
            A0A(str, contentValues, "MessageUIElementsStore/insertOrUpdateQuotedButtonMessageElement", j, 2);
        }
    }

    public void A03(AnonymousClass28A r8) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", (Integer) 2);
        contentValues.put("reply_values", r8.A0D());
        contentValues.put("reply_description", r8.A00);
        contentValues.put("message_row_id", Long.valueOf(r8.A0p));
        A0A("message_ui_elements_reply", contentValues, "MessageUIElementsStore/insertOrUpdateButtonsResponseMessage", r8.A0p, 2);
    }

    public void A04(AnonymousClass28A r8, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("element_type", (Integer) 2);
        contentValues.put("reply_values", r8.A0D());
        contentValues.put("reply_description", r8.A00);
        contentValues.put("message_row_id", Long.valueOf(j));
        A0A("message_quoted_ui_elements_reply", contentValues, "MessageUIElementsStore/insertOrUpdateQuoteButtonsResponseMessage", j, 2);
    }

    public void A05(AnonymousClass0ZN r8) {
        if (r8.A00 != null) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("message_row_id", Long.valueOf(r8.A0p));
            int i = 1;
            if (r8.A00.A00 != 1) {
                i = 0;
            }
            contentValues.put("element_type", Integer.valueOf(i));
            String A0g = C001801b.A0g(r8.A00);
            if (!TextUtils.isEmpty(A0g)) {
                contentValues.put("element_content", A0g);
            }
            long j = r8.A0p;
            int i2 = 1;
            if (r8.A00.A00 != 1) {
                i2 = 0;
            }
            A0A("message_ui_elements", contentValues, "MessageUIElementsStore/insertMessageMultiElement", j, i2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass0ZN r12, long r13) {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018409q.A06(X.0ZN, long):void");
    }

    public void A07(AnonymousClass0ZP r10) {
        ContentValues A012 = A01(r10);
        A012.put("message_row_id", Long.valueOf(r10.A0p));
        long j = r10.A0p;
        int i = 1;
        if (r10.A00.A00 != 1) {
            i = 0;
        }
        A0A("message_ui_elements_reply", A012, "MessageUIElementsStore/insertOrUpdateResponseMessage", j, i);
    }

    public void A08(AnonymousClass0ZP r10, long j) {
        ContentValues A012 = A01(r10);
        A012.put("message_row_id", Long.valueOf(j));
        int i = 1;
        if (r10.A00.A00 != 1) {
            i = 0;
        }
        A0A("message_quoted_ui_elements_reply", A012, "MessageUIElementsStore/insertOrUpdateQuoteResponseMessage", j, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(java.lang.String r6, long r7, X.AbstractC007503q r9) {
        /*
            r5 = this;
            X.08d r0 = r5.A00
            X.0OQ r4 = r0.A03()
            X.0BK r3 = r4.A04     // Catch:{ all -> 0x004e }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004e }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x004e }
            r2[r1] = r0     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL"
            android.database.Cursor r1 = r3.A07(r6, r2, r0)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "element_type"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x004e }
            int r2 = r1.getInt(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "element_content"
            int r0 = r1.getColumnIndex(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = r1.getString(r0)     // Catch:{ all -> 0x004e }
            r0 = 2
            if (r2 != r0) goto L_0x004a
            X.1XN r1 = X.C001801b.A0H(r1)     // Catch:{ all -> 0x004e }
            if (r1 == 0) goto L_0x004a
            X.1XE r0 = r9.A0A()     // Catch:{ all -> 0x004e }
            r0.A00 = r1     // Catch:{ all -> 0x004e }
            long r2 = r9.A0t     // Catch:{ all -> 0x004e }
            r0 = 8
            long r2 = r2 | r0
            r9.A0t = r2     // Catch:{ all -> 0x004e }
        L_0x004a:
            r4.close()
            return
        L_0x004e:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018409q.A09(java.lang.String, long, X.03q):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.String r10, android.content.ContentValues r11, java.lang.String r12, long r13, int r15) {
        /*
            r9 = this;
            X.08d r0 = r9.A00
            X.0OQ r2 = r0.A04()
            X.0BK r3 = r2.A04     // Catch:{ all -> 0x002b }
            java.lang.String r6 = "element_type = ? AND message_row_id = ?"
            r0 = 2
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x002b }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x002b }
            r7[r1] = r0     // Catch:{ all -> 0x002b }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x002b }
            r7[r1] = r0     // Catch:{ all -> 0x002b }
            r5 = r11
            r8 = r12
            r4 = r10
            int r0 = r3.A00(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0027
            r3.A02(r10, r11, r12)     // Catch:{ all -> 0x002b }
        L_0x0027:
            r2.close()
            return
        L_0x002b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018409q.A0A(java.lang.String, android.content.ContentValues, java.lang.String, long, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(java.lang.String r8, X.AnonymousClass28A r9, java.lang.String r10) {
        /*
            r7 = this;
            long r1 = r9.A0p
            r6 = 0
            r5 = 1
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x000c
            r2 = 1
        L_0x000c:
            java.lang.String r0 = "MessageUIElementsStore/fillReplyDataIfAvailable/message must have row_id set; key="
            java.lang.StringBuilder r1 = X.AnonymousClass008.A0S(r0)
            X.03n r0 = r9.A0n
            X.AnonymousClass008.A1R(r1, r0, r2)
            java.lang.String[] r3 = new java.lang.String[r5]
            long r0 = r9.A0p
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r6] = r0
            X.08d r0 = r7.A00
            X.0OQ r2 = r0.A03()
            X.0BK r0 = r2.A04     // Catch:{ all -> 0x005d }
            android.database.Cursor r3 = r0.A07(r8, r3, r10)     // Catch:{ all -> 0x005d }
            if (r3 == 0) goto L_0x0059
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = "reply_values"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r1 = r3.getString(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "reply_description"
            int r0 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = r3.getString(r0)     // Catch:{ all -> 0x0052 }
            r9.A0d(r1)     // Catch:{ all -> 0x0052 }
            r9.A00 = r0     // Catch:{ all -> 0x0052 }
        L_0x004e:
            r3.close()
            goto L_0x0059
        L_0x0052:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0058 }
        L_0x0058:
            throw r0
        L_0x0059:
            r2.close()
            return
        L_0x005d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018409q.A0B(java.lang.String, X.28A, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.lang.String r8, X.AnonymousClass0ZN r9) {
        /*
            r7 = this;
            X.08d r0 = r7.A00
            X.0OQ r3 = r0.A03()
            X.0BK r6 = r3.A04     // Catch:{ all -> 0x0044 }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x0044 }
            r2 = 0
            long r0 = r9.A0p     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0044 }
            r5[r2] = r0     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "GET_MESSAGE_UI_ELEMENTS_BY_MESSAGE_ROW_ID_SQL"
            android.database.Cursor r2 = r6.A07(r8, r5, r0)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0040
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "element_type"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0044 }
            int r1 = r2.getInt(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "element_content"
            int r0 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0044 }
            if (r1 != r4) goto L_0x0040
            X.1XT r0 = X.C001801b.A0J(r0)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0040
            r9.A00 = r0     // Catch:{ all -> 0x0044 }
        L_0x0040:
            r3.close()
            return
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004a }
        L_0x004a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018409q.A0C(java.lang.String, X.0ZN):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0072, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0D(java.lang.String r9, X.AnonymousClass0ZP r10, java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 115
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C018409q.A0D(java.lang.String, X.0ZP, java.lang.String):void");
    }
}
