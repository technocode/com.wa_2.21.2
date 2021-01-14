package X;

/* renamed from: X.1Ef  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class RunnableC25041Ef extends RunnableEmptyBase implements Runnable {
    public final ServiceConnectionC25021Ed A00;

    public RunnableC25041Ef(ServiceConnectionC25021Ed r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r5 = java.lang.String.valueOf(r7);
        r1 = new java.lang.StringBuilder(r5.length() + 8);
        r1.append("Sending ");
        r1.append(r5);
        android.util.Log.d("MessengerIpcClient", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r6 = r6.A02;
        r1 = r2.A02;
        r5 = android.os.Message.obtain();
        r5.what = r7.A00;
        r5.arg1 = r4;
        r5.replyTo = r1;
        r4 = new android.os.Bundle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        if ((r7 instanceof X.C37011nO) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007b, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        r4.putBoolean("oneWay", r0);
        r4.putString("pkg", r6.getPackageName());
        r4.putBundle("data", r7.A02);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0093, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = r2.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0099, code lost:
        if (r0 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009b, code lost:
        r0.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a0, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r0 == null) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r0.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        throw new java.lang.IllegalStateException("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r2.A01(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        // Method dump skipped, instructions count: 192
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC25041Ef.run():void");
    }
}
