package X;

import android.app.Notification;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Ws  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC29021Ws {
    public void A02(Context context, Notification notification, int i) {
    }

    public List A00(Context context) {
        if (this instanceof C449022c) {
            return Arrays.asList("com.miui.miuilite", "com.miui.miuihome", "com.miui.miuihome2");
        } else if (this instanceof C448822a) {
            return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
        } else if (this instanceof AnonymousClass22Z) {
            return null;
        } else {
            if (this instanceof AnonymousClass22Y) {
                return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher", "com.sec.android.app.easylauncher", "com.sec.android.emergencylauncher");
            } else if (this instanceof AnonymousClass22X) {
                return Collections.singletonList("com.oppo.launcher");
            } else {
                if (this instanceof AnonymousClass22W) {
                    return Collections.singletonList("com.huawei.android.launcher");
                }
                if (!(this instanceof AnonymousClass22V)) {
                    return Arrays.asList("com.asus.launcher", "com.lge.launcher", "com.lge.launcher2", "com.lge.launcher3");
                } else if (((AnonymousClass22V) this).A03(context) >= 4.0f) {
                    return Collections.singletonList("com.htc.launcher");
                } else {
                    return new ArrayList();
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x017a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017e, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x029c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.content.Context r22, int r23) {
        /*
        // Method dump skipped, instructions count: 800
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC29021Ws.A01(android.content.Context, int):void");
    }
}
