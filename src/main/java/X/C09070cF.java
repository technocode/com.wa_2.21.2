package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.whatsapp.usernotice.UserNoticeBottomSheetDialogFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.Map;

/* renamed from: X.0cF  reason: invalid class name and case insensitive filesystem */
public class C09070cF {
    public static volatile C09070cF A02;
    public final C02780Dk A00;
    public final AnonymousClass0HE A01;

    public C09070cF(C02780Dk r1, AnonymousClass0HE r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public static C09070cF A00() {
        if (A02 == null) {
            synchronized (C09070cF.class) {
                if (A02 == null) {
                    A02 = new C09070cF(C02780Dk.A02(), AnonymousClass0HE.A00());
                }
            }
        }
        return A02;
    }

    public void A01(Context context) {
        AnonymousClass357 A022;
        int i;
        AnonymousClass352 A03;
        AnonymousClass3S4 r4;
        AnonymousClass0HE r5 = this.A01;
        boolean z = false;
        if (r5.A00.A0D(AbstractC000400g.A2a)) {
            z = true;
        }
        if (z && (A022 = r5.A05.A02()) != null && (((i = A022.A01) == 3 || i == 4) && (A03 = r5.A04.A03(A022)) != null)) {
            if (i == 3) {
                r4 = A03.A03;
                if (r4 == null) {
                    Log.i("UserNoticeManager/getModal/no content for stage 3");
                } else {
                    AnonymousClass355 r1 = r4.A00;
                    if (!r5.A09(r1)) {
                        Log.i("UserNoticeManager/getModal/modal not shown as per timing");
                    } else {
                        r5.A06(r1);
                        Log.i("UserNoticeManager/getModal/has modal");
                    }
                }
            } else {
                r4 = A03.A02;
                if (r4 == null) {
                    Log.i("UserNoticeManager/getModal/no content for stage 4");
                } else {
                    AnonymousClass355 r12 = r4.A00;
                    if (!r5.A09(r12)) {
                        Log.i("UserNoticeManager/getModal/blocking modal not shown as per timing");
                    } else {
                        r5.A06(r12);
                        Log.i("UserNoticeManager/getModal/has blocking modal");
                    }
                }
            }
            ActivityC004702f r3 = (ActivityC004702f) C02780Dk.A01(context);
            Bundle bundle = new Bundle();
            bundle.putString("icon_light_url", r4.A06);
            bundle.putString("icon_dark_url", r4.A05);
            bundle.putString("icon_description", ((AnonymousClass356) r4).A02);
            bundle.putString("title", r4.A07);
            List list = r4.A08;
            bundle.putInt("bullets_size", list.size());
            for (int i2 = 0; i2 < list.size(); i2++) {
                AnonymousClass358 r7 = (AnonymousClass358) list.get(i2);
                bundle.putString(AnonymousClass008.A0F("bullet_text_", i2), r7.A02);
                StringBuilder sb = new StringBuilder("bullet_icon_light_url_");
                sb.append(i2);
                bundle.putString(sb.toString(), r7.A01);
                StringBuilder sb2 = new StringBuilder("bullet_icon_dark_url_");
                sb2.append(i2);
                bundle.putString(sb2.toString(), r7.A00);
            }
            bundle.putString("agree_button_text", r4.A01);
            AnonymousClass355 r72 = r4.A00;
            AnonymousClass354 r52 = r72.A02;
            if (r52 != null) {
                bundle.putString("start_reference", r52.A01);
                bundle.putString("start_time_string", r52.A02);
            }
            AnonymousClass353 r6 = r72.A00;
            if (r6 != null) {
                bundle.putLong("duration_static", r6.A00);
                bundle.putLongArray("duration_repeat", r6.A01);
            }
            AnonymousClass354 r53 = r72.A01;
            if (r53 != null) {
                bundle.putString("end_reference", r53.A01);
                bundle.putString("end_time_string", r53.A02);
            }
            bundle.putString("body", r4.A02);
            bundle.putString("footer", r4.A04);
            bundle.putString("dismiss_button_text", r4.A03);
            File file = ((AnonymousClass356) r4).A01;
            if (file != null) {
                bundle.putString("light_icon_path", file.getAbsolutePath());
            }
            File file2 = ((AnonymousClass356) r4).A00;
            if (file2 != null) {
                bundle.putString("dark_icon_path", file2.getAbsolutePath());
            }
            UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = new UserNoticeBottomSheetDialogFragment();
            userNoticeBottomSheetDialogFragment.A0N(bundle);
            r3.APm(userNoticeBottomSheetDialogFragment);
            return;
        }
        Log.i("UserNoticeLinkActionHandler/handleOpenModal/no modal");
    }

    public void A02(String str, Map map, Context context) {
        int hashCode = str.hashCode();
        if (hashCode != -745876118) {
            if (hashCode == 1499924893 && str.equals("open-link")) {
                String str2 = (String) map.get("link");
                if (str2 == null) {
                    Log.e("UserNoticeLinkActionHandler/handleOpenLink null url");
                    return;
                }
                this.A00.A05(context, new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                return;
            }
        } else if (str.equals("open-modal")) {
            A01(context);
            return;
        }
        StringBuilder sb = new StringBuilder("UserNoticeLinkActionHandler/handleAction unknown action: ");
        sb.append(str);
        sb.append(" with params: ");
        sb.append(map);
        Log.e(sb.toString());
    }
}
