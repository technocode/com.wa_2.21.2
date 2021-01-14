package X;

import android.os.Message;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.0Xx  reason: invalid class name and case insensitive filesystem */
public class C07500Xx implements AnonymousClass0C0 {
    public static volatile C07500Xx A01;
    public final AnonymousClass0HE A00;

    @Override // X.AnonymousClass0C0
    public int[] A6c() {
        return new int[]{216};
    }

    public C07500Xx(AnonymousClass0HE r1) {
        this.A00 = r1;
    }

    @Override // X.AnonymousClass0C0
    public boolean AAE(int i, Message message) {
        int i2;
        int i3;
        if (i != 216) {
            return false;
        }
        List<AnonymousClass357> list = (List) message.obj;
        AnonymousClass0HE r3 = this.A00;
        StringBuilder A0S = AnonymousClass008.A0S("UserNoticeManager/onUserNoticeListReceived/serverUserNoticeList size: ");
        A0S.append(list.size());
        Log.i(A0S.toString());
        AnonymousClass0HH r2 = r3.A05;
        TreeMap A03 = r2.A03();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass357 r6 : list) {
            AnonymousClass357 r8 = (AnonymousClass357) A03.get(Integer.valueOf(r6.A00));
            if (r8 == null) {
                Log.i("UserNoticeManager/getUpdatedUserNoticeList/new notice");
                arrayList.add(r6);
            } else {
                int i4 = r8.A01;
                int i5 = r6.A01;
                if (i4 < i5) {
                    StringBuilder A0S2 = AnonymousClass008.A0S("UserNoticeManager/getUpdatedUserNoticeList/client stage is stale. client stage: ");
                    A0S2.append(i4);
                    A0S2.append(" sever stage: ");
                    A0S2.append(i5);
                    Log.i(A0S2.toString());
                    arrayList.add(r6);
                } else {
                    int i6 = r8.A02;
                    int i7 = r6.A02;
                    if (i6 < i7) {
                        StringBuilder A0S3 = AnonymousClass008.A0S("UserNoticeManager/getUpdatedUserNoticeList/new version available. client version: ");
                        A0S3.append(i6);
                        A0S3.append(" sever version: ");
                        A0S3.append(i7);
                        Log.i(A0S3.toString());
                        arrayList.add(new AnonymousClass357(r8.A00, i4, r8.A03, i7));
                    } else {
                        StringBuilder A0S4 = AnonymousClass008.A0S("UserNoticeManager/getUpdatedUserNoticeList/server stage is same or stale. client stage: ");
                        A0S4.append(i4);
                        A0S4.append(" sever stage: ");
                        A0S4.append(i5);
                        Log.i(A0S4.toString());
                        arrayList.add(r8);
                    }
                }
            }
        }
        AnonymousClass008.A1b(arrayList, AnonymousClass008.A0S("UserNoticeManager/onUserNoticeListReceived/updatedUserNoticeList size: "));
        r2.A05(arrayList);
        AnonymousClass357 A02 = r2.A02();
        TreeMap A032 = r2.A03();
        if (A032.isEmpty()) {
            Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/notice map empty");
        } else {
            Log.i("UserNoticeManager/getUpdatedCurrentUserNotice/found metadata");
            Map.Entry firstEntry = A032.firstEntry();
            if (firstEntry != null) {
                AnonymousClass357 r62 = (AnonymousClass357) firstEntry.getValue();
                if (r62 != null) {
                    r2.A04(r62);
                    if (A02 != null && ((i2 = A02.A00) != (i3 = r62.A00) || A02.A02 < r62.A02)) {
                        StringBuilder A0S5 = AnonymousClass008.A0S("UserNoticeManager/deleteUserNoticeContentIfNecessary/notice mismatch: ");
                        boolean z = false;
                        boolean z2 = false;
                        if (i2 != i3) {
                            z2 = true;
                        }
                        A0S5.append(z2);
                        A0S5.append("old version: ");
                        if (A02.A02 < r62.A02) {
                            z = true;
                        }
                        AnonymousClass008.A1a(A0S5, z);
                        r3.A04.A04(i2);
                        r3.A04();
                    }
                    AnonymousClass0HF r7 = r3.A04;
                    int i8 = r62.A00;
                    int i9 = r62.A01;
                    AnonymousClass008.A0y("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/notice id ", i8, " stage: ", i9);
                    if (i9 == 5) {
                        Log.i("UserNoticeContentManager/fetchUserNoticeContentIfNecessary/end stage, skip fetch");
                    } else if (!r7.A09(i8, "content.json")) {
                        Log.i("UserNoticeContentManager/userNoticeContentExists/content does not exist, fetch");
                        r7.A05(i8);
                    }
                    r3.A05(i8, i9, r62.A02);
                    r3.A08(r62, r7.A03(r62));
                    return true;
                }
            } else {
                throw null;
            }
        }
        r3.A02();
        r3.A03();
        return true;
    }
}
