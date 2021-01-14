package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.0Xy  reason: invalid class name and case insensitive filesystem */
public final class HandlerC07510Xy extends Handler implements AnonymousClass0GA {
    public final /* synthetic */ AnonymousClass0G8 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerC07510Xy(AnonymousClass0G8 r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    @Override // X.AnonymousClass0GA
    public boolean AAK() {
        return hasMessages(4) || this.A00.A04.AAK();
    }

    @Override // X.AnonymousClass0GA
    public void ANd() {
        Log.d("xmpp/connection/send/client_ping");
        obtainMessage(5).sendToTarget();
    }

    @Override // X.AnonymousClass0GA
    public void ANe(UserJid userJid, String str, boolean z, boolean z2) {
        String obj;
        StringBuilder A0S = AnonymousClass008.A0S("xmpp/connection/send/connect/");
        if (z2) {
            obj = "active";
        } else {
            StringBuilder A0S2 = AnonymousClass008.A0S("passive ");
            A0S2.append(this.A00.A0w.A01());
            obj = A0S2.toString();
        }
        A0S.append(obj);
        Log.i(A0S.toString());
        removeMessages(0);
        Message obtainMessage = obtainMessage(0);
        Bundle data = obtainMessage.getData();
        data.putString("jid", userJid.getRawString());
        data.putString("ipaddress", str);
        data.putBoolean("available", z);
        data.putBoolean("active_connection", z2);
        obtainMessage.sendToTarget();
    }

    @Override // X.AnonymousClass0GA
    public void ANg(boolean z) {
        int i = 1;
        if (z) {
            i = 2;
        }
        StringBuilder sb = new StringBuilder("xmpp/connection/send/disconnect force:");
        sb.append(z);
        sb.append(" hasConnect:");
        sb.append(hasMessages(0));
        sb.append(" hasDisconnect:");
        sb.append(hasMessages(i));
        Log.d(sb.toString());
        removeMessages(i);
        removeMessages(0);
        Message obtainMessage = obtainMessage(i);
        obtainMessage.getData().putLong("requestTime", this.A00.A0N.A04());
        obtainMessage.sendToTarget();
    }

    @Override // X.AnonymousClass0GA
    public void ANj() {
        Log.d("xmpp/connection/send/pingtimeout");
        obtainMessage(8).sendToTarget();
    }

    @Override // X.AnonymousClass0GA
    public void ANk() {
        Log.d("xmpp/connection/send/quit");
        obtainMessage(3).sendToTarget();
    }

    @Override // X.AnonymousClass0GA
    public void ANl() {
        Log.d("xmpp/connection/send/active");
        obtainMessage(7).sendToTarget();
    }

    @Override // X.AnonymousClass0GA
    public void ANm() {
        Log.d("xmpp/connection/send/inactive");
        obtainMessage(6).sendToTarget();
    }

    @Override // X.AnonymousClass0GA
    public void ANp(Message message) {
        message.what = 4;
        sendMessage(message);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:68:0x0208 */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0311, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0315, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0318, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x031c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0496, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0504, code lost:
        if (r23 != false) goto L_0x0506;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0d86, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0d8c, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0d92, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0f8c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0f8e, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0f90, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0ff0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0ff5, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0ffa, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x100a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x100f, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x1014, code lost:
        r3 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x1034, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x1036, code lost:
        if (r0 == null) goto L_0x1046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x1040, code lost:
        X.AnonymousClass0G8.A01(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x1048, code lost:
        if (r2.A01 != null) goto L_0x104a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x104a, code lost:
        com.whatsapp.util.Log.i("xmpp/connection/socket/closed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x104d, code lost:
        if (r17 != null) goto L_0x104f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x1072, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x1074, code lost:
        if (r0 == null) goto L_0x1084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x107e, code lost:
        X.AnonymousClass0G8.A01(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x1086, code lost:
        if (r2.A01 != null) goto L_0x1088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x1088, code lost:
        com.whatsapp.util.Log.i("xmpp/connection/socket/closed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:714:0x108b, code lost:
        if (r17 == null) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x10b0, code lost:
        r0 = r2.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:723:0x10b2, code lost:
        if (r0 == null) goto L_0x10c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x10bc, code lost:
        X.AnonymousClass0G8.A01(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x10c4, code lost:
        if (r2.A01 != null) goto L_0x10c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x10c6, code lost:
        com.whatsapp.util.Log.i("xmpp/connection/socket/closed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x10c9, code lost:
        if (r17 == null) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x10cb, code lost:
        com.whatsapp.util.Log.d("xmpp/connection/reader_thread/finished");
        r17.A00 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:770:0x117a, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:771:0x117c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x118f, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:784:0x1194, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:792:0x11a1, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:0x11a9, code lost:
        r1 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0371  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x08f5  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x090d  */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x0937  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x093e  */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0945 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0d28 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:601:0x0f8c A[ExcHandler: 3Bw (e X.3Bw), Splitter:B:373:0x0a6e] */
    /* JADX WARNING: Removed duplicated region for block: B:602:0x0f8e A[ExcHandler: 1XC (e X.1XC), Splitter:B:373:0x0a6e] */
    /* JADX WARNING: Removed duplicated region for block: B:603:0x0f90 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:373:0x0a6e] */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x100a A[ExcHandler: 3Bw (e X.3Bw), Splitter:B:194:0x04e7] */
    /* JADX WARNING: Removed duplicated region for block: B:669:0x100f A[ExcHandler: 1XC (e X.1XC), Splitter:B:194:0x04e7] */
    /* JADX WARNING: Removed duplicated region for block: B:672:0x1014 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:194:0x04e7] */
    /* JADX WARNING: Removed duplicated region for block: B:689:0x1034 A[Catch:{ 2xq -> 0x11ba, all -> 0x11b7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:706:0x1072  */
    /* JADX WARNING: Removed duplicated region for block: B:722:0x10b0  */
    /* JADX WARNING: Removed duplicated region for block: B:732:0x10d8  */
    /* JADX WARNING: Removed duplicated region for block: B:742:0x10fc  */
    /* JADX WARNING: Removed duplicated region for block: B:743:0x1100  */
    /* JADX WARNING: Removed duplicated region for block: B:749:0x111d  */
    /* JADX WARNING: Removed duplicated region for block: B:750:0x1122  */
    /* JADX WARNING: Removed duplicated region for block: B:751:0x1126  */
    /* JADX WARNING: Removed duplicated region for block: B:755:0x1138  */
    /* JADX WARNING: Removed duplicated region for block: B:759:0x114c  */
    /* JADX WARNING: Removed duplicated region for block: B:760:0x1152  */
    /* JADX WARNING: Removed duplicated region for block: B:763:0x1163  */
    /* JADX WARNING: Removed duplicated region for block: B:767:0x1170  */
    /* JADX WARNING: Removed duplicated region for block: B:768:0x1174  */
    /* JADX WARNING: Removed duplicated region for block: B:770:0x117a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:435:0x0c88] */
    /* JADX WARNING: Removed duplicated region for block: B:781:0x118f A[ExcHandler: all (th java.lang.Throwable), Splitter:B:208:0x051c] */
    /* JADX WARNING: Removed duplicated region for block: B:784:0x1194 A[ExcHandler: 3Bv (e X.3Bv), Splitter:B:208:0x051c] */
    /* JADX WARNING: Removed duplicated region for block: B:797:0x11a9 A[ExcHandler: 3Bv (e X.3Bv), Splitter:B:194:0x04e7] */
    /* JADX WARNING: Removed duplicated region for block: B:831:0x11f3 A[Catch:{ 2xq -> 0x121d, all -> 0x121a }] */
    /* JADX WARNING: Removed duplicated region for block: B:854:0x1232  */
    /* JADX WARNING: Removed duplicated region for block: B:879:0x12a4 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:883:0x12c4  */
    /* JADX WARNING: Removed duplicated region for block: B:893:0x133a  */
    /* JADX WARNING: Removed duplicated region for block: B:903:0x1390  */
    /* JADX WARNING: Removed duplicated region for block: B:908:0x13b7  */
    /* JADX WARNING: Removed duplicated region for block: B:918:0x140e  */
    /* JADX WARNING: Removed duplicated region for block: B:953:0x122b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:963:0x035d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:965:0x035d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:967:0x035d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r82) {
        /*
        // Method dump skipped, instructions count: 5274
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC07510Xy.handleMessage(android.os.Message):void");
    }
}
