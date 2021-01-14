package X;

import android.content.ContentValues;
import android.content.Intent;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.0cE  reason: invalid class name and case insensitive filesystem */
public final class C09060cE {
    public static volatile C09060cE A02;
    public final C014308b A00;
    public final C006903j A01;

    public C09060cE(C006903j r1, C014308b r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public static final Intent A00(String str, String str2, boolean z, boolean z2) {
        Intent intent;
        if (z) {
            intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        if (!TextUtils.isEmpty(str2)) {
            if (z2) {
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                ContentValues contentValues = new ContentValues();
                contentValues.put("mimetype", "vnd.android.cursor.item/name");
                contentValues.put("data2", str2);
                arrayList.add(contentValues);
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("mimetype", "vnd.android.cursor.item/organization");
                contentValues2.put("data1", str2);
                arrayList.add(contentValues2);
                intent.putParcelableArrayListExtra("data", arrayList);
            } else {
                intent.putExtra("name", str2);
            }
        }
        intent.putExtra("phone", str);
        intent.putExtra("phone_type", 2);
        intent.setFlags(524288);
        return intent;
    }

    public static C09060cE A01() {
        if (A02 == null) {
            synchronized (C09060cE.class) {
                if (A02 == null) {
                    A02 = new C09060cE(C006903j.A00(), C014308b.A00());
                }
            }
        }
        return A02;
    }

    public Intent A02(C007003k r4, AnonymousClass02N r5, boolean z) {
        String A08;
        boolean z2;
        String A022 = C12420i4.A02(r5);
        if (r4 == null || !r4.A08()) {
            A08 = this.A01.A08(r5);
            z2 = false;
        } else if (this.A00 != null) {
            A08 = r4.A04();
            z2 = true;
        } else {
            throw null;
        }
        return A00(A022, A08, z, z2);
    }
}
