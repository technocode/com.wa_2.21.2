package X;

import android.app.Notification;

/* renamed from: X.0rm  reason: invalid class name and case insensitive filesystem */
public final class C17580rm {
    public final int A00;
    public final int A01;
    public final Notification A02;

    public C17580rm(int i, Notification notification, int i2) {
        this.A01 = i;
        this.A02 = notification;
        this.A00 = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17580rm.class != obj.getClass()) {
            return false;
        }
        C17580rm r4 = (C17580rm) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return this.A02.equals(r4.A02);
        }
        return false;
    }

    public int hashCode() {
        return this.A02.hashCode() + (((this.A01 * 31) + this.A00) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ForegroundInfo{");
        sb.append("mNotificationId=");
        sb.append(this.A01);
        sb.append(", mForegroundServiceType=");
        sb.append(this.A00);
        sb.append(", mNotification=");
        sb.append(this.A02);
        sb.append('}');
        return sb.toString();
    }
}
