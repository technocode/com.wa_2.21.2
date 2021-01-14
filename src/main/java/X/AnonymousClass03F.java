package X;

import android.support.v4.app.INotificationSideChannel;

/* renamed from: X.03F  reason: invalid class name */
public class AnonymousClass03F implements AnonymousClass03G {
    public final int A00;
    public final String A01;
    public final String A02;

    public AnonymousClass03F(String str, int i, String str2) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    @Override // X.AnonymousClass03G
    public void ANa(INotificationSideChannel iNotificationSideChannel) {
        iNotificationSideChannel.A2Y(this.A01, this.A00, this.A02);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CancelTask[");
        sb.append("packageName:");
        sb.append(this.A01);
        sb.append(", id:");
        sb.append(this.A00);
        sb.append(", tag:");
        sb.append(this.A02);
        sb.append(", all:");
        sb.append(false);
        sb.append("]");
        return sb.toString();
    }
}
