package X;

import android.content.ContentResolver;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.provider.ContactsContract;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.0RQ  reason: invalid class name */
public final class AnonymousClass0RQ {
    public static final String[] A07 = {"com.whatsapp", "com.whatsapp.w4b"};
    public static final String[] A08 = {"raw_contact_id", "display_name", "data1", "data2", "data3", "sort_key", "account_type"};
    public final int A00;
    public final long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public AnonymousClass0RQ(long j, String str, String str2, int i, String str3, String str4, String str5) {
        if (str2 != null) {
            this.A01 = j;
            this.A03 = str;
            this.A05 = str2;
            this.A00 = i;
            this.A04 = str3;
            this.A06 = str4;
            this.A02 = str5;
            return;
        }
        throw new NullPointerException("number must not be null");
    }

    public static Cursor A00(AnonymousClass03P r5, String str) {
        Log.i("phone/getcursor/query/start");
        ContentResolver A062 = r5.A06();
        if (A062 == null) {
            Log.w("phone/getcursor/cr null");
            return null;
        }
        Cursor query = A062.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, A08, A01(), null, null);
        Log.i("phone/getcursor/query/end");
        if (query != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append('/');
            sb.append(query.getCount());
            Log.i(sb.toString());
        }
        return query;
    }

    public static String A01() {
        StringBuilder sb = new StringBuilder("(");
        sb.append("account_type");
        sb.append(" IS NULL OR (");
        sb.append("account_type");
        sb.append(" NOT IN (");
        int i = 0;
        while (true) {
            String[] strArr = A07;
            int length = strArr.length - 1;
            if (i < length) {
                DatabaseUtils.appendEscapedSQLString(sb, strArr[i]);
                sb.append(",");
                i++;
            } else {
                DatabaseUtils.appendEscapedSQLString(sb, strArr[length]);
                sb.append(")))");
                Log.i(sb.toString());
                return sb.toString();
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (AnonymousClass0RQ.class != obj.getClass()) {
            return false;
        }
        AnonymousClass0RQ r7 = (AnonymousClass0RQ) obj;
        if (this.A01 != r7.A01 || !TextUtils.equals(this.A03, r7.A03) || !TextUtils.equals(this.A05, r7.A05) || this.A00 != r7.A00 || !TextUtils.equals(this.A04, r7.A04) || !TextUtils.equals(this.A06, r7.A06)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.A01;
        int i = 0;
        int i2 = (((((((int) (j >>> 32)) + 0) * 31) + ((int) j)) * 31) + this.A00) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }
}
