package X;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* renamed from: X.0oa  reason: invalid class name and case insensitive filesystem */
public final class C15740oa {
    public boolean A00;
    public boolean A01;
    public final BroadcastReceiver A02;
    public final IntentFilter A03;

    public C15740oa(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.A03 = intentFilter;
        this.A02 = broadcastReceiver;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.A02);
        sb.append(" filter=");
        sb.append(this.A03);
        if (this.A01) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
