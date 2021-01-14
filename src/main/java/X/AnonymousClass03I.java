package X;

import android.app.Notification;
import android.support.v4.app.INotificationSideChannel;

/* renamed from: X.03I  reason: invalid class name */
public class AnonymousClass03I implements AnonymousClass03G {
    public final int A00;
    public final Notification A01;
    public final String A02;
    public final String A03;

    public AnonymousClass03I(String str, int i, String str2, Notification notification) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = str2;
        this.A01 = notification;
    }

    @Override // X.AnonymousClass03G
    public void ANa(INotificationSideChannel iNotificationSideChannel) {
        iNotificationSideChannel.ACT(this.A02, this.A00, this.A03, this.A01);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[");
        sb.append("packageName:");
        sb.append(this.A02);
        sb.append(", id:");
        sb.append(this.A00);
        sb.append(", tag:");
        return AnonymousClass008.A0O(sb, this.A03, "]");
    }
}
