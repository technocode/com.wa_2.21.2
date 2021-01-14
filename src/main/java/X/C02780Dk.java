package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.search.verification.client.R;
import com.whatsapp.util.Log;

/* renamed from: X.0Dk  reason: invalid class name and case insensitive filesystem */
public class C02780Dk implements AbstractC02790Dl {
    public static volatile C02780Dk A01;
    public final AnonymousClass02M A00;

    public C02780Dk(AnonymousClass02M r1) {
        this.A00 = r1;
    }

    public static Activity A00(Context context) {
        Context A0O = C002001d.A0O(context);
        if (A0O != null) {
            return (Activity) A0O;
        }
        throw new IllegalStateException("The Context is not an Activity.");
    }

    public static Activity A01(Context context) {
        Activity A002 = A00(context);
        if (ActivityC004702f.class.isAssignableFrom(A002.getClass())) {
            return A002;
        }
        StringBuilder A0S = AnonymousClass008.A0S("The Context is not assignable from class ");
        A0S.append(ActivityC004702f.class.getSimpleName());
        throw new IllegalStateException(A0S.toString());
    }

    public static C02780Dk A02() {
        if (A01 == null) {
            synchronized (C02780Dk.class) {
                if (A01 == null) {
                    A01 = new C02780Dk(AnonymousClass02M.A00());
                }
            }
        }
        return A01;
    }

    public static void A03(View view, WindowManager windowManager) {
        int identifier;
        if (Build.VERSION.SDK_INT >= 19 && view != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i = 0;
            Resources resources = view.getContext().getResources();
            if (C006803i.A0j() && resources.getConfiguration().orientation == 2 && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                i = resources.getDimensionPixelSize(identifier);
            }
            view.getLayoutParams().width = point.x - i;
        }
    }

    public static void A04(Window window) {
        if (Build.VERSION.SDK_INT >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if ((r6.getFlags() & 268435456) != 0) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Context r5, android.content.Intent r6) {
        /*
            r4 = this;
            android.content.Context r0 = X.C002001d.A0O(r5)
            r3 = 0
            if (r0 != 0) goto L_0x0011
            int r2 = r6.getFlags()
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            r1 = 0
            if (r2 == 0) goto L_0x0012
        L_0x0011:
            r1 = 1
        L_0x0012:
            java.lang.String r0 = "Need to use activity context or FLAG_ACTIVITY_NEW_TASK flag"
            X.AnonymousClass00E.A09(r1, r0)
            r5.startActivity(r6)     // Catch:{ ActivityNotFoundException -> 0x001b }
            goto L_0x002a
        L_0x001b:
            r1 = move-exception
            java.lang.String r0 = "app/start-activity "
            com.whatsapp.util.Log.e(r0, r1)
            X.02M r1 = r4.A00
            r0 = 2131886160(0x7f120050, float:1.940689E38)
            r1.A06(r0, r3)
            return
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02780Dk.A05(android.content.Context, android.content.Intent):void");
    }

    public boolean A06(Activity activity, Intent intent, int i) {
        try {
            activity.startActivityForResult(intent, i);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.e("app/start-activity-for-result ", e);
            this.A00.A06(R.string.activity_not_found, 0);
            return false;
        }
    }

    @Override // X.AbstractC02790Dl
    public void ANL(Context context, Uri uri) {
        if (uri == null) {
            Log.e("activity-utils/start-activity/uri-is-null");
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", context.getPackageName());
        intent.putExtra("create_new_tab", true);
        A05(context, intent);
    }
}
