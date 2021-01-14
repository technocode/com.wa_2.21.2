package X;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.dialogs.RoomsNUXBottomSheetDialogFragment;
import com.whatsapp.dialogs.RoomsRedirectDialogFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0cR  reason: invalid class name and case insensitive filesystem */
public class C09190cR {
    public static final Uri A06 = Uri.parse("fb-messenger://meetup_create");
    public static final Uri A07 = Uri.parse("https://www.messenger.com/groupcall/create");
    public static volatile C09190cR A08;
    public final AnonymousClass02M A00;
    public final C000300f A01;
    public final AnonymousClass00G A02;
    public final AnonymousClass00D A03;
    public final C002701k A04;
    public final AnonymousClass00Y A05;

    public C09190cR(C002701k r1, AnonymousClass00G r2, AnonymousClass02M r3, AnonymousClass00Y r4, C000300f r5, AnonymousClass00D r6) {
        this.A04 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A05 = r4;
        this.A01 = r5;
        this.A03 = r6;
    }

    public static C09190cR A00() {
        if (A08 == null) {
            synchronized (C09190cR.class) {
                if (A08 == null) {
                    A08 = new C09190cR(C002701k.A00(), AnonymousClass00G.A01, AnonymousClass02M.A00(), AnonymousClass00Y.A00(), C000300f.A00(), AnonymousClass00D.A00());
                }
            }
        }
        return A08;
    }

    public static final boolean A01(Intent intent, PackageManager packageManager) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
        return queryIntentActivities != null && queryIntentActivities.size() > 0;
    }

    public static final boolean A02(PackageManager packageManager, String str, int i) {
        try {
            if (Integer.parseInt(packageManager.getPackageInfo(str, 0).versionName.split("\\.")[0]) >= i) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NumberFormatException e) {
            Log.e("Cannot get application version", e);
            return false;
        }
    }

    public final Uri A03(AnonymousClass02N r4, boolean z, int i) {
        String str;
        Uri.Builder appendQueryParameter = A07.buildUpon().appendQueryParameter("source", "whatsapp");
        if (r4 != null) {
            appendQueryParameter.appendQueryParameter("ref", A05(r4));
        }
        if (z && this.A04.A0E(179)) {
            appendQueryParameter.appendQueryParameter("upgrade", "1");
        }
        if (i == 0) {
            str = "3";
        } else if (i != 1) {
            if (i == 2) {
                str = "1";
            }
            return appendQueryParameter.build();
        } else {
            str = "2";
        }
        appendQueryParameter.appendQueryParameter("ep", str);
        return appendQueryParameter.build();
    }

    public final DialogFragment A04(AnonymousClass02N r8, int i) {
        SharedPreferences sharedPreferences = this.A03.A00;
        if (!sharedPreferences.getBoolean("rooms_nux_shown", false)) {
            Bundle bundle = new Bundle();
            RoomsNUXBottomSheetDialogFragment roomsNUXBottomSheetDialogFragment = new RoomsNUXBottomSheetDialogFragment();
            if (r8 != null) {
                bundle.putString("ref", r8.getRawString());
            }
            bundle.putInt("entry_point", i);
            roomsNUXBottomSheetDialogFragment.A0N(bundle);
            if (roomsNUXBottomSheetDialogFragment != null) {
                return roomsNUXBottomSheetDialogFragment;
            }
        }
        if (sharedPreferences.getInt("rooms_dialogs_shown", 0) < 5 || (sharedPreferences.getInt("rooms_redirect_shown", 0) & (1 << i)) == 0) {
            Bundle bundle2 = new Bundle();
            RoomsRedirectDialogFragment roomsRedirectDialogFragment = new RoomsRedirectDialogFragment();
            if (r8 != null) {
                bundle2.putString("chat_jid", r8.getRawString());
            }
            bundle2.putInt("entry_point", i);
            roomsRedirectDialogFragment.A0N(bundle2);
            if (roomsRedirectDialogFragment != null) {
                return roomsRedirectDialogFragment;
            }
        }
        return null;
    }

    public final String A05(AnonymousClass02N r7) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt((int) (Math.random() * ((double) 62))));
            i++;
        } while (i < 5);
        String obj = sb.toString();
        AnonymousClass00D r2 = this.A03;
        AnonymousClass008.A0m(r2, "return_chat_id", obj);
        AnonymousClass008.A0m(r2, "return_chat_jid", r7.getRawString());
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass02N r18, int r19) {
        /*
        // Method dump skipped, instructions count: 242
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09190cR.A06(X.02N, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002c, code lost:
        if (A01(new android.content.Intent("android.intent.action.VIEW").setData(A03(null, false, 1)), r5.A02.A00.getApplicationContext().getPackageManager()) == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07() {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09190cR.A07():boolean");
    }
}
