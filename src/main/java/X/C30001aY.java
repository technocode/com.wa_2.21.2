package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1aY  reason: invalid class name and case insensitive filesystem */
public final class C30001aY {
    public int A00 = -1;
    public int A01;
    public int A02 = 8388613;
    public int A03;
    public int A04 = 0;
    public int A05 = 1;
    public int A06 = 80;
    public int A07;
    public PendingIntent A08;
    public Bitmap A09;
    public String A0A;
    public String A0B;
    public ArrayList A0C = new ArrayList();
    public ArrayList A0D = new ArrayList();

    public void A00(AnonymousClass03E r9) {
        Notification.Action.Builder builder;
        Bundle bundle;
        Icon A072;
        Bundle bundle2 = new Bundle();
        ArrayList arrayList = this.A0C;
        if (!arrayList.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C14550mT r4 = (C14550mT) it.next();
                int i = Build.VERSION.SDK_INT;
                if (i >= 20) {
                    if (i >= 23) {
                        IconCompat A002 = r4.A00();
                        if (A002 == null) {
                            A072 = null;
                        } else {
                            A072 = A002.A07();
                        }
                        builder = new Notification.Action.Builder(A072, r4.A03, r4.A01);
                    } else {
                        builder = new Notification.Action.Builder(r4.A00, r4.A03, r4.A01);
                    }
                    Bundle bundle3 = r4.A07;
                    if (bundle3 != null) {
                        bundle = new Bundle(bundle3);
                    } else {
                        bundle = new Bundle();
                    }
                    bundle.putBoolean("android.support.allowGeneratedReplies", r4.A04);
                    if (Build.VERSION.SDK_INT >= 24) {
                        builder.setAllowGeneratedReplies(r4.A04);
                    }
                    builder.addExtras(bundle);
                    C14630mc[] r0 = r4.A09;
                    if (r0 != null) {
                        for (RemoteInput remoteInput : C14630mc.A01(r0)) {
                            builder.addRemoteInput(remoteInput);
                        }
                    }
                    arrayList2.add(builder.build());
                } else {
                    arrayList2.add(C14570mV.A00(r4));
                }
            }
            bundle2.putParcelableArrayList("actions", arrayList2);
        }
        int i2 = this.A05;
        if (i2 != 1) {
            bundle2.putInt("flags", i2);
        }
        PendingIntent pendingIntent = this.A08;
        if (pendingIntent != null) {
            bundle2.putParcelable("displayIntent", pendingIntent);
        }
        ArrayList arrayList3 = this.A0D;
        if (!arrayList3.isEmpty()) {
            bundle2.putParcelableArray("pages", (Parcelable[]) arrayList3.toArray(new Notification[arrayList3.size()]));
        }
        Bitmap bitmap = this.A09;
        if (bitmap != null) {
            bundle2.putParcelable("background", bitmap);
        }
        int i3 = this.A01;
        if (i3 != 0) {
            bundle2.putInt("contentIcon", i3);
        }
        int i4 = this.A02;
        if (i4 != 8388613) {
            bundle2.putInt("contentIconGravity", i4);
        }
        int i5 = this.A00;
        if (i5 != -1) {
            bundle2.putInt("contentActionIndex", i5);
        }
        int i6 = this.A04;
        if (i6 != 0) {
            bundle2.putInt("customSizePreset", i6);
        }
        int i7 = this.A03;
        if (i7 != 0) {
            bundle2.putInt("customContentHeight", i7);
        }
        int i8 = this.A06;
        if (i8 != 80) {
            bundle2.putInt("gravity", i8);
        }
        int i9 = this.A07;
        if (i9 != 0) {
            bundle2.putInt("hintScreenTimeout", i9);
        }
        String str = this.A0B;
        if (str != null) {
            bundle2.putString("dismissalId", str);
        }
        String str2 = this.A0A;
        if (str2 != null) {
            bundle2.putString("bridgeTag", str2);
        }
        r9.A03().putBundle("android.wearable.EXTENSIONS", bundle2);
    }

    public Object clone() {
        C30001aY r2 = new C30001aY();
        r2.A0C = new ArrayList(this.A0C);
        r2.A05 = this.A05;
        r2.A08 = this.A08;
        r2.A0D = new ArrayList(this.A0D);
        r2.A09 = this.A09;
        r2.A01 = this.A01;
        r2.A02 = this.A02;
        r2.A00 = this.A00;
        r2.A04 = this.A04;
        r2.A03 = this.A03;
        r2.A06 = this.A06;
        r2.A07 = this.A07;
        r2.A0B = this.A0B;
        r2.A0A = this.A0A;
        return r2;
    }
}
